package com.reference.types.gc;

import java.lang.ref.SoftReference;

import com.reference.common.JavaObject;

public class SoftReferenceExampleV2 {

	public static void main(String[] args) {

		SoftReference<JavaObject> ex = new SoftReference<JavaObject>(new JavaObject(-999));
		System.gc();

		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String str = "";
			str = str + new String("Garbage!" + i);
		}

		System.out.println("Soft refrence :: " + ex.get().getId());
	}
}
