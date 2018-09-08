package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex1 {
	
	public static Integer transform(Integer i) {
		System.out.println(Thread.currentThread() +"=>"+i);
		return i * i;
	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		
		integers
		.stream()
		.parallel()
		.map(Ex1::transform)
		.forEachOrdered(System.out::println);
		
		

	}

}
