package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntFunction;

/**
 * 
 * @author nag-training
 *
 *
 * 
 *         - java.util.function.* 
 *         
 *          	==> for standard functional-interfaces
 * 
 * 
 *
 */
public class Ex3 {

	public static void main(String[] args) {

		Predicate<String> isEmpty = s -> s.isEmpty(); // function-creation
		boolean b = isEmpty.test("ibm"); // function-invocation
		System.out.println(b);

		
		
		Consumer<String> printIt = s -> System.out.println(s);
		printIt.accept("hello");

		
		
		List<String> list = new ArrayList<>();
		list.add("boy");
		list.add("boy");
		list.add("girl");
		

		list.replaceAll(p -> p.equals("girl") ? "new-boy" : p);
		System.out.println(list);

		BinaryOperator<Integer> sum = (n1, n2) -> n1 + n2;
		System.out.println(sum.apply(12, 13));

		Function<String, Integer> findLength = s -> s.length();
		System.out.println(findLength.apply("ibm"));

		// -------------------------------------------------------

		BinaryOperator<Integer> sum1 = (n1, n2) -> n1 + n2;
		int r = sum.apply(12, 13);

		// or ( better version using primitive version FI )

		IntBinaryOperator sum2= (n1, n2) -> n1 + n2;
		int r1 = sum2.applyAsInt(12, 13);

		ToIntFunction<String> findLength1 = s -> s.length();
		int len = findLength1.applyAsInt("ibm");
		System.out.println(len);
//		

		// -------------------------------------------------------

		ToDoubleBiFunction<Float, Float> biFunction = (f1, f2) -> f1 + f2;

		// -------------------------------------------------------

	}

}
