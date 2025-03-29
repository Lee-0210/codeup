package _1403;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		
		int[] arr = new int[K];

		for(int i = 0; i < K; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < 2; i++) {
			for(int num : arr) {
				System.out.println(num);
			}
		}
		sc.close();
	}
}
