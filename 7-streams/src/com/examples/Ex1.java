package com.examples;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Box<E> implements Iterable<E> {
	// ....
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Collection<Integer> collection = null;
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		collection = list;

//		Set<Integer> set = new HashSet<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		collection = set;


		// External iteration
		//----------------------

		// way-1 : traditional for loop :
		for (int i = 0; i < list.size(); i++) {
			Integer item = list.get(i);
			System.out.println(item);
		}

		System.out.println();

		// way-2 : iterator pattern
		Iterator<Integer> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Integer item = iterator.next();
			System.out.println(item);
		}

		// way-3 : for-each loop ( JDK 1.5 )
		for (Integer item : collection) {
			System.out.println(item);
		}

		Box<Integer> box = new Box<>();
		for (Integer item : box) {
			// ...
		}
		
		
		// internal iteration
		//----------------------
		
		collection
		//.forEach(item->System.out.println(item));
		.forEach(System.out::println);
		
		
		
		
		
		
		
		

	}

}
