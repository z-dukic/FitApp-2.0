/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.controller;

import java.util.List;
import org.hibernate.Session;
import fitapp.util.ControllerException;
import fitapp.util.HibernateUtil;

/**
 *
 * @author PC
 */
public abstract class Controller<T> {

    protected Session session;

    //Vrsta klase
    protected T entitet;

    //(C(R)UD
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
    //(C)RUD
    public T create() throws ControllerException {
        kontrolaCreate();
        save();
        return entitet;
    }

    //Update postojecih entiteta
    //CR(U)D
    public T update() throws ControllerException {
        kontrolaUpdate();
        save();
        return entitet;
    }

    //Brisanje entiteta
    //CRU(D)
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
