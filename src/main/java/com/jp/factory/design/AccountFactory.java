package com.jp.factory.design;

import java.util.Objects;

public abstract class AccountFactory {

	public static Account getAccount(String type) {
		if (Objects.equals("savings", type)) {
			return new SavingsAccount();
		} else if (Objects.equals("current", type)) {
			return new CurrentAccount();
		} else if (Objects.equals("loan", type)) {
			return new LoanAccount();
		} else {
			throw new RuntimeException("Invalid Factory Type");
		}
	}

}
