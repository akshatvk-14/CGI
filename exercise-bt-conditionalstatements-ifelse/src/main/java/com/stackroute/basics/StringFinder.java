package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
	// Create Scanner object as instance variable
	Scanner scnInp = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Get three strings from the user
		StringFinder stringFinder = new StringFinder();
		String searchString, firstString, secondString;
		searchString = stringFinder.getInput();
    	firstString = stringFinder.getInput();
    	secondString = stringFinder.getInput();
    	displayResult(findString(searchString, firstString, secondString));
	}

	public String getInput() {

		return scnInp.nextLine();
	}

	public static void displayResult(int result) {
		// displays the result
		if (result == 1) {
			System.out.println("Found as expected");
		} else if (result == 0) {
			System.out.println("Not found");
		} else if (result == -1) {
			System.out.println("Empty string or null");
		}
	}

	public static int findString(String searchString, String firstString, String secondString) {
		if (searchString == null || firstString == null || secondString == null ) {
			return -1;
		}
		if(firstString.length()==0 || secondString.length()==0 || searchString.length()==0) {
			return -1;
		}else if(!(searchString.contains(firstString) && searchString.contains(secondString))) { 
        	return 0;
        }else if(searchString.indexOf(firstString) < searchString.indexOf(secondString)) { 
        	return 1;
        }
		return 0;
	}

	public void closeScanner() {
		scnInp.close();
	}
}





//package com.stackroute.basics;
//
//public class StringFinder {
//    //Create Scanner object as instance variable
//
//    public static void main(String[] args) {
//        //Get three strings from the user
//    }
//
//    public String getInput() {
//        return null;
//    }
//
//    public void displayResult(int result) {
//        //displays the result
//    }
//
//    public int findString(String searchString, String firstString, String secondString) {
//        return 0;
//    }
//
//    public void closeScanner() {
//    }
//}
