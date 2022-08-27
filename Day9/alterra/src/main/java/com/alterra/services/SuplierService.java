package com.alterra.services;

import com.alterra.dtos.ProductRequestDto;
import com.alterra.dtos.ProductResponsesDto;
import com.alterra.dtos.SuplierRequestDto;
import com.alterra.dtos.SuplierResponsesDto;
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
public class SuplierService implements ISuplierService{

    @Autowired
    SuplierRepo suplierRepo;

    @Autowired
    ProductRepo productRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public SuplierResponsesDto addSuplier(SuplierRequestDto suplierRequestDto) {
        validate(suplierRequestDto);

        Suplier suplier = convertToEntity(suplierRequestDto);
        Suplier createSuplier = suplierRepo.save(suplier);
        return convertToDto(createSuplier);
    }

    @Override
    public List<SuplierResponsesDto> getAllSuplier() {
        List<Suplier> suplierList = suplierRepo.findAll();
        if(!suplierList.isEmpty()){
            return suplierList.stream()
                    .map(suplier -> modelMapper.map(suplier, SuplierResponsesDto.class))
                    .collect(Collectors.toList());
        }

        return Collections.emptyList();
    }

    @Override
    public void removeOne(Long id) {
        suplierRepo.deleteById(id);
    }
    
    private Suplier convertToEntity(SuplierRequestDto suplierRequestDto){
        return modelMapper.map(suplierRequestDto, Suplier.class);
    }

    private SuplierResponsesDto convertToDto(Suplier suplier){
        return modelMapper.map(suplier, SuplierResponsesDto.class);
    }

    private void validate(SuplierRequestDto resquestDTO) {
        if (resquestDTO == null) {
            throw new RuntimeException("Body request cannot be empty");
        }

        if (StringUtils.isEmpty(resquestDTO.getName())) {
            throw new RuntimeException("name is required");
        }

        if (StringUtils.isEmpty(resquestDTO.getAddress())){
            throw new RuntimeException("address is required");
        }

    }

}
