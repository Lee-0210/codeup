package Q.Q13;

import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Lotto lotto = Lotto.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? ");
		int N = 0;
		int choose = 0;
		int price = 0;
		
		// 몇 게임 할건지
		do {
			N = sc.nextInt();
			if(N > 5 || N <= 0) {
				System.err.println("최소 1게임 최대 5게임 입니다.");
			} else break;
			
		} while(true);
		
		// 로또 번호
		for(int i = 0; i < N; i++) {
			List<Integer> list = new ArrayList<>();
			System.out.print("[" + (i+1) + " 게임] (1.자동 / 2.수동) : ");
			choose = sc.nextInt();
			
			switch(choose) {
				case 1 :	
					for(int j = 0; j < 6; j++) {
							int ran = (int)(Math.random()*45) + 1;
							if(!list.contains(ran)) list.add(j, ran);
							else j--;
						}
					lotto.addToMap(list, "자 동");
					list.stream().sorted().forEach(e -> System.out.print(e + " "));
					System.out.println("\n");
				break;
				
				case 2  :
					System.out.print("① : ");
					list.add(sc.nextInt());
					System.out.print("② : ");
					list.add(sc.nextInt());
					System.out.print("③ : ");
					list.add(sc.nextInt());
					System.out.print("④ : ");
					list.add(sc.nextInt());
					System.out.print("⑤ : ");
					list.add(sc.nextInt());
					System.out.print("⑥ : ");
					list.add(sc.nextInt());
					
					lotto.addToMap(list, "수 동");
					list.stream().sorted().forEach(e -> System.out.print(e + " "));
					System.out.println();
				break;
			}
			price += 1000;
		}
		
		// 로또 결과 출력
		System.out.println("############ 인생역전 Lottoria ############");
		System.out.print("발행일	: ");
		System.out.println(getBuyDay());
		System.out.print("추첨일	: ");
		System.out.println(getSatDay());
		System.out.print("지급기한	: ");
		System.out.println(getOneYearAfter());
		System.out.println("-----------------------------------------");
		int count = 0;
		DecimalFormat df = new DecimalFormat("₩#,##0");
		
	    for (Map.Entry<List<Integer>, String> entry : lotto.lottoNumList.entrySet()) {
            System.out.print((char)('A'+count++) + " " + entry.getValue() + " ");
            for(int i = 0; i < entry.getKey().size(); i++) {
              System.out.print(entry.getKey().get(i) + "  ");
            }
            System.out.println();
        }
	    System.out.println("-----------------------------------------");
	    System.out.println("금액                           	    " + df.format(price));
	    System.out.println("######################################### \n");
	    
	    // 당첨 번호
	    System.out.print("당천 번호 : ");
	    List<Integer> resultNum = new ArrayList<>();
	    for(int i = 0; i < 6; i++) {
	    	int rand = (int)(Math.random()*46)+1;
	    	if(!resultNum.contains(rand)) {
	    		resultNum.add(i, rand);
	    	} else i--;
	    }
	    resultNum.stream().sorted().forEach(e -> System.out.print(e + " "));
	    System.out.println();
	    
	    // 보너스 번호
	    int bonusNum = 0;
	    while(true) {
	    	bonusNum = (int)(Math.random()*45)+1;
	    	if(!resultNum.contains(bonusNum)) break;
	    }
	    System.out.println("보너스 번호 : " + bonusNum);
	    
	    getResult(lotto.lottoNumList, resultNum, bonusNum);
		sc.close();
	}
	
	// 산 날짜 메서드
	public static String getBuyDay() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd일 (E) HH:mm:ss", Locale.KOREA);
		String currenDate = now.format(dateFormatter);
		
		return currenDate;
	}
	
	// 그 주에 토요일 메서드
	public static String getSatDay() {
		LocalDate sat = LocalDate.now().with(DayOfWeek.SATURDAY);
		LocalDateTime satDateTime = sat.atTime(21, 0);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd일 (E) HH:mm:ss", Locale.KOREA);
		String formattedDate = satDateTime.format(dateFormatter);
		
		return formattedDate;
	}
	
	// 1년뒤 메서드
	public static String getOneYearAfter() {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd일 (E)", Locale.KOREA);
		LocalDate sat = LocalDate.now().with(DayOfWeek.SATURDAY);
		LocalDate oneYearAfter = sat.plusYears(1);
		String formattedDate = oneYearAfter.format(dateFormatter);

		return formattedDate;
	}
	
	// 최종 결과 메서드
	public static void getResult(Map<List<Integer>, String> lottoNumList, List<Integer> list, int bonus) {
		int count = 0;
		System.out.println();
		System.out.println("#################### 당첨 결과 ####################");
		for (Map.Entry<List<Integer>, String> entry : lottoNumList.entrySet()) {
			int lottoCount = 0;
			int bonusCount = 0;
			System.out.print((char)('A'+count++) + " " + entry.getValue() + "  ");
            for(int i = 0; i < entry.getKey().size(); i++) {
              if(list.contains(entry.getKey().get(i))) lottoCount++;
              if(entry.getKey().get(i) == bonus) bonusCount++;
            }
            entry.getKey().stream().sorted().forEach(e -> System.out.print(e + "    "));
            
            String winning = "";
            if(lottoCount == 6) winning = "(1등)";
            else if(lottoCount == 5 && bonusCount != 0) winning = "(2등)";
            else if(lottoCount == 5) winning = "(3등)";
            else if(lottoCount == 4) winning = "(4등)";
            else if(lottoCount == 3) winning = "(5등)";
            else winning = "(낙첨)";
            
            System.out.println(winning);
        }
		System.out.println("#################################################");
	}
}
