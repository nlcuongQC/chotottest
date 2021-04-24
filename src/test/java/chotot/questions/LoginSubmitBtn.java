package chotot.questions;

import chotot.ui.LoginForm;
import chotot.ui.NavBar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Text;

public class LoginSubmitBtn implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Enabled.of(LoginForm.LOGIN_SUBMIT_BTN).viewedBy(actor).asBoolean();
    }

    public static LoginSubmitBtn enabled() {
        return new LoginSubmitBtn();
    }
}
