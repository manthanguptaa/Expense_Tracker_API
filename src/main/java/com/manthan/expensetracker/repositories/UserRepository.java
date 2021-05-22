package com.manthan.expensetracker.repositories;

import com.manthan.expensetracker.domain.User;
import com.manthan.expensetracker.exceptions.EtAuthException;

public interface UserRepository {
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;
    
    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
