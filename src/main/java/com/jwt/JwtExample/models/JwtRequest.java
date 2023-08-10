package com.jwt.JwtExample.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JwtRequest {

    private String email;
    private String password;

}
