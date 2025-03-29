package _1287;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String starData = "";
		
		for(int i = 0; i < num; i++) {
			starData += "*";
		}		
		
		String star = starData;
		
		for(int i = 0; i < 9; i++) {
			System.out.println(star);
			star += starData;
		}
		sc.close();
	}
}
