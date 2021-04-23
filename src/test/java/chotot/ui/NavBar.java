package chotot.ui;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class NavBar {
    public static final Target LOGIN_BTN    = the("Login button").locatedBy(
            "//div[contains(@class, 'action')]//a[contains(@class, 'navItemLink')]");
    public static final Target ACCOUNT_NAME = the("Account name").locatedBy("//a[contains(@href, 'user')]/span");
}
