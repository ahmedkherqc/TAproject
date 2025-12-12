package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Task2 {

    @Test
    public void test() {
        WebDriver driver ;
        driver = new ChromeDriver();
        driver.get("https://duckduckgo.com");

        WebElement img = driver.findElement(By.xpath("//section[@class='header_headerLeft__rW6nD header_headerSection___XMRI']//img"));
        Assert.assertTrue(img.isDisplayed(), "Image should be displayed");
        System.out.println("Image is displayed: " + img.isDisplayed());
        driver.quit();
    }


}
