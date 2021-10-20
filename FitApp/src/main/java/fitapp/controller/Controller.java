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
    protected T modelEntity;

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
        return modelEntity;
    }

    public void setEntitet(T entitet) {
        this.modelEntity = entitet;
    }

    //New entity
    //(C)RUD
    public T create() throws ControllerException {
        controlCreate();
        save();
        return modelEntity;
    }

    //Update existing entity
    //CR(U)D
    public T update() throws ControllerException {
        controlUpdate();
        save();
        return modelEntity;
    }

    //Delete entity
    //CRU(D)
    public void delete() throws ControllerException {
        controlDelete();
        session.beginTransaction();
        session.delete(modelEntity);
        session.getTransaction().commit();

    }

    //Save new entity
    private void save() {
        session.beginTransaction();
        session.save(modelEntity);
        session.getTransaction().commit();
    }

}
