/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.controller;

import fitapp.model.Blog;
import fitapp.model.Hrana;
import fitapp.util.ControllerException;
import java.util.List;

/**
 *
 * @author PC
 */
public class BlogController extends Controller<Blog>{

    @Override
    public List<Blog> read() {
        return session.createQuery("from Blog").list();
    }

    @Override
    protected void kontrolaCreate() throws ControllerException {
    }

    @Override
    protected void kontrolaUpdate() throws ControllerException {
    }

    @Override
    protected void kontrolaDelete() throws ControllerException {
    }
    
}
