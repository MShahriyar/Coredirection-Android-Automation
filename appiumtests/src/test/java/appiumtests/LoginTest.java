package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginTest {
	
	
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try {
			LoginActivity();
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	public static void LoginActivity() throws MalformedURLException, InterruptedException {
		

		//SignUpTest.capablities();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus6");
		cap.setCapability("udid", "d3b8c91d");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.coredirection.coredirection");
		cap.setCapability("appActivity", "com.eureka.activity.SplashActivity");

		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,cap); 
		
		System.out.println("Started");
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		MobileElement login = driver.findElement(By.id("com.coredirection.coredirection:id/tv_sign_in"));
		login.click();
		
		MobileElement usesrname = driver.findElement(By.id("com.coredirection.coredirection:id/et_email"));
		usesrname.sendKeys("dtest@mailinator.com");
		
		MobileElement password = driver.findElement(By.id("com.coredirection.coredirection:id/et_password"));
		password.sendKeys("123456");
		
		MobileElement privacy = driver.findElement(By.id("com.coredirection.coredirection:id/checkbox_gdpr"));
		privacy.click();
		
		
		MobileElement keepLogin = driver.findElement(By.id("com.coredirection.coredirection:id/checkbox_keep_log_in"));
		keepLogin.click();
		
		driver.hideKeyboard();
		
		MobileElement login_btn = driver.findElement(By.id("com.coredirection.coredirection:id/btn_login"));
		login_btn.click();
		
		
		
		System.out.println("Successfully login");
		Thread.sleep(10000);
		
		MobileElement gmail_allow = driver.findElement(By.id("com.google.android.gms:id/account_display_name"));
		gmail_allow.click();
		
		Thread.sleep(5000);
		
		System.out.println("Gmail Selected");
		
		
		MobileElement grant_permission = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		grant_permission.click();
		
		Thread.sleep(5000);
		MobileElement go_to_profile = driver.findElement(By.id("com.coredirection.coredirection:id/iv_image_right"));
		go_to_profile.click();
		Thread.sleep(2000);
		MobileElement go_to_setting = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView"));
		go_to_setting.click();
		
		MobileElement click_logout = driver.findElement(By.id("com.coredirection.coredirection:id/tv_logout"));
		click_logout.click();
		
		MobileElement click_yes = driver.findElement(By.id("com.coredirection.coredirection:id/textview_popup_yes"));
		click_yes.click();
		Thread.sleep(2000);
		
		//com.coredirection.coredirection:id/iv_image_right
		//com.coredirection.coredirection:id/iv_image_right
		//	com.coredirection.coredirection:id/tv_logout
		//	com.coredirection.coredirection:id/textview_popup_yes
		//MobileElement splash_screen_next = driver.findElement(By.id("com.google.android.gms:id/account_display_name"));
		//splash_screen_next.click();
		
		//MobileElement splash_screen_skip = driver.findElement(By.id("com.google.android.gms:id/account_display_name"));
		//splash_screen_skip.click();
		
	}

	
}
