/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entites.Individu;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author asus
 */
public class DaoIndividu {
    EntityManager em;
    EntityTransaction tx;
    
    public DaoIndividu()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        //tx.begin();
    }
    
    public void add(Individu E)
    {
        try
        {   
            em.persist(E);
            tx.commit();
        }catch (Exception ex)
        {
            System.out.println("Erreur");
        }       
    }
    
    public List<Individu> findAll()
    {
        Query req = em.createQuery(" select d from Individu d ");
        return req.getResultList();
    }
    
    public Individu FindById(long code)
    {
        Individu d ;
        //tx.begin();
        d = em.find(Individu.class , code);
        //tx.commit();
        return d;
        
    }
    
    public boolean update (Individu d)
    {
        if (FindById(d.getId()) == null)
        {
            System.err.println("Pas d'individu");
            return false;
        }
        tx.begin();
        try
        {
            em.merge(d);
        }
        catch (Exception ex)
        {
            tx.commit();
            return false ;
        }
        tx.commit();
        return true;
    }
    
}
