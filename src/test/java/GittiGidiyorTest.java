import org.junit.Test;
import pages.*;

public class GittiGidiyorTest extends BaseTest {

    @Test
    public void gittiGidiyorJourney() {

        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userLogin("serragencalioglu@gmail.com","122333Serra_");
        homePage.searchProduct("bilgisayar");
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.goToSecondPageAndCheck();
        productsPage.clickOnFirstProduct();
        ProductDetailPage productDetailPage = new ProductDetailPage(driver);
        productDetailPage.addToBasket();
        productDetailPage.assertProductPriceInBasket();
        BasketPage basketPage = new BasketPage(driver);
        basketPage.increaseProductAmount("2");
        basketPage.deletionAndCheck();

    }
}