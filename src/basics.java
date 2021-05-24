import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> drive = capabilities();
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//drive.findElementByClassName("android.widget.EditText").sendKeys("soufiane@gmail.com");
		drive.findElementById("com.example.app_project:id/login_num").sendKeys("soufiane@gmail.com");
		drive.findElementById("com.example.app_project:id/login_pass").sendKeys("soufiane");
		drive.findElementById("com.example.app_project:id/main_login").click();
		
	
	}

}
