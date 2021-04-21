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
        LoginPage.signIn("", ""); //Enter your data
        MusicPage.clickMusic();
        MusicPage.clickMusicPlayButton();
    }

    @After
    public void end() {
        sleep(5000);
    }
}
