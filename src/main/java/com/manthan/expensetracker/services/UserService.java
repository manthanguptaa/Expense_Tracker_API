package com.manthan.expensetracker.services;

import com.manthan.expensetracker.domain.User;
import com.manthan.expensetracker.exceptions.EtAuthException;

public interface UserService {
    User validatUser(String email, String password) throws EtAuthException;

    User registeUser(String firstName, String lastName, String email,String password) throws EtAuthException;
}
