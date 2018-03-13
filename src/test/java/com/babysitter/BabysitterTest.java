package com.babysitter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BabysitterTest {

	@Test
	public void whenAStartTimeOf5PMOrLaterIsPassedThatNumberIsReturned() {
		Babysitter babysitter = new Babysitter();
		assertEquals("5", babysitter.startTime(5));
		assertEquals("8", babysitter.startTime(8));
	}
}
