package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ProductsPage {

    WebDriver driver;
    Actions actions;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
    }
    public void goToSecondPageAndCheck(){
        driver.findElement(By.cssSelector(".clearfix>.next-link")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("sf=2"));
    }

    public void clickOnFirstProduct(){
        List<WebElement> productList = driver.findElements(By.className("gg-uw-6"));
        productList.get(0).click();
    }
}