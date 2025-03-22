package _1408;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chArr1 = new char[20];
		char[] chArr2 = new char[20];
		String pw = sc.nextLine();
		if(pw.length() > 20) return;
		
		for(int i = 0; i < pw.toCharArray().length; i++) {
			chArr1[i] = pw.charAt(i);
			chArr1[i] = (char)(chArr1[i]+2);
			System.out.print(chArr1[i] + "");
		}
		System.out.println();
		for(int i = 0; i < pw.toCharArray().length; i++) {
			chArr2[i] = pw.charAt(i);
			chArr2[i] = (char)((chArr2[i]*7) % (80+48));
			System.out.print(chArr2[i] + "");
		}
		System.out.println();
		System.out.println((char)('E'*7)%(80+48));
		sc.close();
	}
}
