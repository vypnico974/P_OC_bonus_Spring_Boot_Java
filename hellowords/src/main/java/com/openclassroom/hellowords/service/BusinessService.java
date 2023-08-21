package com.openclassroom.hellowords.service;

import org.springframework.stereotype.Component;

import com.openclassroom.hellowords.model.Helloworld;

@Component
public class BusinessService {

    public Helloworld getHelloworld(){
        Helloworld hw = new Helloworld();
        return hw;
    }
    
}
