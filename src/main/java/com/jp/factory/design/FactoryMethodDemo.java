package com.jp.factory.design;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		
		Account currentAccount = AccountFactory.getAccount("current");
		currentAccount.display();
		
		Account savingsAccount = AccountFactory.getAccount("savings");
		savingsAccount.display();
		
	}

}
