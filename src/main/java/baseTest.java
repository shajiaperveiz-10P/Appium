import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import utilities.configFileReader;

import java.net.MalformedURLException;
import java.net.URL;

public class baseTest {
    public static AppiumDriver driver;

    public static utilities.configFileReader ConfigFileReader;

    @Test
    public void initialize() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        ConfigFileReader = new configFileReader();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME,ConfigFileReader.getdeviceName());
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,ConfigFileReader.getplatformVersion());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,ConfigFileReader.getautomationName());
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,ConfigFileReader.getplatformName());
        cap.setCapability(MobileCapabilityType.TIMEOUTS, 10000);
        cap.setCapability(MobileCapabilityType.APP,ConfigFileReader.getapp());
        URL url = new URL(ConfigFileReader.getappiumServerURL());
        driver = new AppiumDriver(url, cap);
    }
}
