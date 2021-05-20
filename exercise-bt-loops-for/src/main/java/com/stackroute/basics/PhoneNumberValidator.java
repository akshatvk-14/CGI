package com.stackroute.basics;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PhoneNumberValidator object = new PhoneNumberValidator();
        String input = object.getInput();
        boolean result = object.validatePhoneNumber(input);
        object.displayResult(result);
    }

    public String getInput() {
        //System.out.println("Enter phone number");
        String inputStr = sc.nextLine();
        return inputStr;
    }

    public void displayResult(boolean result) {
       if(result){
           System.out.println("Valid");
       }else{
           System.out.println("Invalid or empty string");
       }
    }

    public boolean validatePhoneNumber(String s) {
    	if(s == null ) {
    		return false;
    	}
        String parsedStr = "";
        int noOfDashes= 0;
        for(int i=0; i< s.length(); i++){
            char charAtI = s.charAt(i);
            if(Character.isDigit(charAtI)){
                parsedStr = parsedStr + charAtI;
            }
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i) != '-' ){
                return false;
            }
            if(s.charAt(i) == '-'){
                noOfDashes++;
            }
        }
        if(parsedStr.length()!=10 || noOfDashes > 2){
            return false;
        }else{
            return true;
        }
    }
}



//package com.stackroute.basics;
//
//import java.util.*;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class PhoneNumberValidator {
//    //Create Scanner object as instance variable
//	
//    Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//        PhoneNumberValidator object = new PhoneNumberValidator();
//        String input = object.getInput();
//        boolean result = object.validatePhoneNumber(input);
//        object.displayResult(result);
//    }
//
//    public String getInput() {
//    	
//    	Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Phone Number : ");
//		String tempVar = sc.nextLine();
//		tempVar = tempVar.toLowerCase();
//		
//		sc.close();
//		
//		return tempVar;
//    	
//    }
//
//    public void displayResult(boolean result) {
//    	
//    	if(result == true) {
//			System.out.println("Valid");
//		}
//		else {
//			System.out.println("Invalid or empty string");
//		}
//       
//    }
//
//    public boolean validatePhoneNumber(String s) {
//       
//    	int numLen = s.length();
//		int count = 0;
//		
//		if(numLen < 10) {
//			return false;
//		}
//		
//		for(int i=0; i<numLen; i++) {
//			
//			if(s.charAt(i) == '-') {
//				continue;
//			}
//			
//			int a = s.charAt(i); 
//			if(a>=48 && a<=57) {
//				count++;
//			}
//			else {
//				break;
//			}
//			
//		}
//		
//		if(count == 10) {
//			return true;
//		}
//		else {
//			return false;
//		}
//    }
//		
//		
//		
//}
//
//
//
//
//
////package com.stackroute.basics;
////
////import java.util.Scanner;
////import java.util.StringTokenizer;
////
////public class PhoneNumberValidator {
////    //Create Scanner object as instance variable
////    Scanner sc = new Scanner(System.in);
////    public static void main(String[] args) {
////        PhoneNumberValidator object = new PhoneNumberValidator();
////        String input = object.getInput();
////        boolean result = object.validatePhoneNumber(input);
////        object.displayResult(result);
////    }
////
////    public String getInput() {
////      return null;
////    }
////
////    public void displayResult(boolean result) {
////       
////    }
////
////    public boolean validatePhoneNumber(String s) {
////       return false;
////    }
////}
