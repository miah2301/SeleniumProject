import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageTest extends Constans {
    WebDriver driver = new FirefoxDriver();

    @Before
    public void setup() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
    }

    @Test
    public void testLoginFirstButton() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickFirstButtonOrder();
        loginPage.login("Миша", "Лосев", "Смоленская", "89853443444");
        loginPage.setMetro();
        loginPage.clickNextButton();

        loginPage.loginInformation();

        String text = loginPage.getTextStatus();
        Assert.assertEquals("Посмотреть статус", text);

        loginPage.clickViewStatusButton();
    }

    @Test
    public void testLoginSecondButton() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickSecondButtonOrder();
        loginPage.login("Андрей", "Иванов", "Арбат", "89853443460");
        loginPage.setMetroSecond();
        loginPage.clickNextButton();

        loginPage.loginInformation();

        String text = loginPage.getTextStatus();
        Assert.assertEquals("Посмотреть статус", text);

        loginPage.clickViewStatusButton();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}