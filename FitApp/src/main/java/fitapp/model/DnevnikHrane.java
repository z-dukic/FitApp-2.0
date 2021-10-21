/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.model;

import fitapp.util.Aplikacija;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import static org.hibernate.type.descriptor.java.DateTypeDescriptor.DATE_FORMAT;

/**
 *
 * @author PC
 */
@Entity
public class DnevnikHrane extends Entitet {

    private Date datum;

    @ManyToOne
    private Hrana hrana;

    @OneToMany(mappedBy="dnevnikHrane")
    private List<IzracunMakroHrane> izracunMakroHrane = new ArrayList<>();

    public List<IzracunMakroHrane> getIzracunMakroHrane() {
        return izracunMakroHrane;
    }

    public void setIzracunMakroHrane(List<IzracunMakroHrane> izracunMakroHrane) {
        this.izracunMakroHrane = izracunMakroHrane;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Hrana getHrana() {
        return hrana;
    }

    public void setHrana(Hrana hrana) {
        this.hrana = hrana;
    }

    //date must not be null error
//    public static final String DATE_FORMAT = "d.M.yyyy.";
//    private static SimpleDateFormat dateFormat;
//    
//    	private static String formatDate(Date datum) {
//		dateFormat = new SimpleDateFormat(DATE_FORMAT);
//                return dateFormat.format(datum);
//	}
    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat(Aplikacija.FORMAT_DATUMA);
        return df.format(datum);
    }

//    @Override
//    public String toString() {
//        return "d" + datum;
//    }
}
