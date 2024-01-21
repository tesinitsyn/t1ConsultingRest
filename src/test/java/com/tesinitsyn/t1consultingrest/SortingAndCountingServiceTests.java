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
}
