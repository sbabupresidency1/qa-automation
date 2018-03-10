package com.zillion.qa.rally;

public interface OR 
{
	public final String RALLY_NEW_USER_BUTTON="//button[contains(text(),'Rally New User')]";
	public final String RALLY_EXISTING_LINKED_USER_BUTTON="//button[contains(text(),'Rally Existing Linked User')]";
	public final String RALLY_EXISTING_NOT_LINKED_USER_BUTTON="//button[contains(text(),'Rally Existing Not Linked User')]";

	public final String RALLY_NEW_USER_EMAIL="//label[contains(text(),'Email')]//following::td//input[@id='param01']";
	public final String RALLY_NEW_USER_RALLY_ID="//label[contains(text(),'Rally ID ')]//following::td//input[@id='param02']";
	public final String RALLY_NEW_USER_FIRST_NAME="//label[contains(text(),'FirstName')]//following::td//input[@id='param03']";
	public final String RALLY_NEW_USER_LAST_NAME="//label[contains(text(),'LastName')]//following::td//input[@id='param04']";
	public final String RALLY_NEW_USER_DOB="//label[contains(text(),'DOB')]//following::td//input[@id='param05']";
	public final String RALLY_NEW_USER_EMPLOYEE_ID="//label[contains(text(),'EmployeeID ')]//following::td//input[@id='param06']";
	public final String RALLY_NEW_USER_CLIENT_ID="//label[contains(text(),'ClientID ')]//following::td//input[@id='param07']";
	public final String RALLY_NEW_USER_GROUP_NUMBER="//label[contains(text(),'GroupNumber')]//following::td//input[@id='param08']";
	public final String RALLY_NEW_USER_MEMBER_ID="//label[contains(text(),'MemberID ')]//following::td//input[@id='param09']";

	public final String RALLY_EXISTING_LINKED_USER_EMAIL="//label[contains(text(),'Email')]//following::td//input[@id='param11']";
	public final String RALLY_EXISTING_LINKED_USER_RALLY_ID="//label[contains(text(),'Rally ID ')]//following::td//input[@id='param12']";
	public final String RALLY_EXISTING_LINKED_USER_FIRST_NAME="//label[contains(text(),'FirstName')]//following::td//input[@id='param13']";
	public final String RALLY_EXISTING_LINKED_USER_LAST_NAME="//label[contains(text(),'LastName')]//following::td//input[@id='param14']";
	public final String RALLY_EXISTING_LINKED_USER_DOB="//label[contains(text(),'DOB')]//following::td//input[@id='param15']";
	public final String RALLY_EXISTING_LINKED_USER_EMPLOYEE_ID="//label[contains(text(),'EmployeeID ')]//following::td//input[@id='param16']";
	public final String RALLY_EXISTING_LINKED_USER_CLIENT_ID="//label[contains(text(),'ClientID ')]//following::td//input[@id='param17']";
	public final String RALLY_EXISTING_LINKED_USER_GROUP_NUMBER="//label[contains(text(),'GroupNumber')]//following::td//input[@id='param18']";
	public final String RALLY_EXISTING_LINKED_USER_MEMBER_ID="//label[contains(text(),'MemberID ')]//following::td//input[@id='param19']";
	
	public final String RALLY_EXISTING_NOT_LINKED_USER_EMAIL="//label[contains(text(),'Email')]//following::td//input[@id='param21']";
	public final String RALLY_EXISTING_NOT_LINKED_USER_RALLY_ID="//label[contains(text(),'Rally ID ')]//following::td//input[@id='param22']";
	public final String RALLY_EXISTING_NOT_LINKED_USER_FIRST_NAME="//label[contains(text(),'FirstName')]//following::td//input[@id='param23']";
	public final String RALLY_EXISTING_NOT_LINKED_USER_LAST_NAME="//label[contains(text(),'LastName')]//following::td//input[@id='param24']";
	public final String RALLY_EXISTING_NOT_LINKED_USER_DOB="//label[contains(text(),'DOB')]//following::td//input[@id='param25']";
	public final String RALLY_EXISTING_NOT_LINKED_USER_EMPLOYEE_ID="//label[contains(text(),'EmployeeID ')]//following::td//input[@id='param26']";
	public final String RALLY_EXISTING_NOT_LINKED_USER_CLIENT_ID="//label[contains(text(),'ClientID ')]//following::td//input[@id='param27']";
	public final String RALLY_EXISTING_NOT_LINKED_USER_GROUP_NUMBER="//label[contains(text(),'GroupNumber')]//following::td//input[@id='param28']";
	public final String RALLY_EXISTING_NOT_LINKED_USER_MEMBER_ID="//label[contains(text(),'MemberID ')]//following::td//input[@id='param29']";
	
	public final String RALLY_MEMBER_LANDINGPAGE_USERNAME="//input[@id='loginEmail']";
	public final String RALLY_MEMBER_LANDINGPAGE_PASSWORD="//input[@id='loginPassword']";
	public final String RALLY_MEMBER_LETS_GO_BUTTON="//button[@id='submitBtn']";
	public final String RA_MEMBER_EMAIL="//input[@id='signup_Email_Textbox']";
	public final String RA_MEMBER_CONFIRM_EMAIL="//input[@id='signup_ConfirmEmail_Textbox']";
	public final String RA_MEMBER_DOBMONTH="//select[@id='dobMonth']";
	public final String RA_MEMBER_DOBDAY="//select[@id='dobDay']";
	public final String RA_MEMBER_DOBYEAR="//select[@id='dobYear']";
	public final String RA_MEMBER_FIRSTNAME="//input[@id='security_firstName']";
	public final String RA_MEMBER_LASTNAME="//input[@id='security_lastName']";
	public final String RA_MEMBER_INSURANCEPROVIDER="//input[@id='insuranceProvider']";
	public final String RA_MEMBER_MEMBERID="//input[@id='memberId']";
	public final String RA_MEMBER_GROUPNUMBER="//input[@id='groupNumber']";
	public final String RA_INSURANCE_AUTO_SUGGEST="//li[contains(@id,'typeahead')]//a";
	
	public final String HFOPS_RALLY_MEMBER_PROFILE_LINK_TO_RALLY_BUTTON="//a[contains(text(),'Link To Rally')]";
	public final String HFOPS_RALLY_MEMBER_PROFILE_LINK_MEMBER_TO_RALLY_HEADER="//b[contains(text(),'Link Member To Rally')]";
	public final String HFOPS_RALLY_MEMBER_PROFILE_RALLY_ID_LABEL="//label[contains(text(),' Rally Id')]";
	public final String HFOPS_RALLY_MEMBER_PROFILE_RALLY_ID_TEXTBOX="//input[@id='rallyId']";
	public final String HFOPS_RALLY_MEMBER_PROFILE_RALLY_ID_LINK_BUTTON="//button[contains(text(),'Link')]";
	public final String HFOPS_RALLY_MEMBER_PROFILE_LINK_MEMBER_TO_RALLY_CLOSE_BUTTON="//div[@class='modal-header no-p']//div//span[@ng-click='close()']";
	public final String HFOPS_RALLY_MEMBER_PROFILE_MEMBER_LINKED_TO_RALLY_SUCCESSFULLY_MSG="//p[contains(text(),'Member Linked To Rally Successfully')]";
	public final String HFOPS_RALLY_MEMBER_PROFILE_MEMBER_LINKED_TO_RALLY_SUCCESSFULLY_OK_BUTTON="//button[contains(text(),'OK')]";

	public final String RALLY_MEMBER_LOGIN_I_AGREE_BUTTON="//button[@id='agreementAccept']";
	public final String RALLY_MEMBER_LOGIN_I_DISAGREE_BUTTON="//a[@id='agreementDecline']";

	
}
