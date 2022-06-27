package com.dh.keycloak.service.impl;

import com.dh.keycloak.model.User;
import com.dh.keycloak.repository.UserRepository;
import com.dh.keycloak.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KeycloakUserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
