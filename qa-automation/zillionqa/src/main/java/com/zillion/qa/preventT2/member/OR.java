package com.zillion.qa.preventT2.member;

public interface OR {
	public final String VIEW_ALL_PHOTOS_LINK_IN_HFOPS_MEMBER_PROFILE="//a[@class='viewAllButton viewAllPhotosButton pull-right']";
	public final String T2_MEMBER_PROGRESS_PICTURE_VIEW_ALL_PHOTOS_BEFORE_PHOTO="//img[@class='beforeImg']";
	public final String T2_MEMBER_PROGRESS_PICTURE_BEFORE_PHOTO_DELETE_BUTTON="//div[@class='uploadedImg onHoverImg']/div[2]/button[contains(text(),'Delete Photo')]";
	public final String T2_MEMBER_PROGRESS_PICTURE_BEFORE_PHOTO_DELETE_CONFIRM_BUTTON="//button[@id='yesConfirm']";
	public final String T2_MEMBER_PROGRESS_PICTURE_BEFORE_PHOTO_DETAIL_CLOSE_BUTTON="//div[@class='uploadedImg onHoverImg']/div[2]/following::div/button[contains(text(),'CLOSE')]";
	public final String T2_MEMBER_PROGRESS_PICTURE_VIEW_ALL_PHOTOS_CLOSE_BUTTON="//div[@id='viewAllPhoto']/following::div/button[contains(text(),'CLOSE')]";
	public final String T2_MEMBER_LANDINGPAGE_USERNAME="//input[@id='loginpage_Email_Textbox']";
	public final String T2_MEMBER_LOGIN_PASSWORD="//input[@id='loginpage_Password_Textbox']";
	public final String RA_MEMBER_LOGIN_BUTTON="//button[text()='LOG IN']";

}
