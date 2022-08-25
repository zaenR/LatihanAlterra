package com.alterra.services;

import com.alterra.request.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceHelloWorld {

    @Autowired
    private HelloWorld helloWorld;
    public String find(){
        return helloWorld.getNote();
    }

    public String addNote(String note){
        helloWorld.setNote(note);
        return helloWorld.getNote();
    }

    public void delete(){
        helloWorld.setNote("");
    }
}
