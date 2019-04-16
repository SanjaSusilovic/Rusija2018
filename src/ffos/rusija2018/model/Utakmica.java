/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.rusija2018.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
/**
 *
 * @author Sanja
 */
@Entity
@Table
public class Utakmica {
    @Id
    @GeneratedValue
    private Long id;
    
    private String rezultat;
    
    @ManyToOne
    private Ekipa domacin;
    
    @ManyToOne
    private Ekipa gost;
    
    @ManyToOne
    private Mjesto mjesto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRezultat() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat = rezultat;
    }

    public Ekipa getDomacin() {
        return domacin;
    }

    public void setDomacin(Ekipa domacin) {
        this.domacin = domacin;
    }

    public Ekipa getGost() {
        return gost;
    }

    public void setGost(Ekipa gost) {
        this.gost = gost;
    }

    public Mjesto getMjesto() {
        return mjesto;
    }

    public void setMjesto(Mjesto mjesto) {
        this.mjesto = mjesto;
    }
    
        @Override
    public String toString() {
        return mjesto + " " + domacin + " " + gost + " " + rezultat;
    }

    
}
