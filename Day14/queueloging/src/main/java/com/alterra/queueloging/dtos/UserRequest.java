package com.alterra.queueloging.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRequest {
    private String username;

    private String email;

    private String password;
}
