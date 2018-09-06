package com.examples;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * 
 * @author nag-training
 * 
 * 
 *         Lazy evaluation
 *
 */

public class Ex6 {

	public static void main(String[] args) {

		// --------------------------------------------------
		String s1 = "hello";
		String s2 = null;

		int hash = computeHashingV2(s1, s2);
		System.out.println(hash);

		// --------------------------------------------------

		Supplier<String> supplier = () -> {
			System.out.println("this code will not execute, untill u call it");
			return "something";
		};

//		when required u call it

		// --------------------------------------------------

	}

	private static String getSystemStatus() {
		// costly & slow method.......
		System.out.println("collecting system status...");
		return LocalDateTime.now().toString();
	}

	private static int computeHashing(String s1, String s2) {
		Objects.requireNonNull(s1, "s1 cannot be null - " + getSystemStatus());
		Objects.requireNonNull(s2, "s2 cannot be null - " + getSystemStatus());
		return s1.hashCode() ^ s2.hashCode();
	}

	private static int computeHashingV2(String s1, String s2) {
		Objects.requireNonNull(s1, () -> "s1 cannot be null - " + getSystemStatus());
		Objects.requireNonNull(s2, () -> "s2 cannot be null - " + getSystemStatus());
		return s1.hashCode() ^ s2.hashCode();
	}

}
