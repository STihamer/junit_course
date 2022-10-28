package com.junit.junitProject;

import com.junit.tdd.FizzBuzz;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitProjectApplication {

	public static void main(String[] args) {
		for (int i=1; i <= 100; i++){
			//System.out.println(i + "," + FizzBuzz.compute(i));
			System.out.println(FizzBuzz.compute(i));
		}
		SpringApplication.run(JunitProjectApplication.class, args);
	}

}
