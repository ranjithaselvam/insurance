package com.atmecs.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {

	public DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	public Date currentDate = new Date();
	public Calendar calender = Calendar.getInstance();
	
    public void oneMonthLater(int value)

	{
		System.out.println("Current Date :" + dateFormat.format(currentDate));
		calender.setTime(currentDate);
		calender.add(Calendar.MONTH, value );
		Date currentDatePlusOne = calender.getTime();
		System.out.println("One month later than the current date :" + dateFormat.format(currentDatePlusOne));
	}

	public void exactlytenthDay(int value) {

		System.out.println("Current Date :" + dateFormat.format(currentDate));
		calender.setTime(currentDate);
		calender.add(Calendar.DAY_OF_MONTH, value);
		Date currentDatePlusTen = calender.getTime();
		System.out.println("Exactly 10 days from the current date :" + dateFormat.format(currentDatePlusTen));

	}

	public void oneMonthEarlier(int value)

	{
		System.out.println("Current Date :" + dateFormat.format(currentDate));
		calender.setTime(currentDate);
		calender.add(Calendar.MONTH,value);
		Date currentDateMinusOne = calender.getTime();
		System.out.println("One month earlier than the current date :" + dateFormat.format(currentDateMinusOne));

	}
}
