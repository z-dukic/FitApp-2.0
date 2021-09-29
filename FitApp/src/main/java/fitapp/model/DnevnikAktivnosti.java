/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author PC
 */
@Entity
public class DnevnikAktivnosti extends Entitet {

    private Date datum;
    private int vrijemeTrajanjaAktivnosti;

    @ManyToMany
    private List<Aktivnost> aktivnost;

    @ManyToOne
    private Korisnik korisnik;

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public List<Aktivnost> getAktivnost() {
        return aktivnost;
    }

    public void setAktivnost(List<Aktivnost> aktivnost) {
        this.aktivnost = aktivnost;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public int getVrijemeTrajanjaAktivnosti() {
        return vrijemeTrajanjaAktivnosti;
    }

    public void setVrijemeTrajanjaAktivnosti(int vrijemeTrajanjaAktivnosti) {
        this.vrijemeTrajanjaAktivnosti = vrijemeTrajanjaAktivnosti;
    }

}
