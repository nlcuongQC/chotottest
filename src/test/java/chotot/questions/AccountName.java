package chotot.questions;

import chotot.ui.NavBar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AccountName implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(NavBar.ACCOUNT_NAME).viewedBy(actor).asString();
    }

    public static AccountName is() {
        return new AccountName();
    }
}
