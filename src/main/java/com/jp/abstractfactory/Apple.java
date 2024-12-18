package com.jp.abstractfactory;

import java.util.Objects;

public abstract class Apple {

	public static Phone getPhone(String model) {
		if(Objects.deepEquals(model, "Iphone14")) {
			return new Iphone14(model);
		}
		else if(Objects.deepEquals(model, "Iphone14")) {
			return new Iphone13(model);
		}
		else {
			throw new RuntimeException("Invalid Model");
		}
	}

}
