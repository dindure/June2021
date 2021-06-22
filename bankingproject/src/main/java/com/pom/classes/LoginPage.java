package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	@FindBy (xpath="//input[@id='userid']")
	private WebElement userId;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@id='pin']")
	private WebElement pinNo;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement continueButton;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void sendUserId()
	{
		userId.sendKeys("EZ5871");
	}
	
	public void sendPassword() throws InterruptedException
	{
		Thread.sleep(2000);
		password.sendKeys("Vmore@257");
	}
	
	public void clickLoginButton() throws InterruptedException
	{
		Thread.sleep(2000);
		loginButton.click();
	}
	
	public void sendPin() throws InterruptedException
	{
		Thread.sleep(4000);
		pinNo.sendKeys("887945");
	}
	
	public void clickContinueButton() throws InterruptedException
	{
		Thread.sleep(2000);
		continueButton.click();
	}
	
	
}