/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp;

import fitapp.util.HibernateSession;
import fitapp.view.SplashScreen;

/**
 *
 * @author PC
 */
public class Start {

    public static void main(String[] args) {

        //Pokretanje aplikacije
        //new SplashScreen().setVisible(true);
        
        //Ubacivanje korisnika, hrane po potrebi
        HibernateSession.odradiPosao();
    }

}
