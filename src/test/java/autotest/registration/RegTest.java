package autotest.registration;

import autotest.TestBase;
import org.testng.annotations.Test;
import pages.LoginPage;

public class RegTest extends TestBase{
    @Test
    public void RegTest() throws InterruptedException {
        // Создание экземпляра страницы авторизации
        LoginPage loginPage = new LoginPage(driver);
        // Переключение на iFrame
        loginPage.switchToIframe();
        // Ввод имени пользователя и пароля
        loginPage.setEmailField("exampleForReg1@gmail.com");
        // Нажатие на кнопку входа
        loginPage.clickContinue();
        // Пауза в выполнении теста на 5 секунд
        Thread.sleep(5000);
    }
}
