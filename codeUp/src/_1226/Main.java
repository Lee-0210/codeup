package _1226;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int[] lottoNum = new int[7];
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = sc.nextInt();
		}
		int[] jihyeLotto = new int[6];
		for (int i = 0; i < jihyeLotto.length; i++) {
			jihyeLotto[i] = sc.nextInt();
		}
		int count = 0;
		int bonusCount = 0;
		
//		for(int i = 0; i < lottoNum.length; i++) {
//			int random = (int)(Math.random() * 45 + 1);
//			lottoNum[i] = random;
//		}
		
//		Arrays.sort(lottoNum);
		
//		int random = (int)(Math.random() * 45 + 1);
//		lottoNum[6] = random;

		for(int i = 0; i < lottoNum.length-1; i++) {
			for(int j = 0; j < lottoNum.length; j++) {
				if(jihyeLotto[i] == lottoNum[6]) bonusCount++;
				if(lottoNum[j] == lottoNum[6]) continue;
				if(jihyeLotto[i] == lottoNum[j]) count++;
			}
//			System.out.print(lottoNum[i] + " ");
		}
//			System.out.println();
//			System.out.println("맞은 개수 : " + count);
		if(count >= 6) {
			System.out.println(1);
		} else if(count == 5  && bonusCount >= 1) {
			System.out.println(2);
		} else if(count == 5) {
			System.out.println(3);
		} else if(count == 4) {
			System.out.println(4);
		} else if(count == 3) {
			System.out.println(5);
		} else if(count <= 2) {
			System.out.println(0);
		}
	}
}
