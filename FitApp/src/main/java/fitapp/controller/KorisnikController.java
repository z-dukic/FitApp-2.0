/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.controller;

import fitapp.model.Korisnik;
import fitapp.util.ControllerException;
import java.util.List;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.persistence.NoResultException;
import org.mindrot.jbcrypt.BCrypt;

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
    protected void controlCreate() throws ControllerException {
        kontrolaNadimka();
        kontrolaTezine();
        // kontrolaEmaila(); to-do kad završim view
        kontrolaVisine();
        kontrolaZeljeneTezine();
        kontrolaDatumaRodenja();
        kontrolaSpola();
    }

    @Override
    protected void controlUpdate() throws ControllerException {
        kontrolaNadimka();
        kontrolaTezine();
        // kontrolaEmaila(); to-do kad završim view
        kontrolaVisine();
        kontrolaZeljeneTezine();
        kontrolaDatumaRodenja();
        kontrolaSpola();
    }

    @Override
    protected void controlDelete() throws ControllerException {

    }

    private void kontrolaNadimka() throws ControllerException {

        if (entitet.getNadimak() == null || entitet.getNadimak().trim().length() == 0) {
            throw new ControllerException("Dodati ime hrane je obavezno.");
        }
        if (entitet.getNadimak().trim().length() < 1 && entitet.getNadimak().trim().length() < 20) {
            throw new ControllerException("Vaš nadimak može biti minimalno dugačak 5 znakova, a maksimalno 20.");
        }

        //Pregledava sve korisnike, ako postoji odbije
        //Ne postoji dva korisnika
      //  List<Korisnik> sviKorisnici = read();
      //  for (Korisnik k : sviKorisnici) {
      //      if (k.getNadimak().equals(entitet.getNadimak())) {
      //          throw new ControllerException("Naziv već postoji");
       //     }
      //  }

    }

    //Težina korisnika mora biti u "normalnim" parametrima da bi BMR bio približno točan
    private void kontrolaTezine() throws ControllerException {
        if (entitet.getTezina() <= 40 || entitet.getTezina() >= 200) {
            throw new ControllerException("Vaša težina mora biti minimalno 40kg, a maksimalno 200kg.");

        }
        //System.out.println("Ukoliko je vaša težina manja od 40kg ili veća 200kg molim Vas da kontaktirate nasu sluzbu za korisnike na " + kontakt); //todo
    }

    //Kontrola e-maila
    public static boolean kontrolaEmaila(String email) throws ControllerException {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;

    }

    //Visina korisnika mora biti u normalnim parametrima radi izračuna BMR
    private void kontrolaVisine() throws ControllerException {

        if (entitet.getTezina() <= 120 && entitet.getTezina() >= 225) {
            throw new ControllerException("Vaša visina mora biti minimalno 120cm, a maksimalna 225cm.");

        }
    }

    //Kontrola tezina radi izračuna BMR i ostalih parametara
    private void kontrolaZeljeneTezine() throws ControllerException {

        if (entitet.getZeljenaTezina() <= 40 && entitet.getZeljenaTezina() >= 200) {
            throw new ControllerException("Vaša željena težina mora biti minimalno 40kg, a maksimalno 200kg.");
        }
    }

    //Kontrola godina
    private void kontrolaDatumaRodenja() throws ControllerException {
        if (entitet.getDob() <= 16 && entitet.getDob() >= 99) {
            throw new ControllerException("Da bi koristili aplikaciju morate imati minimalno 16 godina.");
        }

    }

    //Kontrola spola
    private void kontrolaSpola() throws ControllerException {

        if (entitet.getSpol() == "m" || entitet.getSpol() == "f") {
            throw new ControllerException("Možete samo izabrati (m) za muški spol i (f) za ženski spol");
        }

    }

    public Korisnik autoriziraj(String email, String lozinka) {
        Korisnik korisnik = null;

        try {
            korisnik = (Korisnik) session.createQuery("from Korisnik korisnik where korisnik.email=:email").setParameter("email", email).getSingleResult();

        } catch (NoResultException e) {
            return null;
        }
        if (korisnik == null) {
            return null;
            
        }
         return BCrypt.checkpw(lozinka, korisnik.getLozinka()) ? korisnik : null;
         //   return null;
    }
}
