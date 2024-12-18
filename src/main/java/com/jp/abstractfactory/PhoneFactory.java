package com.jp.abstractfactory;

import java.util.Objects;

public class PhoneFactory {

	private PhoneFactory() {

	}

	public static Phone getPhone(String brand, String model) {
		if (Objects.equals(brand, "Apple")) {
			return Apple.getPhone(model);
		} else if (Objects.equals(brand, "Samsung")) {
			return Samsung.getPhone(model);
		} else {
			throw new RuntimeException("Invalid parameters");
		}
	}

}
