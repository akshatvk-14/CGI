package com.stackroute.exercises;

import java.time.LocalDate;

public class FindDay {

    //write logic to find day of the date and return result
    public String findDay(int month, int day, int year) {
    	String findDay = new String();
    	int check = 0;
    	if(month < 1 || month >12) {
    		check = 1;
    		findDay = "Give month in range";
    	}
    	if(day < 1 || day > 31) {
    		check = 1;
    		findDay = findDay + "Give day in range";
    	}
    	if(year < 2000 || year > 3000) {
    		check = 1;
    		findDay = findDay + "Give year in range";
    	}
    	if(check == 1) {
    		return findDay;
    	}
    	return LocalDate.of(year, month, day).getDayOfWeek().name();
    }
}





//package com.stackroute.exercises;
//
//
//public class FindDay {
//
//    //write logic to find day of the date and return result
//    public String findDay(int month, int day, int year) {
//        return null;
//    }
//}
