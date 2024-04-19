# Taller #2 Screenplay Web - SerenityBDD

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Este repositorio contiene un escenario de login en Saucedemo con Screenplay y Serenity BDD para comprar con la implementación en Cypress.


## Contenido

- Automatización Screenplay Web
- Ejecución por Terminal


## Automatización Screenplay Web

En la rama principal [main](https://github.com/ingjuanfg/screenplay_automation_project "main") encontrarás el Login. El objetivo de este ejemplo es ver una implementacion basica del Patron para realizar la misama en Cypress.

## Ejecución por Terminal

Para ejecutar y generar la documentación viva, basta con que por medio de una terminal en la ruta donde esta el proyecto ejecutes la siguiente linea:

`gradle clean test aggregate`

Si no cuentas con gradle configurado en tu maquina, usa el wrapper.

`./gradlew clean test aggregate`

Con esta instrucción limpias el proyecto de archivos temporales, ejecuta los test y genera la documentación viva.

Una vez ejecutado, puedes verificar las evidencias en la ruta:

`.../target/site/serenity/index.html`


**Happy Coding!**

***Juan de Jesús Fernández Graciano***
***Dip Learn Academy***

