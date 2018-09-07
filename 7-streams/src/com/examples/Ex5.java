package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.examples.model.Employee;
import com.examples.model.Gender;

public class Ex5 {

	public static void main(String[] args) {

		Employee[] employees = { 
				new Employee("jack", 1000.00, Gender.MALE),
				new Employee("jill", 4000.00, Gender.FEMALE), 
				new Employee("mac", 3000.00, Gender.MALE),
				new Employee("adam", 2000.00, Gender.FEMALE), 
				new Employee("eve", 5000.00, Gender.FEMALE),
				new Employee("eve", 5000.00, Gender.FEMALE),
				new Employee("foo", 6000.00, Gender.MALE), 
				new Employee("bar", 4000.00, Gender.MALE),
				new Employee("baz", 2000.00, Gender.FEMALE), };
		
		
		Stream<Employee> stream=Arrays.stream(employees);
		
//		
//		boolean b=stream
//				  //.allMatch(e->e.getSalary()>=100);
//				  //.anyMatch(e->e.getSalary()>=6000);
//				  .noneMatch(e->e.getSalary()>10000);
//		
//		System.out.println(b);
		
		
		
//		Object[] arr=stream
//						.filter(e->e.getGender()==Gender.MALE)
//						.toArray();
//		
//		for(Object e:arr) {
//			System.out.println(e);
//		}
		
		
		

//		Employee[] arr=stream
//						.filter(e->e.getGender()==Gender.MALE)
//						.toArray(n->new Employee[n]);
//						.toArray(Employee[]::new);
//		
		
		
//		long count=stream
//					.filter(e->e.getGender()==Gender.MALE)
//					.count();
//		System.out.println(count);		
//		
		
		
		
		
//		Optional<Employee> optional=stream
//									.filter(e->e.getSalary()>3000)
//									.findAny();
//							
//		if(optional.isPresent()) {
//			System.out.println(optional.get());
//		}
//		System.out.println(optional.orElse(null));
		
		
		
		
		
//		List<Employee> result1=stream
//								.filter(e->e.getGender()==Gender.MALE)
//								.collect(Collectors.toList());
//		
//		Set<Employee> result2=stream
//								.filter(e->e.getGender()==Gender.MALE)
//								.collect(Collectors.toSet());
//		
//		Map<String, Double>  result=
//								stream
//								.filter(e->e.getGender()==Gender.MALE)
//								.collect(Collectors.toMap(Employee::getName, Employee::getSalary));
//		
		
//		Map<Gender,List<Employee>> map=stream
//					  .collect(Collectors.groupingBy(Employee::getGender));
//					  
		
		
		
//		IntStream intStream=IntStream.range(1, 10000);
//		intStream.sum();
		
	}
	
}
