import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {


	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException  {
		File fil = new File("src");
		File fs= new File(fil,"app-debug.apk");
			DesiredCapabilities souf = new DesiredCapabilities();
			souf.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_API_30_x86");
			souf.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		AndroidDriver <AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),souf);
		return driver;
			
	}

}
