package com.Collections.Learning;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.Stack;

public class ArraysOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long[] array = { 2, -9, 5, -6, 7, 3, 0, -8, 100 };
//		System.out.println(maxProduct(array, array.length));
//		Arrays.sort(array);

		LinkedList<String> names = new LinkedList<String>(
				Arrays.asList("Krishnakanth", "Pavan", "Krishnakanth", "Rahul", "Sravan"));
//		names.remove("Krishnakanth");
//		names.addLast("Charlie");
		int size = names.size();
		int middle = size / 2;
		names.remove(middle);
//		names.sort(Comparator<T>)
//		names.stream().forEach(System.out::println);

		/****************************************************************************/
		Stack<Long> cards = new Stack();
		for (long num : array) {
			cards.push(num);
		}
		cards.clear();

		Optional<Stack> stackOptional = Optional.ofNullable(cards);

		stackOptional.ifPresent(s -> System.out.println(s));
		if (!cards.isEmpty()) {
			System.out.println(cards.peek() + "\n" + cards.capacity() + "\n" + cards.firstElement());
			cards.pop();
			cards.stream().forEach(System.out::println);

		}
		/**************************************** Queue **************************/
		Queue<String> queue = new LinkedList<String>(
				Arrays.asList("Krishnakanth", "Pavan", "Krishnakanth", "Rahul", "Sravan"));
		
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue);
	
	
	}

	private static long maxProduct(long[] array, int length) {
//		long max = Integer.MIN_VALUE;
		Arrays.sort(array);

		long maxProduct = array[length - 2] * array[length - 1];
		long minProdcut = array[0] * array[1];
		return maxProduct > minProdcut ? maxProduct : minProdcut;

//		if(length <2) {
//			System.out.println("Not valid input-- minimum 2 values req in array");
//		}
//		for(int i =0; i<length;i++) {
//			for(int j =i+1;j<length;j++) {
//				if(array[i]*array[j] > max) {
//					max = array[i]*array[j];
//				}
//			}
//		}

//		long value =	array[length-2]*array[length-1];
//		return max;
	}

}
