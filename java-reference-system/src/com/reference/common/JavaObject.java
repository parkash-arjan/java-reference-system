package com.reference.common;

public class JavaObject {

	private int id;

	public JavaObject(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("JavaObject with id  " + getId() + " garbage collected.");
	}
}
