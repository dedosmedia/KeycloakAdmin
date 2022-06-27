package com.dh.keycloak.repository;

import com.dh.keycloak.model.User;

import java.util.List;

public interface UserRepository {

    public List<User> findAll();

}
