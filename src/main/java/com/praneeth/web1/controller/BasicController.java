package com.praneeth.web1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.praneeth.web1.dao.ProductDao;
import com.praneeth.web1.model.Product;

@Controller
public class BasicController {
	@Autowired
	ProductDao dao;
@RequestMapping("/adminhome")
public String m1()
{
	return "adminhome";
}
@RequestMapping("/user")
public ModelAndView m2()
{
	
	  List proList=dao.getAllProducts();
	ModelAndView mv=new ModelAndView("user","productInfo",proList);
	
	return mv;

}
@RequestMapping("/displayProduct")
public ModelAndView diplayProduct(@RequestParam("proid")int productid)
{ 
	Product	prod=dao.displayProduct(productid);
	ModelAndView mv=new ModelAndView("displayProduct","pro",prod);
	return mv;
}
}
