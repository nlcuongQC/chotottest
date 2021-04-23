package chotot.features.login;

import chotot.questions.AccountName;
import chotot.tasks.Login;
import chotot.tasks.OpenPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class LoginStory {

    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void anna_should_login_successfully() {

        givenThat(anna).wasAbleTo(OpenPage.homePage());

        when(anna).attemptsTo(OpenPage.loginPage(), Login.with("0932028646", "123456"));

        then(anna).should(seeThat(AccountName.is(), equalTo("Nguyễn Lê Cường")));

    }
}