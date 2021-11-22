package co.com.choucair.pruebaautomatizacion.models;

import co.com.choucair.pruebaautomatizacion.models.builders.VariablesBuilder;

public class Variables {

    private final String url,correo,password;


    public Variables(VariablesBuilder variablesBuilder) {
        this.url = variablesBuilder.getUrl();
        this.correo = variablesBuilder.getCorreo();
        this.password = variablesBuilder.getPassword();
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
}
