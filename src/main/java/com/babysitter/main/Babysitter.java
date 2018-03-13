package com.babysitter.main;

public class Babysitter {

	public String startTime(Integer startHour) {
		if (startHour < 1700)
			return "This is too early";

		return startHour.toString();
	}
}
