import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private final By price = By.id("accordion__heading-0");
    private final By priceAccordion = By.id("accordion__panel-0");
    private final By severalScooters = By.id("accordion__heading-1");
    private final By severalScootersAccordion = By.id("accordion__panel-1");
    private final By rentalTime = By.id("accordion__heading-2");
    private final By rentalTimeAccordion = By.id("accordion__panel-2");
    private final By orderForToday = By.id("accordion__heading-3");
    private final By orderForTodayAccordion = By.id("accordion__panel-3");
    private final By extendOrRefund = By.id("accordion__heading-4");
    private final By extendOrRefundAccordion = By.id("accordion__panel-4");

    private final By charging = By.id("accordion__heading-5");
    private final By chargingAccordion = By.id("accordion__panel-5");
    private final By orderUndo = By.id("accordion__heading-6");
    private final By orderUndoAccordion = By.id("accordion__panel-6");
    private final By mkadElement = By.id("accordion__heading-7");
    private final By mkadElementAccordion = By.id("accordion__panel-7");

    public String getTextPrice(){
        driver.findElement(price).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(priceAccordion));
        return driver.findElement(priceAccordion).getText();
    }
    public String getTextSeveralScooters(){
        driver.findElement(severalScooters).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(severalScootersAccordion));
        return driver.findElement(severalScootersAccordion).getText();
    }
    public String getTextRentalTime(){
        driver.findElement(rentalTime).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(rentalTimeAccordion));
        return driver.findElement(rentalTimeAccordion).getText();
    }
    public String getTextOrderForToday(){
        driver.findElement(orderForToday).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(orderForTodayAccordion));
        return driver.findElement(orderForTodayAccordion).getText();
    }
    public String getTextExtendOrRefund(){
        driver.findElement(extendOrRefund).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(extendOrRefundAccordion));
        return driver.findElement(extendOrRefundAccordion).getText();
    }
    public String getTextCharging(){
        driver.findElement(charging).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(chargingAccordion));
        return driver.findElement(chargingAccordion).getText();
    }
    public String getTextOrderUndo(){
        driver.findElement(orderUndo).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(orderUndoAccordion));
        return driver.findElement(orderUndoAccordion).getText();
    }
    public String getTextMkadElement(){
        driver.findElement(mkadElement).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(mkadElementAccordion));
        return driver.findElement(mkadElementAccordion).getText();
    }

    public void waitForLoadPage(){
        WebElement element = new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(mkadElement));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

}
