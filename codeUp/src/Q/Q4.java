package Q;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int k = num-i; k > 0; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i+i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
