package _3015;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int large = sc.nextInt();
		sc.nextLine();
		Map<String, Integer> map = new LinkedHashMap<>();
		
		for(int i = 0; i < N; i++) {
			String nameAndScore = sc.nextLine();
			String[] spl = nameAndScore.split(" ");
			map.put(spl[0], Integer.parseInt(spl[1]));
		}
		
		List<String> list = map.entrySet().stream()
																			.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
																			.map(e -> e.getKey())
																			.collect(Collectors.toList());
		
		for(int i = 0; i < large; i++) {
			System.out.println(list.get(i));
		}
		
		sc.close();
	}
}
