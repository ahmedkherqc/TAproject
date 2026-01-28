package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task3 {

    @Test
    public void test() {
        WebDriver driver ;
        driver = new ChromeDriver();
        driver.get("https://duckduckgo.com");

        WebElement searchBox = driver.findElement(By.id("searchbox_input"));
        searchBox.sendKeys("Selenium WebDriver");
        WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
        searchButton.click();
        By firstResult = By.cssSelector("a[href='https://www.selenium.dev/documentation/webdriver/']");

        WebElement firstLink=driver.findElement(firstResult);

        String href = firstLink.getAttribute("href");
        Assert.assertEquals(href, "https://www.selenium.dev/documentation/webdriver/");

        System.out.println("First link href: " + href);

        driver.quit();
    }


}
