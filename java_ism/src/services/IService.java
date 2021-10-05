/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Classe;
import entities.Etudiant;
import entities.Professeur;
import entities.User;
import java.util.List;

/**
 *
 * @author Mr Demba Ndiaye
 */
public interface IService {
    // cest la couche des services = nombres de packages 
// ça concerne les use cases en mm temps
    
    /*
        ajout retourne boolean
        true ajout correct
        false erreur
    */
    
//RP    
    /* Gerer classe*/
    public boolean addClasse(Classe classe);
    public boolean updateClasse(Classe classe);
    public boolean deleteClasse(int id);
    public List<Classe> showAllClasse();
    public Classe showOneClasse(int id);
    
     /* Affecter Professeur*/
    public Professeur searchProfesseurByNci(String nci);
    public boolean addAffectation(Professeur prof,Classe classe,String annee);
    public List<Classe> searchClasseByProfesseur(String nci,String annee);

     /* Se connecter*/
    public User seConnecter(String login, String password);
    
    //lister Professeur
    public List<Professeur> showAllProfesseur();
    
    
//AC       
     /* Inscription Etudiant*/
    public Etudiant searchEtudiantByMat(String mat);
    public boolean addInscription(Etudiant etu,Classe classe,String annee);
    public Etudiant searchInscriptionByEtudiantAndYear(int id, String annee) ;

     /* Lister inscrits d'une annee*/
    public List<Etudiant> searchInscriptionByYear(String annee);
    public List<Etudiant> searchInscriptionByYear(String annee,Classe classe);

    



}
