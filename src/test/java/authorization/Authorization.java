package authorization;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.commands.SetValue;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;


public class Authorization {

    AuthorizationUtils userEmail = new AuthorizationUtils();
    AuthorizationUtils authorizationUtils = new AuthorizationUtils();


    @BeforeEach
    void openWebSite() {
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        open("https://portal.dev01.russpass.dev/");
        authorizationUtils.successfulAuthorization();

    }

    @AfterEach
    void closeWebSite() {
        sleep(5000L);
        closeWindow();
    }

    @Test
    void successfulAuthorization() {

        $("[class=profile-new__header]").shouldHave(text(AuthorizationUtils.EMAIL));
    }
    @Test
    void signOut() {

       $("[class = 'button button--primary button--full-width cookie-banner-new__btn-ok']").click();
       $x("//div[text()='Выйти из профиля']").click();
       $x("//span[text()='Вход']").shouldHave(text("Вход"));
    }
}
