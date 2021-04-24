package chotot.ui;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginForm {
    public static final Target PHONE_TXTBX      = the("Phone field").locatedBy("//input[@type = 'tel']");
    public static final Target PASSWORD_TXTBX   = the("Password field").locatedBy("//input[@type = 'password']");
    public static final Target LOGIN_SUBMIT_BTN = the("Submit login button").locatedBy("//button[@type = 'submit']");
    public static final Target ERROR_TXT = the("Not match error text").locatedBy("//div[contains(@class, 'error')]");
}
