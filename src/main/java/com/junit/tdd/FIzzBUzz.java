package com.junit.tdd;

public class FIzzBUzz {

    //If number is divisible by 5, print Buzz
    // If number is divisible by3 and 5, print FizzBuzz
    //If number is not divisible by 3 or 5, then print the number

    // If number is divisible by 3, print Fizz
    /*public static String compute(int i) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(i);
        }
    }*/

    public static String compute(int i) {
        StringBuilder result = new StringBuilder();
        if (i % 3 == 0) {
            result.append("Fizz");
        }
        if (i % 5 == 0) {
            result.append("Buzz");
        }

        if (result.isEmpty()) {
            result.append(i);
        }
        return result.toString();
    }

}
