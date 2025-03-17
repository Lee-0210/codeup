package _1409;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 10;
		int count = 0;
		int[] array = new int[num];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int chooseNum = sc.nextInt();
		System.out.println(array[chooseNum-1]);
		
	}
}
