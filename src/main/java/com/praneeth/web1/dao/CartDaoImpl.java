package com.praneeth.web1.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.praneeth.web1.model.Cart;
import com.praneeth.web1.model.Product;


@Component
@Repository
public class CartDaoImpl implements CartDao{
@Autowired
SessionFactory sessionFactory;
	
	public boolean sendToCart(int quantity, int id,String un) {
		Cart cr=new Cart();
		cr.setCartUser(un);
		cr.setCartId((int)(Math.random()*10000));
		Session session=sessionFactory.openSession();
	Product pro	=(Product)session.get(Product.class, id);
	String name=pro.getName();
	int p=pro.getPrice();
	cr.setProductName(name);
	cr.setProductPrice(p);
	cr.setTotalPrice(quantity*p);
	cr.setQuantity(quantity);
		session.save(cr);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
		return true;
	}

	
	public List getAllCart(String cart) {
		
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Cart where cartuser=:cu");
		query.setParameter("cu", cart);
      List cartList= query.list();
		return cartList;
	}

	
}
