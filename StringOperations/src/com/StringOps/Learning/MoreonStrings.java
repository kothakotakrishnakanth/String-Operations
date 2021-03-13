package com.StringOps.Learning;

import java.util.Arrays;

import com.sun.nio.file.SensitivityWatchEventModifier;

public class MoreonStrings {
	public static void main(String[] args) {
		String text = "Update: There seems to be some confusion that programming to the Log4j2 API somehow introduces a \"facade for a facade\". There is no difference in this respect between the Log4j2 API and SLF4J.\n"
				+ "\n"
				+ "Both APIs require 2 dependencies when using a native implementation, and 4 dependencies for a non-native implementation. SLF4J and the Log4j2 API are identical in this respect. For example:";

	String[] sentences = text.split("\\. ");
	System.out.println(Arrays.toString(sentences)+"\n"+sentences.length);
	
	
	}

}
