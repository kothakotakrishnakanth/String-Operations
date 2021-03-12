package com.java8learning.newTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

/**
 * 
 * @author krishnakanthkothakota Lambda experssions or functions are introduced
 *         in java8 these helpto reduce the addtional lines in the code and
 *         provide inline functionality to excution
 *
 *
 */
public class LambdaLearning {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>(
				Arrays.asList("Krishnakanth", "Mohan", "Rama", "Divya", "Lalithya"));
//			students.forEach(s->{System.out.println(s);});
		// consumer in lambda
		Consumer<String> printItem = n -> {
			System.out.println(n);
		};
		students.forEach(printItem);

		// Functions
		Function<Integer, Double> sqrt = n -> Math.sqrt(n);

		System.out.println(sqrt.apply(0711));

		// Predicate
		DoublePredicate divbythree = n -> n % 3 == 0;
		System.out.println(divbythree.test(9.3));

		// Supplier
		Supplier<Double> genRandomNumber = ()->Math.random()*100;
		System.out.println(genRandomNumber.get());
	}

}
