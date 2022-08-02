import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class ErrorFieldCaseTest extends LoginPage{
    WebDriver driver = new ChromeDriver();
    private final String errorText;
    private final String expectedName;
    private final String expectedFamily;
    private final String expectedAddress;
    private final String expectedNumber;

    public ErrorFieldCaseTest(String errorText, String expectedName, String expectedFamily, String expectedAddress, String expectedNumber) {
        this.errorText = errorText;
        this.expectedName = expectedName;
        this.expectedFamily = expectedFamily;
        this.expectedAddress = expectedAddress;
        this.expectedNumber = expectedNumber;
    }

    @Parameterized.Parameters
    public static Object[][] getTestName() {
        return new Object[][]{
                {"123", "Введите корректное имя", "Введите корректную фамилию", "Введите корректный адрес", "Введите корректный номер"},
                {"A3", "Введите корректное имя", "Введите корректную фамилию", "Введите корректный адрес", "Введите корректный номер"},
                {"RO", "Введите корректное имя", "Введите корректную фамилию", "Введите корректный адрес", "Введите корректный номер"},
        };
    }

    @Before
    public void setup() {
        driver.get("https://qa-scooter.praktikum-services.ru/order");
        driver.findElement(By.id("rcc-confirm-button")).click();
    }

    @Test
    public void errorNameField() {

        LoginPage errorField = new LoginPage(driver);
        driver.findElement(nameField).sendKeys(errorText);
        errorField.clickFamilyField();
        String actual = errorField.getErrorTextName();
        Assert.assertEquals(expectedName, actual);
    }

    @Test
    public void errorFamilyField() {

        LoginPage errorField = new LoginPage(driver);
        driver.findElement(familyField).sendKeys(errorText);
        errorField.clickNameField();
        String actual = errorField.getErrorTextFamily();
        Assert.assertEquals(expectedFamily, actual);
    }
    @Test
    public void errorAddressField() {

        LoginPage errorField = new LoginPage(driver);
        driver.findElement(addressField).sendKeys(errorText);
        errorField.clickNameField();
        String actual = errorField.getErrorTextAddress();
        Assert.assertEquals(expectedAddress, actual);
    }

    @Test
    public void errorNumberField() {

        LoginPage errorField = new LoginPage(driver);
        driver.findElement(telephoneField).sendKeys(errorText);
        errorField.clickFamilyField();
        String actual = errorField.getErrorTextNumber();
        Assert.assertEquals(expectedNumber, actual);
    }


    @After
    public void teardown() {
        driver.quit();
    }
}