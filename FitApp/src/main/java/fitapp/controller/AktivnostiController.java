/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.controller;

import fitapp.model.Aktivnost;
import fitapp.util.ControllerException;
import java.util.List;

/**
 *
 * @author PC
 */
public class AktivnostiController extends Controller<Aktivnost> {

    //Izlistanje svih aktivnosti
    @Override
    public List<Aktivnost> read() {
        return session.createQuery("from Aktivnost").list();
    }

    public List<Aktivnost> read(String uvjet) {
        return session.createQuery("from Aktivnost a"
                + " where concat (a.imeAktivnosti) "
                + "like :uvjet order by a.imeAktivnosti")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(50)
                .list();
    }

    //Kreiranje aktivnosti
    @Override
    protected void controlCreate() throws ControllerException {
        kontrolaImenaAktivnosti();
        kontrolaTrajanjeAktivnosti();

    }

    //Update aktivnosti
    @Override
    protected void controlUpdate() throws ControllerException {
    }

    //Brisanje aktivnosti
    @Override
    protected void controlDelete() throws ControllerException {
    }

    //Dodati ime je obavezno
    private void kontrolaImenaAktivnosti() throws ControllerException {
        if (modelEntity.getImeAktivnosti() == null || modelEntity.getImeAktivnosti().trim().length() == 0) {
            throw new ControllerException("Dodati ime aktivnosti je obavezno.");
        }
    }

    private void kontrolaTrajanjeAktivnosti() throws ControllerException {
        if (modelEntity.getPotroseneKalorijePoSatu() > 1000) {
            throw new ControllerException("Aktivnost ne može imati više od 1000 kcal po satu");

        }
    }

}
