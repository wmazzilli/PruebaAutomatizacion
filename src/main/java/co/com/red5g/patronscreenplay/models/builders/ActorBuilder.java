package co.com.red5g.patronscreenplay.models.builders;

import co.com.red5g.patronscreenplay.models.Actor;
import javafx.util.Builder;

public class ActorBuilder implements Builder<Actor> {

    private String nombreActor;

    public ActorBuilder() {
        this.nombreActor = "";
    }

    @Override
    public Actor build(){
        return new Actor(this);
    }

    public String getActor() {
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