/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.controller;

import fitapp.model.Dnevnik;
import fitapp.model.Makrohrana;
import fitapp.util.ControllerException;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author PC
 */
public class DnevnikHraneController extends Controller<Dnevnik> {

    @Override
    public List<Dnevnik> read() {
        return session.createQuery("from Dnevnik").list();
    }

    public Dnevnik create() throws ControllerException {

        for (Makrohrana c : entitet.getMakrohrana()) {
            c.setDnevnikHrane(entitet);
            session.save(c);
        }

        return super.create();
    }

    public Dnevnik update() throws ControllerException {
        session.beginTransaction();
        for (Makrohrana c : entitet.getMakrohrana()) {
            session.save(c);
        }
        session.getTransaction().commit();
        return super.update();
    }

    public void delete() throws ControllerException {
        session.beginTransaction();
        for (Makrohrana c : entitet.getMakrohrana()) {
            session.delete(c);
        }
        session.getTransaction().commit();
        super.delete();
    }

    @Override
    protected void controlCreate() throws ControllerException {
        kontrolaDatumaAkoJeNull();
        kontrolaDatumaAkoPostoji();

    }

    @Override
    protected void controlUpdate() throws ControllerException {

    }

    @Override
    protected void controlDelete() throws ControllerException {

    }

    private void kontrolaDatumaAkoJeNull() throws ControllerException {
        if (entitet.getDatum() == null) {
            throw new ControllerException("Morate dodati datum");
        }
    }

    private void kontrolaDatumaAkoPostoji() throws ControllerException {
        Query q = session.createNativeQuery("select count(*) from dnevnikhrane where datum=:nazivParametar");
        q.setParameter("nazivParametar", entitet.getDatum());

        BigInteger ukupno = (BigInteger) q.getSingleResult();

        if (ukupno.compareTo(BigInteger.ZERO) > 0) {
            throw new ControllerException("Datum postoji");
        }
    }
}
