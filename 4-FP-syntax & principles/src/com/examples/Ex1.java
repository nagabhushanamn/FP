package com.examples;

@FunctionalInterface
interface Greeting {
	void greet();
}

class GreetingLib {
	public static void greet(Greeting greeting) {
		if (greeting == null)
			System.out.println("Hello...");
		else
			greeting.greet();
	}
}

/**
 * 
 * @author nag-training
 * 
 *  Hello World
 *
 */

public class Ex1 {

	public static void main(String[] args) {

		GreetingLib.greet(null);

		// way-1: traditional style
		class TNGreeting implements Greeting {
			@Override
			public void greet() {
				System.out.println("Vanakkam");
			}
		}
		Greeting tnGreeting = new TNGreeting();
		GreetingLib.greet(tnGreeting);

		// way-2: functional style
		Greeting hiGreeting = () -> System.out.println("Namasthe");
		GreetingLib.greet(hiGreeting);

	}

}
