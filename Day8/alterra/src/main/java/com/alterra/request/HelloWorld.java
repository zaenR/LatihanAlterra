package com.alterra.request;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelloWorld {
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
