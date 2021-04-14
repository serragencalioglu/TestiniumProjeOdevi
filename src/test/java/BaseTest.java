import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    Actions actions;

    @Before
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
        actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.gittigidiyor.com");
        Assert.assertTrue(driver.findElement(By.className("sc-1fjiks5-1")).isDisplayed());
        driver.findElement(By.className("tyj39b-3")).click();
    }
}