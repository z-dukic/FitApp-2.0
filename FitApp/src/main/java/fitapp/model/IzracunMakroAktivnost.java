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
@Entity(name = "makroakt")
public class IzracunMakroAktivnost extends Entitet {

    @ManyToOne
    private DnevnikAktivnosti dnevnikAktivnosti;

    @ManyToOne
    private Aktivnost aktivnostMakro;

    private int trajanjeAktivnosti;
    private int potroseneKcal;
    

    public int getPotroseneKcal() {
        return potroseneKcal;
    }

    public void setPotroseneKcal(int potroseneKcal) {
        this.potroseneKcal = potroseneKcal;
    }

    public Aktivnost getAktivnostMakro() {
        return aktivnostMakro;
    }

    public void setAktivnostMakro(Aktivnost aktivnostMakro) {
        this.aktivnostMakro = aktivnostMakro;
    }

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
        return "" + aktivnostMakro + " " + potroseneKcal+ "kcal " + trajanjeAktivnosti+"min";
    }

}
