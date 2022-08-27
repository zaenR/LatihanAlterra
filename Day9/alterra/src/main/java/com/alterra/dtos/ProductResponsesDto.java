package com.alterra.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(value = {"createAt", "updateAt"}, allowGetters = true)
@Getter
@Setter
public class ProductResponsesDto implements Serializable {

    @JsonProperty("id")
    private Long id;

    private String name;

    private String description;


    @JsonIgnore
    private Date createAt;

    @JsonIgnore
    private Date updateAt;
}
