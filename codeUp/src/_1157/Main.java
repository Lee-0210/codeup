package _1157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double meter = sc.nextDouble();
		
		if(meter >= 50 && meter <= 60)System.out.println("win");
		else System.out.println("lose");
	}
}
