package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By iframeElement = By.xpath("//*[@class='login__iframe']");

    private By signInMod = By.xpath("//div/button[text()='Sign In']");

    private By emailField = By.xpath("//input[@type='text']");
    private By passwordField = By.xpath("//input[@type='password']");
    private By continueButton = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Ввод email пользователя
    public void setEmailField(String username) {
        driver.findElement(emailField).sendKeys(username);
    }

    // Ввод пароля
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    // Нажатие на tab Sign In
    public void clickSignİnTab() {
        driver.findElement(signInMod).click();
    }

    //Нажать на кнопку "continue"
    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    // Переключиться на iframe
    public void switchToIframe(){
        WebElement switchIframe = driver.findElement(iframeElement);
        driver.switchTo().frame(switchIframe);
    }
}
