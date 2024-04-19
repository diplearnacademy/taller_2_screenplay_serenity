package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.interactions.Abrir;
import com.ingjuanfg.questions.AutenticacionEcommerce;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.ingjuanfg.tasks.Autenticacion.autenticacionEnSaucedemo;
import static com.ingjuanfg.userinterface.ProductoPage.TITLE_PAGINA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSaucedemoStepDefinition {

    @Dado("que {word} se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina(String nombre) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(nombre).wasAbleTo(
                //Login Interaction Serenity
                //Comentar linea 3 del serenity.properties si se descomenta esta linea
                //Open.url("https://www.saucedemo.com/v1/index.html")

                //Login Interaction Creada
                Abrir.paginaWeb()
        );
    }

    @Cuando("el ingresa sus credenciales")
    public void elUsuarioIngreseSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(
                autenticacionEnSaucedemo()
        );
    }

    @Entonces("el usuario deberia ingresar a la pagina de {word}")
    public void elUsuarioDeberiaIngresarAlEcommerce(String nombrePagina) {
        //Assert con Question
        //theActorInTheSpotlight().should(seeThat(AutenticacionEcommerce.esExitosa(nombrePagina)));

        //Assert con Ensure
        theActorInTheSpotlight().attemptsTo(Ensure.that(TITLE_PAGINA).text().isEqualTo("Products"));
    }
}
