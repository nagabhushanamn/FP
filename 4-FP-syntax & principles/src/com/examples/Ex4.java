package com.examples;

import java.util.Comparator;

import com.examples.model.Employee;

/**
 * 
 * @author nag-training
 *
 *
 *         in java-8 : interface got some boost
 *         
 *            with default  & static methods
 *
 */

interface Scalable {
	// implicitly public static final
	double DEFAULT_SCALE = 1.0;

	// implicitly public abstract
	void setScale(double scale);

	// implicitly public
	default void resetScale() {
		setScale(DEFAULT_SCALE);
	}

	// implicitly public
	static boolean isScalable(Object obj) {
		return obj instanceof Scalable;
	}
}

class SquareBox implements Scalable {
	@Override
	public void setScale(double scale) {
		// ..
	}
}

class RecBox implements Scalable {
	@Override
	public void setScale(double scale) {
		// ..
	}
}

public class Ex4 {

	public static void main(String[] args) {

		// -------------------------------------------------

		SquareBox squareBox = new SquareBox();
		squareBox.resetScale();

		boolean bo = Scalable.isScalable(squareBox);
		System.out.println(bo);

		// -------------------------------------------------

		Employee e1 = new Employee("Nag", 1000.00);
		Employee e2 = new Employee("Kishore", 500.00);

		Comparator<Employee> byNameAsc = (a, b) -> a.getName().compareTo(b.getName());
//		Comparator<Employee> byNameDsc = (a, b) -> b.getName().compareTo(a.getName());
		// or
		Comparator<Employee> byNameDsc = byNameAsc.reversed();

//		System.out.println(byNameAsc.compare(e1, e2));
//		System.out.println(byNameDsc.compare(e1, e2));

		Comparator<Employee> byNameAscWithNullLast = Comparator.nullsLast(byNameAsc);
		System.out.println(byNameAscWithNullLast.compare(e1, null));
		
		// -------------------------------------------------

		
		
	}

}
