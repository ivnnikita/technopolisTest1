import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class MusicTest extends BaseTest {
//также Before и after вынесла бы в BaseTest

    @Before
    public void start() {
        open(baseUrl);
    }

    @Test
    public void MusicPageTest() {
        //вынести данные для входа в константы, чтобы не приходилось в каждом тесте снова вводить эти данные
        LoginPage.signIn("", ""); //Enter your data
        MusicPage.clickMusic();
        MusicPage.clickMusicPlayButton();
    }

    @After
    public void end() {
        sleep(5000);
    }
}
