package Q;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		for(int i = 1; i <= num; i++) {
			if(i == num) {
				System.out.print(i + "=");
			}
			else if(i % 2 == 1) {
				oddSum += i;
				System.out.print(i + "+");
			}
		}
		System.out.println(oddSum);
		
		for(int i = 1; i <= num; i++) {
			if(i == num) {
				evenSum += i;
				System.out.print(i + "=");
			}
			else if(i % 2 == 0) {
				evenSum += i;
				System.out.print(i + "+");
			}
		}
		System.out.println(evenSum);
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) System.out.print(i + " ");
		}
	}
}
