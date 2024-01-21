package com.tesinitsyn.t1consultingrest;

import com.tesinitsyn.t1consultingrest.service.SortingAndCountingService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SortingAndCountingServiceTests {
    @Test
    public void testCountCharacters() {
        String input = "aaaaabcccc";
        String expectedOutput = "\"a\": 5, \"c\": 4, \"b\": 1";
        SortingAndCountingService sortingAndCountingService = new SortingAndCountingService();
        String actualOutput =sortingAndCountingService.countCharacters(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testCountCharactersWithSingleCharacter() {
        String input = "aaaaa";
        String expectedOutput = "\"a\": 5";
        SortingAndCountingService sortingAndCountingService = new SortingAndCountingService();
        String actualOutput = sortingAndCountingService.countCharacters(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCountCharactersWithEmptyString() {
        String input = "";
        String expectedOutput = "Input was empty string";
        SortingAndCountingService sortingAndCountingService = new SortingAndCountingService();
        String actualOutput = sortingAndCountingService.countCharacters(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCountCharactersWithMixedCharacters() {
        String input = "ababccc";
        String expectedOutput = "\"c\": 3, \"a\": 2, \"b\": 2";
        SortingAndCountingService sortingAndCountingService = new SortingAndCountingService();
        String actualOutput = sortingAndCountingService.countCharacters(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testWithALotOfCharacters(){
        String input = "aaaabcbcbcbcdefjkkkkkkk";
        String expectedOutput = "\"k\": 7, \"a\": 4, \"b\": 4, \"c\": 4, \"d\": 1, \"e\": 1, \"f\": 1, \"j\": 1";
        SortingAndCountingService sortingAndCountingService = new SortingAndCountingService();
        String actualOutput = sortingAndCountingService.countCharacters(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
