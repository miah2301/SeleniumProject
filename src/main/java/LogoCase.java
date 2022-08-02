import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoCase {

    WebDriver driver;

    public LogoCase(WebDriver driver) {
        this.driver = driver;
    }

    private final By samokatLogo = By.xpath("//img[@alt = 'Scooter']");
    private final By yandexLogo = By.xpath("//img[@alt = 'Yandex']");

    public void clickSamokatLogo() {
        driver.findElement(samokatLogo).click();
    }

    public void clickYandexLogo() {
        driver.findElement(yandexLogo).click();
    }

}

