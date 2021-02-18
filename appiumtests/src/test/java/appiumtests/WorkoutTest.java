package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class WorkoutTest {
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try {
			WorkoutActivity();
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
public static void WorkoutActivity() throws MalformedURLException, InterruptedException {
		

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
		MobileElement goto_workout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[3]/android.widget.LinearLayout/android.widget.ImageView"));
		goto_workout.click();
		Thread.sleep(2000);		
		MobileElement history_section = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"HISTORY\"]/android.widget.TextView"));
		history_section.click();
		Thread.sleep(1000);		
		MobileElement favourite_section = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"FAVOURITES\"]/android.widget.TextView"));
		favourite_section.click();
		Thread.sleep(1000);		
		MobileElement recommend_section = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"RECOMMENDED\"]/android.widget.TextView"));
		recommend_section.click();	
		Thread.sleep(3000);		
		MobileElement select_filter = driver.findElement(By.id("com.coredirection.coredirection:id/iv_filter"));
		select_filter.click();
		
		MobileElement category = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.CheckBox"));
		category.click();
		
		MobileElement type = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.CheckBox"));
		type.click();
		
		MobileElement reset = driver.findElement(By.id("com.coredirection.coredirection:id/tv_reset"));
		reset.click();
		
		MobileElement apply = driver.findElement(By.id("com.coredirection.coredirection:id/tv_apply"));
		apply.click();
		Thread.sleep(5000);		
		System.out.println("Filter done");
				
		
		MobileElement select_workuot = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView"));
		select_workuot.click();		
		System.out.println("Workout Selected");
		MobileElement download = driver.findElement(By.id("com.coredirection.coredirection:id/btn_download_start_workout"));
		download.click();
		Thread.sleep(30000);	
		System.out.println("Download completed");
		MobileElement start = driver.findElement(By.id("com.coredirection.coredirection:id/btn_download_start_workout"));
		start.click();
		
		MobileElement allow = driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
		allow.click();
		Thread.sleep(50000);	
		MobileElement play = driver.findElement(By.id("com.coredirection.coredirection:id/iv_music_play"));
		play.click();
										
		//AndroidElement list=(AndroidElement)driver.findElement(By.id("com.coredirection.coredirection:id/et_search"));
		
		//MobileElement listitem= (MobileElement) driver.findElement(
			//	MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Explore By Level\"))"));		
		//workout
		//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[3]/android.widget.LinearLayout/android.widget.ImageView
		//favrt
			//androidx.appcompat.app.ActionBar.Tab[@content-desc="FAVOURITES"]/android.widget.TextView
		//history
		//androidx.appcompat.app.ActionBar.Tab[@content-desc="HISTORY"]/android.widget.TextView
		//recommend
		//androidx.appcompat.app.ActionBar.Tab[@content-desc="RECOMMENDED"]/android.widget.TextView
		//make_fvrt
		//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.ImageView
		//filter
		//	com.coredirection.coredirection:id/iv_filter
		//Beginner
		//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.CheckBox
		//type
		//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.CheckBox
		//reset
		//	com.coredirection.coredirection:id/tv_reset
		//apply
		//	com.coredirection.coredirection:id/tv_apply
		//workout
		//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView
		//back_workout_menu
		//com.coredirection.coredirection:id/iv_image_left
		
		//workout_begineer
		//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.TextView
		
		//Start_workout
		//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.TextView
		//Downloads
		//com.coredirection.coredirection:id/btn_download_start_workout
		//Start
		//	com.coredirection.coredirection:id/btn_download_start_workout
		//allow button
		//	com.android.packageinstaller:id/permission_allow_button
		//Play button
		//	com.coredirection.coredirection:id/iv_music_play
		//
}		


}
