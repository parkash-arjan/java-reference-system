package com.reference.types.gc;

import java.lang.ref.SoftReference;

import com.reference.common.JavaObject;

public class SoftReferenceExample {

	public static void main(String[] args) {

		JavaObject javaObject = new JavaObject(-999);
		SoftReference<JavaObject> ex = new SoftReference<JavaObject>(javaObject);
		System.gc();
		System.out.println("Soft refrence :: " + ex.get().getId());
	}
}
