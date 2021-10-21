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
public class Makrohrana extends Entitet {

    @ManyToOne
    private Dnevnik dnevnikHrane;

    @ManyToOne
    private Hrana hranaMakro;

    private int kolicina;

    public Dnevnik getDnevnikHrane() {
        return dnevnikHrane;
    }

    public void setDnevnikHrane(Dnevnik dnevnikHrane) {
        this.dnevnikHrane = dnevnikHrane;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
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
//    @Override
//    public String toString() {
//
//        return " " + dnevnikHrane;
//    }

    @Override
    public String toString() {
        return "" + hranaMakro + " " + kolicina + "g ";
    }
    
    

}
