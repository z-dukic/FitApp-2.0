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
@Entity
public class Blog extends Entitet {

    private String nazivClanka;

    @Lob
    private String clanak;

    public String getNazivClanka() {
        return nazivClanka;
    }

    public void setNazivClanka(String nazivClanka) {
        this.nazivClanka = nazivClanka;
    }

    public String getClanak() {
        return clanak;
    }

    public void setClanak(String clanak) {
        this.clanak = clanak;
    }

    public Blog() {
    }

    public Blog(String nazivClanka, String clanak) {
        this.nazivClanka = nazivClanka;
        this.clanak = clanak;
    }

    @Override
    public String toString() {
        return nazivClanka;
    }

}
