package com.stackroute.basics;


import java.util.Scanner;

public class NumberAverage {
    public static void main(String[] args) {
        new NumberAverage().getArrayValues();
    }

    //get the values of the array from the user
    public void getArrayValues() {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter number of values:");
        int size= sc.nextInt();
        sc.nextLine();
        if(size <=0){
            System.out.println("Empty array") ;
            return;
        }
        int [] a = new int[size];
        //System.out.println("Enter the values:");
        for(int i=0; i<size; i++){
            a[i]= sc.nextInt();
        }
        String result = findAverage(a);
        System.out.println(result);
        
    }

    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {
        int sum =0;
        if(inputArray.length <=0){
            return "Empty array";
        }
        for(int num : inputArray){
            if(num<0){
                return "Give proper positive integer values";
            }
            sum = sum + num;
        }
        return "The average value is: " + (sum/inputArray.length);
    }
}



//package com.stackroute.basics;
//import java.util.*;
//
//public class NumberAverage {
//	
//	private int informs = 0;
//    
//	public static void main(String[] args) {
//        new NumberAverage().getArrayValues();
//    }
//
//    //get the values of the array from the user
//    public void getArrayValues() {
//    	
//    	Scanner sc = new Scanner(System.in);
//    	
//    	int num = -1;
//    	num = sc.nextInt();
//    	
//    	if(num == -1) {
//    		informs = num;
//    	}
//    	
//    	if(num>0) {
//    		int[] input = new int[num];
//        	
//        	for(int i=0;i<num;i++) {
//        		input[i] = sc.nextInt();
//        		findAverage(input);
//        	}
//    	}
//    	
//    	sc.close();
//    	int[] arr = new int[1];
//    	findAverage(arr);
//
//    }
//
//    //write here logic to calculate the average an array
//    public String findAverage(int[] inputArray) {
//    	
//    	if(informs == -1) {
//    		return ("Empty array");
//    	}
//    	
//    	if((inputArray.length) == 0) {
//    		return ("Empty array");
//    	}
//    	int sum = 0;
//    	for(int i:inputArray) {
//    		
//    		if(i<0) {
//    			return ("Give proper positive integer values");
//    		}
//    		sum = sum + i;
//    	}
//    	
//    	int avg = sum / inputArray.length;
//    	String ans = String.valueOf(avg);
//    	
//        return ("The average value is: " + ans);
//    }
//}
///*package com.stackroute.basics;
//
//
//public class NumberAverage {
//
//    public static void main(String[] args) {
//        new NumberAverage().getArrayValues();
//    }
//
//    //get the values of the array from the user
//    public void getArrayValues() {
//
//    }
//
//    //write here logic to calculate the average an array
//    public String findAverage(int[] inputArray) {
//
//        return null;
//    }
//}
//*/