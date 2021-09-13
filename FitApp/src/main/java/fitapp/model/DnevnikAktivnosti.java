/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitApp.model;

import fitapp.model.Aktivnosti;
import fitapp.model.Entitet;

import fitapp.model.Korisnik;
import java.util.Date;
import javax.persistence.ManyToOne;

/**
 *
 * @author PC
 */
public class DnevnikAktivnosti extends Entitet {

    private Date datum;

    @ManyToOne
    private Aktivnosti aktivnost;

    @ManyToOne
    private Korisnik korisnik;

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Aktivnosti getAktivnost() {
        return aktivnost;
    }

    public void setAktivnost(Aktivnosti aktivnost) {
        this.aktivnost = aktivnost;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

}
