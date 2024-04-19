package com.ingjuanfg.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ProductoPage {

    public static final Target TITLE_PAGINA = the("Titulo Pagina").located(By.xpath("//div[@id='inventory_filter_container']//div"));

}

