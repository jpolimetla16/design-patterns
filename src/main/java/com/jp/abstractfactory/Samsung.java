package com.jp.abstractfactory;

import java.util.Objects;

public abstract class Samsung {

	public static Phone getPhone(String model) {
		if(Objects.deepEquals(model, "Galaxy11")) {
			return new Iphone14(model);
		}
		else if(Objects.deepEquals(model, "Galaxy12")) {
			return new Iphone13(model);
		}
		else {
			throw new RuntimeException("Invalid Model");
		}
	}

}
