package co.com.red5g.patronscreenplay.models;

import co.com.red5g.patronscreenplay.models.builders.UserBuilder;

public class User {

    private String nombreUser;
    private String passwordUser;

    public User(UserBuilder userBuilder) {
        this.nombreUser = userBuilder.getNombreUser();
        this.passwordUser = userBuilder.getPasswordUser();
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }
}
