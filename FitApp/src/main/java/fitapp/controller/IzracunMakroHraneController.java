/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.controller;

import fitapp.model.DnevnikHrane;
import fitapp.model.IzracunMakroHrane;
import fitapp.util.ControllerException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author PC
 */
public class IzracunMakroHraneController extends Controller<IzracunMakroHrane> {

    @Override
    public List<IzracunMakroHrane> read() {
       return new ArrayList<>();
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
