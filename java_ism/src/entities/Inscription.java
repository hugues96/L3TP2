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
public class Inscription {
    private int id;
    private String annee;
    
 //attribut navigationnel
    private Classe classe;
    private Etudiant etudiant;
   
    
    public Inscription() {
    }
        public Inscription(String annee) {
        this.annee = annee;
    }
    
    public Inscription(int id, String annee, Etudiant etudiant) {
        this.id = id;
        this.annee = annee;
        this.etudiant = etudiant;
    }

    public Inscription(String annee, Classe classe, Etudiant etu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    
}
