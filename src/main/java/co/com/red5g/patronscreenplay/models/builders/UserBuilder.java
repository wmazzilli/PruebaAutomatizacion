package co.com.red5g.patronscreenplay.models.builders;

import co.com.red5g.patronscreenplay.models.User;
import javafx.util.Builder;

public class UserBuilder implements Builder<User> {

    private String nombreUser;
    private String passwordUser;

    @Override
    public User build() {
        return null;
    }

    public UserBuilder() {
        this.nombreUser = "";
        this.passwordUser = "";
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public static UserBuilder con() {
        return new UserBuilder();
    }

    public UserBuilder conUser(String nombreUser){
        this.nombreUser = nombreUser;
        return this;
    }

    public UserBuilder conPassword(String passwordUser){
        this.passwordUser = passwordUser;
        return this;
    }

    public User conUserCredenciales(){
        conUser("ochinchilla");
        conPassword("Nicolas32@");
        return build();
    }



}
