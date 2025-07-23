package com.springboot.SpringBootSecondDemo.service;

import com.springboot.SpringBootSecondDemo.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public void addLaptop(Laptop lap) {
        System.out.println("Laptop added");
    }

    public boolean isGoogForProgramming(Laptop lap) {
        return true;
    }
}
