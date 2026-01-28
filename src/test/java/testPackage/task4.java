package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task4
{

    @Test
    public void test4() {

        WebDriver driver ;
        driver = new FirefoxDriver();
        driver.get("https://duckduckgo.com");

        WebElement searchBox = driver.findElement(By.id("searchbox_input"));
        searchBox.sendKeys("TestNG");
        WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
        searchButton.click();

        By forthResult = By.xpath("//span[text()='TestNG Tutorial']");

        String forthResult_text = driver.findElement(forthResult).getText();
      //  wait.until(d -> d.findElement(forthResult));
        Assert.assertEquals(forthResult_text, "TestNG Tutorial","Fourth result text should be 'TestNG Tutorial'");

        System.out.println("Fourth result text is: " + forthResult_text);

        driver.quit();

    }

}
