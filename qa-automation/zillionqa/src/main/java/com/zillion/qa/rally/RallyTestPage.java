package com.zillion.qa.rally;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.zillion.qa.commands.Manipulation;
import com.zillion.qa.commands.Navigate;
import com.zillion.qa.rally.OR;
import com.zillion.qa.utils.Directory;

public class RallyTestPage extends Manipulation implements OR {
	public static String RallyID="";
	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the new user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyTestPageUrl(WebDriver driver) 
	{
		Navigate.get(driver, Directory.Rally_Test_Page_Url);
		Navigate.maximize(driver);
		wait(driver, "4");
		waitForElement(driver, RALLY_NEW_USER_EMAIL);
	}
	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the new user credentials at Rally test page
	 * Required Inputs :
	 */
	public static String rallyNewUserCredentialsForRallyTestPage(WebDriver driver) 
	{
		WebElement newUserEmail = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMAIL));
		WebElement newUserRallyID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_RALLY_ID));
		WebElement newUserFirstName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_FIRST_NAME));
		WebElement newUserLastName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_LAST_NAME));
		WebElement newUserDOB = driver.findElement(By.xpath(OR.RALLY_NEW_USER_DOB));
		WebElement newUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMPLOYEE_ID));
		WebElement newUserClientID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_CLIENT_ID));
		WebElement newUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_NEW_USER_GROUP_NUMBER));
		WebElement newUserMemberID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_MEMBER_ID));
		clearAndType(newUserEmail, Directory.Rally_TestPage_DefaultSubdomain_Email);
		String timeStamp = new SimpleDateFormat("MMmmss").format(Calendar.getInstance().getTime());
		int milli = Calendar.getInstance().get(Calendar.MILLISECOND);
		int milli1 = Calendar.getInstance().get(Calendar.MILLISECOND);
		RallyID = timeStamp+milli+milli1;
		System.out.println("Current Time: "+RallyID);
		clearAndType(newUserRallyID, RallyID);
		clearAndType(newUserFirstName, Directory.Rally_TestPage_DefaultSubdomain_First_Name);
		clearAndType(newUserLastName, Directory.Rally_TestPage_DefaultSubdomain_Last_Name);
		clearAndType(newUserDOB, Directory.Rally_TestPage_DefaultSubdomain_DOB);
		clearAndType(newUserEmployeeID, Directory.Rally_TestPage_DefaultSubdomain_Employee_ID);
		clearAndType(newUserClientID, Directory.Rally_TestPage_DefaultSubdomain_Client_ID);
		clearAndType(newUserGroupNumber, Directory.Rally_TestPage_DefaultSubdomain_Group_Number);
		clearAndType(newUserMemberID, Directory.Rally_TestPage_DefaultSubdomain_Member_ID);
		return Directory.Rally_TestPage_DefaultSubdomain_Email;
	}
	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingLinkedUserCredentialsForRallyTestPage(WebDriver driver) 
	{
		WebElement existingLinkedUserEmail = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_EMAIL));
		WebElement existingLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_RALLY_ID));
		WebElement existingLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_FIRST_NAME));
		WebElement existingLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_LAST_NAME));
		WebElement existingLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_DOB));
		WebElement existingLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_EMPLOYEE_ID));
		WebElement existingLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_CLIENT_ID));
		WebElement existingLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_GROUP_NUMBER));
		WebElement existingLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_MEMBER_ID));
		clearAndType(existingLinkedUserEmail, Directory.Rally_TestPage_DefaultSubdomain_Email);
		System.out.println("Current Time: "+RallyID);
		clearAndType(existingLinkedUserRallyID, RallyID);
		clearAndType(existingLinkedUserFirstName, Directory.Rally_TestPage_DefaultSubdomain_First_Name);
		clearAndType(existingLinkedUserLastName, Directory.Rally_TestPage_DefaultSubdomain_Last_Name);
		clearAndType(existingLinkedUserDOB, Directory.Rally_TestPage_DefaultSubdomain_DOB);
		clearAndType(existingLinkedUserEmployeeID, Directory.Rally_TestPage_DefaultSubdomain_Employee_ID);
		clearAndType(existingLinkedUserClientID, Directory.Rally_TestPage_DefaultSubdomain_Client_ID);
		clearAndType(existingLinkedUserGroupNumber, Directory.Rally_TestPage_DefaultSubdomain_Group_Number);
		clearAndType(existingLinkedUserMemberID, Directory.Rally_TestPage_DefaultSubdomain_Member_ID);
	}
	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing  not Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingNotLinkedUserCredentialsForRallyTestPage(WebDriver driver) 
	{
		WebElement existingNotLinkedUserEmail = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_EMAIL));
		WebElement existingNotLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_RALLY_ID));
		WebElement existingNotLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_FIRST_NAME));
		WebElement existingNotLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_LAST_NAME));
		WebElement existingNotLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_DOB));
		WebElement existingNotLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_EMPLOYEE_ID));
		WebElement existingNotLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_CLIENT_ID));
		WebElement existingNotLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_GROUP_NUMBER));
		WebElement existingNotLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_MEMBER_ID));
		clearAndType(existingNotLinkedUserEmail, Directory.Rally_TestPage_DefaultSubdomain_Email);
		clearAndType(existingNotLinkedUserRallyID, RallyID);
		clearAndType(existingNotLinkedUserFirstName, Directory.Rally_TestPage_DefaultSubdomain_First_Name);
		clearAndType(existingNotLinkedUserLastName, Directory.Rally_TestPage_DefaultSubdomain_Last_Name);
		clearAndType(existingNotLinkedUserDOB, Directory.Rally_TestPage_DefaultSubdomain_DOB);
		clearAndType(existingNotLinkedUserEmployeeID, Directory.Rally_TestPage_DefaultSubdomain_Employee_ID);
		clearAndType(existingNotLinkedUserClientID, Directory.Rally_TestPage_DefaultSubdomain_Client_ID);
		clearAndType(existingNotLinkedUserGroupNumber, Directory.Rally_TestPage_DefaultSubdomain_Group_Number);
		clearAndType(existingNotLinkedUserMemberID, Directory.Rally_TestPage_DefaultSubdomain_Member_ID);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the new user Custom subdomain-2 at Rally test page
	 * Required Inputs :
	 */
	public static void rallyNewUserCustomSubDomain1ForRallyTestPage(WebDriver driver) 
	{
		WebElement newUserEmail = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMAIL));
		WebElement newUserRallyID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_RALLY_ID));
		WebElement newUserFirstName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_FIRST_NAME));
		WebElement newUserLastName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_LAST_NAME));
		WebElement newUserDOB = driver.findElement(By.xpath(OR.RALLY_NEW_USER_DOB));
		WebElement newUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMPLOYEE_ID));
		WebElement newUserClientID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_CLIENT_ID));
		WebElement newUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_NEW_USER_GROUP_NUMBER));
		WebElement newUserMemberID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_MEMBER_ID));
		clearAndType(newUserEmail, Directory.Rally_TestPage_CustomSubdomain1_Email);
		String timeStamp = new SimpleDateFormat("MMmmss").format(Calendar.getInstance().getTime());
		int milli = Calendar.getInstance().get(Calendar.MILLISECOND);
		int milli1 = Calendar.getInstance().get(Calendar.MILLISECOND);
		RallyID = timeStamp+milli+milli1;
		System.out.println("Current Time: "+RallyID);
		clearAndType(newUserRallyID, RallyID);
		clearAndType(newUserFirstName, Directory.Rally_TestPage_CustomSubdomain1_First_Name);
		clearAndType(newUserLastName, Directory.Rally_TestPage_CustomSubdomain1_Last_Name);
		clearAndType(newUserDOB, Directory.Rally_TestPage_CustomSubdomain1_DOB);
		clearAndType(newUserEmployeeID, Directory.Rally_TestPage_CustomSubdomain1_Employee_ID);
		clearAndType(newUserClientID, Directory.Rally_TestPage_CustomSubdomain1_Client_ID);
		clearAndType(newUserGroupNumber, Directory.Rally_TestPage_CustomSubdomain1_Group_Number);
		clearAndType(newUserMemberID, Directory.Rally_TestPage_CustomSubdomain1_Member_ID);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the new user Custom subdomain-2 at Rally test page
	 * Required Inputs :
	 */
	public static void rallyNewUserCustomSubDomain2ForRallyTestPage(WebDriver driver) 
	{
		WebElement newUserEmail = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMAIL));
		WebElement newUserRallyID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_RALLY_ID));
		WebElement newUserFirstName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_FIRST_NAME));
		WebElement newUserLastName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_LAST_NAME));
		WebElement newUserDOB = driver.findElement(By.xpath(OR.RALLY_NEW_USER_DOB));
		WebElement newUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMPLOYEE_ID));
		WebElement newUserClientID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_CLIENT_ID));
		WebElement newUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_NEW_USER_GROUP_NUMBER));
		WebElement newUserMemberID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_MEMBER_ID));
		clearAndType(newUserEmail, Directory.Rally_TestPage_CustomSubdomain2_Email);
		String timeStamp = new SimpleDateFormat("MMmmss").format(Calendar.getInstance().getTime());
		int milli = Calendar.getInstance().get(Calendar.MILLISECOND);
		int milli1 = Calendar.getInstance().get(Calendar.MILLISECOND);
		RallyID = timeStamp+milli+milli1;
		System.out.println("Current Time: "+RallyID);
		clearAndType(newUserRallyID, RallyID);
		clearAndType(newUserFirstName, Directory.Rally_TestPage_CustomSubdomain2_First_Name);
		clearAndType(newUserLastName, Directory.Rally_TestPage_CustomSubdomain2_Last_Name);
		clearAndType(newUserDOB, Directory.Rally_TestPage_CustomSubdomain2_DOB);
		clearAndType(newUserEmployeeID, Directory.Rally_TestPage_CustomSubdomain2_Employee_ID);
		clearAndType(newUserClientID, Directory.Rally_TestPage_CustomSubdomain2_Client_ID);
		clearAndType(newUserGroupNumber, Directory.Rally_TestPage_CustomSubdomain2_Group_Number);
		clearAndType(newUserMemberID, Directory.Rally_TestPage_CustomSubdomain2_Member_ID);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the new user Custom subdomain-3 at Rally test page
	 * Required Inputs :
	 */
	public static void rallyNewUserCustomSubDomain3ForRallyTestPage(WebDriver driver) 
	{
		WebElement newUserEmail = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMAIL));
		WebElement newUserRallyID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_RALLY_ID));
		WebElement newUserFirstName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_FIRST_NAME));
		WebElement newUserLastName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_LAST_NAME));
		WebElement newUserDOB = driver.findElement(By.xpath(OR.RALLY_NEW_USER_DOB));
		WebElement newUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMPLOYEE_ID));
		WebElement newUserClientID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_CLIENT_ID));
		WebElement newUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_NEW_USER_GROUP_NUMBER));
		WebElement newUserMemberID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_MEMBER_ID));
		clearAndType(newUserEmail, Directory.Rally_TestPage_CustomSubdomain3_Email);
		String timeStamp = new SimpleDateFormat("MMmmss").format(Calendar.getInstance().getTime());
		int milli = Calendar.getInstance().get(Calendar.MILLISECOND);
		int milli1 = Calendar.getInstance().get(Calendar.MILLISECOND);
		RallyID = timeStamp+milli+milli1;
		System.out.println("Current Time: "+RallyID);
		clearAndType(newUserRallyID, RallyID);
		clearAndType(newUserFirstName, Directory.Rally_TestPage_CustomSubdomain3_First_Name);
		clearAndType(newUserLastName, Directory.Rally_TestPage_CustomSubdomain3_Last_Name);
		clearAndType(newUserDOB, Directory.Rally_TestPage_CustomSubdomain3_DOB);
		clearAndType(newUserEmployeeID, Directory.Rally_TestPage_CustomSubdomain3_Employee_ID);
		clearAndType(newUserClientID, Directory.Rally_TestPage_CustomSubdomain3_Client_ID);
		clearAndType(newUserGroupNumber, Directory.Rally_TestPage_CustomSubdomain3_Group_Number);
		clearAndType(newUserMemberID, Directory.Rally_TestPage_CustomSubdomain3_Member_ID);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the new user Custom subdomain-3 at Rally test page
	 * Required Inputs :
	 */
	public static void rallyNewUserCustomSubDomain4ForRallyTestPage(WebDriver driver) 
	{
		WebElement newUserEmail = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMAIL));
		WebElement newUserRallyID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_RALLY_ID));
		WebElement newUserFirstName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_FIRST_NAME));
		WebElement newUserLastName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_LAST_NAME));
		WebElement newUserDOB = driver.findElement(By.xpath(OR.RALLY_NEW_USER_DOB));
		WebElement newUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMPLOYEE_ID));
		WebElement newUserClientID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_CLIENT_ID));
		WebElement newUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_NEW_USER_GROUP_NUMBER));
		WebElement newUserMemberID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_MEMBER_ID));
		clearAndType(newUserEmail, Directory.Rally_TestPage_CustomSubdomain4_Email);
		String timeStamp = new SimpleDateFormat("MMmmss").format(Calendar.getInstance().getTime());
		int milli = Calendar.getInstance().get(Calendar.MILLISECOND);
		int milli1 = Calendar.getInstance().get(Calendar.MILLISECOND);
		RallyID = timeStamp+milli+milli1;
		System.out.println("Current Time: "+RallyID);
		clearAndType(newUserRallyID, RallyID);
		clearAndType(newUserFirstName, Directory.Rally_TestPage_CustomSubdomain4_First_Name);
		clearAndType(newUserLastName, Directory.Rally_TestPage_CustomSubdomain4_Last_Name);
		clearAndType(newUserDOB, Directory.Rally_TestPage_CustomSubdomain4_DOB);
		clearAndType(newUserEmployeeID, Directory.Rally_TestPage_CustomSubdomain4_Employee_ID);
		clearAndType(newUserClientID, Directory.Rally_TestPage_CustomSubdomain4_Client_ID);
		clearAndType(newUserGroupNumber, Directory.Rally_TestPage_CustomSubdomain4_Group_Number);
		clearAndType(newUserMemberID, Directory.Rally_TestPage_CustomSubdomain4_Member_ID);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:06/Jul/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingLinkedUserForCustomSubDomain1(WebDriver driver) 
	{
		WebElement existingLinkedUserEmail = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_EMAIL));
		WebElement existingLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_RALLY_ID));
		WebElement existingLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_FIRST_NAME));
		WebElement existingLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_LAST_NAME));
		WebElement existingLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_DOB));
		WebElement existingLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_EMPLOYEE_ID));
		WebElement existingLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_CLIENT_ID));
		WebElement existingLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_GROUP_NUMBER));
		WebElement existingLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_MEMBER_ID));
		clearAndType(existingLinkedUserEmail, Directory.Rally_TestPage_CustomSubdomain1_Email);
		System.out.println("Current Time: "+RallyID);
		clearAndType(existingLinkedUserRallyID, RallyID);
		clearAndType(existingLinkedUserFirstName, Directory.Rally_TestPage_CustomSubdomain1_First_Name);
		clearAndType(existingLinkedUserLastName, Directory.Rally_TestPage_CustomSubdomain1_Last_Name);
		clearAndType(existingLinkedUserDOB, Directory.Rally_TestPage_CustomSubdomain1_DOB);
		clearAndType(existingLinkedUserEmployeeID, Directory.Rally_TestPage_CustomSubdomain1_Employee_ID);
		clearAndType(existingLinkedUserClientID, Directory.Rally_TestPage_CustomSubdomain1_Client_ID);
		clearAndType(existingLinkedUserGroupNumber, Directory.Rally_TestPage_CustomSubdomain1_Group_Number);
		clearAndType(existingLinkedUserMemberID, Directory.Rally_TestPage_CustomSubdomain1_Member_ID);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:06/Jul/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingLinkedUserForCustomSubDomain2(WebDriver driver) 
	{
		WebElement existingLinkedUserEmail = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_EMAIL));
		WebElement existingLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_RALLY_ID));
		WebElement existingLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_FIRST_NAME));
		WebElement existingLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_LAST_NAME));
		WebElement existingLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_DOB));
		WebElement existingLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_EMPLOYEE_ID));
		WebElement existingLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_CLIENT_ID));
		WebElement existingLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_GROUP_NUMBER));
		WebElement existingLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_MEMBER_ID));
		clearAndType(existingLinkedUserEmail, Directory.Rally_TestPage_CustomSubdomain2_Email);
		System.out.println("Current Time: "+RallyID);
		clearAndType(existingLinkedUserRallyID, RallyID);
		clearAndType(existingLinkedUserFirstName, Directory.Rally_TestPage_CustomSubdomain2_First_Name);
		clearAndType(existingLinkedUserLastName, Directory.Rally_TestPage_CustomSubdomain2_Last_Name);
		clearAndType(existingLinkedUserDOB, Directory.Rally_TestPage_CustomSubdomain2_DOB);
		clearAndType(existingLinkedUserEmployeeID, Directory.Rally_TestPage_CustomSubdomain2_Employee_ID);
		clearAndType(existingLinkedUserClientID, Directory.Rally_TestPage_CustomSubdomain2_Client_ID);
		clearAndType(existingLinkedUserGroupNumber, Directory.Rally_TestPage_CustomSubdomain2_Group_Number);
		clearAndType(existingLinkedUserMemberID, Directory.Rally_TestPage_CustomSubdomain2_Member_ID);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:06/Jul/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingLinkedUserForCustomSubDomain3(WebDriver driver) 
	{
		WebElement existingLinkedUserEmail = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_EMAIL));
		WebElement existingLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_RALLY_ID));
		WebElement existingLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_FIRST_NAME));
		WebElement existingLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_LAST_NAME));
		WebElement existingLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_DOB));
		WebElement existingLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_EMPLOYEE_ID));
		WebElement existingLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_CLIENT_ID));
		WebElement existingLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_GROUP_NUMBER));
		WebElement existingLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_MEMBER_ID));
		clearAndType(existingLinkedUserEmail, Directory.Rally_TestPage_CustomSubdomain3_Email);
		System.out.println("Current Time: "+RallyID);
		clearAndType(existingLinkedUserRallyID, RallyID);
		clearAndType(existingLinkedUserFirstName, Directory.Rally_TestPage_CustomSubdomain3_First_Name);
		clearAndType(existingLinkedUserLastName, Directory.Rally_TestPage_CustomSubdomain3_Last_Name);
		clearAndType(existingLinkedUserDOB, Directory.Rally_TestPage_CustomSubdomain3_DOB);
		clearAndType(existingLinkedUserEmployeeID, Directory.Rally_TestPage_CustomSubdomain3_Employee_ID);
		clearAndType(existingLinkedUserClientID, Directory.Rally_TestPage_CustomSubdomain3_Client_ID);
		clearAndType(existingLinkedUserGroupNumber, Directory.Rally_TestPage_CustomSubdomain3_Group_Number);
		clearAndType(existingLinkedUserMemberID, Directory.Rally_TestPage_CustomSubdomain3_Member_ID);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:06/Jul/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingLinkedUserForCustomSubDomain4(WebDriver driver) 
	{
		WebElement existingLinkedUserEmail = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_EMAIL));
		WebElement existingLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_RALLY_ID));
		WebElement existingLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_FIRST_NAME));
		WebElement existingLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_LAST_NAME));
		WebElement existingLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_DOB));
		WebElement existingLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_EMPLOYEE_ID));
		WebElement existingLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_CLIENT_ID));
		WebElement existingLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_GROUP_NUMBER));
		WebElement existingLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_MEMBER_ID));
		clearAndType(existingLinkedUserEmail, Directory.Rally_TestPage_CustomSubdomain4_Email);
		System.out.println("Current Time: "+RallyID);
		clearAndType(existingLinkedUserRallyID, RallyID);
		clearAndType(existingLinkedUserFirstName, Directory.Rally_TestPage_CustomSubdomain4_First_Name);
		clearAndType(existingLinkedUserLastName, Directory.Rally_TestPage_CustomSubdomain4_Last_Name);
		clearAndType(existingLinkedUserDOB, Directory.Rally_TestPage_CustomSubdomain4_DOB);
		clearAndType(existingLinkedUserEmployeeID, Directory.Rally_TestPage_CustomSubdomain4_Employee_ID);
		clearAndType(existingLinkedUserClientID, Directory.Rally_TestPage_CustomSubdomain4_Client_ID);
		clearAndType(existingLinkedUserGroupNumber, Directory.Rally_TestPage_CustomSubdomain4_Group_Number);
		clearAndType(existingLinkedUserMemberID, Directory.Rally_TestPage_CustomSubdomain4_Member_ID);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing  not Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingNotLinkedUserForCustomSubDomain1(WebDriver driver) 
	{
		WebElement existingNotLinkedUserEmail = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_EMAIL));
		WebElement existingNotLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_RALLY_ID));
		WebElement existingNotLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_FIRST_NAME));
		WebElement existingNotLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_LAST_NAME));
		WebElement existingNotLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_DOB));
		WebElement existingNotLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_EMPLOYEE_ID));
		WebElement existingNotLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_CLIENT_ID));
		WebElement existingNotLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_GROUP_NUMBER));
		WebElement existingNotLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_MEMBER_ID));
		clearAndType(existingNotLinkedUserEmail, Directory.Rally_TestPage_CustomSubdomain1_Email);
		clearAndType(existingNotLinkedUserRallyID, RallyID);
		clearAndType(existingNotLinkedUserFirstName, Directory.Rally_TestPage_CustomSubdomain1_First_Name);
		clearAndType(existingNotLinkedUserLastName, Directory.Rally_TestPage_CustomSubdomain1_Last_Name);
		clearAndType(existingNotLinkedUserDOB, Directory.Rally_TestPage_CustomSubdomain1_DOB);
		clearAndType(existingNotLinkedUserEmployeeID, Directory.Rally_TestPage_CustomSubdomain1_Employee_ID);
		clearAndType(existingNotLinkedUserClientID, Directory.Rally_TestPage_CustomSubdomain1_Client_ID);
		clearAndType(existingNotLinkedUserGroupNumber, Directory.Rally_TestPage_CustomSubdomain1_Group_Number);
		clearAndType(existingNotLinkedUserMemberID, Directory.Rally_TestPage_CustomSubdomain1_Member_ID);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing  not Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingNotLinkedUserForCustomSubDomain2(WebDriver driver) 
	{
		WebElement existingNotLinkedUserEmail = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_EMAIL));
		WebElement existingNotLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_RALLY_ID));
		WebElement existingNotLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_FIRST_NAME));
		WebElement existingNotLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_LAST_NAME));
		WebElement existingNotLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_DOB));
		WebElement existingNotLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_EMPLOYEE_ID));
		WebElement existingNotLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_CLIENT_ID));
		WebElement existingNotLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_GROUP_NUMBER));
		WebElement existingNotLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_MEMBER_ID));
		clearAndType(existingNotLinkedUserEmail, Directory.Rally_TestPage_CustomSubdomain2_Email);
		clearAndType(existingNotLinkedUserRallyID, RallyID);
		clearAndType(existingNotLinkedUserFirstName, Directory.Rally_TestPage_CustomSubdomain2_First_Name);
		clearAndType(existingNotLinkedUserLastName, Directory.Rally_TestPage_CustomSubdomain2_Last_Name);
		clearAndType(existingNotLinkedUserDOB, Directory.Rally_TestPage_CustomSubdomain2_DOB);
		clearAndType(existingNotLinkedUserEmployeeID, Directory.Rally_TestPage_CustomSubdomain2_Employee_ID);
		clearAndType(existingNotLinkedUserClientID, Directory.Rally_TestPage_CustomSubdomain2_Client_ID);
		clearAndType(existingNotLinkedUserGroupNumber, Directory.Rally_TestPage_CustomSubdomain2_Group_Number);
		clearAndType(existingNotLinkedUserMemberID, Directory.Rally_TestPage_CustomSubdomain2_Member_ID);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing  not Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingNotLinkedUserForCustomSubDomain3(WebDriver driver) 
	{
		WebElement existingNotLinkedUserEmail = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_EMAIL));
		WebElement existingNotLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_RALLY_ID));
		WebElement existingNotLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_FIRST_NAME));
		WebElement existingNotLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_LAST_NAME));
		WebElement existingNotLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_DOB));
		WebElement existingNotLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_EMPLOYEE_ID));
		WebElement existingNotLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_CLIENT_ID));
		WebElement existingNotLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_GROUP_NUMBER));
		WebElement existingNotLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_MEMBER_ID));
		clearAndType(existingNotLinkedUserEmail, Directory.Rally_TestPage_CustomSubdomain3_Email);
		clearAndType(existingNotLinkedUserRallyID, RallyID);
		clearAndType(existingNotLinkedUserFirstName, Directory.Rally_TestPage_CustomSubdomain3_First_Name);
		clearAndType(existingNotLinkedUserLastName, Directory.Rally_TestPage_CustomSubdomain3_Last_Name);
		clearAndType(existingNotLinkedUserDOB, Directory.Rally_TestPage_CustomSubdomain3_DOB);
		clearAndType(existingNotLinkedUserEmployeeID, Directory.Rally_TestPage_CustomSubdomain3_Employee_ID);
		clearAndType(existingNotLinkedUserClientID, Directory.Rally_TestPage_CustomSubdomain3_Client_ID);
		clearAndType(existingNotLinkedUserGroupNumber, Directory.Rally_TestPage_CustomSubdomain3_Group_Number);
		clearAndType(existingNotLinkedUserMemberID, Directory.Rally_TestPage_CustomSubdomain3_Member_ID);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing  not Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingNotLinkedUserForCustomSubDomain4(WebDriver driver) 
	{
		WebElement existingNotLinkedUserEmail = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_EMAIL));
		WebElement existingNotLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_RALLY_ID));
		WebElement existingNotLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_FIRST_NAME));
		WebElement existingNotLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_LAST_NAME));
		WebElement existingNotLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_DOB));
		WebElement existingNotLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_EMPLOYEE_ID));
		WebElement existingNotLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_CLIENT_ID));
		WebElement existingNotLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_GROUP_NUMBER));
		WebElement existingNotLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_MEMBER_ID));
		clearAndType(existingNotLinkedUserEmail, Directory.Rally_TestPage_CustomSubdomain4_Email);
		clearAndType(existingNotLinkedUserRallyID, RallyID);
		clearAndType(existingNotLinkedUserFirstName, Directory.Rally_TestPage_CustomSubdomain4_First_Name);
		clearAndType(existingNotLinkedUserLastName, Directory.Rally_TestPage_CustomSubdomain4_Last_Name);
		clearAndType(existingNotLinkedUserDOB, Directory.Rally_TestPage_CustomSubdomain4_DOB);
		clearAndType(existingNotLinkedUserEmployeeID, Directory.Rally_TestPage_CustomSubdomain4_Employee_ID);
		clearAndType(existingNotLinkedUserClientID, Directory.Rally_TestPage_CustomSubdomain4_Client_ID);
		clearAndType(existingNotLinkedUserGroupNumber, Directory.Rally_TestPage_CustomSubdomain4_Group_Number);
		clearAndType(existingNotLinkedUserMemberID, Directory.Rally_TestPage_CustomSubdomain4_Member_ID);
	}
	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static String verifyRallyLinkedUserStep1(WebDriver driver) 
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		String confirmemail=Manipulation.getAttribute(driver, confirmEmail);
		String Email1 =Directory.Rally_TestPage_DefaultSubdomain_Email;
		if(Email.equalsIgnoreCase(Email))
		{
			if(confirmemail.equalsIgnoreCase(Email1))
			{
				System.out.println("Both the Email and Confirm email match with configured Email");
			}
		}
		else if(!Email.equalsIgnoreCase(Email))
		{
			Assert.fail();	
		}
		return Email1;
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static String verifyRallyLinkedUserCustomSubDomain1Step1(WebDriver driver) 
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		String confirmemail=Manipulation.getAttribute(driver, confirmEmail);
		String Email1 =Directory.Rally_TestPage_CustomSubdomain1_Email;
		if(Email.equalsIgnoreCase(Email))
		{
			if(confirmemail.equalsIgnoreCase(Email1))
			{
				System.out.println("Both the Email and Confirm email match with configured Email");
			}
		}
		else if(!Email.equalsIgnoreCase(Email))
		{
			Assert.fail();	
		}
		return Email1;
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static String verifyRallyLinkedUserCustomSubDomain2Step1(WebDriver driver) 
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		String confirmemail=Manipulation.getAttribute(driver, confirmEmail);
		String Email1 =Directory.Rally_TestPage_CustomSubdomain2_Email;
		if(Email.equalsIgnoreCase(Email))
		{
			if(confirmemail.equalsIgnoreCase(Email1))
			{
				System.out.println("Both the Email and Confirm email match with configured Email");
			}
		}
		else if(!Email.equalsIgnoreCase(Email))
		{
			Assert.fail();	
		}
		return Email1;
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static String verifyRallyLinkedUserCustomSubDomain3Step1(WebDriver driver) 
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		String confirmemail=Manipulation.getAttribute(driver, confirmEmail);
		String Email1 =Directory.Rally_TestPage_CustomSubdomain3_Email;
		if(Email.equalsIgnoreCase(Email))
		{
			if(confirmemail.equalsIgnoreCase(Email1))
			{
				System.out.println("Both the Email and Confirm email match with configured Email");
			}
		}
		else if(!Email.equalsIgnoreCase(Email))
		{
			Assert.fail();	
		}
		return Email1;
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static String verifyRallyLinkedUserCustomSubDomain4Step1(WebDriver driver) 
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		String confirmemail=Manipulation.getAttribute(driver, confirmEmail);
		String Email1 =Directory.Rally_TestPage_CustomSubdomain4_Email;
		if(Email.equalsIgnoreCase(Email))
		{
			if(confirmemail.equalsIgnoreCase(Email1))
			{
				System.out.println("Both the Email and Confirm email match with configured Email");
			}
		}
		else if(!Email.equalsIgnoreCase(Email))
		{
			Assert.fail();	
		}
		return Email1;
	}
	/**
	 * Name :VINOTHKUMAR.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description : Created common method to fill the existing not Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyNotLinkedUserStep1(WebDriver driver) 
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		String confirmemail=Manipulation.getAttribute(driver, confirmEmail);
		String Email1 =Directory.Rally_TestPage_DefaultSubdomain_Email;
		if(!Email.equalsIgnoreCase(Email))
		{
			if(!confirmemail.equalsIgnoreCase(Email1))
			{
				System.out.println("Both the Email and Confirm email match with configured Email");

			}
		}
		else if(Email.equalsIgnoreCase(null))
		{
			Assert.fail();	
		}
	}

	/**
	 * Name :VINOTHKUMAR.M
	 * Created Date:04/Jul/2017
	 * Modified Date:
	 * Description : Created common method to fill the existing not Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyNotLinkedUserCustomSubDomail1Step1(WebDriver driver) 
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		String confirmemail=Manipulation.getAttribute(driver, confirmEmail);
		String Email1 =Directory.Rally_TestPage_CustomSubdomain1_Email;
		if(!Email.equalsIgnoreCase(Email))
		{
			if(!confirmemail.equalsIgnoreCase(Email1))
			{
				System.out.println("Both the Email and Confirm email match with configured Email");

			}
		}
		else if(Email.equalsIgnoreCase(null))
		{
			Assert.fail();	
		}
	}

	/**
	 * Name :VINOTHKUMAR.M
	 * Created Date:04/Jul/2017
	 * Modified Date:
	 * Description : Created common method to fill the existing not Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyNotLinkedUserCustomSubDomail2Step1(WebDriver driver) 
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		String confirmemail=Manipulation.getAttribute(driver, confirmEmail);
		String Email1 =Directory.Rally_TestPage_CustomSubdomain2_Email;
		if(!Email.equalsIgnoreCase(Email))
		{
			if(!confirmemail.equalsIgnoreCase(Email1))
			{
				System.out.println("Both the Email and Confirm email match with configured Email");

			}
		}
		else if(Email.equalsIgnoreCase(null))
		{
			Assert.fail();	
		}
	}

	/**
	 * Name :VINOTHKUMAR.M
	 * Created Date:04/Jul/2017
	 * Modified Date:
	 * Description : Created common method to fill the existing not Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyNotLinkedUserCustomSubDomail3Step1(WebDriver driver) 
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		String confirmemail=Manipulation.getAttribute(driver, confirmEmail);
		String Email1 =Directory.Rally_TestPage_CustomSubdomain3_Email;
		if(!Email.equalsIgnoreCase(Email))
		{
			if(!confirmemail.equalsIgnoreCase(Email1))
			{
				System.out.println("Both the Email and Confirm email match with configured Email");

			}
		}
		else if(Email.equalsIgnoreCase(null))
		{
			Assert.fail();	
		}
	}

	/**
	 * Name :VINOTHKUMAR.M
	 * Created Date:04/Jul/2017
	 * Modified Date:
	 * Description : Created common method to fill the existing not Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyNotLinkedUserCustomSubDomail4Step1(WebDriver driver) 
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		String confirmemail=Manipulation.getAttribute(driver, confirmEmail);
		String Email1 =Directory.Rally_TestPage_CustomSubdomain4_Email;
		if(!Email.equalsIgnoreCase(Email))
		{
			if(!confirmemail.equalsIgnoreCase(Email1))
			{
				System.out.println("Both the Email and Confirm email match with configured Email");

			}
		}
		else if(Email.equalsIgnoreCase(null))
		{
			Assert.fail();	
		}
	}
	/**
	 * Name :Vinothkumar.M
	 * Created Date:   23/JUN/17
	 * Modified Date:
	 * Description : Create a common method to enter Email and Confirm email dynamic to multi environment
	 * @return 
	 * @return
	 */
	public static Object enterRAllyDefaultSubdomainEmailAndConfirmEmail(WebDriver driver)
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		clearAndType(memberEmail, Directory.Rally_TestPage_DefaultSubdomain_Email);
		wait(driver, "3");
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		clearAndType(confirmEmail, Directory.Rally_TestPage_DefaultSubdomain_Email);
		wait(driver, "3");
		return Email;
	}

	/**
	 * Name :Vinothkumar.M
	 * Created Date: 23/JUN/17
	 * Modified Date:
	 * Description : Create a common method to enter Month,day and Year dynamic to multi environment
	 * @return
	 */
	public static void enterRallyDefaultSubdomainDOB(WebDriver driver)
	{
		String DOB= Directory.Rally_TestPage_DefaultSubdomain_DOB;
		String[] DefaultSubDomainDOB=DOB.split("\\b");
		String Month=DefaultSubDomainDOB[0];
		String Day=DefaultSubDomainDOB[2];
		String Year=DefaultSubDomainDOB[4];
		WebElement month = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		selectByVisibletext(month, Month);
		WebElement day = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		selectByVisibletext(day, Day);
		WebElement year = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		selectByVisibletext(year, Year);
		wait(driver, "1");
	}

	/**
	 * Name :Vinothkumar.M
	 * Created Date: 23/JUN/17
	 * Modified Date:
	 * Description : Create a common method to enter First and Last name dynamic to multi environment
	 * @return
	 */
	public static void enterRallyDefaultSubdomainFirstAndLastName(WebDriver driver)
	{
		WebElement  firstname = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		clearAndType(firstname, Directory.Rally_TestPage_DefaultSubdomain_First_Name);
		wait(driver, "1");
		WebElement  lastname = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		clearAndType(lastname, Directory.Rally_TestPage_DefaultSubdomain_Last_Name);
		wait(driver, "1");
	}

	/**
	 * Name :     Vinothkumar.M
	 * Created Date:   26/JUN/17
	 * Modified Date:
	 * Description : Create a common method to enter insurance details in RAlly Enrollment
	 * Ticket ID :
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public static void rallyDefaultSubdomainInsuranceDetails(WebDriver driver)
	{
		Manipulation.wait(driver, "5");
		waitForElement(driver, OR.RA_MEMBER_INSURANCEPROVIDER);
		WebElement insurance_provider= driver.findElement(By.xpath(OR.RA_MEMBER_INSURANCEPROVIDER));
		WebElement member_id= driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
		WebElement groupnumber= driver.findElement(By.xpath(OR.RA_MEMBER_GROUPNUMBER));
		clearAndType(insurance_provider, Directory.Rally_TestPage_DefaultSubdomain_Insurance_Provider);
		WebElement autosuggest= driver.findElement(By.xpath(OR.RA_INSURANCE_AUTO_SUGGEST));
		Manipulation.wait(driver, "2");
		waitForElement(driver, OR.RA_INSURANCE_AUTO_SUGGEST);
		actionClick(driver, autosuggest);
		clearAndType(member_id, Directory.Rally_TestPage_DefaultSubdomain_Member_ID);
		clearAndType(groupnumber, Directory.Rally_TestPage_DefaultSubdomain_Group_Number);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:26/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyLinkedUserStep2(WebDriver driver) 
	{
		WebElement firstName = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		WebElement lastName = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		WebElement dobMonth = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		WebElement dobDay = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		WebElement dobYear = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		String FirstName=Manipulation.getAttribute(driver, firstName);
		String LastName=Manipulation.getAttribute(driver, lastName);
		String DobMonth=Manipulation.getAttribute(driver, dobMonth);
		String DobDay=Manipulation.getAttribute(driver, dobDay);
		String DobYear=Manipulation.getAttribute(driver, dobYear);
		String FirstNameFromConfig= Directory.Rally_TestPage_DefaultSubdomain_First_Name;
		String LastNameFromConfig= Directory.Rally_TestPage_DefaultSubdomain_Last_Name;
		String DOBfromConfig= Directory.Rally_TestPage_DefaultSubdomain_DOB;
		String[] DobSplit= DOBfromConfig.split("/");
		String DobMonthFromConfig= DobSplit[0];
		String DobDayFromConfig= DobSplit[1];
		String DobYearFromConfig= DobSplit[2];
		System.out.println("FirstName: "+FirstName);
		System.out.println("LastName: "+LastName);
		System.out.println("DobMonth: "+DobMonth);
		System.out.println("DobDay: "+DobDay);
		System.out.println("DobYear: "+DobYear);

		if (FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&LastName.equalsIgnoreCase(LastNameFromConfig)
				&&DobMonthFromConfig.contains(DobMonth)
				&&DobDayFromConfig.contains(DobDay)
				&&DobYearFromConfig.contains(DobYear))
		{
			System.out.println("Firstname, Lastname and DOB match eachother with config file");
		}
		else if (!FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&!LastName.equalsIgnoreCase(LastNameFromConfig)
				&&DobMonthFromConfig.contains(DobMonth)
				&&DobDayFromConfig.contains(DobDay)
				&&DobYearFromConfig.contains(DobYear))
		{
			Assert.fail();
			System.out.println("Firstname, Lastname and DOB not match eachother with config file");
		}
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:26/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user CustomSubDomain1 at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyLinkedUserCustomSubDomail1Step2(WebDriver driver) 
	{
		WebElement firstName = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		WebElement lastName = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		WebElement dobMonth = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		WebElement dobDay = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		WebElement dobYear = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		String FirstName=Manipulation.getAttribute(driver, firstName);
		String LastName=Manipulation.getAttribute(driver, lastName);
		String DobMonth=Manipulation.getAttribute(driver, dobMonth);
		String DobDay=Manipulation.getAttribute(driver, dobDay);
		String DobYear=Manipulation.getAttribute(driver, dobYear);
		String FirstNameFromConfig= Directory.Rally_TestPage_CustomSubdomain1_First_Name;
		String LastNameFromConfig= Directory.Rally_TestPage_CustomSubdomain1_Last_Name;
		String DOBfromConfig= Directory.Rally_TestPage_CustomSubdomain1_DOB;
		String[] DobSplit= DOBfromConfig.split("/");
		String DobMonthFromConfig= DobSplit[0];
		String DobDayFromConfig= DobSplit[1];
		String DobYearFromConfig= DobSplit[2];
		System.out.println("FirstName: "+FirstName);
		System.out.println("LastName: "+LastName);
		System.out.println("DobMonth: "+DobMonth);
		System.out.println("DobDay: "+DobDay);
		System.out.println("DobYear: "+DobYear);

		if (FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&LastName.equalsIgnoreCase(LastNameFromConfig)
				&&DobMonthFromConfig.contains(DobMonth)
				&&DobDayFromConfig.contains(DobDay)
				&&DobYearFromConfig.contains(DobYear))
		{
			System.out.println("Firstname, Lastname and DOB match eachother with config file");
		}
		else if (!FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&!LastName.equalsIgnoreCase(LastNameFromConfig)
				&&DobMonthFromConfig.contains(DobMonth)
				&&DobDayFromConfig.contains(DobDay)
				&&DobYearFromConfig.contains(DobYear))
		{
			Assert.fail();
			System.out.println("Firstname, Lastname and DOB not match eachother with config file");
		}
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:26/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user CustomSubDomain1 at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyLinkedUserCustomSubDomail2Step2(WebDriver driver) 
	{
		WebElement firstName = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		WebElement lastName = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		WebElement dobMonth = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		WebElement dobDay = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		WebElement dobYear = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		String FirstName=Manipulation.getAttribute(driver, firstName);
		String LastName=Manipulation.getAttribute(driver, lastName);
		String DobMonth=Manipulation.getAttribute(driver, dobMonth);
		String DobDay=Manipulation.getAttribute(driver, dobDay);
		String DobYear=Manipulation.getAttribute(driver, dobYear);
		String FirstNameFromConfig= Directory.Rally_TestPage_CustomSubdomain2_First_Name;
		String LastNameFromConfig= Directory.Rally_TestPage_CustomSubdomain2_Last_Name;
		String DOBfromConfig= Directory.Rally_TestPage_CustomSubdomain2_DOB;
		String[] DobSplit= DOBfromConfig.split("/");
		String DobMonthFromConfig= DobSplit[0];
		String DobDayFromConfig= DobSplit[1];
		String DobYearFromConfig= DobSplit[2];
		System.out.println("FirstName: "+FirstName);
		System.out.println("LastName: "+LastName);
		System.out.println("DobMonth: "+DobMonth);
		System.out.println("DobDay: "+DobDay);
		System.out.println("DobYear: "+DobYear);

		if (FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&LastName.equalsIgnoreCase(LastNameFromConfig)
				&&DobMonthFromConfig.contains(DobMonth)
				&&DobDayFromConfig.contains(DobDay)
				&&DobYearFromConfig.contains(DobYear))
		{
			System.out.println("Firstname, Lastname and DOB match eachother with config file");
		}
		else if (!FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&!LastName.equalsIgnoreCase(LastNameFromConfig)
				&&DobMonthFromConfig.contains(DobMonth)
				&&DobDayFromConfig.contains(DobDay)
				&&DobYearFromConfig.contains(DobYear))
		{
			Assert.fail();
			System.out.println("Firstname, Lastname and DOB not match eachother with config file");
		}
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:26/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user CustomSubDomain1 at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyLinkedUserCustomSubDomail3Step2(WebDriver driver) 
	{
		WebElement firstName = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		WebElement lastName = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		WebElement dobMonth = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		WebElement dobDay = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		WebElement dobYear = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		String FirstName=Manipulation.getAttribute(driver, firstName);
		String LastName=Manipulation.getAttribute(driver, lastName);
		String DobMonth=Manipulation.getAttribute(driver, dobMonth);
		String DobDay=Manipulation.getAttribute(driver, dobDay);
		String DobYear=Manipulation.getAttribute(driver, dobYear);
		String FirstNameFromConfig= Directory.Rally_TestPage_CustomSubdomain3_First_Name;
		String LastNameFromConfig= Directory.Rally_TestPage_CustomSubdomain3_Last_Name;
		String DOBfromConfig= Directory.Rally_TestPage_CustomSubdomain3_DOB;
		String[] DobSplit= DOBfromConfig.split("/");
		String DobMonthFromConfig= DobSplit[0];
		String DobDayFromConfig= DobSplit[1];
		String DobYearFromConfig= DobSplit[2];
		System.out.println("FirstName: "+FirstName);
		System.out.println("LastName: "+LastName);
		System.out.println("DobMonth: "+DobMonth);
		System.out.println("DobDay: "+DobDay);
		System.out.println("DobYear: "+DobYear);

		if (FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&LastName.equalsIgnoreCase(LastNameFromConfig)
				&&DobMonthFromConfig.contains(DobMonth)
				&&DobDayFromConfig.contains(DobDay)
				&&DobYearFromConfig.contains(DobYear))
		{
			System.out.println("Firstname, Lastname and DOB match eachother with config file");
		}
		else if (!FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&!LastName.equalsIgnoreCase(LastNameFromConfig)
				&&DobMonthFromConfig.contains(DobMonth)
				&&DobDayFromConfig.contains(DobDay)
				&&DobYearFromConfig.contains(DobYear))
		{
			Assert.fail();
			System.out.println("Firstname, Lastname and DOB not match eachother with config file");
		}
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:26/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user CustomSubDomain1 at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyLinkedUserCustomSubDomail4Step2(WebDriver driver) 
	{
		WebElement firstName = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		WebElement lastName = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		WebElement dobMonth = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		WebElement dobDay = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		WebElement dobYear = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		String FirstName=Manipulation.getAttribute(driver, firstName);
		String LastName=Manipulation.getAttribute(driver, lastName);
		String DobMonth=Manipulation.getAttribute(driver, dobMonth);
		String DobDay=Manipulation.getAttribute(driver, dobDay);
		String DobYear=Manipulation.getAttribute(driver, dobYear);
		String FirstNameFromConfig= Directory.Rally_TestPage_CustomSubdomain4_First_Name;
		String LastNameFromConfig= Directory.Rally_TestPage_CustomSubdomain4_Last_Name;
		String DOBfromConfig= Directory.Rally_TestPage_CustomSubdomain4_DOB;
		String[] DobSplit= DOBfromConfig.split("/");
		String DobMonthFromConfig= DobSplit[0];
		String DobDayFromConfig= DobSplit[1];
		String DobYearFromConfig= DobSplit[2];
		System.out.println("FirstName: "+FirstName);
		System.out.println("LastName: "+LastName);
		System.out.println("DobMonth: "+DobMonth);
		System.out.println("DobDay: "+DobDay);
		System.out.println("DobYear: "+DobYear);

		if (FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&LastName.equalsIgnoreCase(LastNameFromConfig)
				&&DobMonthFromConfig.contains(DobMonth)
				&&DobDayFromConfig.contains(DobDay)
				&&DobYearFromConfig.contains(DobYear))
		{
			System.out.println("Firstname, Lastname and DOB match eachother with config file");
		}
		else if (!FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&!LastName.equalsIgnoreCase(LastNameFromConfig)
				&&DobMonthFromConfig.contains(DobMonth)
				&&DobDayFromConfig.contains(DobDay)
				&&DobYearFromConfig.contains(DobYear))
		{
			Assert.fail();
			System.out.println("Firstname, Lastname and DOB not match eachother with config file");
		}
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:26/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyLinkedUserStep2InsuranceCarrier(WebDriver driver) 
	{
		WebElement memberIDTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
		WebElement groupMemberTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_GROUPNUMBER));
		String memberID=Manipulation.getAttribute(driver, memberIDTextbox);
		String groupNumber=Manipulation.getAttribute(driver, groupMemberTextbox);
		String memberIDFromConfig= Directory.Rally_TestPage_DefaultSubdomain_Member_ID;
		String groupNumberFromConfig= Directory.Rally_TestPage_DefaultSubdomain_Group_Number;
		WebElement insuranceProviderTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_INSURANCEPROVIDER));
		sendKeys(insuranceProviderTextbox, Directory.Rally_TestPage_DefaultSubdomain_Insurance_Provider);
		wait(driver, "3");
		WebElement autoSuggestOption = driver.findElement(By.xpath(OR.RA_INSURANCE_AUTO_SUGGEST));
		click(autoSuggestOption);
		if (memberID.equalsIgnoreCase(memberIDFromConfig)&&groupNumber.equalsIgnoreCase(groupNumberFromConfig))
		{
			System.out.println("MemberID and Group number match with the config file");
		}
		else if (!memberID.equalsIgnoreCase(memberIDFromConfig)&&!groupNumber.equalsIgnoreCase(groupNumberFromConfig))
		{
			System.out.println("MemberID and Group number not match with the config file");
			Assert.fail();
		}
	}

	/**
	 * Name :VINOTHKUMAR.M
	 * Created Date:26/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing not Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyNotLinkedUserStep2(WebDriver driver) 
	{
		WebElement firstName = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		WebElement lastName = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		WebElement dobMonth = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		WebElement dobDay = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		WebElement dobYear = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		String FirstName=Manipulation.getAttribute(driver, firstName);
		String LastName=Manipulation.getAttribute(driver, lastName);
		String DobMonth=Manipulation.getAttribute(driver, dobMonth);
		String DobDay=Manipulation.getAttribute(driver, dobDay);
		String DobYear=Manipulation.getAttribute(driver, dobYear);
		String FirstNameFromConfig= Directory.Rally_TestPage_DefaultSubdomain_First_Name;
		String LastNameFromConfig= Directory.Rally_TestPage_DefaultSubdomain_Last_Name;
		String DOBfromConfig= Directory.Rally_TestPage_DefaultSubdomain_DOB;
		String[] DobSplit= DOBfromConfig.split("/");
		String DobMonthFromConfig= DobSplit[0];
		String DobDayFromConfig= DobSplit[1];
		String DobYearFromConfig= DobSplit[2];
		System.out.println("FirstName: "+FirstName);
		System.out.println("LastName: "+LastName);
		System.out.println("DobMonth: "+DobMonth);
		System.out.println("DobDay: "+DobDay);
		System.out.println("DobYear: "+DobYear);

		if (!FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&!LastName.equalsIgnoreCase(LastNameFromConfig)
				&&!DobMonthFromConfig.contains(DobMonth)
				&&!DobDayFromConfig.contains(DobDay)
				&&!DobYearFromConfig.contains(DobYear))
		{
			System.out.println("Firstname, Lastname and DOB match eachother with config file");
		}
		else if (FirstName.equalsIgnoreCase(null)
				&&LastName.equalsIgnoreCase(null)
				&&DobMonthFromConfig.contains(null)
				&&DobDayFromConfig.contains(null)
				&&DobYearFromConfig.contains(null))
		{
			Assert.fail();
			System.out.println("Firstname, Lastname and DOB not match eachother with config file");
		}
	}


	/**
	 * Name :VINOTHKUMAR.M
	 * Created Date:26/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing not Linked user CustomSubDomain1 at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyNotLinkedUserCustomSubDomain1Step2(WebDriver driver) 
	{
		WebElement firstName = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		WebElement lastName = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		WebElement dobMonth = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		WebElement dobDay = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		WebElement dobYear = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		String FirstName=Manipulation.getAttribute(driver, firstName);
		String LastName=Manipulation.getAttribute(driver, lastName);
		String DobMonth=Manipulation.getAttribute(driver, dobMonth);
		String DobDay=Manipulation.getAttribute(driver, dobDay);
		String DobYear=Manipulation.getAttribute(driver, dobYear);
		String FirstNameFromConfig= Directory.Rally_TestPage_CustomSubdomain1_First_Name;
		String LastNameFromConfig= Directory.Rally_TestPage_CustomSubdomain1_Last_Name;
		String DOBfromConfig= Directory.Rally_TestPage_CustomSubdomain1_DOB;
		String[] DobSplit= DOBfromConfig.split("/");
		String DobMonthFromConfig= DobSplit[0];
		String DobDayFromConfig= DobSplit[1];
		String DobYearFromConfig= DobSplit[2];
		System.out.println("FirstName: "+FirstName);
		System.out.println("LastName: "+LastName);
		System.out.println("DobMonth: "+DobMonth);
		System.out.println("DobDay: "+DobDay);
		System.out.println("DobYear: "+DobYear);

		if (!FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&!LastName.equalsIgnoreCase(LastNameFromConfig)
				&&!DobMonthFromConfig.contains(DobMonth)
				&&!DobDayFromConfig.contains(DobDay)
				&&!DobYearFromConfig.contains(DobYear))
		{
			System.out.println("Firstname, Lastname and DOB match eachother with config file");
		}
		else if (FirstName.equalsIgnoreCase(null)
				&&LastName.equalsIgnoreCase(null)
				&&DobMonthFromConfig.contains(null)
				&&DobDayFromConfig.contains(null)
				&&DobYearFromConfig.contains(null))
		{
			Assert.fail();
			System.out.println("Firstname, Lastname and DOB not match eachother with config file");
		}
	}

	/**
	 * Name :VINOTHKUMAR.M
	 * Created Date:26/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing not Linked user CustomSubDomain1 at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyNotLinkedUserCustomSubDomain2Step2(WebDriver driver) 
	{
		WebElement firstName = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		WebElement lastName = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		WebElement dobMonth = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		WebElement dobDay = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		WebElement dobYear = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		String FirstName=Manipulation.getAttribute(driver, firstName);
		String LastName=Manipulation.getAttribute(driver, lastName);
		String DobMonth=Manipulation.getAttribute(driver, dobMonth);
		String DobDay=Manipulation.getAttribute(driver, dobDay);
		String DobYear=Manipulation.getAttribute(driver, dobYear);
		String FirstNameFromConfig= Directory.Rally_TestPage_CustomSubdomain2_First_Name;
		String LastNameFromConfig= Directory.Rally_TestPage_CustomSubdomain2_Last_Name;
		String DOBfromConfig= Directory.Rally_TestPage_CustomSubdomain2_DOB;
		String[] DobSplit= DOBfromConfig.split("/");
		String DobMonthFromConfig= DobSplit[0];
		String DobDayFromConfig= DobSplit[1];
		String DobYearFromConfig= DobSplit[2];
		System.out.println("FirstName: "+FirstName);
		System.out.println("LastName: "+LastName);
		System.out.println("DobMonth: "+DobMonth);
		System.out.println("DobDay: "+DobDay);
		System.out.println("DobYear: "+DobYear);

		if (!FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&!LastName.equalsIgnoreCase(LastNameFromConfig)
				&&!DobMonthFromConfig.contains(DobMonth)
				&&!DobDayFromConfig.contains(DobDay)
				&&!DobYearFromConfig.contains(DobYear))
		{
			System.out.println("Firstname, Lastname and DOB match eachother with config file");
		}
		else if (FirstName.equalsIgnoreCase(null)
				&&LastName.equalsIgnoreCase(null)
				&&DobMonthFromConfig.contains(null)
				&&DobDayFromConfig.contains(null)
				&&DobYearFromConfig.contains(null))
		{
			Assert.fail();
			System.out.println("Firstname, Lastname and DOB not match eachother with config file");
		}
	}

	/**
	 * Name :VINOTHKUMAR.M
	 * Created Date:26/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing not Linked user CustomSubDomain1 at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyNotLinkedUserCustomSubDomain3Step2(WebDriver driver) 
	{
		WebElement firstName = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		WebElement lastName = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		WebElement dobMonth = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		WebElement dobDay = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		WebElement dobYear = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		String FirstName=Manipulation.getAttribute(driver, firstName);
		String LastName=Manipulation.getAttribute(driver, lastName);
		String DobMonth=Manipulation.getAttribute(driver, dobMonth);
		String DobDay=Manipulation.getAttribute(driver, dobDay);
		String DobYear=Manipulation.getAttribute(driver, dobYear);
		String FirstNameFromConfig= Directory.Rally_TestPage_CustomSubdomain3_First_Name;
		String LastNameFromConfig= Directory.Rally_TestPage_CustomSubdomain3_Last_Name;
		String DOBfromConfig= Directory.Rally_TestPage_CustomSubdomain3_DOB;
		String[] DobSplit= DOBfromConfig.split("/");
		String DobMonthFromConfig= DobSplit[0];
		String DobDayFromConfig= DobSplit[1];
		String DobYearFromConfig= DobSplit[2];
		System.out.println("FirstName: "+FirstName);
		System.out.println("LastName: "+LastName);
		System.out.println("DobMonth: "+DobMonth);
		System.out.println("DobDay: "+DobDay);
		System.out.println("DobYear: "+DobYear);

		if (!FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&!LastName.equalsIgnoreCase(LastNameFromConfig)
				&&!DobMonthFromConfig.contains(DobMonth)
				&&!DobDayFromConfig.contains(DobDay)
				&&!DobYearFromConfig.contains(DobYear))
		{
			System.out.println("Firstname, Lastname and DOB match eachother with config file");
		}
		else if (FirstName.equalsIgnoreCase(null)
				&&LastName.equalsIgnoreCase(null)
				&&DobMonthFromConfig.contains(null)
				&&DobDayFromConfig.contains(null)
				&&DobYearFromConfig.contains(null))
		{
			Assert.fail();
			System.out.println("Firstname, Lastname and DOB not match eachother with config file");
		}
	}

	/**
	 * Name :VINOTHKUMAR.M
	 * Created Date:26/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing not Linked user CustomSubDomain1 at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyNotLinkedUserCustomSubDomain4Step2(WebDriver driver) 
	{
		WebElement firstName = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		WebElement lastName = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		WebElement dobMonth = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		WebElement dobDay = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		WebElement dobYear = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		String FirstName=Manipulation.getAttribute(driver, firstName);
		String LastName=Manipulation.getAttribute(driver, lastName);
		String DobMonth=Manipulation.getAttribute(driver, dobMonth);
		String DobDay=Manipulation.getAttribute(driver, dobDay);
		String DobYear=Manipulation.getAttribute(driver, dobYear);
		String FirstNameFromConfig= Directory.Rally_TestPage_CustomSubdomain4_First_Name;
		String LastNameFromConfig= Directory.Rally_TestPage_CustomSubdomain4_Last_Name;
		String DOBfromConfig= Directory.Rally_TestPage_CustomSubdomain4_DOB;
		String[] DobSplit= DOBfromConfig.split("/");
		String DobMonthFromConfig= DobSplit[0];
		String DobDayFromConfig= DobSplit[1];
		String DobYearFromConfig= DobSplit[2];
		System.out.println("FirstName: "+FirstName);
		System.out.println("LastName: "+LastName);
		System.out.println("DobMonth: "+DobMonth);
		System.out.println("DobDay: "+DobDay);
		System.out.println("DobYear: "+DobYear);

		if (!FirstName.equalsIgnoreCase(FirstNameFromConfig)
				&&!LastName.equalsIgnoreCase(LastNameFromConfig)
				&&!DobMonthFromConfig.contains(DobMonth)
				&&!DobDayFromConfig.contains(DobDay)
				&&!DobYearFromConfig.contains(DobYear))
		{
			System.out.println("Firstname, Lastname and DOB match eachother with config file");
		}
		else if (FirstName.equalsIgnoreCase(null)
				&&LastName.equalsIgnoreCase(null)
				&&DobMonthFromConfig.contains(null)
				&&DobDayFromConfig.contains(null)
				&&DobYearFromConfig.contains(null))
		{
			Assert.fail();
			System.out.println("Firstname, Lastname and DOB not match eachother with config file");
		}
	}
	/**
	 * Name :Vinothkumar.M
	 * Created Date:26/Jun/2017
	 * Modified Date:
	 * Description : Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyNotLinkedUserStep2InsuranceCarrier(WebDriver driver) 
	{
		WebElement memberIDTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
		WebElement groupMemberTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_GROUPNUMBER));
		String memberID=Manipulation.getAttribute(driver, memberIDTextbox);
		String groupNumber=Manipulation.getAttribute(driver, groupMemberTextbox);
		String memberIDFromConfig= Directory.Rally_TestPage_DefaultSubdomain_Member_ID;
		String groupNumberFromConfig= Directory.Rally_TestPage_DefaultSubdomain_Group_Number;
		WebElement insuranceProviderTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_INSURANCEPROVIDER));
		sendKeys(insuranceProviderTextbox, Directory.Rally_TestPage_DefaultSubdomain_Insurance_Provider);
		wait(driver, "3");
		WebElement autoSuggestOption = driver.findElement(By.xpath(OR.RA_INSURANCE_AUTO_SUGGEST));
		click(autoSuggestOption);
		if (!memberID.equalsIgnoreCase(memberIDFromConfig)&&!groupNumber.equalsIgnoreCase(groupNumberFromConfig))
		{
			System.out.println("MemberID and Group number match with the config file");
		}
		else if (memberID.equalsIgnoreCase(null)&&groupNumber.equalsIgnoreCase(null))
		{
			System.out.println("MemberID and Group number not match with the config file");
			Assert.fail();
		}
	}

	/**
	 * Name :Vinothkumar.M
	 * Created Date:26/Jun/2017
	 * Modified Date:
	 * Description : Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyNotLinkedUserStep2InsuranceCarrierIsNull(WebDriver driver) 
	{
		WebElement memberIDTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
		WebElement groupMemberTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_GROUPNUMBER));
		String memberID=Manipulation.getAttribute(driver, memberIDTextbox);
		String groupNumber=Manipulation.getAttribute(driver, groupMemberTextbox);
		String memberIDFromConfig= Directory.Rally_TestPage_DefaultSubdomain_Member_ID;
		String groupNumberFromConfig= Directory.Rally_TestPage_DefaultSubdomain_Group_Number;
		if (!memberID.equalsIgnoreCase(memberIDFromConfig)&&!groupNumber.equalsIgnoreCase(groupNumberFromConfig))
		{
			System.out.println("MemberID and Group number match with the config file");
		}
		else if (memberID.equalsIgnoreCase(null)&&groupNumber.equalsIgnoreCase(null))
		{
			System.out.println("MemberID and Group number not match with the config file");
			Assert.fail();
		}
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method verify OptOut value using Rally ID
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static void retrieveOptOutValueUsingRallyID(WebDriver driver, String testData) throws ClassNotFoundException, SQLException
	{
		String port = Directory.Oracle_Port;
		String database_name= Directory.Oracle_Databasename;
		String user = Directory.Oracle_User;
		String pass = Directory.Oracle_Pass;
		String hostname =Directory.Oracle_Hostname;
		String url ="jdbc:oracle:thin:@"+hostname+":"+port+":"+database_name+"";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection success");
		Statement stat=conn.createStatement();
		ResultSet rs = stat.executeQuery("select * from RALLY_AUDIT_LOGIN where RALLY_ID ='"+RallyID+"'");
		System.out.println("query executed");
		String OptOutValue="";
		if(rs.next())
		{
			OptOutValue= rs.getString("OPTOUT");
			System.out.println("OptOut value: "+OptOutValue);
			if(OptOutValue.equalsIgnoreCase(testData))
			{
				System.out.println("FirstName, LastName and Email match eachother");
			}
			else if(!OptOutValue.equalsIgnoreCase(testData))
			{
				Assert.fail();
			}
		}
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:04/Jul/2017
	 * Modified Date:
	 * Description : Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyCutomSubDomain1Step2InsuranceCarrier(WebDriver driver) 
	{
		WebElement memberIDTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
		String memberID=Manipulation.getAttribute(driver, memberIDTextbox);
		String memberIDFromConfig= Directory.Rally_TestPage_CustomSubdomain1_Member_ID;
		wait(driver, "3");
		if (!memberID.equalsIgnoreCase(memberIDFromConfig))
		{
			System.out.println("MemberID and Group number match with the config file");
		}
		else if (memberID.equalsIgnoreCase(memberIDFromConfig))
		{
			System.out.println("MemberID and Group number not match with the config file");
			Assert.fail();
		}
		sendKeys(memberIDTextbox, memberIDFromConfig);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:04/Jul/2017
	 * Modified Date:
	 * Description : Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyCutomSubDomain2Step2InsuranceCarrier(WebDriver driver) 
	{
		WebElement memberIDTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
		WebElement insuranceProviderTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_INSURANCEPROVIDER));
		WebElement groupNumberTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_GROUPNUMBER));
		String insuranceProvider=Manipulation.getAttribute(driver, insuranceProviderTextbox);
		String insuranProviderFromConfig= Directory.Rally_TestPage_CustomSubdomain2_Insurance_Provider;
		String memberID=Manipulation.getAttribute(driver, memberIDTextbox);
		String memberIDFromConfig=Directory.Rally_TestPage_CustomSubdomain2_Member_ID;
		String groupNumber=Manipulation.getAttribute(driver, groupNumberTextbox);
		String groupNumberFromConfig=Directory.Rally_TestPage_CustomSubdomain2_Group_Number;
		wait(driver, "3");
		if (!memberID.equalsIgnoreCase(memberIDFromConfig)&&!groupNumber.equalsIgnoreCase(groupNumberFromConfig)&&insuranceProvider.contains(insuranProviderFromConfig))
		{
			System.out.println("Insurance provider match with the config file and MemberID and Group number should not");
		}
		else if (memberID.equalsIgnoreCase(memberIDFromConfig))
		{
			System.out.println("Insurance provider not match and MemberID and Group number match");
			Assert.fail();
		}
		sendKeys(memberIDTextbox, memberIDFromConfig);
		wait(driver, "2");
		sendKeys(groupNumberTextbox, groupNumberFromConfig);
		wait(driver, "2");
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:04/Jul/2017
	 * Modified Date:
	 * Description : Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyCutomSubDomain3Step2InsuranceCarrier(WebDriver driver) 
	{
		WebElement memberIDTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
		WebElement groupNumberTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_GROUPNUMBER));
		String memberID=Manipulation.getAttribute(driver, memberIDTextbox);
		String memberIDFromConfig=Directory.Rally_TestPage_CustomSubdomain3_Member_ID;
		String groupNumber=Manipulation.getAttribute(driver, groupNumberTextbox);
		String groupNumberFromConfig=Directory.Rally_TestPage_CustomSubdomain3_Group_Number;
		wait(driver, "3");
		if (!memberID.equalsIgnoreCase(memberIDFromConfig)&&!groupNumber.equalsIgnoreCase(groupNumberFromConfig))
		{
			System.out.println("Insurance provider match with the config file and MemberID and Group number should not");
		}
		else if (memberID.equalsIgnoreCase(memberIDFromConfig))
		{
			System.out.println("Insurance provider not match and MemberID and Group number match");
			Assert.fail();
		}
		sendKeys(memberIDTextbox, memberIDFromConfig);
		wait(driver, "2");
		sendKeys(groupNumberTextbox, groupNumberFromConfig);
		wait(driver, "2");
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:04/Jul/2017
	 * Modified Date:
	 * Description : Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyCutomSubDomain4Step2InsuranceCarrier(WebDriver driver) 
	{
		WebElement memberIDTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
		WebElement groupNumberTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_GROUPNUMBER));
		WebElement insuranceProviderTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_INSURANCEPROVIDER));
		String insuranProviderFromConfig= Directory.Rally_TestPage_CustomSubdomain4_Insurance_Provider;
		String insuranceProvider=Manipulation.getAttribute(driver, insuranceProviderTextbox);
		String memberID=Manipulation.getAttribute(driver, memberIDTextbox);
		String memberIDFromConfig=Directory.Rally_TestPage_CustomSubdomain4_Member_ID;
		String groupNumber=Manipulation.getAttribute(driver, groupNumberTextbox);
		String groupNumberFromConfig=Directory.Rally_TestPage_CustomSubdomain4_Group_Number;
		wait(driver, "3");
		if (!memberID.equalsIgnoreCase(memberIDFromConfig)&&!groupNumber.equalsIgnoreCase(groupNumberFromConfig)&&!insuranceProvider.contains(insuranProviderFromConfig))
		{
			System.out.println("Insurance provider match with the config file and MemberID and Group number should not");
		}
		else if (memberID.equalsIgnoreCase(memberIDFromConfig))
		{
			System.out.println("Insurance provider not match and MemberID and Group number match");
			Assert.fail();
		}
		sendKeys(memberIDTextbox, memberIDFromConfig);
		wait(driver, "2");
		sendKeys(groupNumberTextbox, groupNumberFromConfig);
		wait(driver, "2");
		sendKeys(insuranceProviderTextbox, Directory.Rally_TestPage_CustomSubdomain4_Insurance_Provider);
		wait(driver, "3");
		WebElement autoSuggestOption = driver.findElement(By.xpath(OR.RA_INSURANCE_AUTO_SUGGEST));
		click(autoSuggestOption);
	}

	/** Name :Vinothkumar.M
	 * Created Date:07/July/2017
	 * Modified Date:
	 * Description :   Created common method to Observe prepopulated details after hfops update DOB
	 * Required Inputs :
	 */
	public static void verifyNoticeThePrepopulatedValueAfterHFOPsUpdate(WebDriver driver) 
	{
		WebElement dobMonth = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		WebElement dobDay = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		WebElement dobYear = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		String DobMonth=Manipulation.getAttribute(driver, dobMonth);
		String DobDay=Manipulation.getAttribute(driver, dobDay);
		String DobYear=Manipulation.getAttribute(driver, dobYear);
		String DOBfromConfig= Directory.Rally_TestPage_DefaultSubdomain_DOB;
		String[] DobSplit= DOBfromConfig.split("/");
		String DobMonthFromConfig= DobSplit[0];
		String DobDayFromConfig= DobSplit[1];
		String DobYearFromConfig= DobSplit[2];
		System.out.println("DobMonth: "+DobMonth);
		System.out.println("DobDay: "+DobDay);
		System.out.println("DobYear: "+DobYear);

		if (DobMonthFromConfig.contains(DobMonth)
				&&DobDayFromConfig.contains(DobDay)
				&&DobYearFromConfig.contains(DobYear))
		{
			System.out.println("DOB match each other with config file");
		}
		else if (DobMonthFromConfig.contains(DobMonth)
				&&DobDayFromConfig.contains(DobDay)
				&&DobYearFromConfig.contains(DobYear))
		{
			Assert.fail();
			System.out.println("DOB not match each other with config file");
		}
	}

	/**
	 * Name :Vinothkumar.M
	 * Created Date:07/July/2017
	 * Modified Date:
	 * Description : Created common method to Member Linked to Rally
	 * Required Inputs :
	 */
	public static void memberLinkedToRally(WebDriver driver) 
	{
		WebElement linkToRallyButton = driver.findElement(By.xpath(OR.HFOPS_RALLY_MEMBER_PROFILE_LINK_TO_RALLY_BUTTON));
		click(linkToRallyButton);
		wait(driver, "5");
		WebElement linkMemberToRallyHeader = driver.findElement(By.xpath(OR.HFOPS_RALLY_MEMBER_PROFILE_LINK_MEMBER_TO_RALLY_HEADER));
		WebElement rallyIDLabel = driver.findElement(By.xpath(OR.HFOPS_RALLY_MEMBER_PROFILE_RALLY_ID_LABEL));
		WebElement rallyIDTextbox= driver.findElement(By.xpath(OR.HFOPS_RALLY_MEMBER_PROFILE_RALLY_ID_TEXTBOX));
		WebElement rallyIDLinkButton= driver.findElement(By.xpath(OR.HFOPS_RALLY_MEMBER_PROFILE_RALLY_ID_LINK_BUTTON));
		WebElement rallyCloseButton= driver.findElement(By.xpath(OR.HFOPS_RALLY_MEMBER_PROFILE_LINK_MEMBER_TO_RALLY_CLOSE_BUTTON));
		verifyElementIsPresent(driver, linkMemberToRallyHeader);
		verifyElementIsPresent(driver, rallyIDLabel);
		verifyElementIsPresent(driver, rallyIDTextbox);
		verifyElementIsPresent(driver, rallyIDLinkButton);
		verifyElementIsPresent(driver, rallyCloseButton);
		clearAndType(rallyIDTextbox, RallyID);
		wait(driver, "1");
		click(rallyIDLinkButton);
		wait(driver, "5");
		WebElement memberLinkedToRallySuccessfullyMsg = driver.findElement(By.xpath(OR.HFOPS_RALLY_MEMBER_PROFILE_MEMBER_LINKED_TO_RALLY_SUCCESSFULLY_MSG));
		WebElement memberLinkedToRallySuccessfullyOkButton = driver.findElement(By.xpath(OR.HFOPS_RALLY_MEMBER_PROFILE_MEMBER_LINKED_TO_RALLY_SUCCESSFULLY_OK_BUTTON));
		verifyElementIsPresent(driver, memberLinkedToRallySuccessfullyMsg);
		verifyElementIsPresent(driver, memberLinkedToRallySuccessfullyOkButton);
		click(memberLinkedToRallySuccessfullyOkButton);
		wait(driver, "5");
		driver.navigate().refresh();
		wait(driver, "5");

	}
	/**
	 * Name :Vinothkumar.M
	 * Created Date:   06/July/17
	 * Modified Date:
	 * Description : Created the common method to get active member with different onboarding status
	 * Ticket ID :
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static String Email="";
	public static String retrievedRAMemberDifferentOnboardingStatus(WebDriver driver,String onboardingStatus) throws ClassNotFoundException, SQLException
	{

		String port = Directory.Oracle_Port;
		String database_name= Directory.Oracle_Databasename;
		String user = Directory.Oracle_User;
		String pass = Directory.Oracle_Pass;
		String hostname =Directory.Oracle_Hostname;
		String url ="jdbc:oracle:thin:@"+hostname+":"+port+":"+database_name+"";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection success");
		Statement stat=conn.createStatement();
		ResultSet rs = stat.executeQuery("select A.ID, A.EMAIL from ACCOUNT A, SUMMARY_ACCOUNT_TODATE SATD, ACCOUNT_IDENTITY_MAP AM where A.ID= SATD.ACCOUNT_ID AND AM.ACCOUNT_ID = A.ID AND SATD.MAST_PROGRAM_ID= '"+Directory.Mast_ProgramId+"' AND SATD.ONBOARDING_STATUS= '"+onboardingStatus+"' AND A.Status='Active' AND A.EMAIL not LIKE '%api%' AND A.EMAIL not like '%QA%' AND A.EMAIL not like '%raj@yopmail.com' AND A.EMAIL not like '%jas@yopmail.com%' AND A.EMAIL not like '%arathi@yopmail.com%' AND A.EMAIL not like '%MANUAL%' AND A.EMAIL not like '%member%.t2%' AND AM.ID IS NOT NULL ORDER  BY SATD.CREATED_DT DESC");
		System.out.println("query executed");
		if(rs.next())
		{
			Email= rs.getString("EMAIL");
			System.out.println(" Member Email is retrieved from the Table: "+Email);
		}
		return Email;
	}

	/**
	 * Name :Vinothkumar.M
	 * Created Date:7/Jul/2017
	 * Modified Date:
	 * Description :   Created common method to fill the existing  not Linked user Different Onboarding Status credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingNotLinkedUserDifferentOnboardingStatusMemberCredentials(WebDriver driver) 
	{
		WebElement existingNotLinkedUserEmail = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_EMAIL));
		WebElement existingNotLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_RALLY_ID));
		WebElement existingNotLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_FIRST_NAME));
		WebElement existingNotLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_LAST_NAME));
		WebElement existingNotLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_DOB));
		WebElement existingNotLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_EMPLOYEE_ID));
		WebElement existingNotLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_CLIENT_ID));
		WebElement existingNotLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_GROUP_NUMBER));
		WebElement existingNotLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_MEMBER_ID));
		String timeStamp = new SimpleDateFormat("MMmmss").format(Calendar.getInstance().getTime());
		int milli = Calendar.getInstance().get(Calendar.MILLISECOND);
		int milli1 = Calendar.getInstance().get(Calendar.MILLISECOND);
		RallyID = timeStamp+milli+milli1;
		System.out.println("Current Time: "+RallyID);
		clearAndType(existingNotLinkedUserEmail, Email);
		clearAndType(existingNotLinkedUserRallyID, RallyID);
		clearAndType(existingNotLinkedUserFirstName, Directory.Rally_TestPage_DefaultSubdomain_First_Name);
		clearAndType(existingNotLinkedUserLastName, Directory.Rally_TestPage_DefaultSubdomain_Last_Name);
		clearAndType(existingNotLinkedUserDOB, Directory.Rally_TestPage_DefaultSubdomain_DOB);
		clearAndType(existingNotLinkedUserEmployeeID, Directory.Rally_TestPage_DefaultSubdomain_Employee_ID);
		clear(existingNotLinkedUserClientID);
		clearAndType(existingNotLinkedUserGroupNumber, Directory.Rally_TestPage_DefaultSubdomain_Group_Number);
		clearAndType(existingNotLinkedUserMemberID, Directory.Rally_TestPage_DefaultSubdomain_Member_ID);
	}

	/**
	 * Name :Vinothkumayr.M
	 * Created Date:7/Jul/2017
	 * Modified Date:
	 * Description :Created common method to fill the existing Linked user Different Onboarding Status credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingLinkedUserDifferentOnboardingStatusMemberCredentials(WebDriver driver) 
	{
		WebElement existingLinkedUserEmail = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_EMAIL));
		WebElement existingLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_RALLY_ID));
		WebElement existingLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_FIRST_NAME));
		WebElement existingLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_LAST_NAME));
		WebElement existingLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_DOB));
		WebElement existingLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_EMPLOYEE_ID));
		WebElement existingLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_CLIENT_ID));
		WebElement existingLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_GROUP_NUMBER));
		WebElement existingLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_MEMBER_ID));
		String timeStamp = new SimpleDateFormat("MMmmss").format(Calendar.getInstance().getTime());
		int milli = Calendar.getInstance().get(Calendar.MILLISECOND);
		int milli1 = Calendar.getInstance().get(Calendar.MILLISECOND);
		RallyID = timeStamp+milli+milli1;
		System.out.println("Current Time: "+RallyID);
		clearAndType(existingLinkedUserEmail, Email);
		clearAndType(existingLinkedUserRallyID, RallyID);
		clearAndType(existingLinkedUserFirstName, Directory.Rally_TestPage_DefaultSubdomain_First_Name);
		clearAndType(existingLinkedUserLastName, Directory.Rally_TestPage_DefaultSubdomain_Last_Name);
		clearAndType(existingLinkedUserDOB, Directory.Rally_TestPage_DefaultSubdomain_DOB);
		clearAndType(existingLinkedUserEmployeeID, Directory.Rally_TestPage_DefaultSubdomain_Employee_ID);
		clear(existingLinkedUserClientID);
		clearAndType(existingLinkedUserGroupNumber, Directory.Rally_TestPage_DefaultSubdomain_Group_Number);
		clearAndType(existingLinkedUserMemberID, Directory.Rally_TestPage_DefaultSubdomain_Member_ID);
	}

	/**
	 * Name :  Vinothkumar. M
	 * Created Date:   07/July/17
	 * Modified Date:
	 * Description : Created a common method to Retrieve Ideal member from DataBase
	 * Ticket ID :
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public static Object retrieveIdealMemberRAFromRally(WebDriver driver) throws ClassNotFoundException, SQLException
	{
		String port =Directory.Oracle_Port;
		String database_name= Directory.Oracle_Databasename;
		String user = Directory.Oracle_User;
		String pass = Directory.Oracle_Pass;
		String hostname =Directory.Oracle_Hostname;
		String url ="jdbc:oracle:thin:@"+hostname+":"+port+":"+database_name+"";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection success");
		Statement stat=conn.createStatement();
		ResultSet rs = stat.executeQuery("select first_name,last_name,email,status,created_dt from account where Status='Idle' and EMAIL NOT LIKE '%guerrillamail.com%' and EMAIL NOT LIKE '%api%' AND EMAIL NOT LIKE '%info%' AND EMAIL not like '%QA%' AND EMAIL not like '%raj@yopmail.com' AND EMAIL not like '%jas@yopmail.com%' AND EMAIL not like '%arathi@yopmail.com%' AND EMAIL not like '%MANUAL%' ORDER BY email DESC");
		System.out.println("query executed");
		if(rs.next())
		{
			Email  = rs.getString("EMAIL");

		}
		System.out.println("Retrieved Ideal member from DB is "+Email);
		return Email;
	}
	/**
	 * Name :  Vinothkumar. M
	 * Created Date:   07/July/17
	 * Modified Date:
	 * Description : Create a common method to Handle terms and condition Popup in Rally login page
	 * Ticket ID :
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public static void rallyMemberTermsAndConditionPopupHandle(WebDriver driver) 
	{
		try
		{
			Manipulation.waitForElement(driver, OR.RALLY_MEMBER_LOGIN_I_AGREE_BUTTON);
			WebElement agree_buton = driver.findElement(By.xpath(OR.RALLY_MEMBER_LOGIN_I_AGREE_BUTTON));
			WebElement disAgree_buton = driver.findElement(By.xpath(OR.RALLY_MEMBER_LOGIN_I_DISAGREE_BUTTON));
			verifyElementIsPresent(driver, agree_buton);
			verifyElementIsPresent(driver, disAgree_buton);
			click(agree_buton);
			wait(driver, "4");
		}
		catch(Exception e)
		{
			System.out.println("Terms and Conditions popup not displayed or handled");
		}
	}
	/**
	 * Name :  Vinothkumar. M
	 * Created Date:   07/July/17
	 * Modified Date:
	 * Description : Create a common method to enter RA Member DOB 
	 * Ticket ID :
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public static void enterRAMemberDOB(WebDriver driver)
	{
		WebElement month = driver.findElement(By.xpath(OR.RA_MEMBER_DOBMONTH));
		selectByVisibletext(month, Directory.RA_Enrollment_Month);
		WebElement day = driver.findElement(By.xpath(OR.RA_MEMBER_DOBDAY));
		selectByVisibletext(day, Directory.RA_Enrollment_Day);
		WebElement year = driver.findElement(By.xpath(OR.RA_MEMBER_DOBYEAR));
		selectByVisibletext(year, Directory.RA_Enrollment_Year);
		wait(driver, "3");

	}
	/***
	 * Name :Vinothkumar.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to fill the Real Appeal user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyNewUserRACredentialsForRallyTestPage(WebDriver driver) 
	{
		WebElement newUserRallyID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_RALLY_ID));
		WebElement newUserFirstName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_FIRST_NAME));
		WebElement newUserLastName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_LAST_NAME));
		WebElement newUserDOB = driver.findElement(By.xpath(OR.RALLY_NEW_USER_DOB));
		WebElement newUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMPLOYEE_ID));
		WebElement newUserClientID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_CLIENT_ID));
		WebElement newUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_NEW_USER_GROUP_NUMBER));
		WebElement newUserMemberID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_MEMBER_ID));
		String timeStamp = new SimpleDateFormat("MMmmss").format(Calendar.getInstance().getTime());
		int milli = Calendar.getInstance().get(Calendar.MILLISECOND);
		int milli1 = Calendar.getInstance().get(Calendar.MILLISECOND);
		RallyID = timeStamp+milli+milli1;
		System.out.println("Current Time: "+RallyID);
		clearAndType(newUserRallyID, RallyID);
		clearAndType(newUserFirstName, Directory.Rally_TestPage_DefaultSubdomain_First_Name);
		clearAndType(newUserLastName, Directory.Rally_TestPage_DefaultSubdomain_Last_Name);
		clearAndType(newUserDOB, Directory.Rally_TestPage_DefaultSubdomain_DOB);
		clearAndType(newUserEmployeeID, Directory.Rally_TestPage_DefaultSubdomain_Employee_ID);
		clear(newUserClientID);
		clearAndType(newUserGroupNumber, Directory.Rally_TestPage_DefaultSubdomain_Group_Number);
		clearAndType(newUserMemberID, Directory.Rally_TestPage_DefaultSubdomain_Member_ID);
	}

	/**
	 * Name :Vinothkumayr.M
	 * Created Date:7/Jul/2017
	 * Modified Date:
	 * Description :Created common method to fill the existing Linked user Declined and Inactive Member Onboarding Status credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingLinkedDeclinednInactiveAccountStatusMemberCredential(WebDriver driver) 
	{
		WebElement existingLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_RALLY_ID));
		WebElement existingLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_FIRST_NAME));
		WebElement existingLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_LAST_NAME));
		WebElement existingLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_DOB));
		WebElement existingLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_EMPLOYEE_ID));
		WebElement existingLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_CLIENT_ID));
		WebElement existingLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_GROUP_NUMBER));
		WebElement existingLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_LINKED_USER_MEMBER_ID));
		String timeStamp = new SimpleDateFormat("MMmmss").format(Calendar.getInstance().getTime());
		int milli = Calendar.getInstance().get(Calendar.MILLISECOND);
		int milli1 = Calendar.getInstance().get(Calendar.MILLISECOND);
		RallyID = timeStamp+milli+milli1;
		System.out.println("Current Time: "+RallyID);
		clearAndType(existingLinkedUserRallyID, RallyID);
		clearAndType(existingLinkedUserFirstName, Directory.Rally_TestPage_DefaultSubdomain_First_Name);
		clearAndType(existingLinkedUserLastName, Directory.Rally_TestPage_DefaultSubdomain_Last_Name);
		clearAndType(existingLinkedUserDOB, Directory.Rally_TestPage_DefaultSubdomain_DOB);
		clearAndType(existingLinkedUserEmployeeID, Directory.Rally_TestPage_DefaultSubdomain_Employee_ID);
		clear(existingLinkedUserClientID);
		clearAndType(existingLinkedUserGroupNumber, Directory.Rally_TestPage_DefaultSubdomain_Group_Number);
		clearAndType(existingLinkedUserMemberID, Directory.Rally_TestPage_DefaultSubdomain_Member_ID);
	}

	/** Name :Vinothkumar.M
	 * Created Date:7/Jul/2017
	 * Modified Date:
	 * Description :   Created common method to Created common method to fill the existing Linked user Declined and Inactive Member Onboarding Status credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyExistingNotLinkedDeclinednInactiveAccountStatusMemberCredential(WebDriver driver) 
	{
		WebElement existingNotLinkedUserRallyID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_RALLY_ID));
		WebElement existingNotLinkedUserFirstName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_FIRST_NAME));
		WebElement existingNotLinkedUserLastName = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_LAST_NAME));
		WebElement existingNotLinkedUserDOB = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_DOB));
		WebElement existingNotLinkedUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_EMPLOYEE_ID));
		WebElement existingNotLinkedUserClientID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_CLIENT_ID));
		WebElement existingNotLinkedUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_GROUP_NUMBER));
		WebElement existingNotLinkedUserMemberID = driver.findElement(By.xpath(OR.RALLY_EXISTING_NOT_LINKED_USER_MEMBER_ID));
		String timeStamp = new SimpleDateFormat("MMmmss").format(Calendar.getInstance().getTime());
		int milli = Calendar.getInstance().get(Calendar.MILLISECOND);
		int milli1 = Calendar.getInstance().get(Calendar.MILLISECOND);
		RallyID = timeStamp+milli+milli1;
		System.out.println("Current Time: "+RallyID);
		clearAndType(existingNotLinkedUserRallyID, RallyID);
		clearAndType(existingNotLinkedUserFirstName, Directory.Rally_TestPage_DefaultSubdomain_First_Name);
		clearAndType(existingNotLinkedUserLastName, Directory.Rally_TestPage_DefaultSubdomain_Last_Name);
		clearAndType(existingNotLinkedUserDOB, Directory.Rally_TestPage_DefaultSubdomain_DOB);
		clearAndType(existingNotLinkedUserEmployeeID, Directory.Rally_TestPage_DefaultSubdomain_Employee_ID);
		clear(existingNotLinkedUserClientID);
		clearAndType(existingNotLinkedUserGroupNumber, Directory.Rally_TestPage_DefaultSubdomain_Group_Number);
		clearAndType(existingNotLinkedUserMemberID, Directory.Rally_TestPage_DefaultSubdomain_Member_ID);
	}

	/**
	 * Name :VINOTHKUMAR.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description : Created common method to fill the existing not Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void verifyRallyCustomSubDomain1NotLinkedUserStep1(WebDriver driver) 
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		String confirmemail=Manipulation.getAttribute(driver, confirmEmail);
		String Email1 =Directory.Rally_TestPage_CustomSubdomain1_Email;
		if(!Email.equalsIgnoreCase(Email))
		{
			if(!confirmemail.equalsIgnoreCase(Email1))
			{
				System.out.println("Both the Email and Confirm email match with configured Email");

			}
		}
		else if(Email.equalsIgnoreCase(null))
		{
			Assert.fail();	
		}
	}

	/**
	 * Name :Vinothkumar.M
	 * Created Date:   23/JUN/17
	 * Modified Date:
	 * Description : Create a common method to enter Email and Confirm email dynamic to multi environment
	 * @return 
	 * @return
	 */
	public static Object enterRAllyCustomSubDomain1EmailAndConfirmEmail(WebDriver driver)
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		clearAndType(memberEmail, Directory.Rally_TestPage_CustomSubdomain1_Email);
		wait(driver, "3");
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		clearAndType(confirmEmail, Directory.Rally_TestPage_CustomSubdomain1_Email);
		wait(driver, "3");
		return Email;
	}
	/**
	 * Name :Vinothkumar.M
	 * Created Date:   23/JUN/17
	 * Modified Date:
	 * Description : Create a common method to enter Email and Confirm email dynamic to multi environment
	 * @return 
	 * @return
	 */
	public static Object enterRAllyCustomSubDomain2EmailAndConfirmEmail(WebDriver driver)
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		clearAndType(memberEmail, Directory.Rally_TestPage_CustomSubdomain2_Email);
		wait(driver, "3");
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		clearAndType(confirmEmail, Directory.Rally_TestPage_CustomSubdomain2_Email);
		wait(driver, "3");
		return Email;
	}
	/**
	 * Name :Vinothkumar.M
	 * Created Date:   23/JUN/17
	 * Modified Date:
	 * Description : Create a common method to enter Email and Confirm email dynamic to multi environment
	 * @return 
	 * @return
	 */
	public static Object enterRAllyCustomSubDomain3EmailAndConfirmEmail(WebDriver driver)
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		clearAndType(memberEmail, Directory.Rally_TestPage_CustomSubdomain3_Email);
		wait(driver, "3");
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		clearAndType(confirmEmail, Directory.Rally_TestPage_CustomSubdomain3_Email);
		wait(driver, "3");
		return Email;
	}
	/**
	 * Name :Vinothkumar.M
	 * Created Date:   23/JUN/17
	 * Modified Date:
	 * Description : Create a common method to enter Email and Confirm email dynamic to multi environment
	 * @return 
	 * @return
	 */
	public static Object enterRAllyCustomSubDomain4EmailAndConfirmEmail(WebDriver driver)
	{
		WebElement memberEmail = driver.findElement(By.xpath(OR.RA_MEMBER_EMAIL));
		clearAndType(memberEmail, Directory.Rally_TestPage_CustomSubdomain4_Email);
		wait(driver, "3");
		String Email=Manipulation.getAttribute(driver, memberEmail);
		WebElement confirmEmail = driver.findElement(By.xpath(OR.RA_MEMBER_CONFIRM_EMAIL));
		clearAndType(confirmEmail, Directory.Rally_TestPage_CustomSubdomain4_Email);
		wait(driver, "3");
		return Email;
	}

	/**
	 * Name :Vinothkumar.M
	 * Created Date: 23/JUN/17
	 * Modified Date:
	 * Description : Create a common method to enter First and Last name dynamic to multi environment
	 * @return
	 */
	public static void enterRallyCustomSubdomain1FirstAndLastName(WebDriver driver)
	{
		WebElement  firstname = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		clearAndType(firstname, Directory.Rally_TestPage_CustomSubdomain1_First_Name);
		wait(driver, "1");
		WebElement  lastname = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		clearAndType(lastname, Directory.Rally_TestPage_CustomSubdomain1_Last_Name);
		wait(driver, "1");
	}
	/**
	 * Name :Vinothkumar.M
	 * Created Date: 23/JUN/17
	 * Modified Date:
	 * Description : Create a common method to enter First and Last name dynamic to multi environment
	 * @return
	 */
	public static void enterRallyCustomSubdomain2FirstAndLastName(WebDriver driver)
	{
		WebElement  firstname = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		clearAndType(firstname, Directory.Rally_TestPage_CustomSubdomain2_First_Name);
		wait(driver, "1");
		WebElement  lastname = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		clearAndType(lastname, Directory.Rally_TestPage_CustomSubdomain2_Last_Name);
		wait(driver, "1");
	}
	/**
	 * Name :Vinothkumar.M
	 * Created Date: 23/JUN/17
	 * Modified Date:
	 * Description : Create a common method to enter First and Last name dynamic to multi environment
	 * @return
	 */
	public static void enterRallyCustomSubdomain3FirstAndLastName(WebDriver driver)
	{
		WebElement  firstname = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		clearAndType(firstname, Directory.Rally_TestPage_CustomSubdomain3_First_Name);
		wait(driver, "1");
		WebElement  lastname = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		clearAndType(lastname, Directory.Rally_TestPage_CustomSubdomain3_Last_Name);
		wait(driver, "1");
	}
	/**
	 * Name :Vinothkumar.M
	 * Created Date: 23/JUN/17
	 * Modified Date:
	 * Description : Create a common method to enter First and Last name dynamic to multi environment
	 * @return
	 */
	public static void enterRallyCustomSubdomain4FirstAndLastName(WebDriver driver)
	{
		WebElement  firstname = driver.findElement(By.xpath(OR.RA_MEMBER_FIRSTNAME));
		clearAndType(firstname, Directory.Rally_TestPage_CustomSubdomain4_First_Name);
		wait(driver, "1");
		WebElement  lastname = driver.findElement(By.xpath(OR.RA_MEMBER_LASTNAME));
		clearAndType(lastname, Directory.Rally_TestPage_CustomSubdomain4_Last_Name);
		wait(driver, "1");
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:04/Jul/2017
	 * Modified Date:
	 * Description : Created common method to fill the existing Linked user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void enterInsuranceInfoForExistingNotLinkedCustomSubDomain1(WebDriver driver) 
	{
		WebElement memberIDTextbox = driver.findElement(By.xpath(OR.RA_MEMBER_MEMBERID));
		String memberIDFromConfig= Directory.Rally_TestPage_CustomSubdomain1_Member_ID;
		wait(driver, "3");
		sendKeys(memberIDTextbox, memberIDFromConfig);
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:14/Jul/2017
	 * Modified Date:
	 * Description :   Created common method to fill the new user credentials at Rally test page
	 * Required Inputs :
	 */
	public static void rallyNewUserWithMissingCredentialsForRallyTestPage(WebDriver driver) 
	{
		WebElement newUserEmail = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMAIL));
		WebElement newUserRallyID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_RALLY_ID));
		WebElement newUserFirstName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_FIRST_NAME));
		WebElement newUserLastName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_LAST_NAME));
		WebElement newUserDOB = driver.findElement(By.xpath(OR.RALLY_NEW_USER_DOB));
		WebElement newUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMPLOYEE_ID));
		WebElement newUserClientID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_CLIENT_ID));
		WebElement newUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_NEW_USER_GROUP_NUMBER));
		WebElement newUserMemberID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_MEMBER_ID));
		clearAndType(newUserEmail, Directory.Rally_TestPage_DefaultSubdomain_Email);
		String timeStamp = new SimpleDateFormat("MMmmss").format(Calendar.getInstance().getTime());
		int milli = Calendar.getInstance().get(Calendar.MILLISECOND);
		int milli1 = Calendar.getInstance().get(Calendar.MILLISECOND);
		RallyID = timeStamp+milli+milli1;
		System.out.println("Current Time: "+RallyID);
		clearAndType(newUserRallyID, RallyID);
		clearAndType(newUserFirstName, Directory.Rally_TestPage_DefaultSubdomain_First_Name);
		clearAndType(newUserLastName, Directory.Rally_TestPage_DefaultSubdomain_Last_Name);
		clearAndType(newUserDOB, Directory.Rally_TestPage_DefaultSubdomain_DOB);
		clearAndType(newUserEmployeeID, Directory.Rally_TestPage_DefaultSubdomain_Employee_ID);
		clearAndType(newUserClientID, Directory.Rally_TestPage_DefaultSubdomain_Client_ID);
		clear(newUserGroupNumber);
		clear(newUserMemberID);
	}

	/**
	 * Name : VIGNESHRAJ.M
	 * Created Date:   07/Mar/17
	 * Modified Date:
	 * Description : Created a common method to Retrieve Ideal member from DataBase
	 * Ticket ID :
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public static Object retrieveMemberDetailsWithRallyID(WebDriver driver) throws ClassNotFoundException, SQLException
	{
		String port =Directory.Oracle_Port;
		String database_name= Directory.Oracle_Databasename;
		String user = Directory.Oracle_User;
		String pass = Directory.Oracle_Pass;
		String hostname =Directory.Oracle_Hostname;
		String url ="jdbc:oracle:thin:@"+hostname+":"+port+":"+database_name+"";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection success");
		Statement stat=conn.createStatement();
		String Rallyid="%"+RallyID+"%";
		ResultSet rs = stat.executeQuery("select MAP_SYSTEM_NAME from account_identity_map where MAP_SYSTEM_NAME like '"+Rallyid+"'");
		System.out.println("query executed");
		String memberDetails="";
		while(rs.next())
		{
			memberDetails  = rs.getString("MAP_SYSTEM_NAME");
		}
		System.out.println("Retrieved Ideal member from DB is "+memberDetails);
		String[] memberDetailsSplit=memberDetails.split(",");
		String groupNumber= memberDetailsSplit[6];
		String memberID=memberDetailsSplit[7];
		String[] groupNumberSplit= groupNumber.split(":");
		String[] memberIDSplit= memberID.split(":");
		String grpID= groupNumberSplit[1];
		String memID= memberIDSplit[1];
		System.out.println("Group number"+grpID);
		System.out.println("member ID"+memID);
		String Null= "\"\"";
		if(grpID.equalsIgnoreCase(Null)&&memID.equalsIgnoreCase(Null))
		{
			System.out.println("Both the values match each other");
		}
		else if(!grpID.equalsIgnoreCase(Null)&&!memID.equalsIgnoreCase(Null))
		{
			System.out.println("Both the values match each other");
			Assert.fail();
		}
		return memberDetails;
	}

	/**
	 * Name :     VIGNESHRAJ.M
	 * Created Date:   17/July/17
	 * Modified Date:
	 * Description : Created a common method to update the T&C for RallyUser
	 * Ticket ID :
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public static String updateRallyTaCForTaCPopUp(WebDriver driver) throws ClassNotFoundException, SQLException
	{
		String port = Directory.Oracle_Port;
		String database_name=Directory.Oracle_Databasename;
		String user = Directory.Oracle_User;
		String pass = Directory.Oracle_Pass;
		String hostname =Directory.Oracle_Hostname;
		String url ="jdbc:oracle:thin:@"+hostname+":"+port+":"+database_name+"";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection success");
		Statement stat=conn.createStatement();
		String sql="update  ORG_MP_DOCUMENT set IS_ACTIVE ='0', IS_DELETED ='1' where ORG_MP_SETTINGS_ID =(SELECT ID FROM ORG_MP_SETTING WHERE MAST_PROGRAM_ID='02' AND ORGANIZATION_ID='02') and IS_ACTIVE ='1' and IS_DELETED ='0' and CATEGORY ='TAC'";
		stat.executeQuery(sql);
		stat.executeQuery("COMMIT");
		System.out.println("Null");
		String Message="TAC for Rally Updated";
		return Message;
	}

	/**
	 * Name :     VIGNESHRAJ.M
	 * Created Date:   17/July/17
	 * Modified Date:
	 * Description : Created a common method to update the T&C for RallyUser
	 * Ticket ID :
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public static String insertRallyTaCForTaCPopUp(WebDriver driver) throws ClassNotFoundException, SQLException
	{
		String port = Directory.Oracle_Port;
		String database_name=Directory.Oracle_Databasename;
		String user = Directory.Oracle_User;
		String pass = Directory.Oracle_Pass;
		String hostname =Directory.Oracle_Hostname;
		String url ="jdbc:oracle:thin:@"+hostname+":"+port+":"+database_name+"";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection success");
		Statement stat=conn.createStatement();
		String sql="INSERT into ORG_MP_DOCUMENT (VERSION, CONTENT_TYPE, CATEGORY, ORG_MP_SETTINGS_ID, HTML_CONTENT, IS_Default) VALUES('1.0,2.0 ', 'text/html', 'TAC', (SELECT ID FROM ORG_MP_SETTING WHERE MAST_PROGRAM_ID='02' AND ORGANIZATION_ID='02'),'<div> RA-PE Test TAC pop up</div>','1')";
		stat.executeUpdate(sql);
		stat.executeQuery("COMMIT");
		System.out.println("Null");
		String Message="TAC for Rally Inserted";
		return Message;
	}
	/**
	 * Name :Vinothkumar.M
	 * Created Date:18/July/17
	 * Modified Date:
	 * Description : Created a common method to Member completes enrollment with same email after light weight account is created
	 * Ticket ID :
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public static Object retrieveMemberEnrollMentWithSameEmailAfterLightWeightAccountIsCreated(WebDriver driver) throws ClassNotFoundException, SQLException
	{
		String port =Directory.Oracle_Port;
		String database_name= Directory.Oracle_Databasename;
		String user = Directory.Oracle_User;
		String pass = Directory.Oracle_Pass;
		String hostname =Directory.Oracle_Hostname;
		String url ="jdbc:oracle:thin:@"+hostname+":"+port+":"+database_name+"";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection success");
		Statement stat=conn.createStatement();
		String memberEmail=Directory.Rally_TestPage_DefaultSubdomain_Email;
		ResultSet rs = stat.executeQuery("select * from ACCOUNT_IDENTITY_MAP where ACCOUNT_ID=(select id from account where email = '"+memberEmail+"')");
		System.out.println("query executed");
		String memberDetails="";
		while(rs.next())
		{
			memberDetails  = rs.getString("MAP_SYSTEM_NAME");
		}
		System.out.println("Retrieved Rally member from DB is "+memberDetails);
		String[] memberDetailsSplit=memberDetails.split(",");
		String email= memberDetailsSplit[3];
		String[] emailSplit= email.split(":");
		String emailSplit1= emailSplit[1];
		String[] emailSplit11=emailSplit1.split("\"");
		String emailSplit12= emailSplit11[1];
		System.out.println("Member Email"+emailSplit12);

		if(emailSplit12.equalsIgnoreCase(memberEmail))
		{
			System.out.println("Both the values match each other");
		}
		else if(!emailSplit12.equalsIgnoreCase(memberEmail))
		{
			System.out.println("Both the values are not match each other");
			Assert.fail();
		}
		return memberDetails;
	}

	/** Name :Vinothkumar.M
	 * Created Date:7/Jul/2017
	 * Modified Date:
	 * Description :  Created common method to Created common method to fill the RA member credentials at Rally test page
	 * Required Inputs :
	 */
	public static void raNewUserCredentialsForRallyTestPage(WebDriver driver) 
	{
		WebElement newUserRallyID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_RALLY_ID));
		WebElement newUserFirstName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_FIRST_NAME));
		WebElement newUserLastName = driver.findElement(By.xpath(OR.RALLY_NEW_USER_LAST_NAME));
		WebElement newUserDOB = driver.findElement(By.xpath(OR.RALLY_NEW_USER_DOB));
		WebElement newUserEmployeeID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_EMPLOYEE_ID));
		WebElement newUserClientID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_CLIENT_ID));
		WebElement newUserGroupNumber = driver.findElement(By.xpath(OR.RALLY_NEW_USER_GROUP_NUMBER));
		WebElement newUserMemberID = driver.findElement(By.xpath(OR.RALLY_NEW_USER_MEMBER_ID));
		String timeStamp = new SimpleDateFormat("MMmmss").format(Calendar.getInstance().getTime());
		int milli = Calendar.getInstance().get(Calendar.MILLISECOND);
		int milli1 = Calendar.getInstance().get(Calendar.MILLISECOND);
		RallyID = timeStamp+milli+milli1;
		System.out.println("Current Time: "+RallyID);
		clearAndType(newUserRallyID, RallyID);
		clearAndType(newUserFirstName, Directory.Rally_TestPage_DefaultSubdomain_First_Name);
		clearAndType(newUserLastName, Directory.Rally_TestPage_DefaultSubdomain_Last_Name);
		clearAndType(newUserDOB, Directory.Rally_TestPage_DefaultSubdomain_DOB);
		clearAndType(newUserEmployeeID, Directory.Rally_TestPage_DefaultSubdomain_Employee_ID);
		clear(newUserClientID);
		clearAndType(newUserGroupNumber, Directory.Rally_TestPage_CustomSubdomain3_Group_Number);
		clearAndType(newUserMemberID, Directory.Rally_TestPage_CustomSubdomain3_Member_ID);
	}

	/** Name :VINOTHKUMAR.M
	 * Created Date:20/Jul/2017
	 * Modified Date:
	 * Description : Created common method to Retrieve Rally Member Account ID from email
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static String Accountid;
	public static String retrieveRallyMemberAccountIdFromEmail(WebDriver driver, String testData) throws ClassNotFoundException, SQLException
	{
		String port = Directory.Oracle_Port;
		String database_name= Directory.Oracle_Databasename;
		String user = Directory.Oracle_User;
		String pass = Directory.Oracle_Pass;
		String hostname =Directory.Oracle_Hostname;
		String url ="jdbc:oracle:thin:@"+hostname+":"+port+":"+database_name+"";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection success");
		Statement stat=conn.createStatement();
		ResultSet rs = stat.executeQuery("select ID from ACCOUNT where EMAIL ='"+testData+"'");
		System.out.println("query executed");
		if(rs.next())
		{
			Accountid= rs.getString("ID");
			System.out.println("Member Account id "+Accountid+" is retrieved from the Table");
		}
		return Accountid;
	}

	/** Name :VINOTHKUMAR.M
	 * Created Date:20/Jul/2017
	 * Modified Date:
	 * Description : Created common method to Verify Account data accessed table Account ID is null
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static String verifyAccountDataAccessedTableAccountIDIsNull(WebDriver driver) throws ClassNotFoundException, SQLException
	{
		String port = Directory.Oracle_Port;
		String database_name= Directory.Oracle_Databasename;
		String user = Directory.Oracle_User;
		String pass = Directory.Oracle_Pass;
		String hostname =Directory.Oracle_Hostname;
		String url ="jdbc:oracle:thin:@"+hostname+":"+port+":"+database_name+"";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection success");
		Statement stat=conn.createStatement();
		ResultSet rs = stat.executeQuery("select * from ACCOUNT_DATA_ACCESSED_LOG where lower(ACTIVITY) =lower('View Rally Payload') order by created_dt desc");
		System.out.println("query executed");
		String accountdataAccessedTableAccountid="";
		if(rs.next())
		{
			accountdataAccessedTableAccountid= rs.getString("ACCOUNT_ID");
			System.out.println("Account id "+accountdataAccessedTableAccountid+" is retrieved from the Table");

			if(accountdataAccessedTableAccountid==null)
			{
				System.out.println("Account data accessed table Account ID is null"+accountdataAccessedTableAccountid);
			}
		}
		return accountdataAccessedTableAccountid;
	}
	
	/** Name :VINOTHKUMAR.M
	 * Created Date:20/Jul/2017
	 * Modified Date:
	 * Description : Created common method to Verify Account data accessed table Account ID is populated
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static String verifyAccountDataAccessedTableAccountIDIsPopulated(WebDriver driver) throws ClassNotFoundException, SQLException
	{
		String port = Directory.Oracle_Port;
		String database_name= Directory.Oracle_Databasename;
		String user = Directory.Oracle_User;
		String pass = Directory.Oracle_Pass;
		String hostname =Directory.Oracle_Hostname;
		String url ="jdbc:oracle:thin:@"+hostname+":"+port+":"+database_name+"";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection success");
		Statement stat=conn.createStatement();
		ResultSet rs = stat.executeQuery("select * from ACCOUNT_DATA_ACCESSED_LOG where lower(ACTIVITY) =lower('View Rally Payload') order by created_dt desc");
		System.out.println("query executed");
		String accountdataAccessedTableAccountid="";
		
		if(rs.next())
		{
			accountdataAccessedTableAccountid= rs.getString("ACCOUNT_ID");
			System.out.println("Account id "+accountdataAccessedTableAccountid+" is retrieved from the Table");
		}
		
		if(accountdataAccessedTableAccountid.equalsIgnoreCase(Accountid))
		{
			System.out.println("Account data accessed table Account ID is Populated"+accountdataAccessedTableAccountid);
		}
		
		return accountdataAccessedTableAccountid;
	}
	
	/** Name :VIGNESHRAJ.M
	 * Created Date:20/Jul/2017
	 * Modified Date:
	 * Description : Created common method to Verify Account data accessed table Account ID is populated
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static String retrieveAccountIDForRallyMemberWithRallyEmail(WebDriver driver,String mail) throws ClassNotFoundException, SQLException
	{
		String port = Directory.Oracle_Port;
		String database_name= Directory.Oracle_Databasename;
		String user = Directory.Oracle_User;
		String pass = Directory.Oracle_Pass;
		String hostname =Directory.Oracle_Hostname;
		String url ="jdbc:oracle:thin:@"+hostname+":"+port+":"+database_name+"";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection success");
		Statement stat=conn.createStatement();
		ResultSet rs = stat.executeQuery("select * from Account where Email like '"+mail+"'");
		System.out.println("query executed");
		String accountID="";
		
		if(rs.next())
		{
			accountID= rs.getString("ID");
			System.out.println("Account id "+accountID+" is retrieved from the Table");
		}
		return accountID;
		
	}
	
	/**
	 * Name :     VIGNESHRAJ.M
	 * Created Date:   17/July/17
	 * Modified Date:
	 * Description : Created a common method to update the T&C for RallyUser
	 * Ticket ID :
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public static String updateRallyExistingNotLinkToLinkedUsingDB(WebDriver driver,String accountID) throws ClassNotFoundException, SQLException
	{
		String port = Directory.Oracle_Port;
		String database_name=Directory.Oracle_Databasename;
		String user = Directory.Oracle_User;
		String pass = Directory.Oracle_Pass;
		String hostname =Directory.Oracle_Hostname;
		String url ="jdbc:oracle:thin:@"+hostname+":"+port+":"+database_name+"";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("connection success");
		Statement stat=conn.createStatement();
		String sql="UPDATE ACCOUNT_IDENTITY_MAP SET IS_DELETED = 0 WHERE ACCOUNT_ID ='"+accountID+"' AND MAP_SYSTEM_ACCOUNT_CODE='"+RallyID+"'";
		stat.executeQuery(sql);
		stat.executeQuery("COMMIT");
		System.out.println("Null");
		String Message="Updated Existing not linked to Linked";
		return Message;
	}
	
}
