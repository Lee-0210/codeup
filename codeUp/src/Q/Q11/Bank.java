package Q.Q11;

import java.util.ArrayList;

public interface Bank {
	
	int MAXOFCUS = 1000;
	ArrayList<Account> account = new ArrayList<>();
	
	boolean deposit(int num);
	boolean send(String bankAccount, int num);
	
}
