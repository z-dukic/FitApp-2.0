/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitApp.controller;

import FitApp.Model.Korisnik;
import FitApp.Util.ControllerException;
import java.util.List;

/**
 *
 * @author PC
 */
public class KorisnikController extends Controller<Korisnik>{

    @Override
    public List<Korisnik> read() {
        return session.createQuery("from Korisnik").list();
   }

    @Override
    protected void kontrolaCreate() throws ControllerException {
        kontrolaNadimka();
        kontrolaTezine();
        kontrolaEmaila();
        kontrolaVisine();
        kontrolaZeljeneTezine();
        kontrolaDatumaRodenja();
        kontrolaSpola();
    }

    @Override
    protected void kontrolaUpdate() throws ControllerException {
   }

    @Override
    protected void kontrolaDelete() throws ControllerException {
        
   }

    private void kontrolaNadimka() {
    }

    private void kontrolaTezine() {
    }

    private void kontrolaEmaila() {
   }

    private void kontrolaVisine() {
       
    }

    private void kontrolaZeljeneTezine() {
        
    }

    private void kontrolaDatumaRodenja() {
        
    }

    private void kontrolaSpola() {
        
    }
    
    
    
}
