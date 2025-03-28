package Q.Q11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bank {
	
	private static Map<String, Account> accountList = new HashMap<>();
	private static final int ADMINPW = 1111;
	
	// 계좌등록
	public static void addAccount(Account acc) {
		if(accountList.containsKey(acc.getBankAccount())) {
			System.err.println("이미 같은 계좌번호가 있습니다.");
			return;
		} else {
			accountList.put(acc.getBankAccount(), acc);
			System.out.println("'" + acc.getName() + "'님의 계좌가 개설되었습니다.");
		}
	}
	
	// 비밀번호 없이 입금만 할때 조회
	public static Account getAccount(String bankAccount) {
		Set<Map.Entry<String, Account>> list = accountList.entrySet();
		
		Account depositAcc = (Account) list.stream()
									.filter(e -> e.getValue().getBankAccount().equals(bankAccount))
									.map(e -> e.getValue())
									.findFirst()
									.orElse(null);
		if(depositAcc == null) {
			System.err.println("해당 계좌가 존재하지 않습니다.");
			return null;
		}
		return depositAcc;
	}
	
	// 비밀번호가 필요한 조회 (출금, 금액조회)
	public static Account getAccount(String bankAccount, int pw) {
		Set<Map.Entry<String, Account>> list = accountList.entrySet();
		
		Account depositAcc = (Account) list.stream()
									.filter(e -> e.getValue().getBankAccount().equals(bankAccount))
									.map(e -> e.getValue())
									.findFirst()
									.orElse(null);
		
		if (depositAcc == null) {
			System.err.println("해당 계좌가 존재하지 않습니다.");
		} else if(depositAcc.getPw() != pw) {
			System.err.println("비밀번호가 다릅니다!");
			return null;
		} 
		return depositAcc;
	}
	
	// 입금
	public static void deposit(Account acc, int money) {
		if(acc.getMoney() + money > 1000000000) {
			System.err.println("잔고 금액이 10억을 초과하였습니다.");
			return;
		}
		acc.setMoney(money);
	}
	
	// 출금
	public static void withdrawal(Account acc, int money, int pw) {
		if(acc.getPw() != pw) { 
			System.err.println("비밀번호가 다릅니다!");
			return;
		} else if(acc.getMoney() - money < 0) { 
			System.err.println("출금하는 금액이 잔액보다 많습니다.");
		} else {
			System.out.println("'" + acc.getName() + "' 님의 계좌에서 " + money + " 원이 출금되었습니다.");
			acc.setMoney(-money);
		}
	}
	
	// 계좌조히
	public static Account checkAccount(String bankAccount, int pw) {
		Set<Map.Entry<String, Account>> list = accountList.entrySet();
		
		Account checkAcc = (Account) list.stream()
									.filter(e -> e.getValue().getBankAccount().equals(bankAccount))
									.map(e -> e.getValue())
									.findFirst()
									.orElse(null);
		
		if(checkAcc.getPw() == pw) {
			return checkAcc;
		} else return null;
	} 
	
	public static Map<String, Account> getAccountList(int adminPw) {
		if(ADMINPW != adminPw) {
			System.err.println("관리자 비밀번호가 다릅니다.");
			return null;
		}
		if(accountList == null) {
			System.err.println("은행에 등록된 계좌가 하나도 없습니다.");
			return null;
		}
		
		return accountList;
	}
}
