package Q;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q6_1차원 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] lotto = new int[6];
		int game = 1;
		Random rd = new Random();
		
		while(N != 0) {
			for(int i = 0; i < lotto.length; i++) {
				lotto[i] = rd.nextInt(45)+1;
				for(int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			
			Arrays.sort(lotto);
			
			System.out.print("[" + game + " 게임] ");
			for(int i = 0; i < lotto.length; i++) {
				
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
			game++;
			N--;
		}
		sc.close();
	}
}
