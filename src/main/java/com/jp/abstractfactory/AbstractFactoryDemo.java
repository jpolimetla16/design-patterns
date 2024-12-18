package com.jp.abstractfactory;

public class AbstractFactoryDemo {

	
	public static void main(String[] args) {
		Phone apple = PhoneFactory.getPhone("Apple","Iphone14");
		System.out.println(apple.getDescrption());
		
		Phone samsung = PhoneFactory.getPhone("Samsung","Galaxy11");
		System.out.println(samsung.getDescrption());
	}

}
