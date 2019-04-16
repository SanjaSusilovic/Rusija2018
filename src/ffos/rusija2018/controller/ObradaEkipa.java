/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.rusija2018.controller;
import ffos.rusija2018.model.Ekipa;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Sanja
 */
public class ObradaEkipa extends Obrada{
    public ObradaEkipa(){ super(); } 
    
    //C
    public Ekipa dodaj(Ekipa p){
        session.beginTransaction();
        session.saveOrUpdate(p);
        session.getTransaction().commit();
        
        return p;
    }
    //R
    public List<Ekipa> getEkipe(){
       Query q = session.createQuery("From Ekipa ");
        return q.list();
    }
    //U
    public void promjeni(Ekipa p){    
        session.beginTransaction();
        session.saveOrUpdate(p);
        session.getTransaction().commit();
    }
    //D
    public void obrisi(Ekipa p){ 
        session.beginTransaction();
        session.delete(p);
        session.getTransaction().commit();
    }
}
