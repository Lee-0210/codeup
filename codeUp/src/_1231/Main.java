package _1231;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operator = sc.next();
		char op = ' ';
		for(char c : operator.toCharArray()) {
			if(c == '+') op = '+';
			if(c == '-') op = '-';
			if(c == '*') op = '*';
			if(c == '/') op = '/';
		}
		String[] array = operator.split("\\" + op);
		System.out.println(Arrays.toString(array));
		int a = Integer.parseInt(array[0].trim());
		int b = Integer.parseInt(array[1].trim());

		switch(op) {
			case '+':  System.out.println((int)(a+b)); break;
			case '-':  System.out.println((int)(a-b)); break;
			case '/':  if(b != 0) System.out.printf("%.2f", a/(double)b); break;
			case '*':  System.out.println((int)(a*b)); break;
		}
		
		sc.close();
	}
}
