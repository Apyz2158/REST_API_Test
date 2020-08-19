package com.test.SmartyPants.Simple;

import java.util.Calendar;
import java.util.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class RandomGen {

	String getAlphaNumericString(int n) {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}
	/*
	 * public int diffTie(String start,String end) throws Exception {
	 * 
	 * 
	 * String start = "08:00:00"; String end = "10:00:00";
	 * 
	 * 
	 * SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	 * 
	 * Date date1 = format.parse(start);
	 * 
	 * Date date2 = format.parse(end);
	 * 
	 * long difference = date2.getTime() - date1.getTime();
	 * 
	 * int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(difference);
	 * 
	 * if(minutes<0)minutes += 1440;
	 * 
	 * //String str = minutes+"";
	 * 
	 * return minutes; }
	 */

	
	  public static void main(String[] args) throws Exception { RandomGen obj = new
	  RandomGen(); 
	  
      
	  
	  
		/*
		 * String start = "08:00:00"; String ddate ="01:00:00"; SimpleDateFormat
		 * Localformat = new SimpleDateFormat("HH:mm:ss");
		 * 
		 * Date date1 = Localformat.parse(start); System.out.println("Date1 : "+date1);
		 * System.out.println(date1.getTime()); Date date2 = Localformat.parse(ddate);
		 * System.out.println("Date2 : "+date2); long date = date1.getTime() +
		 * date2.getTime(); System.out.println("long: "+date); int min = (int)
		 * TimeUnit.MILLISECONDS.toHours(date); System.out.println("Hours : "+min);
		 * 
		 * DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH:mm:ss");
		 * 
		 * Date result = new Date(date); System.out.println("Result : "+result);
		 * System.out.println("Converted : "+dateFormat.format(result));
		 * 
		 * 
		 * System.out.println("Long : "+date); Timestamp ts = new
		 * Timestamp(date1.getTime());
		 * 
		 * System.out.println(date1);
		 * 
		 * String time = Localformat.format(date1.getTime()); System.out.println(time);
		 * 
		 */
	 
	  
	  
	  String myTime = "14:10";
	  SimpleDateFormat df = new SimpleDateFormat("HH:mm");
	  Date d = df.parse(myTime); 
	  Calendar cal = Calendar.getInstance();
	  cal.setTime(d);
	  cal.add(Calendar.MINUTE, 60);
	  String newTime = df.format(cal.getTime());
	  System.out.println(newTime);
	  
	  
	  
	  
	  
	  
	 
	  }
	 

}
