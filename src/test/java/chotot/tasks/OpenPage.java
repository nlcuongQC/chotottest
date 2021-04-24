package chotot.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage {

    public static Performable homePage() {
        return Task.where("{0} open home page", Open.browserOn().thePageNamed("homepage"));
    }
}
