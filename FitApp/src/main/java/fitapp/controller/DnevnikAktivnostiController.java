/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.controller;

import fitapp.model.DnevnikAktivnosti;
import fitapp.util.ControllerException;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author PC
 */
public class DnevnikAktivnostiController extends Controller<DnevnikAktivnosti> {

    @Override
    public List<DnevnikAktivnosti> read() {
        return session.createQuery("from DnevnikAktivnosti").list();
    }

    @Override
    protected void controlCreate() throws ControllerException {
        kontrolaDatuma();
        kontrolaNullDatuma();

    }

    @Override
    protected void controlUpdate() throws ControllerException {

    }

    @Override
    protected void controlDelete() throws ControllerException {

    }

    private void kontrolaDatuma() throws ControllerException {
        Query q = session.createNativeQuery("select count(*) from dnevnikaktivnosti where datum=:nazivParametar");
        q.setParameter("nazivParametar", modelEntity.getDatum());

        BigInteger ukupno = (BigInteger) q.getSingleResult();

        if (ukupno.compareTo(BigInteger.ZERO) > 0) {
            throw new ControllerException("Datum već postoji");
        }

    }

    private void kontrolaNullDatuma() throws ControllerException {
        if (modelEntity.getDatum() == null) {
            throw new ControllerException("Morate obavezno izabrati datum.");
        }
    }

}
