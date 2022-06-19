package com.mrodriguezul.tjpa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class testCollections {
	public static void main(String[] args) {
		System.out.println("hey!");
		
		List<Integer> lstIntegers = new ArrayList<Integer>();
		lstIntegers = List.of(1,2,1,3,1,4);
		
		System.out.println(lstIntegers);
		
		Set<Integer> stInteger = new HashSet<>();
		stInteger = Set.of(1,2,3,4);
		
		System.out.println(stInteger);
	}

}
