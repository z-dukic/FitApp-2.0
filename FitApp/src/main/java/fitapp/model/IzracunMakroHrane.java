/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author PC
 */
@Entity
public class IzracunMakroHrane extends Entitet {

    @ManyToOne()
    private DnevnikHrane dnevnikHrane;

    @ManyToOne
    private Hrana hranaMakro;

    private int kalorije;

    public DnevnikHrane getDnevnikHrane() {
        return dnevnikHrane;
    }

    public void setDnevnikHrane(DnevnikHrane dnevnikHrane) {
        this.dnevnikHrane = dnevnikHrane;
    }

    public int getKalorije() {
        return kalorije;
    }

    public void setKalorije(int kalorije) {
        this.kalorije = kalorije;
    }

    public Hrana getHranaMakro() {
        return hranaMakro;
    }

    public void setHranaMakro(Hrana hranaMakro) {
        this.hranaMakro = hranaMakro;
    }

    //Baca error da je string "";
//    @Override
//    public String toString() {
//
//        
//        return dnevnikHrane.toString();
//    }
    //To dodaje null vrijednost.

    @Override
    public String toString() {
        return " " + hranaMakro + " " + kalorije + "g";
    }

    
}
