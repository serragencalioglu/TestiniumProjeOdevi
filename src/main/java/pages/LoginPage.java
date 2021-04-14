package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
    WebDriver driver;
    Actions actions;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
    }
    public void userLogin(String userName,String password){

        driver.findElement(By.id("L-UserNameField")).sendKeys(userName);
        driver.findElement(By.id("L-PasswordField")).sendKeys(password);
        driver.findElement(By.id("gg-login-enter")).click();
        String actualAccountName = driver.findElement(By.cssSelector("[title='Hesabım']>.gekhq4-4>span")).getText();
        Assert.assertEquals("serragencalioglu", actualAccountName);

    }
}
