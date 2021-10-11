/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.model;

<<<<<<< HEAD
import fitapp.util.Aplikacija;
=======
import java.text.DateFormat;
>>>>>>> parent of 076721c (Prepravak datuma.)
import java.text.SimpleDateFormat;
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
public class DnevnikHrane extends Entitet {

    private Date datum;

    @ManyToMany
    private List<Hrana> hrana;

    private int kolicinaUneseneHrane;

    @ManyToOne
    private Korisnik korisnik;

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public List<Hrana> getHrana() {
        return hrana;
    }

    public void setHrana(List<Hrana> hrana) {
        this.hrana = hrana;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public int getKolicinaUneseneHrane() {
        return kolicinaUneseneHrane;
    }

    public void setKolicinaUneseneHrane(int kolicinaUneseneHrane) {
        this.kolicinaUneseneHrane = kolicinaUneseneHrane;
    }

    
    //date must not be null error
//    public static final String DATE_FORMAT = "d.M.yyyy.";
//    private static SimpleDateFormat dateFormat;
//    
//    	private static String formatDate(Date datum) {
//		dateFormat = new SimpleDateFormat(DATE_FORMAT);
//                return dateFormat.format(datum);
//	}
        
//    @Override
//    public String toString() {
//        return "d: " + formatDate(datum);
//    }

        @Override
    public String toString() {
        return "d: " + datum;
    }
}
