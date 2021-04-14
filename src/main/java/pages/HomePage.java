package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver driver;
    Actions actions;

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void clickLoginButton(){
        actions.moveToElement(driver.findElement(By.cssSelector("[title='Giriş Yap']"))).perform();
        driver.findElement(By.cssSelector("[data-cy='header-login-button']")).click();

    }
    public void searchProduct(String productName){
        driver.findElement(By.className("sc-4995aq-0")).sendKeys(productName, Keys.ENTER);

    }

}
