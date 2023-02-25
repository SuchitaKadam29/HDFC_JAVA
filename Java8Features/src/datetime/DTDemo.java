package datetime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DTDemo {

	public static void main(String[] args) {


		LocalDate date =	LocalDate.now();
		
		System.out.println(date);
		
			
		
		
		
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
		
		System.out.println(date.plusWeeks(8));
		
		LocalDate date2 = LocalDate.of(2020, 8, 15);
		
		System.out.println(date.isAfter(date2));
		
		System.out.println(date2.isLeapYear());
		
		
	
		
		
System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		String str = "01-12-2023";
		
	DateTimeFormatter format =	DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate mydate =	LocalDate.parse(str,format);
		
			System.out.println(mydate);
		
			System.out.println(mydate.getMonth());


		
	}

}
