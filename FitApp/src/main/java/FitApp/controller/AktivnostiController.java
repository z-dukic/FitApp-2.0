/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitApp.controller;

import FitApp.Model.Aktivnosti;
import FitApp.Util.ControllerException;
import java.util.List;

/**
 *
 * @author PC
 */
public abstract class AktivnostiController extends Controller<Aktivnosti> {

    //Izlistanje svih aktivnosti
    @Override
    public List<Aktivnosti> read() {
        return session.createQuery("from Aktivnosti").list();
    }

    //Kreiranje aktivnosti
    @Override
    protected void kontrolaCreate() throws ControllerException {
        kontrolaImenaAktivnosti();
        kontrolaTrajanjeAktivnosti();

    }

    //Update aktivnosti
    @Override
    protected void kontrolaUpdate() throws ControllerException {
    }

    //Brisanje aktivnosti
    @Override
    protected void kontrolaDelete() throws ControllerException {
    }

    //Dodati ime je obavezno
    private void kontrolaImenaAktivnosti() throws ControllerException {
        if (entitet.getImeAktivnosti() == null || entitet.getImeAktivnosti().trim().length() == 0) {
            throw new ControllerException("Dodati ime aktivnosti je obavezno.");
        }
    }

    private void kontrolaTrajanjeAktivnosti() throws ControllerException {
        if (entitet.getPotroseneKalorijePoSatu() > 1000) {
            throw new ControllerException("Aktivnost ne može imati više od 1000 kcal po satu");

        }
    }

}