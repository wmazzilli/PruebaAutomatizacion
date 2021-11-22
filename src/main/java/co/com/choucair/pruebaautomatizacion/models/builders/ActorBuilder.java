package co.com.choucair.pruebaautomatizacion.models.builders;

import co.com.choucair.pruebaautomatizacion.utils.Builder;
import co.com.choucair.pruebaautomatizacion.models.Actor;


public class ActorBuilder implements Builder<Actor> {

    private String nombreActor;

    public ActorBuilder(){
        this.nombreActor = "";
    }

    @Override
    public Actor build(){
        return new Actor(this);
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public static ActorBuilder con(){
        return new ActorBuilder();
    }

    public ActorBuilder conNombreActor(String nombreActor){
        this.nombreActor = nombreActor;
        return this;
    }

    public Actor conNombreActor(){
        conNombreActor("Mazzilli");
        return build();
    }

}
