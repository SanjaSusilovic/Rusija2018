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

/**
 *
 * @author Sanja
 */
@Entity
@Table
public class Ekipa {
    @Id
    @GeneratedValue
    private Long id;
    
    private String naziv;
    
    private String izbornik;
    
    private String pozicija;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getIzbornik() {
        return izbornik;
    }

    public void setIzbornik(String izbornik) {
        this.izbornik = izbornik;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }
    
        @Override
    public String toString() {
        return naziv + " " + izbornik + " " + pozicija;
    }

}
