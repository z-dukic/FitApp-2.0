/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.model;

import javax.persistence.ManyToOne;

/**
 *
 * @author PC
 */
public class IzracunMakroAktivnost extends Entitet{
    
    @ManyToOne
    private DnevnikAktivnosti dnevnikAktivnosti;
    
    private int trajanjeAktivnosti;

    public DnevnikAktivnosti getDnevnikAktivnosti() {
        return dnevnikAktivnosti;
    }

    public void setDnevnikAktivnosti(DnevnikAktivnosti dnevnikAktivnosti) {
        this.dnevnikAktivnosti = dnevnikAktivnosti;
    }

    public int getTrajanjeAktivnosti() {
        return trajanjeAktivnosti;
    }

    public void setTrajanjeAktivnosti(int trajanjeAktivnosti) {
        this.trajanjeAktivnosti = trajanjeAktivnosti;
    }

    @Override
    public String toString() {
        return dnevnikAktivnosti.toString();
    }
    
    
    
}
