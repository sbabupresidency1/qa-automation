package com.zillion.qa.preventT2.member;
import java.sql.SQLException;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.zillion.qa.commands.Manipulation;
import com.zillion.qa.commands.Navigate;
import com.zillion.qa.utils.Directory;
public class Profile extends Manipulation implements OR {
	/**
	 * Created By:Suresh V
	 * Description:Verify 'View all photos link' and delete photo
	 * @param driver
	 */
	public static void verifyViewAllPhotosLink(WebDriver driver)
	{
		{
			try
			{
				jsClickByXPath(driver, OR.VIEW_ALL_PHOTOS_LINK_IN_HFOPS_MEMBER_PROFILE);
				wait(driver, "3");
				jsClickByXPath(driver, OR.T2_MEMBER_PROGRESS_PICTURE_VIEW_ALL_PHOTOS_BEFORE_PHOTO);
				wait(driver, "3");
				jsClickByXPath(driver, OR.T2_MEMBER_PROGRESS_PICTURE_BEFORE_PHOTO_DELETE_BUTTON);
				wait(driver, "3");
				jsClickByXPath(driver, OR.T2_MEMBER_PROGRESS_PICTURE_BEFORE_PHOTO_DELETE_CONFIRM_BUTTON);
				wait(driver, "2");
				jsClickByXPath(driver, OR.T2_MEMBER_PROGRESS_PICTURE_BEFORE_PHOTO_DETAIL_CLOSE_BUTTON);
				wait(driver, "3");
				jsClickByXPath(driver, OR.T2_MEMBER_PROGRESS_PICTURE_VIEW_ALL_PHOTOS_CLOSE_BUTTON);
				wait(driver, "2");
				WebElement viewAllPhotosLink= driver.findElement(By.xpath(OR.VIEW_ALL_PHOTOS_LINK_IN_HFOPS_MEMBER_PROFILE));
				verifyElementIsNotPresent(driver,viewAllPhotosLink);
			}
			catch(Exception e)
			{
				System.out.println("View all photos link is not available");
			}
		}
	}
	/**
	 * Name :     SURESH V
	 * Created Date:   03/July/17
	 * Modified Date:
	 * Description : Create a common method to retrieve Member who is scheduled group session
	 * Required Inputs :  Member URL, Username and Password
	 * @throws ParseException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public static String scheduledPreventT2MemberLogin(WebDriver driver,String result) throws ClassNotFoundException, ParseException, SQLException
	{
		String memberEmail[]=result.split(",");
		String retrievedscheduleAvailableMemberEmail=memberEmail[0];
		wait(driver, "5");
		System.out.println("Retrieved member is: " +retrievedscheduleAvailableMemberEmail);
		Navigate.get(driver, Directory.RA_Member_Url);
		wait(driver, "5");
		Navigate.maximize(driver);
		wait(driver, "5");
		WebElement  username = driver.findElement(By.xpath(OR.T2_MEMBER_LANDINGPAGE_USERNAME));
		sendKeys(username, Directory.RA_Member_Username1);
		WebElement  password = driver.findElement(By.xpath(OR.T2_MEMBER_LOGIN_PASSWORD));
		sendKeys(password, Directory.RA_Member_Password1);
		WebElement  loginButton = driver.findElement(By.xpath(OR.RA_MEMBER_LOGIN_BUTTON));
		click(loginButton);
		return retrievedscheduleAvailableMemberEmail;
	}
	
	/**
	 * Name :     SURESH V
	 * Created Date:   04/July/17
	 * Modified Date:
	 * Description : Create a common method to retrieve Member who is retrieved from DB
	 * Required Inputs :  Member URL, Username and Password
	 * @throws ParseException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public static String preventT2RetrievedDBMemberLogin(WebDriver driver,String result) throws ClassNotFoundException, ParseException, SQLException
	{
		String memberEmail[]=result.split(",");
		String retrievedscheduleAvailableMemberEmail=memberEmail[0];
		wait(driver, "5");
		System.out.println("Retrieved member is: " +retrievedscheduleAvailableMemberEmail);
		Navigate.get(driver, Directory.RA_Member_Url);
		wait(driver, "5");
		Navigate.maximize(driver);
		wait(driver, "5");
		WebElement  username = driver.findElement(By.xpath(OR.T2_MEMBER_LANDINGPAGE_USERNAME));
		sendKeys(username, retrievedscheduleAvailableMemberEmail);
		WebElement  password = driver.findElement(By.xpath(OR.T2_MEMBER_LOGIN_PASSWORD));
		sendKeys(password, Directory.RA_Member_Password1);
		WebElement  loginButton = driver.findElement(By.xpath(OR.RA_MEMBER_LOGIN_BUTTON));
		click(loginButton);
		return retrievedscheduleAvailableMemberEmail;
	}
}
