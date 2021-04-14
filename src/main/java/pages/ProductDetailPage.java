package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ProductDetailPage {
    WebDriver driver;
    Actions actions;

    public ProductDetailPage(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
    }
    public void addToBasket(){
        driver.findElement(By.id("add-to-basket")).click();
    }
    public void assertProductPriceInBasket(){
        String productPrice = driver.findElement(By.cssSelector(".lastPrice")).getText();
        clickBasket();
        String productBasketPrice = driver.findElement(By.className("new-price")).getText();
        Assert.assertEquals(productPrice,productBasketPrice);
    }
    public void clickBasket(){
        driver.findElement(By.className("dIB")).click();
    }
}
