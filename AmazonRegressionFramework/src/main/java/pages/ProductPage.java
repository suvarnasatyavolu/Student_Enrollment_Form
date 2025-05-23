package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstProduct() {
        driver.findElement(By.cssSelector(".s-main-slot .s-result-item h2 a")).click();
    }

    public void addToCart() {
        driver.findElement(By.id("add-to-cart-button")).click();
    }
}
