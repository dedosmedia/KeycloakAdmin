package com.dh.keycloak.model;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @Builder
public class User {

    private String id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;

}
