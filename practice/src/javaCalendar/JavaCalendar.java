package javaCalendar;

//import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class JavaCalendar {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the date in DDMMYYYY format");
		String str=scan.nextLine();
		System.out.println("Using Calendar class : Weekday on the given date is "+calendar1(str));
		System.out.println("Using SimpleDateFormat class : Weekday on the given date is "+calendar2(str));
		scan.close();
	}
	
	public static String calendar1(String date) {
		Calendar cal=GregorianCalendar.getInstance();
		
		int d=Integer.parseInt(date.substring(0, 2));
		//System.out.println(d);
		int m=Integer.parseInt(date.substring(2, 4));
		//System.out.println(m);
		int y=Integer.parseInt(date.substring(4, 8));
		//System.out.println(y);
		cal.clear();
		cal.set(y, m-1, d);
		
		int d1=cal.get(Calendar.DAY_OF_WEEK);
		
		String[] week= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String day=week[d1-1];
		return day;
		
	}
	
	public static String calendar2(String date) throws ParseException {
		
		
		SimpleDateFormat sdt=new SimpleDateFormat("ddMMyyyy");
		Date dt=sdt.parse(date); 
		SimpleDateFormat df=new SimpleDateFormat("EEEE");
		String day=df.format(dt);
		return day;
	}

}
