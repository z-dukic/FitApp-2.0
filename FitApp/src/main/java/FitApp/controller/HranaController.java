/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitApp.controller;

import FitApp.Model.Hrana;
import FitApp.Util.ControllerException;
import java.util.List;

/**
 *
 * @author PC
 */
public abstract class HranaController extends Controller<Hrana> {

    //Izlistanje sve hrane
    @Override
    public List<Hrana> read() {
        return session.createQuery("from Hrana").list();
    }

    //Kontrola hrane (kolicina, ime itd.)
    @Override
    protected void kontrolaCreate() throws ControllerException {
        kontrolaImenaHrane();
        kontrolaKolicinaHrane();

    }

    //Kontrola hrane pri updateu
    @Override
    protected void kontrolaUpdate() throws ControllerException {
        kontrolaImenaHrane();
        kontrolaKolicinaHrane();

    }

    @Override
    protected void kontrolaDelete() throws ControllerException {

    }

    //Dodati ime hrane je obavezno
    private void kontrolaImenaHrane() throws ControllerException {
               if(entitet.getImeHrane()==null || entitet.getImeHrane().trim().length()==0){
           throw new ControllerException("Dodati ime hrane je obavezno.");
    }
               
    }

    //Nemoguce dodati vise od 1000g
    private void kontrolaKolicinaHrane()throws ControllerException {
        if(entitet.getKolicina()>1000){
            throw new ControllerException("Količina hrane ne može biti veća od 1000g (odnosno 1kg).");
        }
        
    
    }

}
