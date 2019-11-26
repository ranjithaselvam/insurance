package com.atmecs.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.atmecs.config.Constant;
import com.atmecs.write.WriteToExcel;

public class EffectiveDate {

	public DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	public Date currentDate = new Date();
	public Calendar calender = Calendar.getInstance();

	public String oneMonthLater(String value) throws Exception {

		System.out.println("Current Date :" + dateFormat.format(currentDate));
		calender.setTime(currentDate);
		WriteToExcel writeCurrentDate = new WriteToExcel(Constant.effectiveDate_path);
		writeCurrentDate.setCellData("policyEffectiveDate", "CurrentDate", 2, dateFormat.format(currentDate));
		int newValue = Integer.parseInt(value);
		calender.add(Calendar.MONTH, newValue);
		Date getDate = calender.getTime();
		System.out.println("One month later than the current date :" + dateFormat.format(getDate));
		return dateFormat.format(getDate);
	}

	public String excatlytenDays(String value) throws Exception {

		System.out.println("Current Date :" + dateFormat.format(currentDate));
		calender.setTime(currentDate);
		WriteToExcel writeCurrentDate = new WriteToExcel(Constant.effectiveDate_path);
		writeCurrentDate.setCellData("policyEffectiveDate", "CurrentDate", 3, dateFormat.format(currentDate));
		int newValue = Integer.parseInt(value);
		calender.add(Calendar.DAY_OF_MONTH, newValue);
		Date getDate = calender.getTime();
		System.out.println("Exactly ten days from the current date :" + dateFormat.format(getDate));
		return dateFormat.format(getDate);
	}

	public String oneMonthEarlier(String value) throws Exception {
		System.out.println("Current Date :" + dateFormat.format(currentDate));
		calender.setTime(currentDate);
		WriteToExcel writeCurrentDate = new WriteToExcel(Constant.effectiveDate_path);
		writeCurrentDate.setCellData("policyEffectiveDate", "CurrentDate", 4, dateFormat.format(currentDate));
		int newValue = Integer.parseInt(value);
		calender.add(Calendar.MONTH, newValue);
		Date getDate = calender.getTime();
		System.out.println("One month earlier than the current date :" + dateFormat.format(getDate));
		return dateFormat.format(getDate);
	}

}
