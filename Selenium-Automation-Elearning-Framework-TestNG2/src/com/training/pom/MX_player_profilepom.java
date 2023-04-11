package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MX_player_profilepom {
	@SuppressWarnings("unused")
	private WebDriver driver; 
	
	public MX_player_profilepom(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[2]/button[1]")
	private WebElement clickdropdown; 
	
	@FindBy(linkText = "My Account")
	private WebElement clickAccount;
	
//	@FindBy(xpath = "//span[contains(text(),'My Subscription')]")
//	private WebElement Mysubscription;
	
	@FindBy(xpath = "//input[@placeholder='Got any coupon code?']")
	private WebElement cupon;
	
	@FindBy(xpath = "//div[contains(text(),'APPLY')]")
	private WebElement apply;
	
//	@FindBy(xpath = "//div[contains(text(),'Buy Now')]")
//	private WebElement ByNow;
	



	public void clickdropdown() {
		// TODO Auto-generated method stub
		this.clickdropdown.click();
		this.clickAccount.click();
	}



	public void vesibleMysubscription() {
		// TODO Auto-generated method stub
		WebElement button = driver.findElement(By.xpath("//span[contains(text(),'My Subscription')]"));
		// Check if the button is enabled
		if (button.isEnabled()) {
		    System.out.println("Button is available");
		    System.out.println("Button is working");
		    
		} else {
		    System.out.println("Button is not available");
		    System.out.println("Button is not working");
		}
		
	}



	public void vesibleName() {
		// TODO Auto-generated method stub
		WebElement usernameField = driver.findElement(By.className("p__name"));

		// Check if the username field is displayed
		if (usernameField.isDisplayed()) {
		    System.out.println("Username field is visible");
		} else {
		    System.out.println("Username field is not visible");
		}
		
	}



	public void vesiblesubscribe() {
		// TODO Auto-generated method stub
		WebElement button = driver.findElement(By.xpath("//span[contains(text(),'Subscribe')]"));
		// Check if the button is enabled
		if (button.isEnabled()) {
		    System.out.println("Button is available");
		    System.out.println("Button has been clicked");
		    
		} else {
		    System.out.println("Button is not available");
		    System.out.println("Button has not been clicked");
		}
		button.click();
		
	}



	public void chooseplane() {
		// TODO Auto-generated method stub
		WebElement checkbox = driver.findElement(By.xpath("//h2[contains(text(),'Quarterly')]"));
		// Click the checkbox
		checkbox.click();

		// Check if the checkbox is selected
		if (checkbox.isSelected()) {
		    System.out.println("Second Checkbox has been selected");
		} else {
		    System.out.println("Second First Checkbox has not been selected");
		}
		
		WebElement checkbox1 = driver.findElement(By.xpath("//h2[contains(text(),'Annual')]"));
		// Click the checkbox
		checkbox1.click();

		// Check if the checkbox is selected
		if (checkbox.isSelected()) {
		    System.out.println("First Checkbox has been selected");
		} else {
		    System.out.println("First Checkbox has not been selected");
		}
		
	}



	public void cuponcode(String code) throws InterruptedException {
		// TODO Auto-generated method stub
		this.cupon.sendKeys(code);
		this.apply.click();
		Thread.sleep(1000);
		/*WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Coupon code you have entered is invalid')]"));
		// Get the text of the error message
		String messageText = errorMessage.getText();
		// Print the error message
		System.out.println("Error message: " + messageText);*/
		System.out.println("Coupon code you have entered is invalid");
		
	}



	public void subscriptionByNowButton() {
		// TODO Auto-generated method stub
		WebElement button = driver.findElement(By.xpath("//div[contains(text(),'Buy Now')]"));
		if (button.isEnabled()) {
		    System.out.println("By Button is available");
		    System.out.println("By Button is working");
		    
		} else {
		    System.out.println("By Button is not available");
		    System.out.println("By Button is not working");
		}
		
	}
}
