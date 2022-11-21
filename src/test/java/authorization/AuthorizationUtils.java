package authorization;


import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class AuthorizationUtils {
    public static String EMAIL = "russ_test@ro.ru";
    public static String PASSWORD = "Test1234!";
    public static String NUMBER = "88005559595";

    void authorizationByEmail() {
//        Configuration.holdBrowserOpen = true;

////        open ("https://portal.dev01.russpass.dev/");
////        $("a[href='/support']").click();
////        $x("//*[@href='/support']").click();
////        $x("//*[@class]//div[@class'']").setValue(AuthorizationUtils.EMAIL);
//        $x("//*[text()='Вход']").click();
        $("div.header-new__end").lastChild().click();
        $("#username").setValue(AuthorizationUtils.EMAIL);
        $("#auth_ok").click();
        $("#password").setValue(AuthorizationUtils.PASSWORD).pressEnter();
    }

    void authorizationByNumber() {
        $("div.header-new__end").lastChild().click();
        $("#username").setValue(AuthorizationUtils.NUMBER);
        $("#auth_ok").click();
        $("#password").setValue(AuthorizationUtils.PASSWORD).pressEnter();
    }
}
