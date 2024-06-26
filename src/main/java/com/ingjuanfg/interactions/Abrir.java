package com.ingjuanfg.interactions;

import com.ingjuanfg.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Interaction {

    private LoginPage loginPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(loginPage)
        );
    }

    public static Performable paginaWeb(){
        return instrumented(Abrir.class);
    }
}
