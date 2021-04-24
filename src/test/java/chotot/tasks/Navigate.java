package chotot.tasks;

import chotot.ui.NavBar;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Navigate {

    public static Performable loginPage() {
        return Task.where("{0} open login page", Click.on(NavBar.LOGIN_BTN));
    }
}
