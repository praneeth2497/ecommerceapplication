package com.praneeth.web1.dao;

import java.util.List;

import com.praneeth.web1.model.Product;



public interface ProductDao {
boolean insert(Product product);
List getAllProducts();
boolean deletePro(int p);
Product editPro(int p);
Product displayProduct(int p);
}
