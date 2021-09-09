/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitApp.Util;

/**
 *
 * @author PC
 */
public class ControllerException extends Exception {

    private String poruka;

    public ControllerException(String poruka) {
        super();
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }

}
