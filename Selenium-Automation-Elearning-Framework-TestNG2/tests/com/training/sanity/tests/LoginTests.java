package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.MX_player_profilepom;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private MX_player_profilepom mx_player_profilepom;
	private static Properties properties;
	private ScreenShot screenShot;

//	@BeforeClass
//	public static void setUpBeforeClass() throws IOException {
//		
//	}

	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		mx_player_profilepom=new MX_player_profilepom(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test(priority = 0)
	public void validLoginTest() throws InterruptedException {
		loginPOM.clickLoginlogo();
		loginPOM.clickgoogle("8240756223");
	}
	
	@Test(priority = 1)
	public void validprofiletest() throws InterruptedException {
		mx_player_profilepom.clickdropdown();
		mx_player_profilepom.vesibleMysubscription();
		mx_player_profilepom.vesibleName();
		Thread.sleep(3000);
		mx_player_profilepom.vesiblesubscribe();
		Thread.sleep(2000);
		mx_player_profilepom.chooseplane();
		Thread.sleep(1000);
		mx_player_profilepom.cuponcode("1234");
		mx_player_profilepom.subscriptionByNowButton();
	}
	
}
