package com.tesinitsyn.t1consultingrest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/string")
public class StringController {
    @PostMapping("/getSortedString")
    public ResponseEntity<String> getString(@RequestBody String string){
        String response = "";
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}

