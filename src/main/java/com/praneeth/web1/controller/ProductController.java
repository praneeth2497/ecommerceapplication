package com.praneeth.web1.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.praneeth.web1.dao.ProductDao;
import com.praneeth.web1.model.Product;

@Controller
public class ProductController {
@Autowired
ProductDao dao;
	
	
	@RequestMapping("/products")
	public ModelAndView proInfo()
	{
		ModelAndView mv= new ModelAndView("showproducts","pro",new Product());
		  List proList=dao.getAllProducts();
		mv.addObject("productInfo",proList);
		return mv;
	}
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
    public ModelAndView saveProduct(@ModelAttribute("pro") Product pro)throws Exception
    {
	pro.setId((int)(Math.random()*10000));
	int id=pro.getId();
		MultipartFile proimg=pro.getProductImage();
		
		File f=new File("H:\\projecteclipse\\mavenweb\\src\\main\\webapp\\resources\\"+String.valueOf(id)+".jpg");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		bos.write(proimg.getBytes());
        dao.insert(pro);
        List proList=dao.getAllProducts();
    ModelAndView mv=new ModelAndView("showproducts","productInfo",proList);
    return mv;
    }
	@RequestMapping("/deleteProduct")
	public ModelAndView deleteProduct(@RequestParam("proid")int productid)
	{
		dao.deletePro(productid);
		  List proList=dao.getAllProducts();
		  ModelAndView mv=new ModelAndView("showproducts","pro",new Product());
			mv.addObject("productInfo",proList);

		return mv;
	}
	@RequestMapping("/editProduct")
	public ModelAndView editProduct(@RequestParam("proid")int productid)
	{
	Product	prod=dao.editPro(productid);
		  List proList=dao.getAllProducts();
		  ModelAndView mv=new ModelAndView("showproducts","pro",prod);
			mv.addObject("productInfo",proList);

		return mv;
	}

	
}
