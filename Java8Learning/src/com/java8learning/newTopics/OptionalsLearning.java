package com.java8learning.newTopics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Optional;


/**
 * 
 * @author krishnakanthkothakota
 *Optionals are introduced in Java 8
 *these are helpful in handling Nullpointer Excepetions
 *Optionals act as wrapper over other data types and handle null checks
 *
 */
public class OptionalsLearning {
	public static void main(String[] args) {
		String[] name  = {"Hello","This","is","krishnaknth"};
		Optional<String> emptyname = Optional.empty();
		Optional<java.util.List<String>> Firstnames = Optional.ofNullable(Arrays.asList(name));
		if (Firstnames.isPresent()) {
			Iterator<String> iterator = Firstnames.get().iterator();
			while(iterator.hasNext()) {
				System.out.print( iterator.next()+" " );
			}
			
			Firstnames = Optional.empty();
		} else {
			System.out.println("Empty Names");
			
		}

	}

}
