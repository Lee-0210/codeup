package _1734;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		if(id.length() >= 10) return;
		System.out.printf("welcome! %s", id);
		
		sc.close();
	}
}
