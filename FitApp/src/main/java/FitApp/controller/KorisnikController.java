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
public class KorisnikController extends Controller<Korisnik> {

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

    private void kontrolaNadimka() throws ControllerException {

        if (entitet.getNadimak() == null || entitet.getNadimak().trim().length() == 0) {
            throw new ControllerException("Dodati ime hrane je obavezno.");
        }
        if (entitet.getNadimak().trim().length() < 6 || entitet.getNadimak().trim().length() < 20) {
            throw new ControllerException("Vaš nadimak može biti minimalno dugačak 5 znakova, a maksimalno 20.");
        }

    }

    //Težina korisnika mora biti u "normalnim" parametrima da bi BMR bio približno točan
    private void kontrolaTezine() throws ControllerException {
        if (entitet.getTezina() <= 40 || entitet.getTezina() >= 200) {
            throw new ControllerException("Vaša težina mora biti minimalno 40kg, a maksimalno 200kg.");

        }
        //System.out.println("Ukoliko je vaša težina manja od 40kg ili veća 200kg molim Vas da kontaktirate nasu sluzbu za korisnike na " + kontakt); //todo
    }

    private void kontrolaEmaila() throws ControllerException {
        //email validator

    }

    //Visina korisnika mora biti u normalnim parametrima radi izračuna BMR
    private void kontrolaVisine() throws ControllerException {

        if (entitet.getTezina() <= 120 || entitet.getTezina() >= 225) {
            throw new ControllerException("Vaša visina mora biti minimalno 120cm, a maksimalna 225cm.");

        }
    }

    //Kontrola tezina radi izračuna BMR i ostalih parametara
    private void kontrolaZeljeneTezine() throws ControllerException {

        if (entitet.getZeljenaTezina() <= 40 || entitet.getZeljenaTezina() >= 200) {
            throw new ControllerException("Vaša željena težina mora biti minimalno 40kg, a maksimalno 200kg.");
        }
    }

    //Kontrola godina
    private void kontrolaDatumaRodenja() throws ControllerException {
        if (entitet.getDob() <= 16 || entitet.getDob() >= 99) {
            throw new ControllerException("Da bi koristili aplikaciju morate imati minimalno 16 godina.");
        }

    }

    private void kontrolaSpola() throws ControllerException {
        //todo

    }

}
