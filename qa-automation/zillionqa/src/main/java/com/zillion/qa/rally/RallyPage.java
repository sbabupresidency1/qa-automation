package com.zillion.qa.rally;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.zillion.qa.commands.Manipulation;
import com.zillion.qa.commands.Navigate;
import com.zillion.qa.utils.Directory;

public class RallyPage extends Manipulation implements OR {

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to delete the Auth credentials for the existing member
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static String deleteAuthUserCredentialsForRallyMember(WebDriver driver) throws ClassNotFoundException, SQLException, java.text.ParseException
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
		String memberEmail=Directory.Rally_TestPage_DefaultSubdomain_Email;
		System.out.println(memberEmail);
		PreparedStatement st = conn.prepareStatement("delete from AUTH_USER_CREDENTIALS where COMMON_USER_ID in(select id from account where lower(email)=lower('"+memberEmail+"'))");
	    st.executeUpdate();
	    Statement stat=conn.createStatement();
	    stat.executeQuery("COMMIT");
	    System.out.println("Rows deleted: "+st);
	    return memberEmail;
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to delete the Auth credentials for the existing member
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static void deleteAccountMemberEmailForRallyMember(WebDriver driver) throws ClassNotFoundException, SQLException, java.text.ParseException
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
		String memberEmail=Directory.Rally_TestPage_DefaultSubdomain_Email;
		System.out.println(memberEmail);
		PreparedStatement st = conn.prepareStatement("delete from account where email in (select email from account where lower(email)=lower('"+memberEmail+"'))");
	    st.executeUpdate();
	    Statement stat=conn.createStatement();
	    stat.executeQuery("COMMIT");
	    System.out.println("Rows deleted: "+st);
	}

	/**
	 * Name :   Vinothkumar.M
	 * Created Date: 22/June/2017
	 * Modified Date:
	 * Description :Create a Common method for Rally URL
	 * Ticket ID :
	 * Required Inputs :
	 *
	 */

	public static void launchRallyUrl(WebDriver driver)
	{

		Navigate.get(driver, Directory.Rally_Url);
	}

	/**
	 * Name :Vinothkumar.M
	 * Created Date:   22JUN/17
	 * Modified Date:
	 * Description : Create a common method for Rally member login
	 * Ticket ID :
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public static String rallyMemberLoginUser(WebDriver driver)
	{
		com.zillion.qa.rally.RallyPage.launchRallyUrl(driver);
		wait(driver, "5");
		WebElement rallyUsername = driver.findElement(By.xpath(OR.RALLY_MEMBER_LANDINGPAGE_USERNAME));
		sendKeys(rallyUsername, Directory.Rally_Member_Username1);
		WebElement rallyPassword = driver.findElement(By.xpath(OR.RALLY_MEMBER_LANDINGPAGE_PASSWORD));
		sendKeys(rallyPassword, Directory.Rally_Member_Password1);
		WebElement letsGoButton = driver.findElement(By.xpath(OR.RALLY_MEMBER_LETS_GO_BUTTON));
		click(letsGoButton);
		wait(driver, "5");
		return ElementWait;

	}
	
	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method verify FirstName, LastName and Email modification for the Member Profile
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static String retrieveFirstNameLastNameModifiedInMemberProfile(WebDriver driver, String memEmail, String FirstName,String LastName) throws ClassNotFoundException, SQLException
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
		ResultSet rs = stat.executeQuery("select FIRST_NAME, LAST_NAME, EMAIL from account where Email like '"+memEmail+"'");
		System.out.println("query executed");
		String email="";
		String FName="";
		String LName="";
		if(rs.next())
		{
			email= rs.getString("EMAIL");
			FName= rs.getString("FIRST_NAME");
			LName= rs.getString("LAST_NAME");
			if(memEmail.equalsIgnoreCase(email)&&FirstName.equalsIgnoreCase(FName)&&LastName.equalsIgnoreCase(LName))
			{
				System.out.println("FirstName, LastName and Email match eachother");
			}
			else if(!memEmail.equalsIgnoreCase(email)&&!FirstName.equalsIgnoreCase(FName)&&!LastName.equalsIgnoreCase(LName))
			{
				Assert.fail();
			}
		}
		return email;
	}
	
	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to delete the Auth credentials for the existing member CustomSubDomain-1
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static String deleteAuthUserCustomSubDomain1ForRallyMember(WebDriver driver) throws ClassNotFoundException, SQLException, java.text.ParseException
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
		String memberEmail=Directory.Rally_TestPage_CustomSubdomain1_Email;
		System.out.println(memberEmail);
		PreparedStatement st = conn.prepareStatement("delete from AUTH_USER_CREDENTIALS where COMMON_USER_ID in(select id from account where lower(email)=lower('"+memberEmail+"'))");
	    st.executeUpdate();
	    Statement stat=conn.createStatement();
	    stat.executeQuery("COMMIT");
	    System.out.println("Rows deleted: "+st);
	    return memberEmail;
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:22/Jun/2017
	 * Modified Date:
	 * Description :   Created common method to delete the Account for the existing member CutomSubDomain-1
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static void deleteAccountMemberEmailForCustomSubDomain1RallyMember(WebDriver driver) throws ClassNotFoundException, SQLException, java.text.ParseException
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
		String memberEmail=Directory.Rally_TestPage_CustomSubdomain1_Email;
		System.out.println(memberEmail);
		PreparedStatement st = conn.prepareStatement("delete from account where email in (select email from account where lower(email)=lower('"+memberEmail+"'))");
	    st.executeUpdate();
	    Statement stat=conn.createStatement();
	    stat.executeQuery("COMMIT");
	    System.out.println("Rows deleted: "+st);
	}
	
	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:05/Jul/2017
	 * Modified Date:
	 * Description :   Created common method to delete the Auth credentials for the existing member
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static String deleteAuthUserCustomSubDomain2ForRallyMember(WebDriver driver) throws ClassNotFoundException, SQLException, java.text.ParseException
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
		String memberEmail=Directory.Rally_TestPage_CustomSubdomain2_Email;
		System.out.println(memberEmail);
		PreparedStatement st = conn.prepareStatement("delete from AUTH_USER_CREDENTIALS where COMMON_USER_ID in(select id from account where lower(email)=lower('"+memberEmail+"'))");
	    st.executeUpdate();
	    Statement stat=conn.createStatement();
	    stat.executeQuery("COMMIT");
	    System.out.println("Rows deleted: "+st);
	    return memberEmail;
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:05/Jul/2017
	 * Modified Date:
	 * Description :   Created common method to delete the Auth credentials for the existing member
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static void deleteAccountMemberEmailForCustomSubDomain2RallyMember(WebDriver driver) throws ClassNotFoundException, SQLException, java.text.ParseException
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
		String memberEmail=Directory.Rally_TestPage_CustomSubdomain2_Email;
		System.out.println(memberEmail);
		PreparedStatement st = conn.prepareStatement("delete from account where email in (select email from account where lower(email)=lower('"+memberEmail+"'))");
	    st.executeUpdate();
	    Statement stat=conn.createStatement();
	    stat.executeQuery("COMMIT");
	    System.out.println("Rows deleted: "+st);
	}
	
	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:05/Jul/2017
	 * Modified Date:
	 * Description :   Created common method to delete the Auth credentials for the existing member
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static String deleteAuthUserCustomSubDomain3ForRallyMember(WebDriver driver) throws ClassNotFoundException, SQLException, java.text.ParseException
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
		String memberEmail=Directory.Rally_TestPage_CustomSubdomain3_Email;
		System.out.println(memberEmail);
		PreparedStatement st = conn.prepareStatement("delete from AUTH_USER_CREDENTIALS where COMMON_USER_ID in(select id from account where lower(email)=lower('"+memberEmail+"'))");
	    st.executeUpdate();
	    Statement stat=conn.createStatement();
	    stat.executeQuery("COMMIT");
	    System.out.println("Rows deleted: "+st);
	    return memberEmail;
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:05/Jul/2017
	 * Modified Date:
	 * Description :   Created common method to delete the Auth credentials for the existing member
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static void deleteAccountMemberEmailForCustomSubDomain3RallyMember(WebDriver driver) throws ClassNotFoundException, SQLException, java.text.ParseException
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
		String memberEmail=Directory.Rally_TestPage_CustomSubdomain3_Email;
		System.out.println(memberEmail);
		PreparedStatement st = conn.prepareStatement("delete from account where email in (select email from account where lower(email)=lower('"+memberEmail+"'))");
	    st.executeUpdate();
	    Statement stat=conn.createStatement();
	    stat.executeQuery("COMMIT");
	    System.out.println("Rows deleted: "+st);
	}
	
	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:05/Jul/2017
	 * Modified Date:
	 * Description :   Created common method to delete the Auth credentials for the existing member
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static String deleteAuthUserCustomSubDomain4ForRallyMember(WebDriver driver) throws ClassNotFoundException, SQLException, java.text.ParseException
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
		String memberEmail=Directory.Rally_TestPage_CustomSubdomain4_Email;
		System.out.println(memberEmail);
		PreparedStatement st = conn.prepareStatement("delete from AUTH_USER_CREDENTIALS where COMMON_USER_ID in(select id from account where lower(email)=lower('"+memberEmail+"'))");
	    st.executeUpdate();
	    Statement stat=conn.createStatement();
	    stat.executeQuery("COMMIT");
	    System.out.println("Rows deleted: "+st);
	    return memberEmail;
	}

	/**
	 * Name :VIGNESHRAJ.M
	 * Created Date:05/Jul/2017
	 * Modified Date:
	 * Description :   Created common method to delete the Auth credentials for the existing member
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static void deleteAccountMemberEmailForCustomSubDomain4RallyMember(WebDriver driver) throws ClassNotFoundException, SQLException, java.text.ParseException
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
		String memberEmail=Directory.Rally_TestPage_CustomSubdomain4_Email;
		System.out.println(memberEmail);
		PreparedStatement st = conn.prepareStatement("delete from account where email in (select email from account where lower(email)=lower('"+memberEmail+"'))");
	    st.executeUpdate();
	    Statement stat=conn.createStatement();
	    stat.executeQuery("COMMIT");
	    System.out.println("Rows deleted: "+st);
	}
	/**
	 * Name :VINOTHKUMAR.M
	 * Created Date:18/Jul/2017
	 * Modified Date:
	 * Description : Created common method to Existing linked: Check db records when Rally email and RA email addresses are updated after linking
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static String retrieveEmailModifiedInMemberProfile(WebDriver driver, String memEmail) throws ClassNotFoundException, SQLException
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
		ResultSet rs = stat.executeQuery("select * from account where email='"+memEmail+"'");
		System.out.println("query executed");
		String email="";
		if(rs.next())
		{
			email= rs.getString("EMAIL");

			if(memEmail.equalsIgnoreCase(email))
			{
				   System.out.println("RA email addresses are updated after linking"+email);
			}
			else if(!memEmail.equalsIgnoreCase(email))
			{
				 System.out.println("RA email addresses are not updated after linking"+email);
				Assert.fail();
			}
		}
		return email;
	}
	
	/**
	 * Name :Vinothkumar.M
	 * Created Date:19/July/2017
	 * Modified Date:
	 * Description :   Created common method to delete the Auth credentials for the Real Appeal existing member
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static String deleteAuthUserCredentialsForRAMember(WebDriver driver,String memEmail) throws ClassNotFoundException, SQLException, java.text.ParseException
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
		System.out.println(memEmail);
		PreparedStatement st = conn.prepareStatement("delete from AUTH_USER_CREDENTIALS where COMMON_USER_ID in(select id from account where lower(email)=lower('"+memEmail+"'))");
	    st.executeUpdate();
	    Statement stat=conn.createStatement();
	    stat.executeQuery("COMMIT");
	    System.out.println("Rows deleted: "+st);
	    return memEmail;
	}

	/**
	 * Name :Vinothkumar.M
	 * Created Date:19/July/2017
	 * Modified Date:
	 * Description :   Created common method to delete the Auth credentials for the Real Appeal existing member
	 * Required Inputs :
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws java.text.ParseException
	 *
	 */
	public static void deleteAccountMemberEmailForRAMember(WebDriver driver,String memEmail) throws ClassNotFoundException, SQLException, java.text.ParseException
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
		System.out.println(memEmail);
		PreparedStatement st = conn.prepareStatement("delete from account where email in (select email from account where lower(email)=lower('"+memEmail+"'))");
	    st.executeUpdate();
	    Statement stat=conn.createStatement();
	    stat.executeQuery("COMMIT");
	    System.out.println("Rows deleted: "+st);
	}

}

