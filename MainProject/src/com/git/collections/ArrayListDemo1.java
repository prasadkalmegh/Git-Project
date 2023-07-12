package com.git.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	


		public static void main(String[] args) {
			ArrayList<String> nameList = new ArrayList<String>();
			nameList.add("Pawan");
			nameList.add("Rahul");
			nameList.add("Rohit");
			nameList.add("Vilas");

			Iterator<String> itr = nameList.iterator();
			while (itr.hasNext()) {

				System.out.println(itr.next());

			}

			for (String name : nameList) {

				System.out.println(name);
			}

		}

	}