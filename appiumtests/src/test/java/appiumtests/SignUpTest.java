package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;



public class SignUpTest {
	
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try {
			MainActivity();
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
/*	public static void capablities() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Nokia 7.2");
		cap.setCapability("udid", "D0AA002302JA1106374");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.coredirection.coredirection");
		cap.setCapability("appActivity", "com.eureka.activity.SplashActivity");

		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,cap); 
		
	}
	*/
	public static void MainActivity() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus6");
		cap.setCapability("udid", "d3b8c91d");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.coredirection.coredirection");
		cap.setCapability("appActivity", "com.eureka.activity.SplashActivity");

		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,cap); 
		
		//capablities();
		//DesiredCapabilities cap = new DesiredCapabilities();
		  
		
		/*cap.setCapability("deviceName", "vivo 1907_19");
		cap.setCapability("udid", "BEKFQSEA85JVORNB");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "com.android.bbkcalculator");
		cap.setCapability("appActivity", "com.android.bbkcalculator.Calculator");*/
		/*		cap.setCapability("deviceName", "OnePlus6");
		cap.setCapability("udid", "d3b8c91d");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.coredirection.coredirection");
		cap.setCapability("appActivity", "com.eureka.activity.SplashActivity");*/

		/*cap.setCapability("deviceName", "SM-G973F");
		cap.setCapability("udid", "RF8M22MNAGK");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.coredirection.coredirection");
		cap.setCapability("appActivity", "com.eureka.activity.SocialLoginActivity");*/
			
		System.out.println("Application Started.....");
		Thread.sleep(2000);
		MobileElement signup = driver.findElement(By.id("com.coredirection.coredirection:id/btn_signup"));		
		signup.click();
		
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		MobileElement email = driver.findElement(By.id("com.coredirection.coredirection:id/et_email"));
		email.sendKeys("sheri+3@mailinator.com");
		
		MobileElement confirmemail = driver.findElement(By.id("com.coredirection.coredirection:id/et_confirm_email"));
		confirmemail.sendKeys("sheri+3@mailinator.com");
		
		MobileElement password = driver.findElement(By.id("com.coredirection.coredirection:id/et_password"));
		password.sendKeys("123456");
		//driver.hideKeyboard();
		//Thread.sleep(500);
		
		MobileElement confirmpassword = driver.findElement(By.id("com.coredirection.coredirection:id/et_confirm_password"));
		confirmpassword.sendKeys("123456");
		driver.hideKeyboard();
		
		MobileElement termsandcondition = driver.findElement(By.id("com.coredirection.coredirection:id/checkbox_new_user"));
		
		termsandcondition.click();
		
		MobileElement privacy = driver.findElement(By.id("com.coredirection.coredirection:id/checkbox_gdpr"));
		
		privacy.click();
		
		String scrollViewContainer_finder = "new UiSelector().resourceIdMatches(\".*id/action_bar_root\")";
		String neededElement_finder = "new UiSelector().resourceIdMatches(\".*id/btn_create_account\")";

		MobileElement abc= driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(" + scrollViewContainer_finder + ")" +
		                ".scrollIntoView(" + neededElement_finder + ")"));
		
		MobileElement createaccount = driver.findElement(By.id("com.coredirection.coredirection:id/btn_create_account"));
		
		createaccount.click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		MobileElement permissionallow = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		
		permissionallow.click();
		Thread.sleep(1000);
		
		MobileElement popupokbtn = driver.findElement(By.id("com.coredirection.coredirection:id/textview_popup_ok"));
		
		popupokbtn.click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("User Registered Successfully.....");
	}
	
}
