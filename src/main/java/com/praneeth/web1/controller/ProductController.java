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

import com.praneeth.web1.dao.CategoryDao;
import com.praneeth.web1.dao.ProductDao;
import com.praneeth.web1.dao.SupplierDao;
import com.praneeth.web1.model.Product;

@Controller
public class ProductController {
@Autowired
ProductDao productdao;
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	SupplierDao supplierDao;
	@RequestMapping("/products")
	public ModelAndView proInfo()
	{
		ModelAndView modelAndView= new ModelAndView("showproducts","pro",new Product());
		List catList =categoryDao.getAllCategory();
		  List proList=productdao.getAllProducts();
		 List supList= supplierDao.getAllSupplier();
		modelAndView.addObject("productInfo",proList);
		modelAndView.addObject("catInfo",catList);
		modelAndView.addObject("supInfo",supList);
		return modelAndView;
	}
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
    public ModelAndView saveProduct(@ModelAttribute("pro") Product pro)throws Exception
    {
	pro.setId((int)(Math.random()*10000));
//	int id=pro.getId();
		MultipartFile proimg=pro.getProductImage();
		
		File f=new File("H:\\projecteclipse\\mavenweb\\src\\main\\webapp\\resources\\"+String.valueOf(pro.getId())+".jpg");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		byte imgarr[];
		imgarr=proimg.getBytes();
		System.out.println(imgarr.length);
		bos.write(imgarr);
		bos.flush();
		bos.close();
        productdao.insert(pro);
        List proList=productdao.getAllProducts();
    ModelAndView modelAndView=new ModelAndView("showproducts","productInfo",proList);
    
    return modelAndView;
    }
	@RequestMapping("/deleteProduct")
	public ModelAndView deleteProduct(@RequestParam("proid")int productid)
	{
		productdao.deletePro(productid);
		  List proList=productdao.getAllProducts();
		  ModelAndView modelAndView=new ModelAndView("showproducts","pro",new Product());
			modelAndView.addObject("productInfo",proList);

		return modelAndView;
	}
	@RequestMapping("/editProduct")
	public ModelAndView editProduct(@RequestParam("proid")int productid)
	{
	Product	prod=productdao.editPro(productid);
		  List proList=productdao.getAllProducts();
		  ModelAndView modelAndView=new ModelAndView("showproducts","pro",prod);
			modelAndView.addObject("productInfo",proList);

		return modelAndView;
	}

	
}
