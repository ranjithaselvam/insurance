package com.atmecs.test;

import org.testng.annotations.Test;

import com.atmecs.config.Constant;
import com.atmecs.read.ExcelReader;
import com.atmecs.util.EffectiveDate;
import com.atmecs.write.WriteToExcel;

public class PolicyEffectiveDateTest {
	public String[] split;
	public String getFromExcel;
	public String getDate;
    public EffectiveDate effectiveDate = new EffectiveDate();
	public ExcelReader read = new ExcelReader();

	@Test()
	public void testDate() throws Exception {
		
		
		//one month later policy effective date
		getFromExcel= read.readData(Constant.effectiveDate_path, "policyEffectiveDate", 1, 0);
		split = getFromExcel.split(":");
	    getDate = effectiveDate.oneMonthLater(split[1]);
		WriteToExcel writeOneMonthLaterDate = new WriteToExcel(Constant.effectiveDate_path);
		writeOneMonthLaterDate.setCellData("policyEffectiveDate", "ResultDate", 2, getDate);
		
        //exactly 10 days from current date 
		getFromExcel = read.readData(Constant.effectiveDate_path, "policyEffectiveDate", 2, 0);
		split = getFromExcel.split(":");
		getDate = effectiveDate.excatlytenDays(split[1]);
		WriteToExcel writeExactlyTenthDayDate = new WriteToExcel(Constant.effectiveDate_path);
		writeExactlyTenthDayDate.setCellData("policyEffectiveDate", "ResultDate", 3, getDate);
		
        //one month earlier policy effective date
		getFromExcel = read.readData(Constant.effectiveDate_path, "policyEffectiveDate", 3, 0);
		split = getFromExcel.split(":");
		getDate = effectiveDate.oneMonthEarlier(split[1]);
		WriteToExcel writeOneMonthEarlierDate = new WriteToExcel(Constant.effectiveDate_path);
		writeOneMonthEarlierDate.setCellData("policyEffectiveDate", "ResultDate", 4, getDate);
	}

}


