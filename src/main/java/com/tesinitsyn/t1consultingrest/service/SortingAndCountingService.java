package com.tesinitsyn.t1consultingrest.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SortingAndCountingService {
    public String countCharacters(String input){
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        charCount.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> result.append("\"").append(entry.getKey()).append("\": ").append(entry.getValue()).append(", "));
        result.delete(result.length() - 2, result.length());
        return result.toString();
    }
}
