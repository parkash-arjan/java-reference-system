package com.reference.types.gc;

import com.reference.common.JavaObject;

public class GarbageCollectorExample {

	public static void main(String[] args) {

		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			new JavaObject(i);

		}

		System.out.println("Exit...");
	}
}
