package com.tesinitsyn.t1consultingrest.controller;

import com.tesinitsyn.t1consultingrest.service.SortingAndCountingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/string")
public class StringController {
    private final SortingAndCountingService sortingAndCountingService;

    public StringController(SortingAndCountingService sortingAndCountingService) {
        this.sortingAndCountingService = sortingAndCountingService;
    }

    @PostMapping("/getSortedString")
    public ResponseEntity<String> getString(@RequestBody String string){
        String response = sortingAndCountingService.countCharacters(string);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}

