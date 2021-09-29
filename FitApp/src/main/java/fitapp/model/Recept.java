/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.model;

import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 *
 * @author PC
 */
//Služi samo za blog feature, nije povezan s izračunima
@Entity
public class Recept extends MakroNutrijenti {

    private String nazivRecepta;
    
    @Lob
    private String opisPripreme;

    public String getNazivRecepta() {
        return nazivRecepta;
    }

    public void setNazivRecepta(String nazivRecepta) {
        this.nazivRecepta = nazivRecepta;
    }

}
