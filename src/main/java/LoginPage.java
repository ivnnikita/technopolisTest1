import static com.codeborne.selenide.Selenide.*;

/**
 * Вместо импорта пакета Selenide.* можно было импортировать вот так:
 * import static com.codeborne.selenide.Selenide.$x;
 * import static com.codeborne.selenide.Selenide.sleep;
 * Это лучше сделать, так как слишком широкие импорты однажды могут привести к проблемам (н-р, увеличение времени компиляции)
 */

public class LoginPage extends BasePage {

    private static final String loginLocator = ".//input[@id='field_email']";
    private static final String passwordLocator = ".//input[@id='field_password']";
    private static final String singInLocator = ".//*[contains(@data-l, \"sign_in\")]";

    private static void clear() {
        $x(loginLocator).clear();
        $x(passwordLocator).clear();
    }

    public static void signIn(String username, String password) {
        clear();
        $x(loginLocator).sendKeys(username);
        $x(passwordLocator).sendKeys(password);
        $x(singInLocator).click();
        sleep(1000);
    }
}
