package _1901;

import java.util.Scanner;

public class Main {

	static int recursive(int num, int index) {
		if(index > num) return 0;
		System.out.println(index);
		index++;
		return recursive(num, index);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int index = 1;
		recursive(num, index);
	}
}
