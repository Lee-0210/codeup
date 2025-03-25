package Q.Q11;

public class Account implements Bank {
	
	private String bankAccount;
	private String name;
	private int money;
	private int max = Bank.MAXOFCUS;
	
	public Account() {
		this("계좌없음", "이름없음", 0);
	}

	public Account(String bankAccount, String name, int money) {
		if(max <= 0) return;
		else max--;
		this.bankAccount = bankAccount;
		this.name = name;
		this.money = money;
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
		this.money = money;
	}

	@Override
	public boolean deposit(int num) {
		if(num > 1000000 && num <= 0) return false;
		else {
			money -= num;
			System.out.println("'" + name + "'님의 계좌에 " + num + " 원이 출금되었습니다.");
			return true;
		}
	}

	@Override
	public boolean send(String bankAccount, int num) {
		if(num > 1000000 && num <= 0) return false;
		else {
			
			money -= num;
			System.out.println("'" + name + "'님의 계좌에 " + num + " 원이 출금되었습니다.");
			return true;
		}
	}
	
}
