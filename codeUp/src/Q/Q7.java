package Q;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 5;
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 버블정렬
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 1; j < arr.length-i; j++) {
//				if(arr[j-1] > arr[j]) {
//					int temp = arr[j-1];
//					arr[j-1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		
		// 선택정렬
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i; j < arr.length-1; j++) {
//				if(arr[i] > arr[j+1]) {
//					int temp = arr[i];
//					arr[i] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		
		// 삽입 정렬
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key ) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = N-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}
