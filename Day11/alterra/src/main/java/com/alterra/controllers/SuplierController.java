package com.alterra.controllers;

import com.alterra.dtos.ProductRequestDto;
import com.alterra.dtos.ProductResponsesDto;
import com.alterra.dtos.SuplierRequestDto;
import com.alterra.dtos.SuplierResponsesDto;
import com.alterra.services.IProductService;
import com.alterra.services.ISuplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/suplier")
public class SuplierController {

    @Autowired
    private ISuplierService suplierService;

    @PostMapping
    public ResponseEntity<SuplierResponsesDto> save(@RequestBody SuplierRequestDto suplierRequestDto){
        SuplierResponsesDto suplierResponsesDto = suplierService.addSuplier(suplierRequestDto);
        return new ResponseEntity<>(suplierResponsesDto, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<SuplierResponsesDto>> getAllProduct(){
        List<SuplierResponsesDto> response = suplierService.getAllSuplier();
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<SuplierResponsesDto> update(@RequestBody SuplierRequestDto suplierRequestDto){
        SuplierResponsesDto suplierResponsesDto = suplierService.addSuplier(suplierRequestDto);
        return new ResponseEntity<>(suplierResponsesDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id){
        suplierService.removeOne(id);
    }
}
