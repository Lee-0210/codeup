package _1410;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("");
		int openCount = 0;
		int closeCount = 0;
		
		for(String 괄호 : arr) {
			if(괄호.equals("(")) openCount++;
			else if(괄호.equals(")")) closeCount++;
		}
		
		System.out.println(openCount + " " + closeCount);
		sc.close();
	}
}
