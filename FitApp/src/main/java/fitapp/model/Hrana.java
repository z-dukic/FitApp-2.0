/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.model;

import javax.persistence.Entity;

/**
 *
 * @author PC
 */
@Entity
public class Hrana extends Entitet {

    private String imeHrane;
    private int kalorije;
    private int proteini;
    private int ugljikohidrati;
    private int masti;

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

    public String getImeHrane() {
        return imeHrane;
    }

    public void setImeHrane(String imeHrane) {
        this.imeHrane = imeHrane;
    }

    @Override
    public String toString() {
        return imeHrane;
    }

}
