package com.zillion.qa.kulfiqs;

import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.zillion.qa.commands.Manipulation;
import com.zillion.qa.commands.Navigate;
import com.zillion.qa.kulfiqs.OR;
import com.zillion.qa.utils.Directory;
import com.zillion.qa.utils.Platform;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;


public class Enrollment extends Manipulation implements OR{
	/**
	 * Name :     RAMYA.P
	 * Created Date:   11/Jul/17
	 * Modified Date:
	 * Description :   Create a common method to launch the QS Member URL
	 * Ticket ID :
	 * Required Inputs :Client URL No
	 */

	public static void launchQSMemberUrl(WebDriver driver,String clientUrl)
	{
		if(clientUrl.equals("1"))
		{
			driver.navigate().to(Directory.QS_Member_Url);
			Navigate.maximize(driver);
			wait(driver, "2");
		}  
		else if(clientUrl.equals("2"))
		{
			driver.navigate().to(Directory.QS1_Member_Url);
			Navigate.maximize(driver);
			wait(driver, "2");
		}
		else if(clientUrl.equals("3"))
		{
			driver.navigate().to(Directory.QS2_Member_Url);
			Navigate.maximize(driver);
			wait(driver, "2");
		}
		else if(clientUrl.equals("4"))
		{
			driver.navigate().to(Directory.QS3_Member_Url);
			Navigate.maximize(driver);
			wait(driver, "2");
		}
		else if(clientUrl.equals("5"))
		{
			driver.navigate().to(Directory.QS4_Member_Url);
			Navigate.maximize(driver);
			wait(driver, "2");
		}
		else if(clientUrl.equals("6"))
		{
			driver.navigate().to(Directory.QS5_Member_Url);
			Navigate.maximize(driver);
			wait(driver, "2");
		}
	}

	/**
	 * Name :     RAMYA.P
	 * Created Date:   12/Jul/17
	 * Modified Date:
	 * Description :   Create a common method to login the QS Member for different client
	 * Ticket ID :
	 * Required Inputs :Client URL No
	 */
	public static void loginQSMember(WebDriver driver,String clientCredentials)
	{
		if(clientCredentials.equals("1"))
		{
			driver.navigate().to(Directory.QS_Member_Url);
			Navigate.maximize(driver);
			wait(driver, "2");
			WebElement  loginLink = driver.findElement(By.xpath(OR.RA_QS_MEMBER_LOGIN_LINK));
			click(loginLink);
			WebElement  username = driver.findElement(By.xpath(OR.RA_QS_MEMBER_USERNAME_TEXTBOX));
			sendKeys(username, Directory.QS_Member_Username);
			WebElement  password = driver.findElement(By.xpath(OR.RA_QS_MEMBER_PASSWORD_TEXTBOX));
			sendKeys(password, Directory.QS_Member_Password);
			WebElement  loginButton = driver.findElement(By.xpath(OR.RA_QS_LOGIN_BUTTON));
			click(loginButton);
		}
		else if(clientCredentials.equals("2"))
		{
			driver.navigate().to(Directory.QS1_Member_Url);
			Navigate.maximize(driver);
			wait(driver, "2");
			WebElement  loginLink = driver.findElement(By.xpath(OR.RA_QS_MEMBER_LOGIN_LINK));
			click(loginLink);
			WebElement  username = driver.findElement(By.xpath(OR.RA_QS_MEMBER_USERNAME_TEXTBOX));
			sendKeys(username, Directory.QS1_Member_Username);
			WebElement  password = driver.findElement(By.xpath(OR.RA_QS_MEMBER_PASSWORD_TEXTBOX));
			sendKeys(password, Directory.QS1_Member_Password);
			WebElement  loginButton = driver.findElement(By.xpath(OR.RA_QS_LOGIN_BUTTON));
			click(loginButton);
		}
		else if(clientCredentials.equals("3"))
		{
			driver.navigate().to(Directory.QS2_Member_Url);
			Navigate.maximize(driver);
			wait(driver, "2");
			WebElement  loginLink = driver.findElement(By.xpath(OR.RA_QS_MEMBER_LOGIN_LINK));
			click(loginLink);
			WebElement  username = driver.findElement(By.xpath(OR.RA_QS_MEMBER_USERNAME_TEXTBOX));
			sendKeys(username, Directory.QS2_Member_Username);
			WebElement  password = driver.findElement(By.xpath(OR.RA_QS_MEMBER_PASSWORD_TEXTBOX));
			sendKeys(password, Directory.QS2_Member_Password);
			WebElement  loginButton = driver.findElement(By.xpath(OR.RA_QS_LOGIN_BUTTON));
			click(loginButton);
		}
		else if(clientCredentials.equals("4"))
		{
			driver.navigate().to(Directory.QS3_Member_Url);
			Navigate.maximize(driver);
			wait(driver, "2");
			WebElement  loginLink = driver.findElement(By.xpath(OR.RA_QS_MEMBER_LOGIN_LINK));
			click(loginLink);
			WebElement  username = driver.findElement(By.xpath(OR.RA_QS_MEMBER_USERNAME_TEXTBOX));
			sendKeys(username, Directory.QS3_Member_Username);
			WebElement  password = driver.findElement(By.xpath(OR.RA_QS_MEMBER_PASSWORD_TEXTBOX));
			sendKeys(password, Directory.QS3_Member_Password);
			WebElement  loginButton = driver.findElement(By.xpath(OR.RA_QS_LOGIN_BUTTON));
			click(loginButton);
		}
		else if(clientCredentials.equals("5"))
		{
			driver.navigate().to(Directory.QS4_Member_Url);
			Navigate.maximize(driver);
			wait(driver, "2");
			WebElement  loginLink = driver.findElement(By.xpath(OR.RA_QS_MEMBER_LOGIN_LINK));
			click(loginLink);
			WebElement  username = driver.findElement(By.xpath(OR.RA_QS_MEMBER_USERNAME_TEXTBOX));
			sendKeys(username, Directory.QS4_Member_Username);
			WebElement  password = driver.findElement(By.xpath(OR.RA_QS_MEMBER_PASSWORD_TEXTBOX));
			sendKeys(password, Directory.QS4_Member_Password);
			WebElement  loginButton = driver.findElement(By.xpath(OR.RA_QS_LOGIN_BUTTON));
			click(loginButton);
		}
		else if(clientCredentials.equals("6"))
		{
			driver.navigate().to(Directory.QS5_Member_Url);
			Navigate.maximize(driver);
			wait(driver, "2");
			WebElement  loginLink = driver.findElement(By.xpath(OR.RA_QS_MEMBER_LOGIN_LINK));
			click(loginLink);
			WebElement  username = driver.findElement(By.xpath(OR.RA_QS_MEMBER_USERNAME_TEXTBOX));
			sendKeys(username, Directory.QS5_Member_Username);
			WebElement  password = driver.findElement(By.xpath(OR.RA_QS_MEMBER_PASSWORD_TEXTBOX));
			sendKeys(password, Directory.QS5_Member_Password);
			WebElement  loginButton = driver.findElement(By.xpath(OR.RA_QS_LOGIN_BUTTON));
			click(loginButton);
		}
	}

	/**
	 * Name :     RAMYA.P
	 * Created Date:   17/Jul/17
	 * Modified Date:
	 * Description :   Create a common method to close the compose email using Sikuli for windows
	 * Ticket ID :
	 * Required Inputs :
	 * @throws FindFailed 
	 */
	public static void composeEmailClose(WebDriver driver) throws FindFailed
	{
		String osName=Platform.OS.toUpperCase();
		if(osName.contains("WINDOWS"))
		{
			
		WebElement  emailHelpLink = driver.findElement(By.xpath(OR.EMAIL_HELP_LINK));
		click(emailHelpLink);
		wait(driver,"5");
		Screen s=new Screen();
		Pattern emailclose = new Pattern(Directory.uploadFilePath+"emailclose.JPG");
		s.click(emailclose);
		wait( driver, "5" );
		Pattern emailSaveNo = new Pattern(Directory.uploadFilePath+"EmailSaveNo.JPG");
		s.click(emailSaveNo);
		wait( driver, "3" );
		}
		else if(osName.contains("MAC"))
		{
			WebElement  emailHelpLink = driver.findElement(By.xpath(OR.EMAIL_HELP_LINK));
			click(emailHelpLink);
			wait( driver, "5" );
			Screen s=new Screen();
			Pattern emailclose = new Pattern(Directory.uploadFilePath+"emailclosemac.png");
			s.click(emailclose);
			wait( driver, "2" );
			Pattern emailSaveNo = new Pattern(Directory.uploadFilePath+"Don'tSave.png");
			s.click(emailSaveNo);
			wait( driver, "3" );
		}
	}

	/**
	 * Name :     RAMYA.P
	 * Created Date:   18/Jul/17
	 * Modified Date:
	 * Description :   Create a common method to enter first and last name
	 * Ticket ID :
	 * Required Inputs :Client No
	 * @throws FindFailed 
	 */
	public static String quickStartUserCredentialsFirstNameAndLastName(WebDriver driver,String clientCredentials)
	{
		String firstName="";
		if(clientCredentials.equals("1"))
		{
			WebElement  firstname = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
			firstName=clearAndType(firstname, Directory.QS_BASICINFOPAGE_FIRSTNAME);
			wait(driver, "1");
			WebElement  lastname = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
			clearAndType(lastname, Directory.QS_BASICINFOPAGE_LASTNAME);
			wait(driver, "1");
			return firstName;
		}
		else if(clientCredentials.equals("2"))
		{
			WebElement  firstname = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
			firstName=clearAndType(firstname, Directory.QS1_BASICINFOPAGE_FIRSTNAME);
			wait(driver, "1");
			WebElement  lastname = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
			clearAndType(lastname, Directory.QS1_BASICINFOPAGE_LASTNAME);
			wait(driver, "1");
			return firstName;
		}
		else if(clientCredentials.equals("3"))
		{
			WebElement  firstname = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
			firstName=clearAndType(firstname, Directory.QS2_BASICINFOPAGE_FIRSTNAME);
			wait(driver, "1");
			WebElement  lastname = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
			clearAndType(lastname, Directory.QS2_BASICINFOPAGE_LASTNAME);
			wait(driver, "1");
			return firstName;
		}
		else if(clientCredentials.equals("4"))
		{
			WebElement  firstname = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
			firstName=clearAndType(firstname, Directory.QS3_BASICINFOPAGE_FIRSTNAME);
			wait(driver, "1");
			WebElement  lastname = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
			clearAndType(lastname, Directory.QS3_BASICINFOPAGE_LASTNAME);
			wait(driver, "1");
			return firstName;
		}
		else if(clientCredentials.equals("5"))
		{
			WebElement  firstname = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
			firstName=clearAndType(firstname, Directory.QS4_BASICINFOPAGE_FIRSTNAME);
			wait(driver, "1");
			WebElement  lastname = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
			clearAndType(lastname, Directory.QS4_BASICINFOPAGE_LASTNAME);
			wait(driver, "1");
			return firstName;
		}
		else if(clientCredentials.equals("6"))
		{
			WebElement  firstname = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
			firstName=clearAndType(firstname, Directory.QS5_BASICINFOPAGE_FIRSTNAME);
			wait(driver, "1");
			WebElement  lastname = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
			clearAndType(lastname, Directory.QS5_BASICINFOPAGE_LASTNAME);
			wait(driver, "1");
			return firstName;
		}
		System.out.println("firstName"+firstName);
		return firstName;
	}
	/**
	 * Name :     RAMYA.P
	 * Created Date:   18/Jul/17
	 * Modified Date:
	 * Description :   Create a common method to enter DOB 
	 * Ticket ID :
	 * Required Inputs :
	 * @throws FindFailed 
	 */
	public static void quickstartUserCredentialsDOB(WebDriver driver){
		WebElement month = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		selectByVisibletext(month, Directory.QS_MONTH);
		WebElement day = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		selectByVisibletext(day, Directory.QS_DAY);
		WebElement year = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		sendKeys(year, Directory.QS_YEAR);
		
	}
	
	/**
	 * Name :     RAMYA.P
	 * Created Date:   18/Jul/17
	 * Modified Date:
	 * Description :   Create a common method to enter Insurance Information
	 * Ticket ID :
	 * Required Inputs :Client No
	 * @throws AWTException 
	 * @throws FindFailed 
	 */
	
	public static void quickStartUserCredentialsInsuranceInformation(WebDriver driver,String clientCredentials) throws AWTException{
		if(clientCredentials.equals("1"))
		{
			WebElement  insurancePlan = driver.findElement(By.xpath(OR.RA_MEMBER_INSURANCEPROVIDER));
			clearAndType(insurancePlan, Directory.QS_INSURANCEINFORMATION_INSURANCEPLAN);
			Navigate.enter(driver);
			WebElement  memberID = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
			clearAndType(memberID, Directory.QS_INSURANCEINFORMATION_MEMBERID);
			wait(driver, "1");
			WebElement  groupNumber = driver.findElement(By.xpath(OR.RA_MEMBER_GROUPNUMBER));
			clearAndType(groupNumber, Directory.QS_INSURANCEINFORMATION_GROUPNUMBER);
			wait(driver, "1");
		}
		else if(clientCredentials.equals("2"))
		{
			WebElement  insurancePlan = driver.findElement(By.xpath(OR.RA_MEMBER_INSURANCEPROVIDER));
			clearAndType(insurancePlan, Directory.QS1_INSURANCEINFORMATION_INSURANCEPLAN);
			Navigate.enter(driver);
			WebElement  memberID = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
			clearAndType(memberID, Directory.QS1_INSURANCEINFORMATION_MEMBERID);
			wait(driver, "1");
			WebElement  groupNumber = driver.findElement(By.xpath(OR.RA_MEMBER_GROUPNUMBER));
			clearAndType(groupNumber, Directory.QS1_INSURANCEINFORMATION_GROUPNUMBER);
			wait(driver, "1");
		}
		else if(clientCredentials.equals("3"))
		{
			WebElement  insurancePlan = driver.findElement(By.xpath(OR.RA_MEMBER_INSURANCEPROVIDER));
			clearAndType(insurancePlan, Directory.QS2_INSURANCEINFORMATION_INSURANCEPLAN);
			Navigate.enter(driver);
			WebElement  memberID = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
			clearAndType(memberID, Directory.QS2_INSURANCEINFORMATION_MEMBERID);
			wait(driver, "1");
			WebElement  groupNumber = driver.findElement(By.xpath(OR.RA_MEMBER_GROUPNUMBER));
			clearAndType(groupNumber, Directory.QS2_INSURANCEINFORMATION_GROUPNUMBER);
			wait(driver, "1");
		}
		else if(clientCredentials.equals("4"))
		{
			WebElement  insurancePlan = driver.findElement(By.xpath(OR.RA_MEMBER_INSURANCEPROVIDER));
			clearAndType(insurancePlan, Directory.QS3_INSURANCEINFORMATION_INSURANCEPLAN);
			Navigate.enter(driver);
			WebElement  memberID = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
			clearAndType(memberID, Directory.QS3_INSURANCEINFORMATION_MEMBERID);
			wait(driver, "1");
			WebElement  groupNumber = driver.findElement(By.xpath(OR.RA_MEMBER_GROUPNUMBER));
			clearAndType(groupNumber, Directory.QS3_INSURANCEINFORMATION_GROUPNUMBER);
			wait(driver, "1");
		}
		else if(clientCredentials.equals("5"))
		{
			WebElement  insurancePlan = driver.findElement(By.xpath(OR.RA_MEMBER_INSURANCEPROVIDER));
			clearAndType(insurancePlan, Directory.QS4_INSURANCEINFORMATION_INSURANCEPLAN);
			Navigate.enter(driver);
			WebElement  memberID = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
			clearAndType(memberID, Directory.QS4_INSURANCEINFORMATION_MEMBERID);
			wait(driver, "1");
			WebElement  groupNumber = driver.findElement(By.xpath(OR.RA_MEMBER_GROUPNUMBER));
			clearAndType(groupNumber, Directory.QS4_INSURANCEINFORMATION_GROUPNUMBER);
			wait(driver, "1");
		}
		else if(clientCredentials.equals("6"))
		{
			WebElement  insurancePlan = driver.findElement(By.xpath(OR.RA_MEMBER_INSURANCEPROVIDER));
			clearAndType(insurancePlan, Directory.QS5_INSURANCEINFORMATION_INSURANCEPLAN);
			Navigate.enter(driver);
			WebElement  memberID = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
			clearAndType(memberID, Directory.QS5_INSURANCEINFORMATION_MEMBERID);
			wait(driver, "1");
			WebElement  groupNumber = driver.findElement(By.xpath(OR.RA_MEMBER_GROUPNUMBER));
			clearAndType(groupNumber, Directory.QS5_INSURANCEINFORMATION_GROUPNUMBER);
			wait(driver, "1");
		}
	}

	/**
	 * Name :     RAMYA.P
	 * Created Date:   18/Jul/17
	 * Modified Date:
	 * Description :   Create a common method to close the contact no using Sikuli for windows
	 * Ticket ID :
	 * Required Inputs :
	 * @throws FindFailed 
	 * @throws AWTException 
	 */
	public static void contactUsLinkHandle(WebDriver driver) throws FindFailed, AWTException
	{
		String osName=Platform.OS.toUpperCase();
		if(osName.contains("WINDOWS"))
		{
			
		WebElement  emailHelpLink = driver.findElement(By.xpath(OR.RA_QS_CONTACT_US_LINK));
		click(emailHelpLink);
		wait(driver,"3");
		Navigate.enter(driver);
		}
		else if(osName.contains("MAC"))
		{
			WebElement  emailHelpLink = driver.findElement(By.xpath(OR.RA_QS_CONTACT_US_LINK));
			click(emailHelpLink);
			wait(driver,"3");
			Screen s=new Screen();
			Pattern dontOpen = new Pattern(Directory.uploadFilePath+"DontOpen.png");
			s.click(dontOpen);
			wait( driver, "3" );
		}
	}
	/**
	 * Name :     RAMYA.P
	 * Created Date:   18/Jul/17
	 * Modified Date:
	 * Description :   Create a common method to enter DOB 
	 * Ticket ID :
	 * Required Inputs :
	 * @throws FindFailed 
	 */
	public static String timeZoneSplit(WebDriver driver,String time){
		String[] value=time.split("\\-");
		String timesplit=value[0].trim();
		return timesplit;
		}
	/**
	 * Name         :   Ramya P
	 * Created Date :   18/July/17
	 * Modified Date:
	 * Description  : Validate current dateandtime
	 */
	public static void timeslotCurrentDateValidate(WebDriver driver)
	{
		Date today = new Date();
		System.out.println("1."+"Today date is : " + today);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String date = dateFormat.format(today);
		String dateTrim=date.trim();
		System.out.println("2."+"Format change today date is : " + dateTrim);
		String year=timeZoneSplit(driver,dateTrim);
		WebElement currentYear=driver.findElement(By.xpath(SELECTED_CURRENT_DATEANDYEAR+year+OR_END));
		verifyElementIsPresent(driver, currentYear);
	}
	
	/**
	 * Name :     Ramya P
	 * Created Date:   21/July/2017
	 * Modified Date:
	 * Description :   Create a common method to verify Session Scheduled details in ics calendar file
	 * Testcase Sheet:
	 * Ticket ID :
	 * Required Inputs :
	 * @throws AWTException
	 * @throws FindFailed
	 *
	 */

	public static void verifyCalenderDetails(WebDriver driver, String inputData,String startTime) throws AWTException, FindFailed {
		String[] inputData1 = inputData.split(",");
		String gmailUsernamedata=inputData1[0];
		String gmailPassworddata=inputData1[1];
		String[] start_Time=startTime.split("\\s");
		wait(driver, "2");
		waitForElement(driver, ADD_TO_YOUR_CALENDAR_LINK);
		jsClickByXPath(driver, ADD_TO_YOUR_CALENDAR_LINK);
		WebElement  googleCalender= driver.findElement(By.xpath(OR.MEMBER_GOOGLE_CALENDER));
		WebElement  yahooCalender= driver.findElement(By.xpath(OR.MEMBER_YAHOO_CALENDER));
		WebElement  icalCalender= driver.findElement(By.xpath(OR.MEMBER_ICAL_CALENDER));
		WebElement  outlookCalender= driver.findElement(By.xpath(OR.MEMBER_OUTLOOK_CALENDER));
		verifyElementIsPresent(driver, googleCalender);
		verifyElementIsPresent(driver, yahooCalender);
		verifyElementIsPresent(driver, icalCalender);
		verifyElementIsPresent(driver, outlookCalender);
		getWindow(driver, googleCalender);
		waitForElement(driver, GMAIL_USERNAME);
		WebElement gmailUsername = driver.findElement(By.xpath(OR.GMAIL_USERNAME));
		actionType(driver,gmailUsername ,gmailUsernamedata);
		jsClickByXPath(driver, GMAIL_NEXT);
		wait(driver, "2");
		waitForElement(driver, GMAIL_PASSWORD);
		WebElement gmailPassword = driver.findElement(By.xpath(OR.GMAIL_PASSWORD));
		actionType(driver,gmailPassword , gmailPassworddata);
		jsClickByXPath(driver, GMAIL_NEXT);
		wait(driver, "2");
		WebElement sessionStartTime = driver.findElement(By.xpath(OR.SCHEDULED_START_TIME));
		String starttime=getAttribute(driver, sessionStartTime);
		if(starttime.contains(start_Time[0]))
		{
			System.out.println("Start Time is Verified");
		}
		WebElement sessionDetails = driver.findElement(By.xpath(OR.SCHEDULED_SESSION_DETAILS));
		String session_Details=getAttribute(driver, sessionDetails);
		if(session_Details.contains("healthy"))
		{
			System.out.println("Healthy Classes are available");
		}
	}
}
