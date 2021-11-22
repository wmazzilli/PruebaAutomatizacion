package co.com.choucair.pruebaautomatizacion.taks.factories;

import co.com.choucair.pruebaautomatizacion.taks.Login;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LoginFactories {


    public static Performable Login(){
        return Tasks.instrumented(Login.class);
    }
}
