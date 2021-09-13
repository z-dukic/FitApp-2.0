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
public class Aktivnosti extends Entitet {

    private String imeAktivnosti;
    private int potroseneKalorijePoSatu;
    private int vrijemeTrajanjaUMinutama;

    public String getImeAktivnosti() {
        return imeAktivnosti;
    }

    public void setImeAktivnosti(String imeAktivnosti) {
        this.imeAktivnosti = imeAktivnosti;
    }

    public int getPotroseneKalorijePoSatu() {
        return potroseneKalorijePoSatu;
    }

    public void setPotroseneKalorijePoSatu(int potroseneKalorijePoSatu) {
        this.potroseneKalorijePoSatu = potroseneKalorijePoSatu;
    }

    public int getVrijemeTrajanjaUMinutama() {
        return vrijemeTrajanjaUMinutama;
    }

    public void setVrijemeTrajanjaUMinutama(int vrijemeTrajanjaUMinutama) {
        this.vrijemeTrajanjaUMinutama = vrijemeTrajanjaUMinutama;
    }

}
