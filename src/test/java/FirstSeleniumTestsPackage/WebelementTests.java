package FirstSeleniumTestsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class WebelementTests {
    public static WebDriver driver;

    @Test
    public static void mainPageTest(){
        System.setProperty("webdriver.firefox.bin",
                "C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        driver = new FirefoxDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement searchInput = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
        searchInput.clear();
        searchInput.sendKeys("Polska");
//        searchInput.submit();

        WebElement serchButton = driver.findElement(By.className("wikipedia-search-button"));
        serchButton.click();

        WebElement resultsElement = driver.findElement(By.id("Wikipedia1_wikipedia-search-results-header"));

        Assert.assertTrue(resultsElement.isDisplayed());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }

    @Test
    public static void fillFormTest(){
        System.setProperty("webdriver.firefox.bin",
                "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement nameInput = driver.findElement(By.id("RESULT_TextField-1"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();

    }
}
