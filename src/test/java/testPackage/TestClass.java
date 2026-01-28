package testPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
    WebDriver driver ;
    @Test // task 1
public void test() {

        driver = new ChromeDriver();
        driver.get("https://duckduckgo.com");

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Google"), "Title should contain Google but was: " + title);

        driver.quit();
    }

    @Test // Task 2
    public void test2() {

        driver = new ChromeDriver();
        driver.get("https://duckduckgo.com");

        WebElement img = driver.findElement(By.xpath("//section[@class='header_headerLeft__rW6nD header_headerSection___XMRI']//img"));
        Assert.assertTrue(img.isDisplayed(), "Image should be displayed");
        System.out.println("Image is displayed: " + img.isDisplayed());
        driver.quit();
    }
    @Test // Task 3
    public void test3() {

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

       // By nameTectBox= By.id("searchbox_input");

        driver.quit();
    }


}
