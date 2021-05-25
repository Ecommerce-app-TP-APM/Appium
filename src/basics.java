import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

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
	/*
	
	 public static void scrollDown(){
	        Dimension dimension = WebDriver.manage().window().getSize();
	        int scrollStart = (int) (dimension.getHeight() * 0.5);
	        int scrollEnd = (int) (dimension.getHeight() * 0.2);

	        new TouchAction((PerformsTouchActions) AppDriver.getDriver())
	                .press(PointOption.point(0, scrollStart))
	                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	                .moveTo(PointOption.point(0, scrollEnd))
	                .release().perform();
	    }

	    public static void scrollNClick(By listItems, String Text){
	        boolean flag = false;

	        while(true){
	            for(WebElement el: AppDriver.getDriver().findElements(listItems)){
	                if(el.getAttribute("text").equals(Text)){
	                    el.click();
	                    flag=true;
	                    break;
	                }
	            }
	            if(flag)
	                break;
	            else
	                scrollDown();
	        }
	    }
	    */

}
