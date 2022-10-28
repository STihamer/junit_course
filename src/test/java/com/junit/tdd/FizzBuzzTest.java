package com.junit.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {






    // If number is divisible by 3, print Fizz
    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
     void testForDivisibleThree(){
         String expected = "Fizz";

         assertEquals(expected, FIzzBUzz.compute(3), "Should return Fizz");
     }

    //If number is divisible by 5, print Buzz
    @DisplayName("Divisible by Five")
    @Test
    @Order(2)
    void testForDivisibleFive(){
        String expected = "Buzz";

        assertEquals(expected, FIzzBUzz.compute(5), "Should return Buzz");
    }



    // If number is divisible by3 and 5, print FizzBuzz
    @DisplayName("Divisible by Three an Five")
    @Test
    @Order(3)
    void testForDivisibleThreeFive(){
        String expected = "FizzBuzz";

        assertEquals(expected, FIzzBUzz.compute(15), "Should return FizzBuzz");
    }

    //If number is not divisible by 3 or 5, then print the number
    @DisplayName("Not divisible by Three aor Five")
    @Test
    @Order(4)
    void testForNotDivisibleThreeFive(){
        String expected = "1";

        assertEquals(expected, FIzzBUzz.compute(1), "Should return 1");
    }
}
