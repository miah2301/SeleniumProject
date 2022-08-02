import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage() {
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // LOGIN PAGE 1
    private final By firstButtonOrder = By.className("Button_Button__ra12g");
    private final By secondButtonOrder = By.xpath("//button[contains(@class,'Button_Middle__1CSJM')]");
    private final By buttonNext = By.xpath("//button[text() = 'Далее']");
    protected final By nameField = By.xpath("//input[@placeholder='* Имя']");
    protected final By familyField = By.xpath("//input[@placeholder='* Фамилия']");
    protected final By addressField = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    protected final By telephoneField = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By metroField = By.xpath("//input[@placeholder='* Станция метро']");
    private final By selectMetroField = By.xpath("//div[@class='select-search__select']/ul//li/button[@value='25']");
    private final By selectMetroFieldSecond = By.xpath("//div[@class='select-search__select']/ul//li/button[@value='18']");

    // LOGIN PAGE 2
    private final By dataField = By.xpath("//input[contains(@class,'Input_Responsible__1jDKN')]");
    private final By nextMonth = By.xpath("//button[contains(@class,'react-datepicker__navigation--next')]");
    private final By data = By.xpath("//*[text() = '10']");
    private final By rentalPeriodField = By.className("Dropdown-placeholder");
    private final By rentalPeriodDropdownElement = By.xpath("//*[text() = 'трое суток']");
    private final By checkBox = By.xpath("//input[@id='black']");
    private final By comment = By.xpath("//input[@placeholder='Комментарий для курьера']");
    private final By buttonOrder = By.xpath("//button[contains(@class, 'Button_Middle__1CSJM')][text() = 'Заказать']");
    private final By buttonYes = By.xpath("//button[text()='Да']");
    private final By viewStatus = By.xpath("//button[text()='Посмотреть статус']");

    // ErrorsField
    private final By errorFieldName = By.xpath("//div[text() = 'Введите корректное имя']");
    private final By errorFieldFamily = By.xpath("//div[text() = 'Введите корректную фамилию']");
    private final By errorFieldNumber = By.xpath("//div[text() = 'Введите корректный номер']");
    private final By errorFieldAddress = By.xpath("//div[text() = 'Введите корректный адрес']");

    public void clickFirstButtonOrder() {
        driver.findElement(firstButtonOrder).click();
    }

    public void clickSecondButtonOrder() {
        driver.findElement(secondButtonOrder).click();
    }

    public void clickNextButton() {
        driver.findElement(buttonNext).click();
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void setFamily(String family) {
        driver.findElement(familyField).sendKeys(family);
    }

    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void setTelephone(String telephone) {
        driver.findElement(telephoneField).sendKeys(telephone);
    }

    public void setMetro() {
        driver.findElement(metroField).click();
        driver.findElement(selectMetroField).click();

    }

    public void setMetroSecond() {
        driver.findElement(metroField).click();
        driver.findElement(selectMetroFieldSecond).click();

    }

    public void login(String name, String family, String address, String telephone) {
        setName(name);
        setFamily(family);
        setAddress(address);
        setTelephone(telephone);
    }

    // LOGIN PAGE 2 METHODS
    public void clickDataField() {
        driver.findElement(dataField).click();
    }

    public void clickNextMonth() {
        driver.findElement(nextMonth).click();
    }

    public void selectData() {
        driver.findElement(data).click();
    }

    public void clickRentalPeriod() {
        driver.findElement(rentalPeriodField).click();
    }

    public void clickRentalPeriodDropdownElement() {
        driver.findElement(rentalPeriodDropdownElement).click();
    }

    public void clickCheckBox() {
        driver.findElement(checkBox).click();
    }

    public void commentInField() {
        driver.findElement(comment).sendKeys("Тут комментарий");
    }

    public void clickButtonOrder() {
        driver.findElement(buttonOrder).click();
    }

    public void clickYesButton() {
        driver.findElement(buttonYes).click();
    }

    public void clickViewStatusButton() {
        driver.findElement(viewStatus).click();
    }

    public void loginInformation() {
        clickDataField();
        clickNextMonth();
        selectData();
        clickRentalPeriod();
        clickRentalPeriodDropdownElement();
        clickCheckBox();
        commentInField();
        clickButtonOrder();
        clickYesButton();
    }

    public String getTextStatus() {
        return driver.findElement(viewStatus).getText();
    }


    // ERROR FIELDS METHODS

    public void clickNameField() {
        driver.findElement(nameField).click();
    }

    public void clickFamilyField() {
        driver.findElement(familyField).click();
    }

    public String getErrorTextName() {
        return driver.findElement(errorFieldName).getText();
    }

    public String getErrorTextFamily() {
        return driver.findElement(errorFieldFamily).getText();
    }

    public String getErrorTextNumber() {
        return driver.findElement(errorFieldNumber).getText();
    }

    public String getErrorTextAddress() {
        return driver.findElement(errorFieldAddress).getText();
    }
}
