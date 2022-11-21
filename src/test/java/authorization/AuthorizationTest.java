package authorization;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;


public class AuthorizationTest {

    static AuthorizationUtils authorizationUtils;
    static SocialNetworkUtils socialNetworkUtils;

    @BeforeAll
    static void setUp(){
        authorizationUtils = new AuthorizationUtils();
        socialNetworkUtils = new SocialNetworkUtils();
    }

    @BeforeEach
    void openWebSite() {
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        open("https://portal.dev01.russpass.dev/");


    }

    @AfterEach
    void closeWebSite() {
        sleep(5000L);
        closeWindow();
    }

    @Test
    void authorizationByEmail() {
        authorizationUtils.authorizationByEmail();
        $("[class=profile-new__header]").shouldHave(text(AuthorizationUtils.EMAIL));
    }
    @Test
    void authorizationByNumber() {
        authorizationUtils.authorizationByNumber();
        $("[class=profile-new__header]").shouldHave(text(AuthorizationUtils.EMAIL));
    }
    @Test
    void signOut() {
        authorizationUtils.authorizationByEmail();
       $("[class = 'button button--primary button--full-width cookie-banner-new__btn-ok']").click();
       $x("//div[text()='Выйти из профиля']").click();
       $("div.header-new__end").lastChild().shouldHave(text("Вход"));

    }

    @Test
    void authorizationByYandex() {
        socialNetworkUtils.authorizationYandex();

    }

}
