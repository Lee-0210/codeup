package _1205;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double max = 0;
		
		if(a+b > max) max = (a+b);
		if(a-b > max) max = (a-b);
		if(b-a > max) max = (b-a);
		if(a*b > max) max = (a*b);
		if(a/b > max) max = (a/b);
		if(b/a > max) max = (b/a);
		if(Math.pow(a, b) > max) max = (double)Math.pow(a, b);
		if(Math.pow(b, a) > max) max = (double)Math.pow(b, a);
		
		System.out.printf("%.6f", max);
	}
}
