package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
    private static Scanner scan;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
    	  int first, second, operator;
          String repeat= "y", answer="";
          while ( repeat.equals(Character.toString('y'))  || repeat.equals(Character.toString('Y'))){
              //System.out.println("Enter the first number:");
              first = scan.nextInt();
              scan.nextLine();
              //System.out.println("Enter the second number:");
              second  = scan.nextInt();
              scan.nextLine();
              //System.out.println("Enter number beside the operation to perform: \n" +
               //       " 1. Add \n" +
               //       " 2. Subtract\n" +
                //      " 3. Multiply\n" +
               //       " 4. Divide");
              operator = scan.nextInt();
              scan.nextLine();
              answer =calculate(first,second,operator);
              

              //System.out.println("Do you want to try again(y/n)");
              repeat = scan.nextLine();
          }
          System.out.println(answer);
              
    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
    	 switch(operator){
         case 1: return "" + firstValue+ " " + "+" + " " + secondValue + " " + "="+ " " + (firstValue+secondValue);
         case 2: return "" + firstValue+ " " + "-" + " " + secondValue + " " + "="+ " " + (firstValue-secondValue);
         case 3: return "" + firstValue+ " " + "*" + " " + secondValue + " " + "="+ " " + (firstValue*secondValue);
         case 4:
             if(secondValue==0){
                 return "The divider (secondValue) cannot be zero" ;
             }
             return "" + firstValue+ " " + "/" + " " + secondValue + " " + "="+ " " + (firstValue/secondValue) ;
         default: return "Entered wrong option " + operator ;
    }
}
}



//package com.stackroute.basics;
//
//import java.util.Scanner;
//
//public class Calculator {
//    private static Scanner scan;
//    public int firstValue, secondValue, operator;
//    
//    // define,declare scanner and call getValues with scanner as parameter
//    public static void main(String[] args) {
//        scan = new Scanner(System.in);
//        new Calculator().getValues(scan);
//    }
//
//    //Get values and which operator from the menu
//    public void getValues(Scanner scan) {
//    	
//		//Scanner sc = new Scanner(System.in);
//		
//		//do {
//			//System.out.println("Enter the first number :");
//			this.firstValue = scan.nextInt();
//			
//			//System.out.println("Enter the second number :");
//			this.secondValue = scan.nextInt();
//		
////			System.out.println("Enter number beside the operation to perform: :");
////			System.out.println("1. Add");
////			System.out.println("2. Subtract");
////			System.out.println("3. Multiply");
////			System.out.println("4. Divide");
////			
//			this.operator = scan.nextInt();
//			
//			
//			calculate(firstValue, secondValue, operator);
//			
////			System.out.println("Do you want to try again(y/n) :");
////			char Var = sc.next().charAt(0);
//		
//			
////			sc.close();
//		}
//		//while(true);
//	
//
//    //perform operation based on the chosen switch case corresponding to the menu and return string
//    public String calculate(int firstValue, int secondValue, int operator) {
//        
//    	 
//    	switch (operator) {
//		
//		case 1:
//			int ans = firstValue + secondValue;
//			return toString(ans);//String.valueOf(ans);
//		case 2:
//			int ans1 = firstValue - secondValue;
//			//break;
//			return toString(ans1);//String.valueOf(ans1);
//		case 3:
//			int ans2 = firstValue * secondValue;
//			return toString(ans2);//String.valueOf(ans2);
//		case 4:
//			if(secondValue == 0) {
//				return ("The divider (secondValue) cannot be zero");
//			}
//			int ans3 = firstValue / secondValue;
//			return toString(ans3);//String.valueOf(ans3);
//		
//		default :
//			return ("Entered wrong option 5");
//		}
//
//    }
//
//		private String toString(int ans) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//	
//}
