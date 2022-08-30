package com.alterra.controllers;

import com.alterra.dtos.ProductRequestDto;
import com.alterra.dtos.ProductResponsesDto;
import com.alterra.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponsesDto> save(@RequestBody ProductRequestDto productRequestDto){
        ProductResponsesDto productResponsesDto = productService.addProduct(productRequestDto);
        return new ResponseEntity<>(productResponsesDto, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponsesDto>> getAllProduct(){
        List<ProductResponsesDto> response = productService.getAllProduct();
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<ProductResponsesDto> update(@RequestBody ProductRequestDto productRequestDto){
        ProductResponsesDto productResponsesDto = productService.addProduct(productRequestDto);
        return new ResponseEntity<>(productResponsesDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id){
        productService.removeOne(id);
    }
}
