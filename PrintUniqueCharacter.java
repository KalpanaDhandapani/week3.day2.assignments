package com.week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// Take your name as input
		// Print all unique characters only (any order)		
		// Convert String to Character array
		// Create a new Set -> HashSet
		// Add each character to the Set and if it is already there, remove it
		// print it
		
		String name = "Kalpana";
		System.out.println("before Set: "+name);
		
		Set<Character> nameSet = new HashSet<Character>();
		
		char[] charArray = name.toCharArray();
				
		for (char c : charArray) {
			nameSet.add(c);
		}
		
		System.out.println("after Set: "+nameSet);

	}

}
