package com.alterra.dtos;

import com.alterra.entities.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(value = {"createAt", "updateAt"}, allowGetters = true)
@Getter
@Setter
public class SuplierResponsesDto implements Serializable {

    @JsonProperty("id")
    private Long id;

    private String name;

    private String address;

    private String email;

    private List<Product> product;

    @JsonIgnore
    private Date createAt;

    @JsonIgnore
    private Date updateAt;
}
