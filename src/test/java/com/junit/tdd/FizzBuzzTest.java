package com.junit.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {


    // If number is divisible by 3, print Fizz
    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
    void testForDivisibleThree() {
        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }

    //If number is divisible by 5, print Buzz
    @DisplayName("Divisible by Five")
    @Test
    @Order(2)
    void testForDivisibleFive() {
        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }


    // If number is divisible by3 and 5, print FizzBuzz
    @DisplayName("Divisible by Three an Five")
    @Test
    @Order(3)
    void testForDivisibleThreeFive() {
        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
    }

    //If number is not divisible by 3 or 5, then print the number
    @DisplayName("Not divisible by Three aor Five")
    @Test
    @Order(4)
    void testForNotDivisibleThreeFive() {
        String expected = "1";

        assertEquals(expected, FizzBuzz.compute(1), "Should return 1");
    }

    @DisplayName("Testing with Small Data File")
    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @Order(5)
    void testSmallDataFile( int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value));
    }
    @DisplayName("Testing with Small Source Data")
    @ParameterizedTest(name = "{0}{1}, u21D2 Overflow")
    @CsvSource(value = {
            "1,1",
            "5,Buzz"
    })
    @Order(6)
    void testSmallCSVSource( int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value));
    }
}
