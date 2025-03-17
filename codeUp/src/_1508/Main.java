package _1508;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] array = new int [num][];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = new int[i+1];
			array[i][0] = sc.nextInt();
		}
		
		int count = array.length - 2;
		
		for(int i = 1; i < array.length; i++) {
			for (int j = 0; j < array[count].length; j++) {
				array[j+i][i] = array[j+i][i-1] - array[j+i-1][i-1];
			}
			count--;
		}
		
		for (int[] is : array) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
	}
}

/*
 * 1,0 - 0,0 
 * 2,0 - 1,0 
 * 3,0 - 2,0
 * 
 * 2,1 - 1,1
 * 3,1 - 2,1
 * 
 * 3,2 - 2,2
 */