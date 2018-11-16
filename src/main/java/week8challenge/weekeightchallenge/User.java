package week8challenge.weekeightchallenge;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

 @Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;

     public Set<MyMessage> getMessages() {
         return messages;
     }

     public void setMessages(Set<MyMessage> messages) {
         this.messages = messages;
     }

    //@ManyToMany
    private Set<MyMessage> messages;

     public User() {
         messages = new HashSet<>();
     }

     public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
