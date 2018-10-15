package com.praneeth.web1.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.praneeth.web1.model.Category;
import com.praneeth.web1.model.Supplier;
@Component
@Repository
public interface SupplierDao {
boolean insert(Supplier supplier);
List getAllSupplier();
boolean deleteSup(int s);
Supplier editSup(int s);
}
