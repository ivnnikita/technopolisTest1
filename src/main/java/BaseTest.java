import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    public String baseUrl = "https://ok.ru/";

    public void driverInit() {
        System.setProperty("webdriver.chrome.driver", "C:/Study/chromedriver.exe");
        open(baseUrl);
    }
}
