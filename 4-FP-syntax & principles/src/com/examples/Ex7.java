package com.examples;

import java.util.function.Consumer;

class Xyz {

	static int staVar = 100; // class's scoped variable

	int insVar; // obj's scoped variable

	public Consumer<String> someMethod() {

		int loc = 300; // method/local scoped variables
		Consumer<String> consumer = s -> {
			System.out.println("im consuming - " + s);

			// imp-note : avoid accessing state-full variables in function
			System.out.println(staVar);
			System.out.println(insVar);

			// imp-note : can access final/effective-final local variables only

			System.out.println(loc);
		};

		return consumer;

	}
}

/**
 * 
 * @author nag-training
 * 
 * variables capture
 *
 */
public class Ex7 {

	public static void main(String[] args) {

		Xyz xyz = new Xyz();
		xyz.insVar = 201;
		Consumer<String> consumer = xyz.someMethod();
		consumer.accept("hey");

		Xyz xyz2 = new Xyz();
		xyz2.insVar = 202;
		Consumer<String> consumer2 = xyz2.someMethod();
		consumer2.accept("dude");

	}

}
