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
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author PC
 */
@Entity
public class DnevnikHrane extends Entitet {

    private Date datum;

    @OneToMany(mappedBy = "dnevnikHrane")
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

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat(Aplikacija.FORMAT_DATUMA);
        return df.format(datum);
    }

}
