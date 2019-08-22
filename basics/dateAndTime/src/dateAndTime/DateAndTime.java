package dateAndTime;
import java.time.LocalDateTime;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// For more about date and time see https://www.w3schools.com/java/java_date.asp
		
		LocalDateTime d = LocalDateTime.now();
		//Date d = new Date(); // It gives the current date and time.
		
		System.out.println(d.getYear());
		
		//System.out.println(d.toString());
		
		//System.out.println(d.getTime()); // Returns miliseconds since 1st of January, 1970.
	
		//System.out.println(d.getYear()); // Deprecated, it returns a number that is the actual year minus 1900.
	}

}
