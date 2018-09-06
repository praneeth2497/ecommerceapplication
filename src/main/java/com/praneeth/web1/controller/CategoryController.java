package com.praneeth.web1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.praneeth.web1.dao.CategoryDao;
import com.praneeth.web1.model.Category;
import com.praneeth.web1.model.Product;



@Controller
public class CategoryController {
	
	@Autowired
	CategoryDao cdao;
@RequestMapping("/categories")
public ModelAndView m1()
{
	ModelAndView mv= new ModelAndView("showcategory","cat",new Category());
	  List catList=cdao.getAllCategory();
			mv.addObject("catInfo",catList);

	return mv;
}
@RequestMapping("/addCategory")
public ModelAndView saveCategory(@ModelAttribute("cat") Category cat)
{
    cdao.insert(cat);
    List catList=cdao.getAllCategory();
ModelAndView mv=new ModelAndView("showcategory","catInfo",catList);
return mv;
}
@RequestMapping("/deleteCategory")
public ModelAndView deleteCategory(@RequestParam("catid")int categoryid)
{
	cdao.deleteCat(categoryid);
	  List catList=cdao.getAllCategory();
	  ModelAndView mv=new ModelAndView("showcategory","cat",new Category());
		mv.addObject("catInfo",catList);

	return mv;
}
@RequestMapping("/editCategory")
public ModelAndView editCategory(@RequestParam("catid")int categoryid)
{
Category	cat=cdao.editCat(categoryid);
	  List catList=cdao.getAllCategory();
	  ModelAndView mv=new ModelAndView("showcategory","cat",cat);
		mv.addObject("catInfo",catList);

	return mv;
}

}
