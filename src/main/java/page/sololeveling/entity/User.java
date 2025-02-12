package page.sololeveling.entity;

import lombok.Data;
import lombok.Generated;

@Data
public class User {

    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String password;

    public User(String firstname, String lastname, String email, String username, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = email;
        this.email = username;
        this.password = password;
    }
}
