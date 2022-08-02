import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoCaseTest extends Constans{

    WebDriver driver = new ChromeDriver();

    @Before
    public void setup(){
        driver.get("https://qa-scooter.praktikum-services.ru/order");
    }

    @Test
    public void testSamokatLogo(){
        LogoCase logoSamokat = new LogoCase(driver);
        logoSamokat.clickSamokatLogo();
        String ActualURL = driver.getCurrentUrl();
        Assert.assertEquals(ActualURL, mainURL_CONST);
    }

    @Test
    public void testYandexLogo(){
        LogoCase logoYandex = new LogoCase(driver);
        logoYandex.clickYandexLogo();
        String ActualURL = driver.getCurrentUrl();
        Assert.assertEquals(ActualURL, yandexURL_CONST);
    }


    @After
    public void teardown(){
        driver.quit();
    }
}