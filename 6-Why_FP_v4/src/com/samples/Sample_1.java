package com.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Sample_1 {

	public static void main(String[] args) {

		List<String> menu = new ArrayList<>();
		menu.add("veg");
		menu.add("veg");
		menu.add("veg");
		menu.add("non-veg");
		menu.add("non-veg");
		menu.add("veg");
		menu.add("non-veg");

		// way-1 : imperative style ( what + How )
//		Iterator<String> iterator = menu.iterator();
//		while (iterator.hasNext()) {
//			String item = (String) iterator.next();
//			if (item.equals("non-veg"))
//				iterator.remove();
//
//		}
//		System.out.println(menu);

		// way-2 : declarative style with function ( what )
		menu.removeIf(item -> item.equals("non-veg"));
		System.out.println(menu);

	}

}
