package Q;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		List<String> list = new ArrayList<>();
		do {
			String name = sc.nextLine();
			if(name.equals("QUIT")) break;
			else list.add(name);
			
		} while(true);
		
		System.out.println("성명\t출장비\t오만원\t만원\t오천원\t천원\t오백원\t백원\t오십원\t십원\t오원\t일원");
		for(int i = 0; i < list.size(); i++) {
			String[] info = list.get(i).split(" ");
			int 출장비 = Integer.parseInt(info[1]);
			
			for(int j = 0; j < info.length; j++) {
				System.out.print(info[j] + "\t");
			}
			
			for(int k = 0; k < money.length; k++) {
				int result = 출장비 / money[k];
				출장비 = 출장비 % money[k];
				System.out.print(result + " \t");
			}
			System.out.println();
		}
		
	
		sc.close();
	}
}
