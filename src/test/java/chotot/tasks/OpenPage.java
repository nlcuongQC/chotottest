package chotot.tasks;

import chotot.ui.NavBar;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage {

    public static Performable homePage() {
        return Task.where("{0} open home page", Open.browserOn().thePageNamed("homepage"));
    }

    public static Performable loginPage() {
        return Task.where("{0} open login page", Click.on(NavBar.LOGIN_BTN));
    }
}
