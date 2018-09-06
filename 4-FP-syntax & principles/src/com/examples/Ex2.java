package com.examples;

interface Adder {
	double add(double n1, double n2);
}

interface Joiner {
	String join(String s1, String s2);
}

class Lib {

	public static double getAdd(Adder adder) {
		// from any input source
		double n1 = 12;
		double n2 = 13;

		return adder.add(n1, n2);

	}

//
	public static String getJoin(Joiner joiner) {
		// from any input source
		String s1 = "Hello";
		String s2 = "World";

		return joiner.join(s1, s2);

	}

	public static double get(Adder adder) {
		// data from any input source
		double n1 = 12;
		double n2 = 13;

		return adder.add(n1, n2);

	}

	public static String get(Joiner joiner) {
		// data from any input source
		String s1 = "Hello";
		String s2 = "World";

		return joiner.join(s1, s2);

	}
}

/**
 * 
 * @author nag-training
 *
 *         Type of Lambda-Expression in java is 'Functional Interface'
 *
 */

public class Ex2 {

	public static void main(String[] args) {

//		double z = Lib.getAdd((double x, double y) -> x + y); // explicit Typing
//		double z = Lib.getAdd((x, y) -> x + y); // implicit Typing

//		String s = Lib.getJoin((x, y) -> x + y);
//		String s = Lib.getJoin((x, y) -> x + " " + y);
//		String s = Lib.getJoin((x, y) -> x + " " + y + " !");
//		System.out.println(s);

//		String s = Lib.getJoin((x, y) -> {
//			// ...
//			return x + y;
//		});
//		System.out.println(s);

		double z = Lib.get((double x, double y) -> x + y);
		String s = Lib.get((Joiner) (x, y) -> x + y);

	}

}
