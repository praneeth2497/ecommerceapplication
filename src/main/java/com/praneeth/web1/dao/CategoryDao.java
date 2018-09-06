package com.praneeth.web1.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.praneeth.web1.model.Category;
import com.praneeth.web1.model.Product;

public interface CategoryDao {
boolean insert(Category category);
List getAllCategory();
boolean deleteCat(int c);
Category editCat(int c);

}
