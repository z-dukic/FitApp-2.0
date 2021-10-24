/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.controller;

import fitapp.model.DnevnikAktivnosti;
import fitapp.model.IzracunMakroAktivnost;
import fitapp.model.IzracunMakroHrane;
import fitapp.util.ControllerException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class IzracunMakroAktivnostController extends Controller<IzracunMakroAktivnost> {

    @Override
    public List<IzracunMakroAktivnost> read() {
        return session.createQuery("from makroakt").list();
    }

    public List<IzracunMakroAktivnost> svi() {
        return session.createQuery("from makroakt").list();
    }

    @Override
    protected void controlCreate() throws ControllerException {

    }

    @Override
    protected void controlUpdate() throws ControllerException {

    }

    @Override
    protected void controlDelete() throws ControllerException {

    }

}
