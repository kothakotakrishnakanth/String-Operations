package com.java8learning.newTopics;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamsLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	synchronized (args) {
		List<String> students =List.of("KRishnakanth","Pavan","Pradeep","Sampath","Pravin");
		//filter Stream
		Stream<String> studentStream = students.stream().filter(i->i.startsWith("P"));
		studentStream.forEach(System.out::println);
		//match
		boolean studentStreamMatch = students.stream().anyMatch(s->s.startsWith("K"));
		
		//map
		
		List<Integer> numbers = List.of(2,3,4,5,6,7,8,9);
		Stream<Integer>  doublenumbers = (Stream<Integer>) numbers.stream().map(n->n*n);
		List<Integer>  doublenumbersList =  numbers.stream().map(n->n*n).collect(Collectors.toList());
		
		doublenumbers.forEach(System.out::println);
		doublenumbersList.parallelStream().forEach(System.out::println);
		
//		studentStream.forEach(System.out::println);
//		students.parallelStream().forEach(System.out::println);
	}	
		
		
		
	}

}
