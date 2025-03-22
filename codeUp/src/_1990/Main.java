package _1990;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int sum = 0;
		
		for(char ch : num.toCharArray()) {
			sum += ch-'0';
		}
		
		if(sum%3 == 0) System.out.println(1);
		else System.out.println(0);
		
		sc.close();
	}
}
