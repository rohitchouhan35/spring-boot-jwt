package com.jwt.JwtExample.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JwtResponse {

    private String username;
    private String jwtToken;

}
