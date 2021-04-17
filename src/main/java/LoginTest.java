import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class LoginTest extends BaseTest {

    @Before
    public void start() {
        open(baseUrl);
    }

    @Test
    public void loginPageTest() {
        LoginPage.signIn("", ""); //Enter your data
    }

    @After
    public void end() {
        sleep(5000);
    }
}
