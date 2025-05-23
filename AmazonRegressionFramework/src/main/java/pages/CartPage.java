package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCart() {
        driver.findElement(By.id("nav-cart")).click();
    }

    public void proceedToCheckout() {
        driver.findElement(By.name("proceedToRetailCheckout")).click();
    }
}
