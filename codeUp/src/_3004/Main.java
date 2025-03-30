package _3004;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] sortArr = Arrays.copyOf(arr, N);
		Arrays.sort(sortArr);
			
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			if(!map.containsKey(sortArr[i]))
				map.put(sortArr[i], i);
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(map.get(arr[i]) + " ");
		}
		sc.close();
	}
}
