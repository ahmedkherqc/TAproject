package testPackage;

//import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class task7 {
    @Test

    public void test7() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/floating_menu#contact");
        driver.manage().window().maximize();

        By homeButton = By.linkText("Home");
        driver.findElement(homeButton).click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/floating_menu#home",
                "URL should end with #home after clicking Home button + current URL is " + driver.getCurrentUrl());

      /*  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        DocFile FileUtils;
        FileUtils.copyFile(src, new File("path/screenshot.png"));
*/
        driver.quit();
    }
}
