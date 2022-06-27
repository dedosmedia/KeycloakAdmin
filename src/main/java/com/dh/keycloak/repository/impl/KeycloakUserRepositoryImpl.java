package com.dh.keycloak.repository.impl;

import com.dh.keycloak.model.User;
import com.dh.keycloak.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import org.keycloak.admin.client.Keycloak;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class KeycloakUserRepositoryImpl implements UserRepository {

    private final Keycloak keycloakClient;

    @Value("${dh.keycloak.realm}")
    private String realm;

    @Override
    public List<User> findAll() {
        return keycloakClient.realm(realm).users().list().stream().map(this::toUser).collect(Collectors.toList());
    }


    private User toUser(UserRepresentation userRepresentation){
        return User.builder()
                .email(userRepresentation.getEmail())
                .username(userRepresentation.getUsername())
                .id(userRepresentation.getId())
                .firstName(userRepresentation.getFirstName())
                .lastName(userRepresentation.getLastName())
                .build();
    }
}
