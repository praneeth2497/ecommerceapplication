package com.praneeth.web1.dao;

import com.praneeth.web1.model.Register;

public interface RegisterDao {
void registerUser(Register reg);
Register getUser(String userName);
}
