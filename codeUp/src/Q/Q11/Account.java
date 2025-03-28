package Q.Q11;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private String bankAccount;
	private String name;
	private int money;
	private int pw;
	private static int count = 1000;

	
	
	public Account() {
		this("계좌 없음", "이름없음", 0);
	}
	
	public Account(String bankAccount, String name, int money) {
		this.bankAccount = bankAccount;
		this.name = name;
		this.money = money;
		count--;
	}

	public Account(String bankAccount, String name, int money, int pw) {
		if(count <= 0) return;
		if(money > 1000000000) return;
		this.bankAccount = bankAccount;
		this.name = name;
		this.money = money;
		this.pw = pw;
		count--;
	}
	
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money += money;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "Account [bankAccount=" + bankAccount + ", name=" + name + ", money=" + money + ", pw=" + pw + ", count="
				+ count + "]";
	}
}
