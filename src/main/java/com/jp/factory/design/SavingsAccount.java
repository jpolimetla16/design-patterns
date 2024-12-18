package com.jp.factory.design;

import org.springframework.util.FileSystemUtils;

public class SavingsAccount implements Account {

	@Override
	public void display() {
		System.out.println("Savings Account");
		
	}

	

}
