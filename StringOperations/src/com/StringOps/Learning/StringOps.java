package com.StringOps.Learning;

import java.util.Arrays;

public class StringOps {

	public static void main(String[] args) {
		String firstName = "Krishnakanth";
		String firstName1 = firstName;
		String firstName2 = "Krishnakanth";
		firstName = firstName + " Kothakota";
		firstName = firstName.concat(" Reddy");
		System.out.println(firstName);
		System.out.println(firstName1);
		System.out.println(firstName2);
//		assertEquals("Krishnakanth", firstName2);

		StringBuffer fullNameBuffer = new StringBuffer("Krishnakanth");
		fullNameBuffer.append(" Reddy");
		fullNameBuffer.append(firstName);
		fullNameBuffer.insert(0, "Kothakota ");
		fullNameBuffer.delete(22, 50);
		String sPrintName = fullNameBuffer.toString();
		System.out.println(sPrintName);
//		sPrintName->(System.out::println);

		String[] name = firstName.split(" ");
		System.out.println(Arrays.toString(name));

	}

}
