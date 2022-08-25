package com.alterra.controllers;

import com.alterra.request.HelloWorld;
import com.alterra.services.ServiceHelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/messages")
public class ControllerHelloWorld {

    @Autowired
    private ServiceHelloWorld serviceHelloWorld;

    //Request Get Mapping digunakan untuk menampilkan atau menarik data dari database
    @GetMapping
    public String Welcome(){
        return  serviceHelloWorld.find();
    }

    //Request Post mapping digunakan untuk menambah data
    @PostMapping
    public String save(@RequestBody HelloWorld helloWorld){
        return serviceHelloWorld.addNote(helloWorld.getNote());
    }

    //Request Delete Mapping digunakan untuk menghapus data
    @DeleteMapping
    public void delete(){
        serviceHelloWorld.delete();
    }
}
