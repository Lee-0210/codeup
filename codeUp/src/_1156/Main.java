package _1156;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("돌의 수 입력 : ");
		int stone = sc.nextInt();
		
		if(stone % 2 == 0) System.out.println("even");
		else System.out.println("odd");
	}
}
