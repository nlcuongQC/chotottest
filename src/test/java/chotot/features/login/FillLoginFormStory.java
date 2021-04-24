package chotot.features.login;

import chotot.questions.AccountName;
import chotot.questions.LoginError;
import chotot.questions.LoginSubmitBtn;
import chotot.tasks.FillLoginForm;
import chotot.tasks.Navigate;
import chotot.tasks.OpenPage;
import chotot.ui.LoginForm;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.*;

@RunWith(SerenityRunner.class)
public class FillLoginFormStory {

    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Before
    public void anna_prepare_to_login() {
        anna.can(BrowseTheWeb.with(herBrowser));
        givenThat(anna).wasAbleTo(OpenPage.homePage());

        when(anna).attemptsTo(Navigate.loginPage());
    }

    @Test
    public void anna_login_with_blank_form() {
        when(anna).attemptsTo(FillLoginForm.with("", ""));

        then(anna).should(seeThat(LoginSubmitBtn.enabled(), is(false)));
    }

    @Test
    public void anna_login_with_blank_password() {
        when(anna).attemptsTo(FillLoginForm.with("0932028646", ""));

        then(anna).should(seeThat(LoginSubmitBtn.enabled(), is(false)));
    }

    @Test
    public void anna_login_with_blank_phone() {
        when(anna).attemptsTo(FillLoginForm.with("", "123456"));

        then(anna).should(seeThat(LoginSubmitBtn.enabled(), is(false)));
    }

    @Test
    public void anna_login_with_wrong_password() {
        when(anna).attemptsTo(FillLoginForm.with("0932028646", "1234567"), Click.on(LoginForm.LOGIN_SUBMIT_BTN));

        then(anna).should(seeThat(LoginError.is(), containsString("Số điện thoại hoặc mật khẩu chưa đúng")));
    }

    @Test
    public void anna_login_with_valid_data() {
        when(anna).attemptsTo(FillLoginForm.with("0932028646", "123456"), Click.on(LoginForm.LOGIN_SUBMIT_BTN));

        then(anna).should(seeThat(AccountName.is(), equalTo("Nguyễn Lê Cường")));

    }
}