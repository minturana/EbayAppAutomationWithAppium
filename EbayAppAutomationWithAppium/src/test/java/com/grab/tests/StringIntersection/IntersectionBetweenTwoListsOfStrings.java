package com.grab.tests.StringIntersection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntersectionBetweenTwoListsOfStrings {
	

	/**
     * 
     * Intersection of two lists of string using inefficient approach
     * @param string $ AL1 one list of array
     * @param string $ AL2 second list of array
     * @return the strings after performing intersecting operation
     *
     */
	
	public  ArrayList<String> getCommonWordsAfterInstectionOfTwoListsOfStringUsingInefficentApproach( ArrayList<String> AL1, ArrayList<String> AL2){   
	    ArrayList<String> empty = new ArrayList<String>();
	    ArrayList<String> empty1 = new ArrayList<String>();
	    if (AL1.isEmpty()){
	        return AL1;
	    }
	    else{
	        String s = AL1.get(0);
	        if(AL2.contains(s))
	            empty.add(s);


	            empty1.addAll(AL1.subList(1, AL1.size()));
	            empty.addAll(getCommonWordsAfterInstectionOfTwoListsOfStringUsingInefficentApproach(empty1, AL2));
	            return empty;
	    }
	}
	
	
	/**
     * 
     * Intersection of two lists of string using efficient approach
     * @param string $ AL1 one list of array
     * @param string $ AL2 second list of array
     * @return the strings after performing intersecting operation
     *
     */
	public  ArrayList<String> getCommonWordsAfterInstectionOfTwoListsOfStringUsingEfficentApproach( ArrayList<String> AL1, ArrayList<String> AL2){   
		List<String> lists = new LinkedList<String>();
		
		
		
		return null;
		
	}



}
