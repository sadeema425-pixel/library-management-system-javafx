/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

/**
 *
 * @author sadeem
 */
public class Member extends Person {
        private String username;
        private String password;

    public Member(String name, int id, String username, String password) {
        super(name, id);
        this.username = username;
        this.password = password;
    }

    public Member() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login(String inputUsername, String inputPassword) {
        if (this.username != null && this.username.equals(inputUsername) &&
            this.password != null && this.password.equals(inputPassword)) {
            return "Logged in successfully!";
        }
        return "Login failed. Incorrect username or password.";
    }

    public String logout() {
        return "Sorry to see you go :( ";
    }
    
}
