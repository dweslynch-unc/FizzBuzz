package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import code.FizzBuzz;

class FizzBuzzTest {

	@Test
	void test() {
		assertEquals("FizzBuzz", 	FizzBuzz.fizzBuzz(0));
		assertEquals("1", 			FizzBuzz.fizzBuzz(1));
		assertEquals("Fizz", 		FizzBuzz.fizzBuzz(3));
		assertEquals("Buzz", 		FizzBuzz.fizzBuzz(5));
		assertEquals("Fizz", 		FizzBuzz.fizzBuzz(6));
		assertEquals("FizzBuzz",	FizzBuzz.fizzBuzz(15));
		assertEquals("16", 			FizzBuzz.fizzBuzz(16));
		assertEquals("Buzz", 		FizzBuzz.fizzBuzz(20));
		assertEquals("FizzBuzz", 	FizzBuzz.fizzBuzz(30));
		assertEquals("Fizz", 		FizzBuzz.fizzBuzz(99));
		assertEquals("Buzz", 		FizzBuzz.fizzBuzz(100));
	}

}
