package com.slowrusher.alg.svc.services;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService{
    public String sayHello() {
        return "Hello world!";
    }
}
