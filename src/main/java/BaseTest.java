import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
//Пожалуйста удаляй не используемые импорты, это улучшит читаемость кода
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    public String baseUrl = "https://ok.ru/";
    //Метод driverInit нигде не используется, может быть стоит его удалить?
    public void driverInit() {
        System.setProperty("webdriver.chrome.driver", "C:/Study/chromedriver.exe");
        open(baseUrl);
    }
}
