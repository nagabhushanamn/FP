package com.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.examples.model.Employee;

/**
 * 
 * @author nag-training
 *
 *
 *         Method Reference ==> function pointers in java
 * 
 *
 */

class ItemLib {
	public static String replaceNonVegWithVeg(String item) {
		return item.equals("nveg") ? "veg" : item;
	}
}

public class Ex9 {

	public static void main(String[] args) {

		// ----------------------------------------------------
//		Supplier<Thread> supplier = () -> Thread.currentThread();
//		// or
//		Supplier<Thread> supplier2 = Thread::currentThread;
//		System.out.println(supplier2.get());
		// ----------------------------------------------------

		List<String> menu = new ArrayList<>();
		menu.add("veg");
		menu.add("nveg");
		menu.add("veg");

		String itemToReplace = "nveg";

		// -----------------------------------------------------
		// way-1: imperative style ( What + How )

//		Iterator<String> iterator = menu.iterator();
//		int idx = 0;
//		while (iterator.hasNext()) {
//			String item = (String) iterator.next();
//			if (item.equals(itemToReplace))
//				menu.set(idx, "veg");
//			idx++;
//		}
//		System.out.println(menu);
		
		// -----------------------------------------------------

//		// way-2 : declarative style using local-inner-class
//		class ItemToReplace implements UnaryOperator<String> {
//			@Override
//			public String apply(String t) {
//				if (t.equals(itemToReplace))
//					return "veg";
//				else
//					return t;
//			}
//		}
//		UnaryOperator<String> operator = new ItemToReplace();
//		menu.replaceAll(operator);
//
//		System.out.println(menu);
		
		// -----------------------------------------------------

		// way-3 : declarative style using anonymous-inner-class

//		UnaryOperator<String> operator = new UnaryOperator<String>() {
//			@Override
//			public String apply(String t) {
//				if (t.equals(itemToReplace))
//					return "veg";
//				else
//					return t;
//			}
//		};
//
//		menu.replaceAll(operator);
//
//		System.out.println(menu);

		// -----------------------------------------------------

		// way-4 : declarative style using function

//		menu.replaceAll(t -> t.equals(itemToReplace) ? "veg" : t);
//
//		System.out.println(menu);

		// --------------------------------------------------------

		// way-5 : declarative style using function

//		menu.replaceAll(t -> ItemLib.replaceNonVegWithVeg(t));
//		System.out.println(menu);

		// --------------------------------------------------------

		// way-6 : declarative style using function , method-reference

//		menu.replaceAll(ItemLib::replaceNonVegWithVeg);
//		System.out.println(menu);
		
		// --------------------------------------------------------
		
		
		// static methods
		
		
//		Function<Integer, String> function=i->String.valueOf(i); // Lambda syntax
		// or
//		Function<Integer, String> function=String::valueOf; // MR
//		System.out.println(function.apply(123));
		
		
//		BiFunction<Integer, Integer, Integer> biFunction=(n1,n2)->Integer.compare(n1, n2);
		// or
//		BiFunction<Integer, Integer, Integer> biFunction=Integer::compare;
//		System.out.println(biFunction.apply(12, 13));
		
		
		//1: specified instance method
		
//		String str="ibm";
		
//		Supplier<Integer> supplier=()->str.length(); // Lambda syntax
		// or
//		Supplier<Integer> supplier=str::length;  // MR
//		System.out.println(supplier.get());
		
		
//		2: unspecified instance method
		
//		Function<String, Integer> function=s->s.length(); // Lambda syntax
		// or
//		Function<String, Integer> function=String::length; // 
//		System.out.println(function.apply("ibm"));
//		System.out.println(function.apply("nag"));
		
		
//		BiFunction<String, String, Boolean> biFunction=(s1,s2)->s1.equals(s2);
		// or
//		BiFunction<String, String, Boolean> biFunction=String::equals;
//		System.out.println(biFunction.apply("ibm", "nag"));
		
		
		
		// constructor
		
//		Supplier<Employee> supplier=()->new Employee();
		// or
//		Supplier<Employee> supplier=Employee::new;
//		Employee e=supplier.get();
		
		
		
//		BiFunction<String, Double, Employee> biFunction=(name,salary)->new Employee(name, salary);
		// or
		
//		BiFunction<String, Double, Employee> biFunction=Employee::new;
		
		
		
		
		
		
		WithThreeParams func=String::regionMatches;
		boolean b=func.accept("ibm",1,"b",0,2);
		
		
		
		

	}

}


interface WithThreeParams{
	boolean accept(String s,int i,String b,int i1,int i2);
}