package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
/*

#6
Open Google Chrome
Navigate to [http://the-internet.herokuapp.com/checkboxes]
Check Checkbox 1
Assert that both Checkboxes are checked
Close Google Chrome

 */
public class task6 {
    @Test
    public void test6()
    {
        //Open Google Chrome
        WebDriver driver=new ChromeDriver();

        //Navigate to [http://the-internet.herokuapp.com/checkboxes]
        driver.navigate().to("http://the-internet.herokuapp.com/checkboxes");

        //Check Checkbox 1
        By firstCheckbox=By.xpath("(//input[@type='checkbox'])[1]");
        driver.findElement(firstCheckbox).click();

        //Assert that both Checkboxes are checked
        var isFirstCheckboxSelected=driver.findElement(firstCheckbox).isSelected();
        By secondCheckbox=By.xpath("(//input[@type='checkbox'])[2]");
        var isSecondCheckboxSelected=driver.findElement(secondCheckbox).isSelected();
        Assert.assertTrue(isFirstCheckboxSelected && isSecondCheckboxSelected,"Both checkboxes should be selected. the first is selected: "
                +isFirstCheckboxSelected+", the second is selected: "+isSecondCheckboxSelected);
        //Close Google Chrome
        driver.quit();

    }
}
