package com.alterra.unittest;

import com.alterra.dtos.ProductRequestDto;
import com.alterra.dtos.ProductResponsesDto;
import com.alterra.entities.Product;
import com.alterra.entities.Suplier;
import com.alterra.repositories.ProductRepo;
import com.alterra.repositories.SuplierRepo;
import com.alterra.services.ProductService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {
    
    @Mock
    ProductRepo productRepo;
    
    @Mock
    SuplierRepo suplierRepo;

    ModelMapper modelMapper = spy(new ModelMapper());

    @InjectMocks
    ProductService productService = spy(new ProductService());

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void givenValidRequest_whenCreateNewProduct_thenShouldBeCreated(){
        Suplier suplier = new Suplier();
        suplier.setId(1l);
        suplier.setName("suplier 1");
        suplier.setAddress("addres suplier 1");
        suplier.setEmail("email");

        ProductRequestDto requestDto = new ProductRequestDto();
        requestDto.setName("Product 1");
        requestDto.setProductDesc("Description Product 1");
        requestDto.setSuplierId(1l);
        when(suplierRepo.findById(requestDto.getSuplierId()))
                .thenReturn(Optional.of(suplier));

        Product product = modelMapper.map(requestDto, Product.class);
        product.setId(1L);

        when(productRepo.save(any(Product.class)))
                .thenReturn(product);

        ProductResponsesDto responseDto = productService.addProduct(requestDto);
        assertThat(responseDto.getId()).isNotNull();
        assertThat(responseDto.getName()).isEqualTo(requestDto.getName());
    }

    @Test(expected = RuntimeException.class)
    public void givenRequestWithNoValidSuplierId_whenCreateNewProduct_thenShouldThrowException() {
        Suplier suplier = new Suplier();
        suplier.setId(1l);
        suplier.setName("suplier 1");
        suplier.setAddress("addres suplier 1");
        suplier.setEmail("email");

        ProductRequestDto requestDto = new ProductRequestDto();
        requestDto.setName("Product 1");
        requestDto.setProductDesc("Description Product 1");
        requestDto.setSuplierId(2l);
        when(suplierRepo.findById(requestDto.getSuplierId()))
                .thenReturn(Optional.of(suplier));

        productService.addProduct(requestDto);
    }

    @Test(expected = RuntimeException.class)
    public void givenRequestWithNameEmpty_whenCreateNewProduct_thenShouldThrowException() {
        ProductRequestDto requestDto = new ProductRequestDto();
        requestDto.setName("");
        requestDto.setProductDesc("Description Product 1");
        requestDto.setSuplierId(1l);

        productService.addProduct(requestDto);
    }

    @Test
    public void givenRequestValid_whenDeleteProductById_thenDeleteProduct() {
        Product product = new Product();
        product.setId(1l);
        product.setName("product 1");

        when(productRepo.findById(product.getId()))
                .thenReturn(Optional.of(product));

        productService.removeOne(product.getId());
        verify(productRepo).deleteById(product.getId());
    }

    @Test(expected = RuntimeException.class)
    public void givenRequestWithOutId_whenDeleteProductById_thenSouldThrowException() {
        Product product = new Product();

        product.setName("product 1");

        given(productRepo.findById(anyLong()))
                .willReturn(Optional.ofNullable(null));
        productService.removeOne(product.getId());
    }

    @Test
    public void givenValidRequest_whenGetAllProducts_thenShouldReturnAllProducts() {
        List<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product());

        given(productRepo.findAll()).willReturn(listProduct);
        List<ProductResponsesDto> actual = listProduct.stream()
                .map(product -> modelMapper.map(product, ProductResponsesDto.class))
                .collect(Collectors.toList());
        List<ProductResponsesDto> expected = productService.getAllProduct();

        assertThat(actual).isEqualTo(expected);
        verify(productRepo).findAll();
    }




}
