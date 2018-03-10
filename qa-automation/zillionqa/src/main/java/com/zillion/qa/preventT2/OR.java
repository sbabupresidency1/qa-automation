package com.zillion.qa.preventT2;

public interface OR {
	public final String GUERRILLA_MAIL_DROPDOWN="//select[@id='gm-host-select']";
	public final String GUERRILLA_MAIL_EDIT_BUTTON="//span[@id='inbox-id']";
	public final String GUERRILLA_MAIL_TEXTBOX="//span//input[@type='text']";
	public final String GUERRILLA_MAIL_SET_BUTTON="//button[contains(text(),'Set')]";
	public final String RA_MEMBER_LASTNAME="//input[@id='security_lastName']";
	public final String RA_MEMBER_DOBMONTH="//select[@id='dobMonth']";
	public final String RA_MEMBER_DOBDAY="//select[@id='dobDay']";
	public final String RA_MEMBER_DOBYEAR="//select[@id='dobYear']";
	public final String GUERRILLA_MAIL_PREVENT_T2_WELCOME_MESSAGE="//td[contains(text(),'Welcome to Real Appeal')]";
	public final String GUERRILLA_MAIL_GENERATED_LINK="//a[contains(text(),'Complete Your Registration')]";
	public final String GUERRILLA_MAIL_COMPLETE_LINK="//a[contains(text(),'Registration complete')]";
	public final String GUERRILLA_MAIL_CONGRATULATION_MESSAGE="//div[contains(text(),'Congratulations! You have completed your Registration successfully.')]";
	public final String GUERRILLA_MAIL_WELCOME_MESSAGE_VSPN="//*[contains(text(),'Welcome to your VSPN Patient Journey')]";
	public final String GUERRILLA_MAIL_GENERATED_LINK_VSPN="//a[contains(text(),'Click here to complete your remaining enrollment process')]";
	public final String GUERRILLA_MAIL_WELCOME_TO_RA_LINK="//a[contains(text(),'Welcome to Real Appeal')]";
	public final String RA_MEMBER_STEP1_NEXTBUTTON_ENABLED="//button[text()='Next Step']";
	public final String PREVENT_T2_ENROLLMENT_PASSWORD_TEXTBOX="//input[@id='obfuscatedPW']";
	public final String PREVENT_T2_ENROLLMENT_SECURITY_DROPDOWN="//select[@id='secureQuestion']";
	public final String PREVENT_T2_ENROLLMENT_SECURITY_ANSWER_TEXTBOX="//input[@id='secureAnswer']";
	public final String PREVENT_T2_ENROLLMENT_SCREENNAME_TEXTBOX="//input[@id='security_screenName']";
	public final String PREVENT_T2_ENROLLMENT_ACCEPT_CHECKBOX="//label[@id='signup_UserInformationPolicy_Checkbox_Label']";
	public final String PREVENT_T2_ENROLLMENT_SUBMIT_BUTTON="//button[@id='enrollmentCredentialsFormSubmitBtn']";
	public final String PREVENT_T2_ENROLLMENT_SELECT_GENDER="//input[@id='genderSelect1']";
	public final String PREVENT_T2_ENROLLMENT_CURRENT_WEIGHT_TEXTBOX="//input[@id='currentWeight']";
	public final String PREVENT_T2_ENROLLMENT_TARGET_WEIGHT_TEXTBOX="//input[@id='targetWeight']";
	public final String PREVENT_T2_ENROLLMENT_HEIGHTFOOT_TEXTBOX="//input[@id='heightFoot']";
	public final String PREVENT_T2_ENROLLMENT_HEIGHTINCH_TEXTBOX="//input[@id='heightInch']";
	public final String PREVENT_T2_ENROLLMENT_ACTIVITY_LEVEL="//input[@id='activityLevel1']";
	public final String PREVENT_T2_ENROLLMENT_PRIMARY_ADDRESS_TEXTBOX="//input[@id='primaryAddress']";
	public final String PREVENT_T2_ENROLLMENT_SECONDARY_ADDRESS_TEXTBOX="//input[@id='secondaryAddress']";
	public final String PREVENT_T2_ENROLLMENT_CITY_TEXTBOX="//input[@id='city']";
	public final String PREVENT_T2_ENROLLMENT_SELECT_STATE_DROPDOWN="//select[@id='selectedState']";
	public final String PREVENT_T2_ENROLLMENT_ZIPCODE_TEXTBOX="//input[@id='zipCode']";
	public final String PREVENT_T2_ENROLLMENT_PHONE_TEXTBOX="//input[@id='personHomePhone']";
	public final String PREVENT_T2_ENROLLMENT_ADDRESS1_REQUIRED="//p[contains(text(),'Address 1 is required')]";
	public final String PREVENT_T2_ENROLLMENT_CITY_REQUIRED="//p[contains(text(),'City is required')]";
	public final String PREVENT_T2_ENROLLMENT_STATE_REQUIRED="//p[contains(text(),'State is required')]";
	public final String PREVENT_T2_ENROLLMENT_ZIPCODE_REQUIRED="//p[contains(text(),'Zip Code is required')]";
	public final String PREVENT_T2_ENROLLMENT_NEXT_BUTTON="//button[contains(text(),'Next Step')]";
	public final String PREVENT_T2_ENROLLMENT_LASTNAME_REQUIRED="//p[contains(text(),'Last Name is required')]";
	public final String PREVENT_T2_ENROLLMENT_MONTH_REQUIRED="//span[contains(text(),'Month is required')]";
	public final String PREVENT_T2_ENROLLMENT_DAY_REQUIRED="//span[contains(text(),'Day is required')]";
	public final String PREVENT_T2_ENROLLMENT_YEAR_REQUIRED="//span[contains(text(),'Year is required')]";
	public final String PREVENT_T2_ENROLLMENT_INFORMATION_DOESNOT_MATCH_ERROR="//span[contains(text(),'The information you provided')]";
	public final String PREVENT_T2_ENROLLMENT_MEMBER_MUST_BE_OVER_EIGHTEEN="//span[contains(text(),'Oops! Sorry, members must be at least 18 years of age to participate in the program')]";
	public final String PREVENT_T2_ENROLLMENT_MUST_CREATE_PASSWORD="//span[contains(text(),'You must create a Password')]";
	public final String PREVENT_T2_ENROLLMENT_SECURITY_QN_REQUIRED="//p[contains(text(),'Security Question is required')]";
	public final String PREVENT_T2_ENROLLMENT_ANS_TO_SECURITY_QN="//p[contains(text(),'Answer to the Security Question is required')]";
	public final String PREVENT_T2_ENROLLMENT_SCREENNAME_REQUIRED="//p[contains(text(),'Screen Name is required')]";
	public final String PREVENT_T2_ENROLLMENT_CURRENT_WEIGHT_ERROR="//div[contains(text(),'Current Weight must be greater than 10')]";
	public final String PREVENT_T2_ENROLLMENT_TARGET_WEIGHT_ERROR="//div[contains(text(),'Weight must be greater than 10 lbs and cannot be more than 100 lbs over your weight')]";
	public final String PREVENT_T2_ENROLLMENT_VALURE_FOR_HEIGHT_FEET_ERROR="//span[contains(text(),'Please enter a valid value for feet')]";
	public final String PREVENT_T2_ENROLLMENT_VALURE_FOR_HEIGHT_INCHES_ERROR="//span[contains(text(),'Please enter a valid value for inches')]";
	public final String PREVENT_T2_ENROLLMENT_SCHEDULE_BUTTON_SUBMIT_BUTTON="//button[@id='btnSchedule']";
	public final String PREVENT_T2_ENROLLMENT_LOGIN_NOW_BUTTON="//button[@id='loginNowBtn']";
	public final String PREVENT_T2_ENROLLMENT_LOGIN_EMAIL_TEXTBOX="//input[@id='loginpage_Email_Textbox']";
	public final String PREVENT_T2_ENROLLMENT_LOGIN_PASSWORD_TEXTBOX="//input[@id='loginpage_Password_Textbox']";
	public final String PREVENT_T2_ENROLLMENT_LOGIN_BUTTON="//button[contains(text(),'LOG IN')]";
	public final String PREVENT_T2_ENROLLMENT_LOGOUT_BUTTON="//a[contains(text(),'Log out')]";
	public final String PREVENT_T2_ENROLLMENT_SIGNEDOUT_TEXT="//h1[contains(text(),'You have signed out')]";
	public final String GUERRILLA_MAIL_PREVENT_T2_ENROLLMENT_COMPLETED="//td[contains(text(),'Congratulations on getting started')]";
	public final String GUERRILLA_MAIL_PREVENT_T2_ENROLLMENT_COMPLETED_TEXT="//h3[contains(text(),'Congratulations on getting started')]";


}