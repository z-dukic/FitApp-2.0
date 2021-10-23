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
@Entity(name = "makro")
public class IzracunMakroHrane extends Entitet {

    @ManyToOne
    private DnevnikHrane dnevnikHrane;

    @ManyToOne
    private Hrana hranaMakro;

    private int kalorije;
    private int kolicina;
    private int proteini;
    private int ugljikohidrati;
    private int masti;

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
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

    @Override
    public String toString() {
        return "" + hranaMakro + " " + kolicina + "g " + kalorije + "kcal " + proteini + "p " + ugljikohidrati + "uh " + masti + "m ";
    }

}
