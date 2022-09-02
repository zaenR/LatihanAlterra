package com.alterra.apachePoi.services;

import com.alterra.apachePoi.entities.Coin;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ICoinService {

    List<Coin> upload (MultipartFile file);

}
