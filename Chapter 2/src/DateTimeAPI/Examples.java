package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class Examples {
	public static void main(String[] args) 
	{ 
		// create an LocalDate object 
		LocalDate lt = LocalDate.now(); 
		// print result 
		System.out.println("LocalDate : "+ lt); 
	} 

}

//Java program to demonstrate LocalDate.now() method 

 class Test { 
	public static void main(String[] args) 
	{ 
		// create a clock 
		ZoneId zid = ZoneId.of("Asia/Kolkata"); 
		// create an LocalDate object using now(zoneId) 
		LocalDate lt = LocalDate.now(zid); 
		// print result 
		System.out.println("LocalDate : "+ lt); 
	} 
} 

//Java program to demonstrate LocalDate.of(int month) method 

 class Test2 { 
	public static void main(String[] args) 
	{ 
		// create LocalDate object 
		LocalDate localdate = LocalDate.of(2020, 5, 13); 
		// print full date 
		System.out.println("Date: " + localdate); 
	} 
} 
//Output:
//Date:2020-05-13

//Java program to demonstrate 
//LocalDate.of(Month month) method 
 class Test3 { 
	public static void main(String[] args) 
	{ 
		// create LocalDate object 
		LocalDate localdate = LocalDate.of(2020, Month.MAY, 13); 
		// print full date 
		System.out.println("Date: "+ localdate); 
	} 
} 
//Output:
//Date: 2020-05-13
 class Test4 { 
 	public static void main(String[] args) 
 	{ 
 		// create an LocalDate object 
 		LocalDate lt = LocalDate.parse("2020-05-13"); 
 		// print result 
 		System.out.println("LocalDate : "+ lt); 
 	} 
 } 

//Java program to demonstrate LocalTime.now() method 
 
 class Test5 { 
	public static void main(String[] args) 
	{ 
		// apply now() method 
		// of LocalTime class 
		LocalTime time = LocalTime.now(); 
		// print time 
		System.out.println("Time: "+ time); 
	} 
} 
//Output: It varies as the time passes.
//Time: 20:43:41.453 
 class Test6 { 
		public static void main(String[] args) 
		{ 
				// create a clock 
			ZoneId zid = ZoneId.of("Asia/Kolkata"); 
			LocalTime time = LocalTime.now(zid);
			// print time 
			System.out.println("Time: "+ time); 
		} 
	} 


