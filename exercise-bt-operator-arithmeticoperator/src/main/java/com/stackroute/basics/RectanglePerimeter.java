package com.stackroute.basics;
import java.util.Scanner;

public class RectanglePerimeter {
	public static void main(String[] args) {
		new RectanglePerimeter().getValues();
	}

	// get user input from console
	public void getValues() {
		Scanner scanInp = new Scanner(System.in);
		//System.out.println("Enter the length");
		double length = scanInp.nextDouble();
		// System.out.println("Enter the breadth");
		double breadth = scanInp.nextDouble();
		double perimeter = perimeterCalculator(length, breadth);
		System.out.println(perimeter);
	}

	// write logic to find perimeter of rectangle here
	public double perimeterCalculator(double length, double breadth) {
		double perimeter = 2*length + 2*breadth;
		return perimeter;
	}
}




//package com.stackroute.basics;
//
//
//
//public class RectanglePerimeter {
//    public static void main(String[] args) {
//        new RectanglePerimeter().getValues();
//    }
//
//    //get user input from console
//    public void getValues() {
//
//    }
//
//    //write logic to find perimeter of rectangle here
//    public double perimeterCalculator(double length, double breadth) {
//        return 0;
//    }
//}
