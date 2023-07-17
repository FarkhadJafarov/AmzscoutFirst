package autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Установка пути к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // Создание экземпляра драйвера Chrome
        driver = new ChromeDriver();

        // Открытие страницы авторизации
        driver.get("https://amzscout.net/app/#/auth/login?redirect=%2Fdatabase");
    }

    @AfterMethod
    public void tearDown() {
        // Закрытие браузера
        driver.quit();
    }
}
