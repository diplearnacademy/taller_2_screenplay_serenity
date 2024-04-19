package com.ingjuanfg.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage extends PageObject {

    public static final Target INPUT_USUARIO = the("Campo de Texto para Usuario").located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = the("Campo de Texto para Password").located(By.id("password"));
    public static final Target BTN_LOGIN = the("Boton Login").located(By.id("login-button"));

}
