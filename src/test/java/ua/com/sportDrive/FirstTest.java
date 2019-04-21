package ua.com.sportDrive;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class FirstTest extends WebDriverBeforeAfterSettings {

   /* public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\EPAM\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Initial setup success");
    }*/

    @Test
    public void openPage() {
        // System.setProperty("webdriver.chrome.driver", "E:\\QA\\EPAM\\driver\\chromedriver.exe");
        // ChromeDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();
        driver.get("http://automationpractice.com/index.php");   //Open the site

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("My Store"));    //Site Title Name

        WebElement searchField = driver.findElementByXPath("//*[@id=\"search_query_top\"]");   //Search Button
        searchField.clear();
        searchField.sendKeys("T-shirts");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement searchButton = driver.findElementByXPath("//*[@id=\"searchbox\"]/button");  //press Button
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);

        // driver.quit();
    }


   /* @After
    public void quitBrowser() {
        driver.quit();
    }*/

}

