package _1503;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j+1+(N*i);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			int n = N-1;
			for(int j = 0; j < arr[i].length; j++) {
				if(i % 2 == 1) {
					System.out.print(arr[i][n] + " ");
					n--;
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
