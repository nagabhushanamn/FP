package com.ibm.util;

public interface List extends Collection {

	int SIZE = 10;  

	void add(int idx, String ele);

	default void forEach() {
	}

}
