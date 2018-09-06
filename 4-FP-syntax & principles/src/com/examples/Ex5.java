package com.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.examples.model.Employee;

/**
 * 
 * @author nag-training
 *
 *
 *         FP principles
 * 
 *         - A function can be stored in a variable or value 
 *         - A parameter of a function can be a function 
 *         - The return value of a function can be a function
 *
 *
 * 
 *         A higher order function
 * 
 *         - A function whose return value is a function
 *         - A function with a parameter that is a function
 * 
 * 
 * 
 * 
 */
public class Ex5 {

	public static Predicate<String> and(Predicate<String> predicate1, Predicate<String> predicate2) {
		Predicate<String> predicate = s -> predicate1.test(s) && predicate2.test(s);
		return predicate;
	}

	public static void main(String[] args) throws IOException {

		// Higher order programming
		
		
		// #1
		Predicate<String> min = s -> s.length() <= 10;
		Predicate<String> max = s -> s.length() >= 100;

		// Predicate<String> predicate=and(min, max);
		// or
		Predicate<String> andPredicate = min.and(max);
		Predicate<String> orPredicate = min.or(max);
		Predicate<String> negateMin=min.negate();

		
		// #2
		Consumer<String> consumer1=log->System.out.println(log);
		
		PrintWriter out=new PrintWriter("log.txt");
		Consumer<String> consumer2=log->out.println(log);
		
		
		Consumer<String> consumer=consumer1.andThen(consumer2);
		
		String info="started...";
		consumer.accept(info);
		
		
		//#3
		Function<Employee,String> getName=e->e.getName();
		Function<String,Character> getFirstLetter=name->name.charAt(0);
		
		//Function<Employee,Character> initial=getName.andThen(getFirstLetter);
		// or
		Function<Employee,Character> initial=getFirstLetter.compose(getName);
		
		
		Employee employee=new Employee("Nag", 1000);
		char c=initial.apply(employee);
		System.out.println(c);

		
		//#4
		
		Comparator<Employee> byName = (e1, e2) -> {
			System.out.println("comparing names...");
			return e1.getName().compareTo(e2.getName());
		};
		Comparator<Employee> bySalaray = (e1, e2) -> {
			System.out.println("comparing salary...");
			return Double.compare(e1.getSalary(), e2.getSalary());
		};
		
		Comparator<Employee> byNameAndThenSalary=byName.thenComparing(bySalaray);
		
		
		Employee employee1=new Employee("xyz", 8000);
		Employee employee2=new Employee("pqr", 9000);
		
		System.out.println(byNameAndThenSalary.compare(employee1, employee2));
		
		
		
		// #5
		
		
		Function<String, Integer> func1=s->{
			return s.length();
		};
		
		Function<String, Integer> func2=s->{
			return s.length()+10;
		};
		
		
		Function<Function<String,Integer>, Function<String,Integer>> ho=f->{
			return s->{
				System.out.println("log : before with "+s);
				return f.apply(s);
			};
		};
		
		func1=ho.apply(func1);
		func2=ho.apply(func2);
		func1.apply("ibm");
		func1.apply("hello");
		
		
		
		
		

	}

}
