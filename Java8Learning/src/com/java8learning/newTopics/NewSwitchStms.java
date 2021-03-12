package com.java8learning.newTopics;


/**
 * 
 * @author krishnakanthkothakota
 * New Switch case labels introduced
 * in Java 8, which make code eaiser and more understandble
 *
 *
 */
public class NewSwitchStms {
	public static void main(String[] args) {
		int a = 2;
		String Season = switch (a) {
		case 0 -> "Winter";
		case 1 -> "Monsonn";
		case 2 -> "Autum";
		default -> "Summer";

		};
		System.out.println("Print Season"+Season);

		/**
		 * Old Switch case function
		 */
		
		
		String oldSeason;
		switch (a) {
		case 0:
			oldSeason = "Winter";
			break;
		case 1: 
		{
			oldSeason = "Moonson";
			break;
		}
		case 2: {
			oldSeason = "Autum";
			break;
		}
		default:
			oldSeason = "Summer";
			break;
		}
		System.out.println("Print old Season "+oldSeason);
		
		
	}

}
