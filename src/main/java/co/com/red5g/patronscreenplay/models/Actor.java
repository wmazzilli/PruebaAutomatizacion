package co.com.red5g.patronscreenplay.models;

import co.com.red5g.patronscreenplay.models.builders.ActorBuilder;

public class Actor {

    private final String nombreActor;

    public Actor(ActorBuilder actorBuilder)
    {
        this.nombreActor = actorBuilder.getActor();
    }


    public String getNombreActor() {
        return nombreActor;
    }


}
