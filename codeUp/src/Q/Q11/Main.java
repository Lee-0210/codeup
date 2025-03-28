package Q.Q11;

import java.nio.channels.ScatteringByteChannel;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		do {
			System.out.println("===================================");
			System.out.println("1. 계좌등록");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 계좌조회");
			System.out.println("5. 계좌목록");
			System.out.println("6. 종료");
			System.out.println("===================================");
			System.out.print("입력>> ");
			input = sc.nextInt();
			sc.nextLine();
			if(input < 1 || input > 6) {
				System.err.println("제발 메뉴만 눌러주세요");
				continue;
			}
			
			switch(input) {
				// 계좌등록
				case 1 :
					try {
						System.out.print("계좌번호>> ");
						String bankAccount = sc.nextLine();
						System.out.print("예금주>> ");
						String name = sc.nextLine();
						System.out.print("최초예금액>> ");
						int money = sc.nextInt();
						System.out.print("비밀번호>> ");
						int pw = sc.nextInt();
						Bank.addAccount(new Account(bankAccount, name, money, pw));
						
					} catch(Exception e) {
						System.err.println("계좌등록에 실패하였습니다.");
					}
				break;
				// 입금
				case 2 :
					try {
						System.out.print("계좌번호>> ");
						String bankAccount = sc.nextLine();
						System.out.print("입금액>> ");
						int money = sc.nextInt();
						Account acc = Bank.getAccount(bankAccount);
						System.out.println("'" + acc.getName() + "'님에게 입금하는게 맞으십니까?");
						System.out.println("1. 예");
						System.out.println("2. 아니요");
						System.out.print("입력>> ");
						int choose = sc.nextInt();
						if(choose == 1) {
							Bank.deposit(acc, money);
							System.out.println("'" + acc.getName() + "'님의 계좌에 "  + money + "원이 입금되었습니다.");
						} else {
							System.out.println("초기화면으로 돌아갑니다.");
						}
					} catch(Exception e) {
					}
				break;
					
				case 3 :
					try {
						System.out.print("계좌번호>> ");
						String bankAccount = sc.nextLine();
						System.out.print("비밀번호>> ");
						int pw = sc.nextInt();
						Account acc = Bank.getAccount(bankAccount, pw);
						if(acc == null) break;
						System.out.print("출금액>> ");
						int money = sc.nextInt();
						Bank.withdrawal(acc, money, pw);
						
					} catch(Exception e) {
					}
				break;
				
				case 4 :
					try {
						System.out.print("계좌번호>> ");
						String bankAccount = sc.nextLine();
						System.out.print("비밀번호>> ");
						int pw = sc.nextInt();
						Account acc = Bank.getAccount(bankAccount, pw);
						System.out.println("'" + acc.getName() + "'님의 계좌잔액은 " + acc.getMoney() + " 원 입니다.");
					} catch (Exception e) {
					}
				break;
				
				case 5 :
					try {
						System.out.print("관리자 비밀번호>> ");
						int pw = sc.nextInt();
						Map<String, Account> list = Bank.getAccountList(pw);
						System.out.println("============= 계좌목록 =============");
						System.out.println("예금주 \t\t\t 계좌번호 \t\t\t 잔고");
						for(Account acc : list.values()) {
							System.out.print(acc.getName() + "\t\t\t" + acc.getBankAccount() + "\t\t\t" + acc.getMoney());
							System.out.println();
						}
					} catch(Exception e) {
					}
				break;
			}
			
		} while(input != 6);
		
		System.out.println("시스템을 종료합니다.");
		
		sc.close();
	}
}
