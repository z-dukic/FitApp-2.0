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

    @ManyToOne
    private DnevnikHrane dnevnikHrane;

    @ManyToOne
    private Hrana hranaMakro;

    private int kalorije;

    private int proteini;

    private int ugljikohidrati;

    private int masti;

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

    public int getProteini() {
        return proteini;
    }

    public void setProteini(int proteini) {
        this.proteini = proteini;
    }

    public int getUgljikohidrati() {
        return ugljikohidrati;
    }

    public void setUgljikohidrati(int ugljikohidrati) {
        this.ugljikohidrati = ugljikohidrati;
    }

    public int getMasti() {
        return masti;
    }

    public void setMasti(int masti) {
        this.masti = masti;
    }

    public Hrana getHranaMakro() {
        return hranaMakro;
    }

    public void setHranaMakro(Hrana hranaMakro) {
        this.hranaMakro = hranaMakro;
    }

<<<<<<< HEAD
    //Baca error da je string "";
//    @Override
//    public String toString() {
//
//        
//        return dnevnikHrane.toString();
//    }

    
    //To dodaje null vrijednost.
=======
>>>>>>> parent of 77fd253 (Save, ali dodaje uvijek null vrijednost.)
    @Override
    public String toString() {

        return dnevnikHrane.toString();
    }

}
