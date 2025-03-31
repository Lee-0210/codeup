import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDateTime ldate = LocalDateTime.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd일 HH:mm:ss (E)", Locale.KOREA);
		LocalDateTime ld = ldate.with(DayOfWeek.SATURDAY);
		String result = ld.format(dateFormatter);
		System.out.println(result);
	}
}
