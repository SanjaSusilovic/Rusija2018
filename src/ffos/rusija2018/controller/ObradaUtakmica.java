/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.rusija2018.controller;
import ffos.rusija2018.model.Utakmica;
import java.util.List;
import org.hibernate.Query;
/**
 *
 * @author Sanja
 */
public class ObradaUtakmica extends Obrada{
    public ObradaUtakmica(){ super(); } 
    
    //C
    public Utakmica dodaj(Utakmica p){
        session.beginTransaction();
        session.saveOrUpdate(p);
        session.getTransaction().commit();
        
        return p;
    }
    //R
    public List<Utakmica> getUtakmice(){
       Query q = session.createQuery("From Utakmica ");
        return q.list();
    }
    //U
    public void promjeni(Utakmica p){    
        session.beginTransaction();
        session.saveOrUpdate(p);
        session.getTransaction().commit();
    }
    //D
    public void obrisi(Utakmica p){ 
        session.beginTransaction();
        session.delete(p);
        session.getTransaction().commit();
    }
    
    
}
