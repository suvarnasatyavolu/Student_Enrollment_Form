package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.*;

import java.time.Duration;

public class AmazonRegressionTests {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    ProductPage productPage;
    CartPage cartPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    @Test(priority = 1)
    public void testLoginFunctionality() {
        homePage.clickSignIn();
        loginPage.enterEmail("your_email@example.com");
        loginPage.clickContinue();
        loginPage.enterPassword("your_password");
        loginPage.submit();
    }

    @Test(priority = 2)
    public void testSearchProduct() {
        homePage.searchProduct("Bluetooth headphones");
    }

    @Test(priority = 3)
    public void testAddToCart() {
        productPage.selectFirstProduct();
        productPage.addToCart();
    }

    @Test(priority = 4)
    public void testCheckoutFlow() {
        cartPage.openCart();
        cartPage.proceedToCheckout();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
