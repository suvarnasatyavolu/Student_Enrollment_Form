package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(By.id("ap_email")).sendKeys(email);
    }

    public void clickContinue() {
        driver.findElement(By.id("continue")).click();
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("ap_password")).sendKeys(password);
    }

    public void submit() {
        driver.findElement(By.id("signInSubmit")).click();
    }
}
