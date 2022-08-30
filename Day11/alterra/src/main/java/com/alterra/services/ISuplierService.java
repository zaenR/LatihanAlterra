package com.alterra.services;


import com.alterra.dtos.ProductRequestDto;
import com.alterra.dtos.ProductResponsesDto;
import com.alterra.dtos.SuplierRequestDto;
import com.alterra.dtos.SuplierResponsesDto;

import java.util.List;

public interface ISuplierService {
    SuplierResponsesDto addSuplier(SuplierRequestDto suplierRequestDto);
    List<SuplierResponsesDto> getAllSuplier();
    void removeOne(Long id);
}
