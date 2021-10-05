 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Mr Demba Ndiaye
 */
public class User {
    protected int id;
    protected String nomComplet;
    protected String login;
    protected String password;
    protected String role;

    public void setId(int id) {
        this.id = id;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
//update RP ou AC
    public User(int id, String nomComplet, String login, String password, String role) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public User(int id) {
        this.id = id;
    }

    public User() {
    }
//update des Etudiants ou professeur
    public User(String nomComplet) {
        this.nomComplet = nomComplet;
    }
//update des Etudiants ou professeur
    public User(int id, String nomComplet) {
        this.id = id;
        this.nomComplet = nomComplet;
    }

    
}

