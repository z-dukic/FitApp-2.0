/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoki.fitness.Model;

import javax.persistence.Entity;

/**
 *
 * @author PC
 */

@Entity
public class Recept extends MakroNutrijenti {
    
    
    private String nazivRecepta;

    public String getNazivRecepta() {
        return nazivRecepta;
    }

    public void setNazivRecepta(String nazivRecepta) {
        this.nazivRecepta = nazivRecepta;
    }
    
    
    
}
