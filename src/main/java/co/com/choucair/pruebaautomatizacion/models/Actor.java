package co.com.choucair.pruebaautomatizacion.models;

import co.com.choucair.pruebaautomatizacion.models.builders.ActorBuilder;

public class Actor {

    private final String nombreActor;

    public Actor(ActorBuilder actorBuilder) {
        this.nombreActor = actorBuilder.getNombreActor();
    }

    public String getNombreActor() {
        return nombreActor;
    }
}
