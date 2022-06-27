package com.dh.keycloak.service;

import com.dh.keycloak.model.User;
import org.springframework.stereotype.Service;

import java.util.List;



public interface UserService {

    public List<User> getAllUsers();
}
