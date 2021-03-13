package com.StringOps.Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NormalizeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> animals = new ArrayList<String>(Arrays.asList("Lion ", " Tiger", "Deer ", " Peacok", "Birds", "Monkey"));
		Iterator<String> iterator = animals.iterator();
	try {
		while (iterator.hasNext()) {
			iterator.next();
//			iterator.remove();
//			animals.add("Cheetha");
		}

		
	}catch (ConcurrentModificationException e) {
		// TODO: handle exception
		System.out.println("Error while iterating List");
		
	}finally {
		animals.stream().forEach(System.out::println);
	}
	
	List<String> animalsNormalized = animals.stream().map(s->s.toLowerCase().trim()).collect(Collectors.toList());
	animalsNormalized.forEach(System.out::println);
	
	//Anagarsm checking
		String First = "Krishnakanth";
		String Second = "rishnaknthKanreddy";
		Boolean isAngram = true;
		
		if (Second.compareTo(First) != 1)
			isAngram = true;
		else
			isAngram = false;
		
//		for(int i =0;i<First.length();i++) {
//			if(Second.indexOf(First.charAt(i)) == -1) {
//				isAngram = false;
//				break;
//			}
//			
//		}
		
		System.out.println(isAngram);
		
	}
	
	
	
	
	

}
