package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class HomeScreenTest {

static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try {
			HomeActivity();
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}



public static void HomeActivity() throws MalformedURLException, InterruptedException {
		

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
	Thread.sleep(2000);
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
	
	Thread.sleep(6000);	
		
		MobileElement challenge_btn = driver.findElement(By.id("com.coredirection.coredirection:id/btn_map"));
		challenge_btn.click();	
		
		/*MobileElement select_deeplink = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ImageView[1]"));
		select_deeplink.click();
		Thread.sleep(5000);
		
		
		MobileElement select_articles = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[1]"));
		select_articles.click();
		Thread.sleep(1000);
		
		MobileElement back_to_home = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[1]/android.widget.LinearLayout/android.widget.ImageView"));
		back_to_home.click();
		Thread.sleep(2000);
		
		MobileElement select_workout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[1]"));
		select_workout.click();
		Thread.sleep(2000);		
		
		MobileElement back_to = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[1]/android.widget.LinearLayout/android.widget.ImageView"));
		back_to.click();
		Thread.sleep(2000);*/
		
		AndroidElement list=(AndroidElement)driver.findElement(By.id("com.coredirection.coredirection:id/iv_image"));
		
		MobileElement listitem= (MobileElement) driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Try some articles\"))"));

		System.out.println(listitem.getLocation());
		
		//listitem.click();
		Thread.sleep(2000);
		MobileElement select_articles = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[1]"));
		select_articles.click();
		Thread.sleep(6000);
		
		MobileElement back_to_home = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[1]/android.widget.LinearLayout/android.widget.ImageView"));
		back_to_home.click();
		Thread.sleep(3000);
		
		MobileElement select_workout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[1]"));
		select_workout.click();
		Thread.sleep(6000);		
		
		MobileElement back_to = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[1]/android.widget.LinearLayout/android.widget.ImageView"));
		back_to.click();
		Thread.sleep(3000);
		
		/*String scrollViewContainer_finder = "new UiSelector().resourceIdMatches(\".*id/com.coredirection.coredirection:id/btn_map\")";
		String neededElement_finder = "new UiSelector().resourceIdMatches(\".*xpath/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[1]\")";

		MobileElement abc= driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(" + scrollViewContainer_finder + ")" +
		                ".scrollIntoView(" + neededElement_finder + ")"));*/


				
		
		//com.coredirection.coredirection:id/btn_map
		//home//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[1]/android.widget.LinearLayout/android.widget.ImageView
		//articles//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[1]
		//workout//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[1]
		//deeplink//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[1]
		
}
}
