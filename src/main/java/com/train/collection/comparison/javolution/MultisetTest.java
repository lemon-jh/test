package com.train.collection.comparison.javolution;

import java.util.Arrays;
import java.util.List;

import com.google.common.collect.HashMultiset;

public class MultisetTest {
	
	private static final String [] temp = new String[]{"1","2","1"};

	public static void main(String[] args) {
		
		HashMultiset<String> multiSet = HashMultiset.create();
		
		List<String> s = Arrays.asList(temp);
		
		multiSet.addAll(s);
		
		System.out.println(multiSet.count("1"));
		
	}
	
}
