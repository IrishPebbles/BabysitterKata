package com.babysitter.main;

public class Babysitter {

	public String startTime(Integer startHour) {
		if (startHour > 400 && startHour < 1700)
			return "This is too early";

		return startHour.toString();
	}

	public String endTime(Integer endHour) {
		if (endHour > 400 && endHour < 1700)
			return "This is too late";
		
		return endHour.toString();
	}
}
