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

    //Hibernate session
    protected Session session;

    //Type of class
    protected T entitet;

    //(C(R)UD
    public abstract List<T> read();

    protected abstract void controlCreate() throws ControllerException;

    protected abstract void controlUpdate() throws ControllerException;

    protected abstract void controlDelete() throws ControllerException;

    //Constructor
    public Controller() {
        this.session = HibernateUtil.getSession();
    }

    //Getters and setters
    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

    //New entity
    //(C)RUD
    public T create() throws ControllerException {
        controlCreate();
        save();
        return entitet;
    }

    //Update existing entity
    //CR(U)D
    public T update() throws ControllerException {
        controlUpdate();
        save();
        return entitet;
    }

    //Delete entity
    //CRU(D)
    public void delete() throws ControllerException {
        controlDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();

    }

    //Save new entity
    private void save() {
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }

}
