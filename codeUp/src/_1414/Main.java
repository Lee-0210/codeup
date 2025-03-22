package _1414;

import java.util.Scanner;

public class Main {
	final static int leng = 100;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int cCount = 0;
		int ccCount = 0;
		
		for(int i = 0; i < str.length(); i++)
			if(str.charAt(i) == 'c' || str.charAt(i) == 'C') cCount++;
		
		for(int i = 0; i < str.length()-1; i++) {
			char a = str.charAt(i);
			char b = str.charAt(i+1);
			
			if((a == 'c' && b == 'c') || (a == 'c' && b == 'C') || (a == 'C' &&b == 'c') || (a == 'C' && b == 'C')) ccCount++;
		}
		
		System.out.println(cCount + "\n" + ccCount);
		sc.close();
	}
}
