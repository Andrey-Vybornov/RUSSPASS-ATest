package authorization;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.commands.SetValue;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;


public class Authorization {

    AuthorizationUtils userEmail = new AuthorizationUtils();

    @BeforeEach
    void openWebSite() {
        open("https://portal.dev01.russpass.dev/");
    }

    @AfterAll
    static void closeWebSite() {
        sleep(5000L);
        closeWindow();
    }

    @Test
    void successfulAuthorization() {
        Configuration.holdBrowserOpen = true;

//        open ("https://portal.dev01.russpass.dev/");
//        $("a[href='/support']").click();
//          $x("//*[@href='/support']").click();
        $x("//*[text()='Вход']").click();
        $("#username").setValue(AuthorizationUtils.EMAIL);
//        $x("//*[@class]//div[@class'']").setValue(AuthorizationUtils.EMAIL);;



    }
}
