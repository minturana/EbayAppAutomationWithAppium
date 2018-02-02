package com.grab.tests.StringIntersection;

import java.util.ArrayList;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class StringIntersectionTests {

	IntersectionBetweenTwoListsOfStrings intersectionBetweenTwoListsOfStrings = new IntersectionBetweenTwoListsOfStrings();

	@Test(priority = 1)
	public void instectionOfTwoListsOfStringUsingInefficentApproach() {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("Ola");
		list1.add("Grab");
		list1.add("Uber");
		list2.add("Grab");
		list2.add("Jazz");

		
		System.out.println("Common Strings After Intersection Operation=" + intersectionBetweenTwoListsOfStrings
				.getCommonWordsAfterInstectionOfTwoListsOfStringUsingInefficentApproach(list1, list2));
		Assert.assertTrue((intersectionBetweenTwoListsOfStrings.getCommonWordsAfterInstectionOfTwoListsOfStringUsingInefficentApproach(list1, list2).contains("Grab")));
		}

	@Test(priority = 2)
	public void instectionOfTwoListsOfStringUsingEfficentApproach() {

	}
}
