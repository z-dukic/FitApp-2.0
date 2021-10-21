/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.controller;

import fitapp.model.Hrana;
import fitapp.util.ControllerException;
import java.util.List;

/**
 *
 * @author PC
 */
public class HranaController extends Controller<Hrana> {

    //Izlistanje sve hrane
    @Override
    public List<Hrana> read() {
        return session.createQuery("from Hrana").list();
    }

    public List<Hrana> read(String uvjet) {
        return session.createQuery("from Hrana h"
                + " where concat (h.imeHrane) "
                + "like :uvjet order by h.imeHrane")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(50)
                .list();
    }

    //Kreiranje hrane
    @Override
    protected void controlCreate() throws ControllerException {
        kontrolaImenaHrane();

    }

    //Update hrane
    @Override
    protected void controlUpdate() throws ControllerException {
        kontrolaImenaHrane();

    }

    //Brisanje hrane
    @Override
    protected void controlDelete() throws ControllerException {

    }

    //Dodati ime hrane je obavezno
    private void kontrolaImenaHrane() throws ControllerException {
        if (entitet.getImeHrane() == null || entitet.getImeHrane().trim().length() == 0) {
            throw new ControllerException("Dodati ime hrane je obavezno.");
        }

    }

}
