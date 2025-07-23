package com.springboot.SpringBootSecondDemo.repo;

import com.springboot.SpringBootSecondDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Laptop saved in database");
    }
}
