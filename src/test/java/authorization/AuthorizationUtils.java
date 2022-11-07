package authorization;


import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AuthorizationUtils {
    public static String EMAIL = "russ_test@ro.ru";
    public static String PASSWORD = "Test1234!";

    void successfulAuthorization() {
        Configuration.holdBrowserOpen = true;

////        open ("https://portal.dev01.russpass.dev/");
////        $("a[href='/support']").click();
////        $x("//*[@href='/support']").click();
////        $x("//*[@class]//div[@class'']").setValue(AuthorizationUtils.EMAIL);
        $x("//*[text()='Вход']").click();
        $("#username").setValue(AuthorizationUtils.EMAIL);
        $("#auth_ok").click();
        $("#password").setValue(AuthorizationUtils.PASSWORD).pressEnter();
    }
}
