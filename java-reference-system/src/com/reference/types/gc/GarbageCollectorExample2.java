package com.reference.types.gc;

import com.reference.common.JavaObject;

public class GarbageCollectorExample2 {

	public static void main(String[] args) throws Exception {

		JavaObject iamGoingToSurvive = new JavaObject(-999);
		for (int i = 0; i < 10; i++) {
			new JavaObject(i);

		}
		System.out.println("Run GC");
		System.gc();

		Thread.sleep(1000);
		System.out.println("iamGoingToSurvive" + iamGoingToSurvive.getId());

		System.out.println("End GC Exit...");
	}
}
