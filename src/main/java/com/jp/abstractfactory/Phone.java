package com.jp.abstractfactory;

public abstract class Phone {

	private String model;

	public Phone(String model) {
		super();
		this.model = model;
	}

	public String getDescrption() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
