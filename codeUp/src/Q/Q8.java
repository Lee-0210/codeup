package Q;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		boolean change = true;
		int count = 1;
		
		for(int i = 0; i < num; i++) {
			
			if(change) {
				for(int j = 0; j < num; j++) {
					arr[i][j] = count;
					count++;
				}
			} else {
				for(int j = num-1; j >= 0; j--) {
					arr[i][j] = count;
					count++;
				}
			}
			change = !change;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
