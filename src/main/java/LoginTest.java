import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class LoginTest extends BaseTest {
    //Before перенесла бы в BaseTest
    @Before
    public void start() {
        open(baseUrl);
    }

    /**
     *Фактически тест ничего не проверяет, так как при вводе как корректных логин/пароль, так и некорректных логин/пароль,
     * тест завершается успешно.
     */
    @Test
    public void loginPageTest() {
        //вынести данные для входа в константы, чтобы не приходилось в каждом тесте снова вводить эти данные
        LoginPage.signIn("", ""); //Enter your data
    }

    //также вынесла бы в BaseTest
    @After
    public void end() {
        sleep(5000);
    }
}
