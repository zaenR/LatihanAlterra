package com.alterra.services;


import com.alterra.dtos.ProductRequestDto;
import com.alterra.dtos.ProductResponsesDto;

import java.util.List;

public interface IProductService {
    ProductResponsesDto addProduct(ProductRequestDto productRequestDto);
    List<ProductResponsesDto> getAllProduct();
    void removeOne(Long id);
}
