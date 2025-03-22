package _1418;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String charCount = "";
		int memory = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int index = str.indexOf("t", memory);
			if(index == -1) break;
			memory = index + 1;
			charCount += index;
		}
		
		for(char ch : charCount.toCharArray()) 
			System.out.print((ch-'0')+1 + " ");

		sc.close();
	}
}
