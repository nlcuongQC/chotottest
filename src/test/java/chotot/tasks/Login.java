package chotot.tasks;

import chotot.ui.LoginForm;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static chotot.ui.LoginForm.LOGIN_SUBMIT_BTN;

public class Login {

    public static Performable with(String phoneNumber, String password) {
        return Task.where("{0} login with phone and password",
                          Enter.theValue(phoneNumber).into(LoginForm.PHONE_TXTBX),
                          Enter.theValue(password).into(LoginForm.PASSWORD_TXTBX),
                          Click.on(LOGIN_SUBMIT_BTN));
    }
}
