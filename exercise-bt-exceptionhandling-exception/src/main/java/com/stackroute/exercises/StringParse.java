package com.stackroute.exercises;

public class StringParse {
    //Write logic to find the character from the sentence at specified location
    public char characterLocator(String sentence, String location) {
    	int i = Integer.parseInt(location);
    	
    	try {
    		char ch=sentence.charAt(i);
    		return ch;
    	}catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
    	return sentence.charAt(i);
    }
}


//package com.stackroute.exercises;
//
//
//public class StringParse {
//    //Write logic to find the character from the sentence at specified location
//    public char characterLocator(String sentence, String location) {
//        return 0;
//    }
//}
