package authorization;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SocialNetworkUtils {
   void authorizationYandex() {
       String EMAILYANDEX = "qarusstester@yandex.ru";
       String PASSWORDYANDEX = "Test1234!";
       $x("//*[text()='Вход']").click();
       $x("//a[text()='Яндекс']").click();
       $("#passp-field-login");
       $("#passp:sign-in");
       $("#passp-field-passwd");
   }
   void authorizationGoogle() {
        String EMAILGOOGLE = "qarusstester@gmail.com";
        String PASSWORDGOOGLE = "Test1234!";
   }
   void authorizationVk() {
       String EMAILVK = "+79657738819";
       String PASSWORDVK = "Test1234! ";

   }
}
