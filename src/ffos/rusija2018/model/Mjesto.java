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
public class Mjesto {
    @Id
    @GeneratedValue
    private Long id;
    
    private String naziv_grada;
    
    private String naziv_stadiona;
    
    private int broj_gledatelja;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv_grada() {
        return naziv_grada;
    }

    public void setNaziv_grada(String naziv_grada) {
        this.naziv_grada = naziv_grada;
    }

    public String getNaziv_stadiona() {
        return naziv_stadiona;
    }

    public void setNaziv_stadiona(String naziv_stadiona) {
        this.naziv_stadiona = naziv_stadiona;
    }

    public int getBroj_gledatelja() {
        return broj_gledatelja;
    }

    public void setBroj_gledatelja(int broj_gledatelja) {
        this.broj_gledatelja = broj_gledatelja;
    }
    
       @Override
    public String toString() {
        return naziv_grada + " " + naziv_stadiona  + " " + broj_gledatelja;
    }

    
}
