package co.com.choucair.pruebaautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Head {

    public static final Target A_LOGIN_O_REGISTRO = Target.the("Etiqueta que me ayudara a ingresar o registrarme")
            .located(By.xpath("//a[@class='login']"));

    public static final Target INPUT_INGRESAR_CORREO = Target.the("Lugar donde se ingresara el correo")
            .located(By.xpath("(//input[@data-validate='isEmail'])[2]"));

    public static final Target INPUT_INGRESAR_PASSWORD = Target.the("Lugar donde se ingresara el password")
            .located(By.xpath("(//input[@class='is_required validate account_input form-control'])[3]"));

    public static final Target BOTTON_PARA_INGRESAR = Target.the("El boton me ayudara a ingresar si ya me registre")
            .located(By.xpath("//button[@id='SubmitLogin']"));

    public static final Target FONT_TEXTO_USUARIO_REGISTRADO = Target.the("Nos ayudara a avalidar el nombre de la persona logueada")
            .located(By.xpath("(//div[@class='header_user_info'])[1]"));



}
