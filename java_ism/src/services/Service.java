/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.AffectationDao;
import dao.ClasseDao;
import dao.EtudiantDao;
import dao.InscriptionDao;
import dao.ProfesseurDao;
import dao.UserDao;
import entities.Classe;
import entities.Etudiant;
import entities.Professeur;
import entities.User;
import entities.Affectation;
import entities.Inscription;
import java.util.List;


/**
 *
 * @author Mr Demba Ndiaye
 */
public class Service implements IService {
    
    //Dependance
    AffectationDao daoAff = new AffectationDao();
    ClasseDao daoClasse = new ClasseDao();
    EtudiantDao daoEtu = new EtudiantDao();
    ProfesseurDao daoProf = new ProfesseurDao();
    InscriptionDao daoInscription = new InscriptionDao();
    UserDao daoUser = new UserDao();




    @Override
    public boolean addClasse(Classe classe) {
        return daoClasse.insert(classe)!=0;

    }

    @Override
    public boolean updateClasse(Classe classe) {
        return daoClasse.update(classe)!=0;
    }

    @Override
    public boolean deleteClasse(int id) {
        return daoClasse.delete(id) !=0;
    }

    @Override
    public List<Classe> showAllClasse() {
        return daoClasse.findAll();

    }

    @Override
    public Classe showOneClasse(int id) {
        return daoClasse.findById(id) ;

    }

    @Override
    public Professeur searchProfesseurByNci(String nci) {
        return daoProf.findByNci(nci);
    }

    @Override
    public boolean addAffectation(Professeur prof, Classe classe, String annee) {
        //nouveau prof
        if(prof.getId()==0){
            int id=daoProf.insert(prof);
            prof.setId(id);
        }
        Affectation affect = new Affectation(annee,classe,prof);
        return daoAff.insert(affect) !=0;
    }

    @Override
    public List<Classe> searchClasseByProfesseur(String nci, String annee) {
        return daoClasse.findClassByProfesseur(nci, annee);
    }
    
    
    
    @Override
    public List<Professeur> showAllProfesseur() {
        return daoProf.findAll();
    }

    @Override
    public Etudiant searchEtudiantByMat(String matricule) {
        return daoEtu.finfBymat(matricule);
    }

    @Override
    public boolean addInscription(Etudiant etu, Classe classe, String annee) {
        if(etu.getId()==0){
            int id = daoEtu.insert(etu);
            etu.setId(id);
        }
        Inscription ins = new Inscription(annee, classe,etu);
        return daoIns.insert(ins)!=0;
    }

    @Override
    public Etudiant searchInscriptionByEtudiantAndYear(int id, String annee) {
        return daoEtu.findByIdAndAnnee(id, annee);
    }

    @Override
    public List<Etudiant> searchInscriptionByYear(String annee) {
        return daoEtu.findAll(annee);
    }

    @Override
    public List<Etudiant> searchInscriptionByYear(String annee, Classe classe) {
        return daoEtu.findAll(annee, classe);
    }
    
    @Override
    public User seConnecter(String login, String password) {
        return daoUser.findUserLoginAndPassword(login, password);
    }

    private static class daoIns {

        private static int insert(Inscription ins) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public daoIns() {
        }
    }
    

  
    
}
