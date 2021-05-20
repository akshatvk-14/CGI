package com.stackroute.strings;

public class LongestSubString {

    //write logic to find the longest substring that appears at both ends of a given string and return result
    public StringBuilder findLongestSubString(StringBuilder input) {
    	StringBuilder longestSubString = new StringBuilder("");
    	if (input.length()==1){
    		longestSubString.append(input);
		}
    	for(int i=0; i<input.length()/2; i++){
    	    if(input.substring(0,i+1).equals(input.substring(input.length()-(i+1), input.length()))){
    	        longestSubString.delete(0, longestSubString.length());
    	        longestSubString.append(input.substring(0,i+1));
            }
        }
    	if(longestSubString.toString().equals("")){
    	    longestSubString.append("Longest substring is not present in the given StringBuilder");
        }
        return longestSubString;

    }
}


//package com.stackroute.strings;
//
//public class LongestSubString {
//
//    //write logic to find the longest substring that appears at both ends of a given string and return result
//    public StringBuilder findLongestSubString(StringBuilder input) {
//        return null;
//    }
//}
