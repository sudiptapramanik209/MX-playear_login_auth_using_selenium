package com.training.pom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@role='presentation']")
	private WebElement clicklogin; 
	
	@FindBy(css = ".phone-input")
	private WebElement clickGoogle; 
	
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	private WebElement clickNext;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	private WebElement login;
	
	@FindBy(name="username")
	private WebElement userName; 
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement loginBtn;
	
	
	public void clickLoginlogo() {
		this.clicklogin.click();
	}
	
	public void clickgoogle(String number) throws InterruptedException{
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		this.clickGoogle.click();
		Thread.sleep(2000);
		this.clickGoogle.sendKeys(number);
		this.clickNext.click();
		Thread.sleep(10000);
		this.login.click();
		Thread.sleep(10000);
	} 
	
	
	
	
	
	
//this code fore extra usages i dont need this
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	

	








	
}
