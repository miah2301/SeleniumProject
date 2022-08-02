import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageTest extends Constans{
    WebDriver driver = new ChromeDriver();

    @Before
    public void setup(){
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
    }

    @Test
    public void testQuestionPrice(){

        HomePage homePage = new HomePage(driver);

        homePage.waitForLoadPage();
        String text = homePage.getTextPrice();
        Assert.assertEquals(Price_CONST, text);
    }
    @Test
    public void testQuestionSeveralScooters(){

        HomePage homePage = new HomePage(driver);

        homePage.waitForLoadPage();
        String text = homePage.getTextSeveralScooters();
        Assert.assertEquals(SeveralScooters_CONST, text);
    }
    @Test
    public void testRentalTime(){

        HomePage homePage = new HomePage(driver);

        homePage.waitForLoadPage();
        String text = homePage.getTextRentalTime();
        Assert.assertEquals(RentalTime_CONST, text);
    }

    @Test
    public void testOrderForToday(){

        HomePage homePage = new HomePage(driver);

        homePage.waitForLoadPage();
        String text = homePage.getTextOrderForToday();
        Assert.assertEquals(OrderForToday_CONST, text);
    }
    @Test
    public void testExtendOrRefund(){

        HomePage homePage = new HomePage(driver);

        homePage.waitForLoadPage();
        String text = homePage.getTextExtendOrRefund();
        Assert.assertEquals(ExtendOrRefund_CONST, text);
    }
    @Test
    public void testCharging(){

        HomePage homePage = new HomePage(driver);

        homePage.waitForLoadPage();
        String text = homePage.getTextCharging();
        Assert.assertEquals(Charging_CONST, text);
    }
    @Test
    public void testOrderUndo(){

        HomePage homePage = new HomePage(driver);

        homePage.waitForLoadPage();
        String text = homePage.getTextOrderUndo();
        Assert.assertEquals(OrderUndo_CONST, text);
    }
    @Test
    public void testMkadElement(){

        HomePage homePage = new HomePage(driver);

        homePage.waitForLoadPage();
        String text = homePage.getTextMkadElement();
        Assert.assertEquals(MkadElement_CONST, text);
    }


    @After
    public void teardown() {
        driver.quit();
    }
}