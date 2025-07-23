package com.springboot.SpringBootSecondDemo.service;

import com.springboot.SpringBootSecondDemo.model.Laptop;
import com.springboot.SpringBootSecondDemo.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
//        System.out.println("Laptop added");
    }

    public boolean isGoogForProgramming(Laptop lap) {
        return true;
    }
}
