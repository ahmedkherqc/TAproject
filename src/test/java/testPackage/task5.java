package testPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class task5 {
    @Test
    public void test5(){
        WebDriver driver ;
        driver = new ChromeDriver();
        driver.navigate().to("https://duckduckgo.com");
        WebElement searchBox = driver.findElement(By.id("searchbox_input"));
        searchBox.sendKeys("Cucumber IO");
        WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
        searchButton.click();
        WebElement secondResult = driver.findElement(By.xpath("(//a[@class='result__a'])[2]"));

        String href = secondResult.getAttribute("href");
        Assert.assertTrue(href.contains("https://www.linkedin.com"),
                "Expected LinkedIn URL in second result but was: " + href);
        driver.quit();
    }



}
