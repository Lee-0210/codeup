package _1419;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		int index = 0;
		
		while((index = str.indexOf("love", index)) != -1) {
			count++;
			index += 4;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
