package com.back.board.controller;

import com.back.board.dto.PersonDto;
import com.back.board.service.PersonService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
//@AllArgsConstructor
@RestController
@RequestMapping("/person")
public class PersonController {

//    private final PersonService personService;

    @Value("${properties.test}")
    private String test;
//
//    @GetMapping
//    public String getMessage(){
//        return "Hello";
//    }
//
//    @PostMapping
//    public ResponseEntity<String> save(@RequestBody PersonDto personDto) {
//        var status = personService.saveNewPerson(personDto);
//        return new ResponseEntity<>(status, HttpStatus.OK);
//
//    }

    @RequestMapping("/test")
    public void getTest(){
        log.info(test);
    }
}
