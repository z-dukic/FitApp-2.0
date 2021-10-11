/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.controller;

import fitapp.model.DnevnikHrane;
import fitapp.util.ControllerException;
import java.util.List;

/**
 *
 * @author PC
 */
public class DnevnikHraneController extends Controller<DnevnikHrane>{

    @Override
    public List<DnevnikHrane> read() {
         return session.createQuery("from DnevnikHrane").list();
    }

//    public List<DnevnikHrane> read(String uvjet) {
//        return session.createQuery("from DnevnikHrane dh" + " where concat(ph.imeHrane)" + " like :uvjet order by ph.imeHrane").setParameter("uvjet", "%" + uvjet + "%").setMaxResults(50).list();
//    }

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
