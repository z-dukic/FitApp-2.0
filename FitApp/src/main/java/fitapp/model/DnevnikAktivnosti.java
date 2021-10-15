/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.model;

import fitapp.util.Aplikacija;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    //private String naziv;
    private List<Date> datum = new ArrayList<>();
    
    private int vrijemeTrajanjaAktivnosti;

    @ManyToMany
    private List<Aktivnost> aktivnost;

    @ManyToOne
    private Korisnik korisnik;

    public List<Date> getDatum() {
        return datum;
    }

    public void setDatum(List<Date> datum) {
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

    public DnevnikAktivnosti(List<Date> datum, int vrijemeTrajanjaAktivnosti, List<Aktivnost> aktivnost, Korisnik korisnik) {
        this.datum = datum;
        this.vrijemeTrajanjaAktivnosti = vrijemeTrajanjaAktivnosti;
        this.aktivnost = aktivnost;
        this.korisnik = korisnik;
    }


    

    public DnevnikAktivnosti() {

    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat(Aplikacija.FORMAT_DATUMA);
        return df.format(datum);
    }

}
