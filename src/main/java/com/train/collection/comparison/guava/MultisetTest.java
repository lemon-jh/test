package com.train.collection.comparison.guava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.HashMultiset;
import com.train.collection.comparison.natives.HashMap;

public class MultisetTest {
	
	private static final String [] temp = new String[]{"1","2","1"};

	public static void main(String[] args) throws InterruptedException {
		
//		HashMultiset<String> multiSet = HashMultiset.create();
//		
//		List<String> s = Arrays.asList(temp);
//		
//		multiSet.addAll(s);
//		
//		System.out.println(multiSet.count("1"));
		
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<10000000;i++){
			list.add(i+"");
		}
		
//		Map<String,Integer> map = new HashMap<String, Integer>();
////		
//		for(int i=0;i<1000;i++){
//			map.put(i+"",i);
//		}
//
//		map.get(0+"");
//		
//		System.out.println(51 & 15);
//		System.out.println(51 & 31);
//		System.out.println(11118 & 15);
//		System.out.println(11118 & 15);
	}
	
}
