package _1281;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		
		for(int i = a; i <= b; i++) {
			
			if(i % 2 == 0)
				sum -= i;
			else 
				sum += i;
			
			if(i % 2 == 0) System.out.print("-" + i);
			else if(i != a) System.out.print("+" + i);
			else System.out.print(i);
			
		}
		System.out.println("=" + sum);
		sc.close();
	}
}
