/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.zoki.fitness.Model;

import javax.persistence.Entity;

/**
 *
 * @author PC
 */

@Entity
public class Hrana extends MakroNutrijenti{
        
    	private String imeHrane;

    public String getImeHrane() {
        return imeHrane;
    }

    public void setImeHrane(String imeHrane) {
        this.imeHrane = imeHrane;
    }
	
        
        
    
}