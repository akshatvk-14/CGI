
package com.stackroute.strings;
import java.util.Arrays;

public class Anagram {
    //write logic to check given two phrases are anagrams or not and return result
	
    public String checkAnagrams(String phraseOne, String phraseTwo) {
        if(phraseOne.isEmpty()||phraseTwo.isEmpty()) {
        	return "Give proper input not empty phrases";
        }
    	char[] str1 = phraseOne.toCharArray();
        char[] str2 = phraseTwo.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.equals(str1, str2))
        {
        	return "Given phrases are anagrams";
        }
        else return "Given phrases are not anagrams";
    
    }
}


//package com.stackroute.strings;
//
//public class Anagram {
//    //write logic to check given two phrases are anagrams or not and return result
//    public String checkAnagrams(String phraseOne, String phraseTwo) {
//        return null;
//    }
//}
