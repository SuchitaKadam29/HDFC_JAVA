package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {


		Date  d = new Date();
		
		System.out.println(d);
		
		LocalDate mydate = LocalDate.now();
		
		System.out.println(mydate);
		
		System.out.println(mydate.plusYears(30));
		
		
		System.out.println("year "+mydate.getYear());
		
		System.out.println("week day "+mydate.getDayOfWeek());
		
		System.out.println("month "+mydate.getMonth());
		
		System.out.println(mydate.getMonthValue());
		
		
		LocalDateTime  dt = LocalDateTime.now();
		
		
		System.out.println(dt.getHour());

	}

}
