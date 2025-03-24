package Q;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Q6_2차원 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] lotto = new int[N][6];
		Random rd = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < lotto[i].length; j++) {
				lotto[i][j] = rd.nextInt(45)+1;
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			Arrays.sort(lotto[i]);
		}
		
		int game = 1;
		for(int[] i : lotto) {
			System.out.print("[" + game++ + " 게임] : ");
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
