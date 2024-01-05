package StepDefinitions;

import Pages.DesignShadeAsGuestPage;
import Pages.LoginPage;

public class PageInitializer {

    public static LoginPage login;
     public static DesignShadeAsGuestPage designShadeAsGuest;



    public static void initializePageObjects(){

        login = new LoginPage();
        designShadeAsGuest = new DesignShadeAsGuestPage();



    }
}
