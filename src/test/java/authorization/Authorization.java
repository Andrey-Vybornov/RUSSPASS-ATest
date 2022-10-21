package authorization;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class Authorization {

    AuthorizationUtils userEmail = new AuthorizationUtils();

    @Test
    void successfulAuthorization() {
        Configuration.holdBrowserOpen = true;

        open ("https://portal.dev01.russpass.dev/");
//        $()


    }
}
