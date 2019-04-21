package ua.com.sportDrive;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBeforeAfterSettings {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\EPAM\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Initial setup success");
    }

    @After
    public void quitBrowser() {
        driver.quit();
    }


}
