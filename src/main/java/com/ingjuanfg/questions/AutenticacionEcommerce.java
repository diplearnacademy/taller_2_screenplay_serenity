package com.ingjuanfg.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.ingjuanfg.userinterface.ProductoPage.TITLE_PAGINA;

public class AutenticacionEcommerce implements Question<Boolean> {

    private String nombrePagina;

    public AutenticacionEcommerce(String nombrePagina){
        this.nombrePagina = nombrePagina;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return nombrePagina.equals(TITLE_PAGINA.resolveFor(actor).getText());
    }

    public static AutenticacionEcommerce esExitosa( String nombrePagina){
        return new AutenticacionEcommerce(nombrePagina);
    }

}
