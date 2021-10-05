/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package dao;

import java.util.List;

/**
 *
 * @author Mr Demba Ndiaye
 */
public interface IDao<T> {
   //creer une methode insert
   //Fonction : MAJ(update,delere,insert)
   //les requetes de MAJ retourne toujours un int et le insert retourne le dernier id inserer
   //update et delete on retourne le nombre de ligne modifier
    public int insert(T objet);
    public int update(T objet);
    public int insert(int id);
    
   //Fonction interrogation retornent deux resultats liste avec un findALL() et objet findByID()
    public List<T> findAll();
    public T findById(int id);

    
    



    
    
}
