/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.rusija2018.controller;
import ffos.rusija2018.model.Mjesto;
import java.util.List;
import org.hibernate.Query;
/**
 *
 * @author Sanja
 */
public class ObradaMjesto extends Obrada{
    public ObradaMjesto(){ super(); } 
    
    //C
    public Mjesto dodaj(Mjesto p){
        session.beginTransaction();
        session.saveOrUpdate(p);
        session.getTransaction().commit();
        
        return p;
    }
    //R
    public List<Mjesto> getMjesta(){
       Query q = session.createQuery("From Mjesto ");
        return q.list();
    }
    //U
    public void promjeni(Mjesto p){    
        session.beginTransaction();
        session.saveOrUpdate(p);
        session.getTransaction().commit();
    }
    //D
    public void obrisi(Mjesto p){ 
        session.beginTransaction();
        session.delete(p);
        session.getTransaction().commit();
    }
}
