package com.praneeth.web1.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.praneeth.web1.dao.CartDao;
import com.praneeth.web1.dao.ProductDao;
import com.praneeth.web1.model.Cart;
import com.praneeth.web1.model.Product;



@Controller
public class CartController {
private static final String String = null;
@Autowired
CartDao cart;
@Autowired
ProductDao dao;
@Autowired
HttpSession s;

@RequestMapping("/SendToCart")
	public ModelAndView cart(@RequestParam ("quantity")int quantity,@RequestParam("id")int id )
	{
	String un=(String)s.getAttribute("userId");
cart.getAllCart(un);
		cart.sendToCart(quantity, id,un);
	List proList=dao.getAllProducts();
		ModelAndView mv=new ModelAndView("user","productInfo",proList);
		return mv;
	}
	@RequestMapping("/cart")
	public ModelAndView cart1()
	{
		String un=(String)s.getAttribute("userId");
		
		 List catList=cart.getAllCart(un);
		
		ModelAndView mv=new ModelAndView("cart","cartInfo",catList);
		
				return mv;
	}
	
	
}
