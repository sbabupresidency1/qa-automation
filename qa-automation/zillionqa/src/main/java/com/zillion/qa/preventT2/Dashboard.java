package com.zillion.qa.preventT2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;

import com.zillion.qa.commands.Manipulation;
import com.zillion.qa.opsadmin.OR;

public class Dashboard extends Manipulation implements OR
{
	public static String dateFormatCheck(String value)
	{
		String returnValue = null;
		String format = "E MMM dd yyyy";
		Date date = null;
		Boolean result;
		try
		{
			SimpleDateFormat insufficientClassroomDateFormat = new SimpleDateFormat(format);
			date = insufficientClassroomDateFormat.parse(value);
			if (!value.equals(insufficientClassroomDateFormat.format(date)))
			{
				date = null;
			}
		}
		catch (ParseException ex)
		{
			ex.printStackTrace();
		}
		if(date != null)
		{
			returnValue = "Date format has verified successfully";
			result = true;
		}
		else
		{
			returnValue = "Date format has not present correctly";
			result = false;
		}
		Assert.assertTrue(result);
		return returnValue;
	}
}
