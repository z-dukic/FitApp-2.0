/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author PC
 */
@Entity
public class Dnevnik extends Entitet {
    
        private Date datum;
        
        @ManyToOne
	private Aktivnosti aktivnost;
        
        @ManyToOne
	private Hrana hrana;
        
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

    public Hrana getHrana() {
        return hrana;
    }

    public void setHrana(Hrana hrana) {
        this.hrana = hrana;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
        
        
    
}
