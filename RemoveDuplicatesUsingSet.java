package com.week3.day2.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {

//		Declare a String as "PayPal India"
		String str = "PayPal India";
		System.out.println("before Set = "+str);
		
//		Convert it into a character array
		char[] charArray = str.toCharArray();
		
//		Declare a Set as charSet for Character
		Set<String> charSet = new LinkedHashSet<String>();

//		Iterate character array and add it into charSet
		for (Object i : charArray) {
			charSet.add(i.toString());
		}
		System.out.println("after Set = "+charSet);

//      Converting HashSet to ArrayList inorder to get an element from a Set. 
//      get() method does not exist in Set. Need to convert a Set to Array/Arraylist
		List<String> list = new ArrayList<String>(charSet);

//		Check the iterator variable isn't equals to an empty space
		for (int i = 0; i < list.size(); i++) {
			String str1 = list.get(i).trim();
			if(str1 !="") {
				System.out.print(str1);
			}
		}
	}
}