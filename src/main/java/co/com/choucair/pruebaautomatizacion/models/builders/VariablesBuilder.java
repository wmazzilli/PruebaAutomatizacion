package co.com.choucair.pruebaautomatizacion.models.builders;


import co.com.choucair.pruebaautomatizacion.models.Variables;
import co.com.choucair.pruebaautomatizacion.utils.Builder;



public class VariablesBuilder implements Builder<Variables> {

    private  String url,correo,password;

    public VariablesBuilder() {
        this.url = "";
        this.correo="";
        this.password="";
    }

    @Override
    public Variables build(){
        return new Variables(this);
    }

    public String getUrl() {
        return url;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    public static VariablesBuilder con(){
        return new VariablesBuilder();
    }


    public VariablesBuilder conUrl(String url){
        this.url = url;
        return this;
    }

    public  VariablesBuilder conCorreo(String correo){
        this.correo = correo;
        return this;
    }

    public VariablesBuilder conPassword(String password){
        this.password = password;
        return this;
    }

    public Variables conVariales(){
        conUrl("http://automationpractice.com/index.php");
        conCorreo("wmazzilli03@gmail.com");
        conPassword("123456789");
        return build();
    }


}
