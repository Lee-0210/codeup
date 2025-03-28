package Q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.print("[" + (i+1) + " 게임] : ");
			List<Integer> list = new ArrayList<>();
			
			for(int j = 0; j < 6; j++) {
				int ran = (int)(Math.random()*45) + 1;
				if(!list.contains(ran)) list.add(j, ran);
				else j--;
			}
			
			Collections.sort(list);
			
			for(int k = 0; k < list.size(); k++) {
				System.out.print(list.get(k) + " ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
