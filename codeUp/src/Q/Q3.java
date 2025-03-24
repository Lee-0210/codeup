package Q;

public class Q3 {

	public static void main(String[] args) {
		System.out.println("::::: 정수로 비교 :::::::");
		// 그냥 정수로 해보기
		for(int i = 1; i <= 100; i++) {
			int ten = i / 10;
			int one = i % 10;
			
			if(ten % 3 == 0 && one % 3 == 0 && ten > 0) System.out.print("**");
			else if(ten % 3 == 0 && ten > 0) System.out.print("*");
			else if(one % 3 == 0 && i != 100) System.out.print("*");
			else System.out.print(i);
			
			System.out.println();
		}
	}
}
