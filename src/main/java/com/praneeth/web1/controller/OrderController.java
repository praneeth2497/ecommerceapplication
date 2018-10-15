package com.praneeth.web1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.praneeth.web1.dao.CartDao;
import com.praneeth.web1.dao.CartDaoImpl;
import com.praneeth.web1.model.Cart;

@Controller
public class OrderController {
@Autowired
CartDao cartDao;
@Autowired
HttpSession httpsession;
	@RequestMapping("/deleteCart")

public ModelAndView deleteOrder()
{
		String username=(String)httpsession.getAttribute("userId");
		//System.out.println("un===="+username);
		cartDao.deleteCart(username);
	//	long count=cartDao.cartCount(username);
		//System.out.println("ordercount is"+count);
		//httpsession.setAttribute("ordercount", count);
	ModelAndView mv=new ModelAndView("cart");
	return mv;
}
}
