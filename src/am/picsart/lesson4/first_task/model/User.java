package am.picsart.lesson4.first_task.model;

import am.picsart.lesson4.first_task.services.Validation;

public class User {
    private String fullName;
    private String username;
    private String email;
    private String password;

    public User(String fullName, String username, String email, String password) {
        setFullName(fullName);
        setUsername(username);
        setEmail(email);
        setPassword(password);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = Validation.md5FormatString(password);
    }

    @Override
    public String toString() {
        return String.format("%s:%s:%s:%s", fullName, username, email, password);
    }
}
