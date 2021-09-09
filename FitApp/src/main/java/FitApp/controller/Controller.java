/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitApp.controller;

import java.util.List;
import org.hibernate.Session;
import FitApp.Util.ControllerException;
import FitApp.Util.HibernateUtil;

/**
 *
 * @author PC
 */
public abstract class Controller<T> {

    protected Session session;
    protected T entitet;

    public abstract List<T> read();

    protected abstract void kontrolaCreate() throws ControllerException;

    protected abstract void kontrolaUpdate() throws ControllerException;

    protected abstract void kontrolaDelete() throws ControllerException;

    //Konstruktor Controllera
    public Controller() {
        this.session = HibernateUtil.getSession();
    }

    //Getter i setteri entiteta
    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

    //Novi entitet
    public T create() throws ControllerException {
        kontrolaCreate();
        save();
        return entitet;
    }

    //Update postojecih entiteta
    public T update() throws ControllerException {
        kontrolaUpdate();
        save();
        return entitet;
    }

    //Brisanje entiteta
    public void delete() throws ControllerException {
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();

    }

    //Save novih entiteta
    private void save() {
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }

}
