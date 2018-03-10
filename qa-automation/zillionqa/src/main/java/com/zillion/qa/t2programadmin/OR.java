package com.zillion.qa.t2programadmin;

public interface OR {
	public final String PRACTITIONER_MY_PROFILE_EDIT_BUTTON="//div[@class='edit-toggler-backend pull-right']/i";
	public final String PRACTITIONER_MY_PROFILE_FIRSTNAME_EDIT_TEXTBOX="//input[@id='firstName']";
	public final String PRACTITIONER_MY_PROFILE_LASTNAME_EDIT_TEXTBOX="//input[@id='lastName']";
	public final String PRACTITIONER_MY_PROFILE_EDIT_AND_SAVE_BUTTON="//input[@id='submitBtnProfileForm']";
	public final String PRACTITIONER_PATIENT_NAME="//tbody//a[contains(@href,'profile')]";
	public final String NEW_PATIENT_FULFILLMENT_STATUS_NOT_INITIATED="//span[text()='Fulfillment Status:']/following-sibling::span[text()='Fulfillment Not Initiated']";
	public final String SUCCESS_MESSAGE_OKBUTTON="//div[@id='spinnerSuccess']/button[text()='OK']";
	public final String PHONE_NUMBER_TEXTBOX="//input[@id='phone']";
	public final String ADDRESSONE_TEXTBOX="//input[@id='street']";
	public final String CITY_TEXTBOX="//input[@id='city']";
	public final String ZIP_CODE_TEXTBOX="//input[@id='postalCode']";
	public final String NICKNAME_TEXTBOX="//input[@id='nickname']";
	public final String SELECT_STATE="//select[@id='state']";
	public final String BIO_EDIT_BUTTON="//div[text()='Bio']/parent::div//div//edit-toggler /div/i";
	public final String BIO_TEXT_AREA="//textarea[@id='bio']";
	public final String BIO_TEXT_AREA_SAVE_BUTTON="//input[@id='submitBtnBioForm']";
	public final String BIO_TEXT_AREA_SAVE_SUCCESS_OK="//div[@id='spinnerSuccess']/button";
	public final String PHONE_EXTENSION="//input[@id='extension']";
	public final String PHONE_EXTENSION_ALERT_MSG_NUMBERS_ONLY="//span[contains(text(),'Phone extension can only be numbers')]";
	public final String EMAIL_EDIT_BUTTON="//div[@id='credentialsPanel']//div[text()='Credentials']/parent::div//div//edit-toggler//div//i";
	public final String EMAIL_EDIT_TEXTBOX="//div//input[@id='email']";
	public final String ORGANIZATION="//select[@name='organization']";
	public final String PROVIDER_URL_ADD_PATIENT_ADD_MONTH_FIELD="//select[@id='dobMonth']";
	public final String PROVIDER_URL_ADD_PATIENT_ADD_DAY_FIELD="//select[@id='dobDay']";
	public final String PROVIDER_URL_ADD_PATIENT_ADD_YEAR_FIELD="//select[@id='dobYear']";
	public final String TRACKER_SERVER_IS_TEMPORARILY_NOT_AVAILABLE_ALERT_BOX="//p[contains(text(),'Tracker server is temporarily unavailable. Please try again later.')]/following-sibling::button[text()='OK']";

}
