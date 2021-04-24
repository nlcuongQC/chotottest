package chotot.questions;

import chotot.ui.LoginForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginError implements Question<String> {

    public static LoginError is() {
        return new LoginError();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginForm.ERROR_TXT).viewedBy(actor).asString();
    }
}
