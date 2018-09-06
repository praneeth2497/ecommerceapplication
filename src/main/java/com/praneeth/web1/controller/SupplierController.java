package com.praneeth.web1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.praneeth.web1.dao.SupplierDao;
import com.praneeth.web1.model.Category;
import com.praneeth.web1.model.Supplier;

@Controller
public class SupplierController {
	
	@Autowired
	SupplierDao sdao;
	@RequestMapping("/supplier")
	public ModelAndView m1()
	{
		ModelAndView mv= new ModelAndView("showsupplier","sup",new Supplier());
		List supList=sdao.getAllSupplier();
		mv.addObject("supInfo",supList);
		return mv;
	}
	@RequestMapping("/addSupplier")
	public ModelAndView saveProduct(@ModelAttribute("sup") Supplier sup)
	{
	   sdao.insert(sup); 
	   List supList=sdao.getAllSupplier();
	ModelAndView mv=new ModelAndView("showsupplier","supInfo",supList);
	return mv;
	}
	@RequestMapping("/deleteSupplier")
	public ModelAndView deleteCategory(@RequestParam("supid")int supplierid)
	{
		sdao.deleteSup(supplierid);
		  List supList=sdao.getAllSupplier();
		  ModelAndView mv=new ModelAndView("showsupplier","sup",new Supplier());
			mv.addObject("supInfo",supList);

		return mv;
	}
	@RequestMapping("/editSupplier")
	public ModelAndView editProduct(@RequestParam("supid")int supplierid)
	{
	Supplier	sup=sdao.editSup(supplierid);
		  List supList=sdao.getAllSupplier();
		  ModelAndView mv=new ModelAndView("showsupplier","sup",sup);
			mv.addObject("supInfo",supList);

		return mv;
	}
}
