/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.util;

import com.github.javafaker.Faker;
import fitapp.model.Aktivnost;
import fitapp.model.Hrana;
import fitapp.model.Korisnik;
import java.util.List;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author PC
 */
public class HibernateSession {
//Ubacivanje inicialnih podataka
    
    public static void odradiPosao() {

        Session s = HibernateUtil.getSession();

        s.beginTransaction();

        //Dodavanje korisnika
        Korisnik korisnik = new Korisnik();
        korisnik.setNadimak("korisnik");
        korisnik.setLozinka(BCrypt.hashpw("korisnik", BCrypt.gensalt()));
        korisnik.setEmail("korisnik@gmail.com");
        korisnik.setVisina(183);
        korisnik.setDob(20);
        korisnik.setSpol("m");
        korisnik.setTezina(120);
        korisnik.setZeljenaTezina(100);

        s.save(korisnik);

        //Dodavanje jedne hrane u bazu hrana
        Hrana banana = new Hrana();
        banana.setImeHrane("Banana");
        banana.setKalorije(20);
        banana.setProteini(20);
        banana.setUgljikohidrati(20);
        banana.setMasti(20);
        s.save(banana);

        //Dodavanje više aktivnosti u bazu
        List<Aktivnost> aktivnosti;

        Faker faker = new Faker();

        //Program prebačen sa rubya pa ne poštuje OOP principe
        Aktivnost aktivnost;
        for (int i = 0; i < 20; i++) {
            aktivnost = new Aktivnost();
            int suma = +i;
            int z = 0;

            aktivnost.setImeAktivnosti(faker.name().firstName());
            aktivnost.setPotroseneKalorijePoSatu(suma);
            aktivnost.setVrijemeTrajanjaUMinutama(60);
            s.save(aktivnost);

        }

        s.getTransaction().commit();
    }
}
