package Q.Q13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now().with(DayOfWeek.SATURDAY);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss (E)");
		String now2 = dtf.format(now);
		System.out.println(now2);
		LocalDate date = LocalDate.now().with(DayOfWeek.SATURDAY);
		LocalDateTime ldt = date.atTime(20, 40);
		
		if(now.isBefore(ldt)) System.out.println("11");
		
		
	}
}
