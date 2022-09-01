package com.spring.controller;

import com.spring.model.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class ResponseTeste  {

    @GetMapping("/v1/cars")
    public ResponseEntity<List<Car>> index() {

        List<Car> cars = new LinkedList<>();
        Car FirstCar = new Car(
                "Civic",
                "Honda",
                "Yellow",
                2018
        );
        Car SecondCar = new Car(
                "Punto",
                "Fiat",
                "White",
                2012
        );

        cars.add(FirstCar);
        cars.add(SecondCar);

        return ResponseEntity.status(HttpStatus.OK).body(cars);
    }

}