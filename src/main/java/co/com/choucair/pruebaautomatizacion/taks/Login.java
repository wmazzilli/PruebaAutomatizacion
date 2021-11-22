package co.com.choucair.pruebaautomatizacion.taks;

import co.com.choucair.pruebaautomatizacion.models.builders.VariablesBuilder;
import co.com.choucair.pruebaautomatizacion.userinterfaces.Head;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Head.A_LOGIN_O_REGISTRO),
                Click.on(Head.INPUT_INGRESAR_CORREO),
                Enter.theValue(VariablesBuilder.con().conVariales().getCorreo())
                        .into(Head.INPUT_INGRESAR_CORREO),
                Click.on(Head.INPUT_INGRESAR_PASSWORD),
                Enter.theValue(VariablesBuilder.con().conVariales().getPassword())
                        .into((Head.INPUT_INGRESAR_PASSWORD)),
                Click.on(Head.BOTTON_PARA_INGRESAR)
        );

    }



}
