import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class MusicPage extends BasePage{

    private static final String musicLocator = "//*[@id=\"music_toolbar_button\"]";
    private static final String musicPlayButton = "//*[@id=\"music_layer\"]/header/wm-player/wm-player-controls";

    public static void clickMusic() {
        $x(musicLocator).click();
        //Понравилось использование sleep, это снижает кол-во ошибок теста, если страницы долго грузятся.
        sleep(1000);
    }
    public static void clickMusicPlayButton() {
        $x(musicPlayButton).click();
        sleep(1000);
    }
}
