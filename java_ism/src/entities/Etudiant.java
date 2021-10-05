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
public class Etudiant extends User {
    private String matricule;
    private String tuteur;
    private final String ROLE="ROLE_ETUDIANT";

    public Etudiant() {
        // super();
        this.role=ROLE;
    }
    public Etudiant(int id, String nomComplet) {
        super(id, nomComplet);
    }
// UPDATE ETUDIANT
    public Etudiant(String matricule, String tuteur, String nomComplet) {
        super(nomComplet);
        this.matricule = matricule;
        this.tuteur = tuteur;
        this.role = ROLE;
    }

// INSERT ETUDIANT
    public Etudiant(String matricule, String tuteur, int id, String nomComplet) {
        super(id, nomComplet);
        this.matricule = matricule;
        this.tuteur = tuteur;
        this.role = ROLE;

    } 
    
    public String getMatricule() {
        return matricule;
    }

    public String getTuteur() {
        return tuteur;
    }

    public String getROLE() {
        return ROLE;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }
   
    
}
