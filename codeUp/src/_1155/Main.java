package _1155;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = "";
		result = num % 7 == 0 ? "multiple" : "not multiple";
		System.out.println(result);

		sc.close();
	}
}
