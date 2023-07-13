package com.git.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo4 {

	public static void main(String[] args) {
	
		LinkedHashSet evenNumberSet = new LinkedHashSet<>();
		
		evenNumberSet.add(2);
		evenNumberSet.add(4);
		evenNumberSet.add(6);
		evenNumberSet.add(8);
		
		Iterator iterator = evenNumberSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

	}

}
