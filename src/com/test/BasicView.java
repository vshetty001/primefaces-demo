package com.test;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("dtBasicView")
@SessionScoped
public class BasicView implements Serializable {
     
    private List<Car> cars;
     
    @Inject
    private CarService service;
 
    @PostConstruct
    public void init() {
    	System.out.println("--- Creating 10 new cars ----");
        cars = service.createCars(10);
    }
     
    public List<Car> getCars() {
       	System.out.println("--- Get all cars ----");
        return cars;
    }
 
    public void setService(CarService service) {
        this.service = service;
    }
}
