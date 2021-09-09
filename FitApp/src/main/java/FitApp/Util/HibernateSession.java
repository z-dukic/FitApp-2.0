/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FitApp.Util;

import com.github.javafaker.Faker;
import FitApp.Model.Aktivnosti;
import FitApp.Model.Hrana;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author PC
 */
public class HibernateSession {
    
    public static void odradiPosao(){
    
    Session s = HibernateUtil.getSession();
    
    s.beginTransaction();
    
    
        //Dodavanje jedne hrane u bazu hrana
        Hrana banana = new Hrana();
        banana.setImeHrane("Banana");
        s.save(banana);
        
        //Dodavanje više aktivnosti u bazu
         List<Aktivnosti> aktivnosti;
         
         
         Faker faker = new Faker();
         
         //Program prebačen sa rubya pa ne poštuje OOP principe
         Aktivnosti aktivnost;
         for (int i = 0; i < 20; i++) {
            aktivnost = new Aktivnosti();
            int suma=+i;
            int z = 0;
            
            aktivnost.setImeAktivnosti(faker.name().firstName());
            aktivnost.setPotroseneKalorijePoSatu(suma);
            aktivnost.setVrijemeTrajanjaUMinutama(60);
            s.save(aktivnost);
            
         
         }
 
    
    
    
    s.getTransaction().commit();
}
}
