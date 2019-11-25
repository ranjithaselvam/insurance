package com.atmecs.page;

import java.util.Scanner;

import org.testng.annotations.BeforeSuite;

import com.atmecs.utils.ExcelReader;
import com.atmecs.utils.NoEffectivePolicyDateException;
import com.atmecs.utils.Utils;

public class Page {
	ExcelReader read = new ExcelReader();
	Utils util = new Utils();
	Scanner input = new Scanner(System.in);
	public int userChoice;
	public String result;

	@BeforeSuite
	public void SelectOption() throws NoEffectivePolicyDateException {
		String choice="y";
		do {
		System.out.println("Insurance policy");
        System.out.println("1-One month later than the current date ");
		System.out.println("2-Exactly 10 days from the current date ");
		System.out.println("3-One month earlier than the current date");
		System.out.println("Select Insurance Policy effective date to Perform:");
		userChoice = input.nextInt();
	
		switch (userChoice) {
		case 1:
			util.oneMonthLater(1);
			break;
		case 2:
			util.exactlytenthDay(10);
			break;
		case 3:
			util.oneMonthEarlier(-1);
			break;
		default:
			throw new NoEffectivePolicyDateException("Policy plan Not Matched");
		}
		System.out.println("Do you want to continue(y/n)?");
		result=input.toString();
		}while(choice.equals("y"));
}
}



