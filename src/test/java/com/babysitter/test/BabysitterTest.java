package com.babysitter.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.babysitter.main.Babysitter;

public class BabysitterTest {

	@Test
	public void whenAStartTimeOf1700OrLaterIsPassedThatNumberIsReturned() {
		Babysitter babysitter = new Babysitter();
		assertEquals("1700", babysitter.startTime(1700));
		assertEquals("2300", babysitter.startTime(2300));
	}
	
	@Test
	public void whenAStartTimeBefore1700IsEnteredAnErrorMessageReturns() {
		Babysitter babysitter = new Babysitter();
		assertEquals("This is too early", babysitter.startTime(1600));
	}
}
