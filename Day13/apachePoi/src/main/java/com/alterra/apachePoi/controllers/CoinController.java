package com.alterra.apachePoi.controllers;

import com.alterra.apachePoi.dtos.CoinDto;
import com.alterra.apachePoi.dtos.ResponseDto;
import com.alterra.apachePoi.entities.Coin;
import com.alterra.apachePoi.services.ICoinService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/v1/excel")
public class CoinController {

    @Autowired
    private ICoinService coinService;

    @PostMapping("/upload")
    public ResponseEntity<ResponseDto<Coin>> bulkUpload (@RequestParam("file")MultipartFile file){
        ResponseDto responseDto = new ResponseDto();
        responseDto.setStatus(HttpStatus.OK.value());
        responseDto.setData(coinService.upload(file));
        return ResponseEntity.ok(responseDto);
    }

}
