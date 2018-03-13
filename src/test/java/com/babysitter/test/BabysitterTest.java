package com.babysitter.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.babysitter.main.Babysitter;

public class BabysitterTest {

	Babysitter babysitter;
	
	@Before
	public void startUp() {
		babysitter = new Babysitter();
	}
	
	@Test
	public void whenAStartTimeOf1700OrLaterIsPassedThatNumberIsReturned() {
		assertEquals("1700", babysitter.startTime(1700));
		assertEquals("2300", babysitter.startTime(2300));
	}
	
	@Test
	public void whenAStartTimeBefore1700IsPassedAnErrorMessageReturns() {
		assertEquals("This is too early", babysitter.startTime(1600));
	}
	
	@Test
	public void whenAnEndTimeOf0400OrEarlierIsPassedThatNumberIsReturned() {
		assertEquals("300", babysitter.endTime(300));
		assertEquals("2359", babysitter.endTime(2359));
	}
	
	@Test
	public void whenAnEndTimeAfter0400IsPassedAnErrorMessageReturns() {
		assertEquals("This is too late", babysitter.endTime(500));
	}
}
