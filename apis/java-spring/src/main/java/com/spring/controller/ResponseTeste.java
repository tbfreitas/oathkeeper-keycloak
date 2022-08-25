package com.spring.controller;

import com.spring.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseTeste  {

    @GetMapping("/dev-info")
    public ResponseEntity<Person> index() {

        Person pessoa = new Person(
                "Tarcisio",
                "Brasilia",
                "Software Developer",
                32,
                "Brasil");
        return ResponseEntity.status(HttpStatus.OK).body(pessoa);
    }

}