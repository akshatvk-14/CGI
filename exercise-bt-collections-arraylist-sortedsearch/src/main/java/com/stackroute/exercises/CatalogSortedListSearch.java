package com.stackroute.exercises;


import java.util.Collections;
import java.util.List;

public class CatalogSortedListSearch {


    //write here logic to get sorted Array List which is a global class variable
	private List<String> ls;
    public String catalogListSorter(List<String> unSortedCatalogList) {
    	if(unSortedCatalogList == null ) {
    		return "The catalog list is null";
    	}else if(unSortedCatalogList.isEmpty()) {
    		return "The catalog List is empty";
    	}
    	for(String value :  unSortedCatalogList) {
    		if(value==null|| value.isEmpty() || value.equals(" ")) {
    			return "The catalog List contains empty or null or blank space as a value";
    		}
    	}
    	Collections.sort(unSortedCatalogList);
    	System.out.println(unSortedCatalogList);
    	ls = unSortedCatalogList;
        return unSortedCatalogList.toString();
    }

    //write here logic to search the input value in sorted Array List
    public String catalogListSearcher(String value) {
    	if(value==null || value.isEmpty() || value.equals(" ")) {
    		return "Input is not accepted";
    	}
        for(String str : ls) {
        	System.out.println(str);
        	if(str.equalsIgnoreCase(value)) {
        		return "Found: " + str;
        	}
        	
        }
        return "Not Found";


    	
    }
}






//package com.stackroute.exercises;
//
//
//import java.util.List;
//
//public class CatalogSortedListSearch {
//
//
//    //write here logic to get sorted Array List which is a global class variable
//    public String catalogListSorter(List<String> unSortedCatalogList) {
//
//        return null;
//    }
//
//    //write here logic to search the input value in sorted Array List
//    public String catalogListSearcher(String value) {
//
//        return null;
//    }
//}
//
