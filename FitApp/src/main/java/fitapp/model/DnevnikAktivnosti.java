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
import javax.persistence.OneToMany;

/**
 *
 * @author PC
 */
@Entity
public class DnevnikAktivnosti extends Entitet {

    private Date datum;

    @OneToMany(mappedBy = "dnevnikAktivnosti")
    private List<IzracunMakroAktivnost> izracunMakroAktivnost = new ArrayList<>();

    public List<IzracunMakroAktivnost> getIzracunMakroAktivnost() {
        return izracunMakroAktivnost;
    }

    public void setIzracunMakroAktivnost(List<IzracunMakroAktivnost> izracunMakroAktivnost) {
        this.izracunMakroAktivnost = izracunMakroAktivnost;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat(Aplikacija.FORMAT_DATUMA);
        return df.format(datum);
    }

}
