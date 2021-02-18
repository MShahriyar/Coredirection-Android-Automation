package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ArticleTest {
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try {
			ArticlesActivity();
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
public static void ArticlesActivity() throws MalformedURLException, InterruptedException {
		

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
	
		MobileElement main_articles = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.ImageView"));
		//MobileElement main_articles = driver.findElement(By.id("com.coredirection.coredirection:id/iv_tab_icon"));
		main_articles.click();	
		Thread.sleep(3000);
		System.out.print("article login");
		MobileElement select_article = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView"));
		select_article.click();
		Thread.sleep(2000);
		MobileElement make_fav_article = driver.findElement(By.id("com.coredirection.coredirection:id/iv_fav"));
		make_fav_article.click();
		
		MobileElement backTo_article = driver.findElement(By.id("com.coredirection.coredirection:id/iv_image_left"));
		backTo_article.click();
		Thread.sleep(4000);
		
		/*MobileElement close_points = driver.findElement(By.id("com.coredirection.coredirection:id/btn_close"));
		close_points.click();
		Thread.sleep(1000);*/
		MobileElement favourite_article = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"FAVOURITES\"]/android.widget.TextView"));
		favourite_article.click();
		
		MobileElement recommend_article = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"RECOMMENDED\"]/android.widget.TextView"));
		recommend_article.click();
		
		MobileElement open_filter = driver.findElement(By.id("com.coredirection.coredirection:id/iv_filter"));
		open_filter.click();
		Thread.sleep(1000);
		/*MobileElement select_any_category = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.CheckBox[1]"));	
		select_any_category.click();
		
		MobileElement select_any_tag = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView"));
		*/
		MobileElement apply_filter = driver.findElement(By.id("com.coredirection.coredirection:id/tv_apply"));
		apply_filter.click();
		Thread.sleep(1000);
		
		System.out.println("Article done!l");	
		//	//androidx.appcompat.app.ActionBar.Tab[@content-desc="FAVOURITES"]/android.widget.TextView
		//	//androidx.appcompat.app.ActionBar.Tab[@content-desc="RECOMMENDED"]/android.widget.TextView
		//com.coredirection.coredirection:id/iv_filter
		///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.CheckBox[2] (select category)
		//com.coredirection.coredirection:id/tv_apply (apply filter)
		
}
}
