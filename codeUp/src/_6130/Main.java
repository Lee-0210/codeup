package _6130;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split("");
		double result = 0;
		
		switch(arr[2]) {
			case "+":
				result = -1*(Double.parseDouble(arr[3]) / Double.parseDouble(arr[0]));
				break;
			case "-": 
				result = Double.parseDouble(arr[3]) / Double.parseDouble(arr[0]);
				break;
		}
		
		System.out.printf("%.2f", result);
	}
}
