/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.model;

import javax.persistence.Entity;

/**
 *
 * @author PC
 */
@Entity
public class Hrana extends Entitet{

    private String imeHrane;

    public String getImeHrane() {
        return imeHrane;
    }

    public void setImeHrane(String imeHrane) {
        this.imeHrane = imeHrane;
    }

    @Override
    public String toString() {
        return imeHrane;
    }
    
    

}
