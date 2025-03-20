package _1754;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int aCount = 0;
		int bCount = 0;
		
		
		for(int i = 0; i < a.toCharArray().length; i++) {
			if(a.toCharArray().length > b.toCharArray().length) {
				System.out.print(b + " " + a);
				break;
			} else if(a.toCharArray().length < b.toCharArray().length) {
				System.out.print(a + " " + b);
				break;
			} 
			
			if(a.toCharArray()[i] > b.toCharArray()[i]) {
				aCount += 10 * (a.toCharArray().length - i);
			} else if(a.toCharArray()[i] < b.toCharArray()[i]) {
				bCount += 10 * (b.toCharArray().length - i);
			}
		}
		
//		System.out.println("aCount : " + aCount);
//		System.out.println("bCount : " + bCount);
		
		if(aCount > bCount) {
			System.out.print(b + " " + a);
		} else if(aCount < bCount) {
			System.out.print(a + " " + b);
		} 
		
		sc.close();
	}
}

