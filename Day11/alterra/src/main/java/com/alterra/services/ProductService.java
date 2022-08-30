package com.alterra.services;

import com.alterra.dtos.ProductRequestDto;
import com.alterra.dtos.ProductResponsesDto;
import com.alterra.entities.Product;
import com.alterra.entities.Suplier;
import com.alterra.repositories.ProductRepo;
import com.alterra.repositories.SuplierRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
//@Transactional
public class ProductService implements IProductService{

    @Autowired
    ProductRepo productRepo;

    @Autowired
    SuplierRepo suplierRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ProductResponsesDto addProduct(ProductRequestDto productRequestDto) {
        validate(productRequestDto);

        Optional<Suplier> suplierOptional = suplierRepo.findById(productRequestDto.getSuplierId());
        if (!suplierOptional.isPresent())
            throw new RuntimeException("Suplier not found. Please check your corresponding suplier Id!");

        Product product = convertToEntity(productRequestDto);
        product.setSuplier(suplierOptional.get());
        Product createProduct = productRepo.save(product);
        return convertToDto(createProduct);
    }

    @Override
    public List<ProductResponsesDto> getAllProduct() {
        List<Product> listProduct = productRepo.findAll();
        if(!listProduct.isEmpty()){
            return listProduct.stream()
                    .map(product -> modelMapper.map(product, ProductResponsesDto.class))
                    .collect(Collectors.toList());
        }

        return Collections.emptyList();
    }

    @Override
    public void removeOne(Long id) {
        Optional<Product> productOptional = productRepo.findById(id);
        if(!productOptional.isPresent()){
            throw new RuntimeException("Product not found. Please check your corresponding product Id!");
        }
        productRepo.deleteById(id);
    }
    
    private Product convertToEntity(ProductRequestDto productRequestDto){
        return modelMapper.map(productRequestDto, Product.class);
    }

    private ProductResponsesDto convertToDto(Product product){
        return modelMapper.map(product, ProductResponsesDto.class);
    }

    private void validate(ProductRequestDto resquestDTO) {
        if (resquestDTO == null) {
            throw new RuntimeException("Body request cannot be empty");
        }

        if (StringUtils.isEmpty(resquestDTO.getName())) {
            throw new RuntimeException("name is required");
        }

    }

}
