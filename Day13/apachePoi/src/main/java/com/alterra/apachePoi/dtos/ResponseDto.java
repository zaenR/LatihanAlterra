package com.alterra.apachePoi.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ResponseDto <T>{
    private int status;
    private List<String> message = new ArrayList<>();
    private T data;
}
