package com.alterra.securities.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class LoginRequestDTO {
    @NotBlank
    @JsonProperty("username_or_phone")
    private String usernameOrPhone;

    @NotBlank
    private String password;
}
