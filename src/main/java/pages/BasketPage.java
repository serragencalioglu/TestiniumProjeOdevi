package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasketPage {
    WebDriver driver;
    Actions actions;

    public BasketPage(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
    }
    public void increaseProductAmount(String amount){
        driver.findElement(By.cssSelector("select.amount")).sendKeys(amount);
        String actualAmount = driver.findElement(By.cssSelector("select.amount")).getAttribute("value");
        Assert.assertEquals("2",actualAmount);
    }
    public void deletionAndCheck(){
        driver.findElement(By.className("btn-delete")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String emptyBasketText = driver.findElement(By.cssSelector(".gg-w-22>h2")).getText();
        Assert.assertEquals("Sepetinizde ürün bulunmamaktadır.",emptyBasketText);

    }
}
