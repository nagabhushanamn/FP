package com.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

import com.examples.model.Employee;
import com.examples.model.Gender;

public class Ex4 {
	
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
		
		
		// Filtering operation
		
//		stream
//		.filter(e->e.getGender()==Gender.FEMALE)
//		.distinct()
//		.limit(3)
//		.forEach(e->System.out.println(e));
		
		
		// Transforming operations
		
		// a. map
//		stream
//		.map(e->new EmployeeSummary(e.getName(), e.getSalary()))
//		//.sorted((s1,s2)->Double.compare(s1.getSalary(), s2.getSalary()))
//		.sorted((s1,s2)->Double.compare(s1.getSalary(), s2.getSalary()))
//		.forEach(es->System.out.println(es));
		
		
		
		// b. flatMap
//		String[] menu= {
//				"idly,vada",
//				"pav,misal-pav"
//		};
//		
//		Stream<String> menuStream=Stream.of(menu);
//		menuStream
//		.flatMap(line->Stream.of(line.split("[,]")))
//		.forEach(item->System.out.println(item));		
		
		
		

	    //Objective: Print names of the employees with the highest salary


         stream
             .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
             .limit(5)
             .map(Employee::getSalary)
             .forEachOrdered(System.out::println);
		
		
		
		
		
	}

}

class EmployeeSummary{
	private String name;
	private double salary;
	public EmployeeSummary(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeSummary [name=" + name + ", salary=" + salary + "]";
	}
	
}



