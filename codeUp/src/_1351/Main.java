package _1351;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startNum = sc.nextInt();
		int lastNum = sc.nextInt();
		
		for(int i = startNum; i <= lastNum; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
		구구단();
	}
	
	public static void 구구단() {
		Scanner sc = new Scanner(System.in);
		String startAndLast = sc.nextLine();
		String[] array = startAndLast.split(" ");

		int startNum = Integer.parseInt(array[0]);
		int lastNum = Integer.parseInt(array[1]);
		
		System.out.println(startNum +""+ lastNum);
		for(int i = startNum; i <= lastNum; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
}
