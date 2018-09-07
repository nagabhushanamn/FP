package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * @author nag-training
 * 
 * 
 *  Evaluating Stream
 *  
 *    i.e we can traverse once
 *
 */
public class Ex3 {
	
	
	public static void main(String[] args) {
		
		List<Integer> integers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Stream<Integer> stream=integers.stream();
		
		stream=stream.filter(n->n>5)
		             .filter(n->n%2==0);
			
		stream
		.map(n->n*2)
		.forEach(n->System.out.println(n));
		
		
	}

}
