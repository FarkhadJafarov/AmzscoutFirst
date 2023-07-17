package autotest.login;

import autotest.TestBase;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends TestBase{
    @Test
    public void loginTest() throws InterruptedException {
        // Создание экземпляра страницы авторизации
        LoginPage loginPage = new LoginPage(driver);
        // Переключение на iFrame
        loginPage.switchToIframe();
        // Переход на табу Sign İn
        loginPage.clickSignİnTab();
        // Ввод имени пользователя и пароля
        loginPage.setEmailField("farkhad.jafarov96@gmail.com");
        loginPage.setPassword("H7yt22LB");
        // Нажатие на кнопку входа
        loginPage.clickContinue();
        // Пауза в выполнении теста на 5 секунд
        Thread.sleep(5000);
    }
}
