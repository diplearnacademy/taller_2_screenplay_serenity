package com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;

import static com.ingjuanfg.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticacion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(INPUT_USUARIO),
                Type.theValue("secret_sauce").into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static Autenticacion autenticacionEnSaucedemo(){
        return instrumented(Autenticacion.class);
    }
}