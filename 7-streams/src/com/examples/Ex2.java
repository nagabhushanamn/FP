package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import com.examples.model.Employee;
import com.examples.model.Gender;

/**
 * 
 * @author nag-training
 *
 *         streams - basic example
 *
 *
 *         Q.
 * 
 * 
 *         Print the names of the employees with salary at least 2500$,
 *         alphabetically sorted
 * 
 * 
 * 
 * 
 *         why FP ?
 * 
 * 
 *         ==> Highr-Order programming
 * 
 *         -> with function composition , we can build complex algoritm with
 *         simple function(s)
 *
 * 
 * 
 */

public class Ex2 {
	
	public static boolean checkSalaray(Employee e) {
		return e.getSalary()>=2500;
	}

	public static void main(String[] args) {

		Employee[] employees = { 
				new Employee("jack", 1000.00, Gender.MALE),
				new Employee("jill", 4000.00, Gender.FEMALE), 
				new Employee("mac", 3000.00, Gender.MALE),
				new Employee("adam", 2000.00, Gender.FEMALE), 
				new Employee("eve", 5000.00, Gender.FEMALE),
				new Employee("foo", 6000.00, Gender.MALE), 
				new Employee("bar", 4000.00, Gender.MALE),
				new Employee("baz", 2000.00, Gender.FEMALE), };

		
//		Arrays.stream(employees)
//		      .filter(e->e.getSalary()>=2500)
//		      .map(e->e.getName())
//		      .sorted()
//		      .forEach(name->System.out.println(name));

		
		// or
		
		
//		Arrays.stream(employees)
//	      .filter(Ex2::checkSalaray)
//	      .map(Employee::getName)
//	      .sorted()
//	      .forEach(System.out::println);
		
		
		
		// How to create stream from any source ?
//		----------------------------------------
		
//		Stream.of(1,2,3,4,5,6,7)
//		.forEach(n->System.out.println(n));
//		
//		
//		Integer[] nums= {1,2,3,4,5};
//		Stream.of(nums)
//		.forEach(n->System.out.println(n));
//		
//		
//		Arrays.stream(nums)
//		.forEach(n->System.out.println(n));
//		
//		
//		List<Integer> list=Arrays.asList(nums);
//		list.stream()
//		.forEach(n->System.out.println(n));
//		
		
		//----------------------------------------
		
		// How to create stream by computation ?
		
		
		// way1 : generate()
		
//		Random random=new Random();
//		
//		Stream
//		.generate(()-> random.nextInt())       // build  operation
//		//.peek(n->System.out.println("generated => "+n))
//		.filter(n->n>0)                        // intermediate operation 
//		//.peek(n->System.out.println("after filter => "+n)) 
//		.limit(20)                             // intermediate operation                     
//		//.peek(n->System.out.println("after limit => "+n))
//		.forEach(n->System.out.println(n));  // Terminal operation
//		
//		System.out.println("done...");
		
		
		// way2 : iterate()
		
		
		
//		Stream
//		.iterate(0, n->n+1)
//		.limit(10)
//		.forEach(System.out::println);
		
		
		
	}

}
