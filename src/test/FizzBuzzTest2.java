package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import code.FizzBuzz;

class FizzBuzzTest2 {

	@Test
	void numberTests() {
		assertEquals("1", FizzBuzz.fizzBuzz2(1));
		assertEquals("2", FizzBuzz.fizzBuzz2(2));
		assertEquals("11", FizzBuzz.fizzBuzz2(11));
		assertEquals("13", FizzBuzz.fizzBuzz2(13));
		assertEquals("17", FizzBuzz.fizzBuzz2(17));
		assertEquals("19", FizzBuzz.fizzBuzz2(19));
		assertEquals("22", FizzBuzz.fizzBuzz2(22));
		assertEquals("23", FizzBuzz.fizzBuzz2(23));
		assertEquals("26", FizzBuzz.fizzBuzz2(26));
		assertEquals("29", FizzBuzz.fizzBuzz2(29));
		assertEquals("31", FizzBuzz.fizzBuzz2(31));
		assertEquals("34", FizzBuzz.fizzBuzz2(34));
		assertEquals("37", FizzBuzz.fizzBuzz2(37));
		assertEquals("38", FizzBuzz.fizzBuzz2(38));
		assertEquals("41", FizzBuzz.fizzBuzz2(41));
		assertEquals("43", FizzBuzz.fizzBuzz2(43));
		assertEquals("46", FizzBuzz.fizzBuzz2(46));
		assertEquals("47", FizzBuzz.fizzBuzz2(47));
		assertEquals("53", FizzBuzz.fizzBuzz2(53));
		assertEquals("58", FizzBuzz.fizzBuzz2(58));
		assertEquals("59", FizzBuzz.fizzBuzz2(59));
		assertEquals("61", FizzBuzz.fizzBuzz2(61));
		assertEquals("62", FizzBuzz.fizzBuzz2(62));
		assertEquals("67", FizzBuzz.fizzBuzz2(67));
		assertEquals("71", FizzBuzz.fizzBuzz2(71));
		assertEquals("73", FizzBuzz.fizzBuzz2(73));
		assertEquals("74", FizzBuzz.fizzBuzz2(74));
		assertEquals("79", FizzBuzz.fizzBuzz2(79));
		assertEquals("82", FizzBuzz.fizzBuzz2(82));
		assertEquals("83", FizzBuzz.fizzBuzz2(83));
		assertEquals("86", FizzBuzz.fizzBuzz2(86));
		assertEquals("89", FizzBuzz.fizzBuzz2(89));
		assertEquals("94", FizzBuzz.fizzBuzz2(94));
		assertEquals("97", FizzBuzz.fizzBuzz2(97));
	}
	
	@Test
	void fizzTests() {
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(3));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(6));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(9));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(18));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(27));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(33));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(39));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(51));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(54));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(57));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(66));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(69));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(78));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(81));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(87));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(93));
		assertEquals("Fizz", FizzBuzz.fizzBuzz2(99));
	}
	
	@Test
	void buzzTests() {
		assertEquals("Buzz", FizzBuzz.fizzBuzz2(5));
		assertEquals("Buzz", FizzBuzz.fizzBuzz2(10));
		assertEquals("Buzz", FizzBuzz.fizzBuzz2(25));
		assertEquals("Buzz", FizzBuzz.fizzBuzz2(50));
		assertEquals("Buzz", FizzBuzz.fizzBuzz2(55));
		assertEquals("Buzz", FizzBuzz.fizzBuzz2(65));
		assertEquals("Buzz", FizzBuzz.fizzBuzz2(85));
		assertEquals("Buzz", FizzBuzz.fizzBuzz2(95));
	}
	
	@Test
	void wowTests() {
		assertEquals("Wow", FizzBuzz.fizzBuzz2(4));
		assertEquals("Wow", FizzBuzz.fizzBuzz2(8));
		assertEquals("Wow", FizzBuzz.fizzBuzz2(16));
		assertEquals("Wow", FizzBuzz.fizzBuzz2(32));
		assertEquals("Wow", FizzBuzz.fizzBuzz2(44));
		assertEquals("Wow", FizzBuzz.fizzBuzz2(52));
		assertEquals("Wow", FizzBuzz.fizzBuzz2(64));
		assertEquals("Wow", FizzBuzz.fizzBuzz2(68));
		assertEquals("Wow", FizzBuzz.fizzBuzz2(76));
		assertEquals("Wow", FizzBuzz.fizzBuzz2(88));
		assertEquals("Wow", FizzBuzz.fizzBuzz2(92));
	}
	
	@Test
	void whoopTests() {
		assertEquals("Whoop", FizzBuzz.fizzBuzz2(7));
		assertEquals("Whoop", FizzBuzz.fizzBuzz2(14));
		assertEquals("Whoop", FizzBuzz.fizzBuzz2(49));
		assertEquals("Whoop", FizzBuzz.fizzBuzz2(77));
		assertEquals("Whoop", FizzBuzz.fizzBuzz2(91));
		assertEquals("Whoop", FizzBuzz.fizzBuzz2(98));
	}
	
	@Test
	void fizzWowTests() {
		assertEquals("FizzWow", FizzBuzz.fizzBuzz2(12));
		assertEquals("FizzWow", FizzBuzz.fizzBuzz2(24));
		assertEquals("FizzWow", FizzBuzz.fizzBuzz2(36));
		assertEquals("FizzWow", FizzBuzz.fizzBuzz2(48));
		assertEquals("FizzWow", FizzBuzz.fizzBuzz2(72));
		assertEquals("FizzWow", FizzBuzz.fizzBuzz2(96));
	}
	
	@Test
	void fizzBuzzTests() {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz2(15));
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz2(30));
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz2(45));
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz2(75));
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz2(90));
	}
	
	@Test
	void buzzWowTests() {
		assertEquals("BuzzWow", FizzBuzz.fizzBuzz2(20));
		assertEquals("BuzzWow", FizzBuzz.fizzBuzz2(40));
		assertEquals("BuzzWow", FizzBuzz.fizzBuzz2(80));
	}
	
	@Test
	void fizzWhoopTests() {
		assertEquals("FizzWhoop", FizzBuzz.fizzBuzz2(21));
		assertEquals("FizzWhoop", FizzBuzz.fizzBuzz2(42));
		assertEquals("FizzWhoop", FizzBuzz.fizzBuzz2(63));
	}
	
	@Test
	void whoopWowTests() {
		assertEquals("WhoopWow", FizzBuzz.fizzBuzz2(28));
		assertEquals("WhoopWow", FizzBuzz.fizzBuzz2(56));
	}
	
	@Test
	void buzzWhoopTests() {
		assertEquals("BuzzWhoop", FizzBuzz.fizzBuzz2(35));
		assertEquals("BuzzWhoop", FizzBuzz.fizzBuzz2(70));
	}
	
	@Test
	void fizzBuzzWowTests() {
		assertEquals("FizzBuzzWow", FizzBuzz.fizzBuzz2(60));
	}
	
	@Test
	void fizzWhoopWowTests() {
		assertEquals("FizzWhoopWow", FizzBuzz.fizzBuzz2(84));
	}
	
	@Test
	void fizzBuzzWhoopWowTest() {
		assertEquals("FizzBuzzWhoopWow", FizzBuzz.fizzBuzz2(0));
		assertEquals("FizzBuzzWhoopWow", FizzBuzz.fizzBuzz2(420));
	}
}
