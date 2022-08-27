package com.alterra.dtos;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ProductRequestDto implements Serializable {
    private Long id;
    private String name;
    private String productDesc;
    private Long suplierId;
}
