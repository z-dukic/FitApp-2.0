/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.util;

import com.github.javafaker.Faker;
import fitapp.model.Aktivnost;
import fitapp.model.Blog;
import fitapp.model.Hrana;
import fitapp.model.IzracunMakroHrane;
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
        korisnik.setSifra(Long.valueOf(1));
        korisnik.setNadimak("korisnik");
        korisnik.setLozinka(BCrypt.hashpw("korisnik", BCrypt.gensalt()));
        korisnik.setEmail("korisnik@gmail.com");
        korisnik.setVisina(183);
        korisnik.setDob(20);
        korisnik.setSpol("m");
        korisnik.setTezina(120);
        korisnik.setZeljenaTezina(100);
        s.save(korisnik);

        //Dodavanje hrane u bazu hrana
        Hrana banana = new Hrana();
        banana.setImeHrane("Banana");
        banana.setKalorije(89);
        banana.setProteini(0);
        banana.setUgljikohidrati(23);
        banana.setMasti(0);
        s.save(banana);

        Hrana mrkva = new Hrana();
        mrkva.setImeHrane("Mrkva");
        mrkva.setKalorije(35);
        mrkva.setProteini(0);
        mrkva.setUgljikohidrati(8);
        mrkva.setMasti(0);
        s.save(mrkva);

        Hrana jabuka = new Hrana();
        jabuka.setImeHrane("Jabuka");
        jabuka.setKalorije(48);
        jabuka.setProteini(0);
        jabuka.setUgljikohidrati(13);
        jabuka.setMasti(0);
        s.save(jabuka);

        Hrana breskva = new Hrana();
        breskva.setImeHrane("Breskva");
        breskva.setKalorije(39);
        breskva.setProteini(10);
        breskva.setUgljikohidrati(0);
        breskva.setMasti(0);
        s.save(breskva);

        Hrana luk = new Hrana();
        luk.setImeHrane("Luk");
        luk.setKalorije(40);
        luk.setProteini(0);
        luk.setUgljikohidrati(10);
        luk.setMasti(0);
        s.save(luk);

        Hrana cocaCola = new Hrana();
        cocaCola.setImeHrane("Coca-cola");
        cocaCola.setKalorije(41);
        cocaCola.setProteini(0);
        cocaCola.setUgljikohidrati(10);
        cocaCola.setMasti(0);
        s.save(cocaCola);

        Hrana cips = new Hrana();
        cips.setImeHrane("??ips");
        cips.setKalorije(547);
        cips.setProteini(7);
        cips.setUgljikohidrati(50);
        cips.setMasti(37);
        s.save(cips);

        Hrana bigMac = new Hrana();
        bigMac.setImeHrane("Big Mac");
        bigMac.setKalorije(257);
        bigMac.setProteini(12);
        bigMac.setUgljikohidrati(20);
        bigMac.setMasti(15);
        s.save(bigMac);

        Hrana bolognese = new Hrana();
        bolognese.setImeHrane("??pagete Bolognese");
        bolognese.setKalorije(113);
        bolognese.setProteini(7);
        bolognese.setUgljikohidrati(9);
        bolognese.setMasti(7);
        s.save(bolognese);

        Hrana sir = new Hrana();
        sir.setImeHrane("sir");
        sir.setKalorije(356);
        sir.setProteini(25);
        sir.setUgljikohidrati(2);
        sir.setMasti(27);
        s.save(sir);

//        IzracunMakroHrane pizza = new IzracunMakroHrane();
//        pizza.setKalorije(200);
//        pizza.setKolicina(100);
//        pizza.setProteini(20);
//        pizza.setUgljikohidrati(50);
//        pizza.setMasti(30);
//        s.save(pizza);

//        IzracunMakroHrane hotdog = new IzracunMakroHrane();
//        //hotdog.setKalorije(500);
//        s.save(hotdog);
//
//        IzracunMakroHrane kelj = new IzracunMakroHrane();
//       //kelj.setKalorije(150);
//        s.save(kelj);

        Blog blog1 = new Blog();
        blog1.setNazivClanka("Vodi?? kroz zdravi doru??ak: ??to jesti, a ??to izbjegavati?");
        blog1.setClanak("I vrapci na granama znaju: doru??ak je najva??niji obrok u danu! Koliko kvalitetno zapo??nete dan doru??kom, toliko ??e vam ostatak dana biti kvalitetan: nutrijenti koje unesete tim obrokom ??e vas voditi kroz dan i odre??ivati vam razinu energije, raspolo??enja i snage u aktivnostima koje budete radili.\n"
                + "\n"
                + "Istovremeno, preskakanje doru??ka koje mnogi naprave u pretjeranoj ljubavi prema du??em spavanju i le??anju, garantira kasnije napade gladi ??? a znamo da to naj??e????e zavr??i s nekim obrokom koji vam nijedan nutricionist ne bi odobrio. Dakle, lako je zaklju??iti da je iznimno bitno da doru??ak bude sa??injen od kvalitetnih nutrijenata."
                + ""
                + "1. Zobene pahuljice\n"
                + "Najve??a vrijednost zobenih pahuljica nalazi se u beta glukanu, vrsti vlakna koje potvr??eno smanjuje razinu kolesterola, ako se redovito konzumira. Osim toga, zobene pahuljice su bogate omega-3 masnim kiselinama, folatima i kalijem. S vremenskog i financijskog aspekta, zobene pahuljice su iznimno brz i jeftin na??in da pripremite kvalitetan doru??ak.\n"
                + "\n"
                + "Usput, i najmanje su??a uprljate. Dakle, zobene stavite u posudicu, prelijte teku??inom (vodom, malomasnim mlijekom, jogurtom, cije??enom naran??om???). Mo??ete dodati ora??aste plodove, su??eno vo??e, proteine u prahu, cimet, svje??e vo??e, med??? i u??ivajte u zdravom doru??ku.\n"
                + "\n"
                + "2. Jaje\n"
                + "???Svako jutro jedno jaje, organizmu snagu daje??????. Zaista je tako: jaje je izvrstan izvor proteina i vitamina D. Masno??e koje su nekad zamjerali jajetu (??umanjku), dokazano je, ne utje??u zna??ajno na razinu kolesterola u krvi. Stoga, jaje na oko, jaje na slatko, kajganu, kuhano, po??irano, kako god vam drago??? Odaberite jaje za doru??ak i dan ??e zapo??eti sna??no i nutritivno bogato."
                + "3. Gr??ki jogurt\n"
                + "Odnedavno je u na??im supermarketima mogu??e kupiti tzv. gr??ki jogurt. Ovaj jogurt je bogat proteinima, kremast i ukusan i izvrstan je odabir za proteinski po??etak dana. Ovaj obrok mo??ete pojesti i po putu, ako ste zaista ustali u posljednji trenutak.\n"
                + "\n"
                + "4. Maslac od kikirikija ili badema\n"
                + "Ako ne jedete jaja ili mlije??ne proizvode, dan mo??ete po??eti i alternativnim izvorima proteina: maslacem od kikirikija ili badema. Ovaj ukusni maslac je bogat mononezasi??enim masnim kiselinama i odli??an je izvor energije. Maslac nama??ite na jabuku ili zdrave, integralne krekere. Kod kupovine maslaca, ??itajte deklaracije i izbjegavajte one oboga??ene biljnim uljima i ??e??erom.\n"
                + "\n"
                + "5. P??eni??ne posije\n"
                + "Jo?? jedna namirnica koja ima opravdano mjesto na meniju za doru??ak, a tek se rijetkima ondje i na??e jesu p??eni??ne posije. P??eni??ne posije su bogate celulozom, vlaknima, mineralima i vitaminima. Istovremeno, prirodno sadr??e malo kolesterola i natrija.\n"
                + "\n"
                + "Dobar su izvor bjelan??evina i ??eljeza, magnezija, fosfora i selena, kao i tiamina (vitamina B1). U 100 g p??eni??nih posija nalazi se 16 grama proteina i 17,7 grama ugljikohidrata, ali i ??ak 45 g vlakana! P??eni??ne posije mo??ete pripremiti na jednak na??in kako obi??no pripremate zobene pahuljice.");

        s.save(blog1);

        Blog blog2 = new Blog();
        blog2.setNazivClanka("Za??to je dobro svakodnevno pojesti ??aku kikirikija?");
        blog2.setClanak("Kikiriki je povr??e koje se ubraja u porodicu mahunarki, iako ga mnogi smatraju ora??astim plodom. Potje??e iz ju??ne i srednje Amerike, a u Europu je stigao u 15. stolje??u. ??ovjek za svoju prehranu koristi sjeme kikirikija koje je bogato proteinima, vlaknima, ??eljezom, cinkom i vitaminima E i K. Kikiriki se jede samostalno ili se od njega proizvode maslac, ulje, bra??no i dr.\n"
                + "\n"
                + "Nutritivno, kikiriki je izrazito kalorijski vrijedna namirnica (567kcal u 100g), pa njenu konzumaciju treba ograni??iti i prilagoditi vlastitim dnevnim kalorijskim potrebama.\n"
                + "\n"
                + "Naj??e????e je dnevno preporu??ena mjera kikirikija ??? ??aka, a ako se govori o maslacu od kikirikija ??? 1 ??lica. No, koli??ine svakako treba prilagoditi individualnim potrebama, ovisno o ciljevima te vrsti i stupnju tjelesne aktivnosti."
                + ""
                + "Ova mahunarka je bogata oleinskom kiselinom, zdravom masti koju nalazimo i u maslinovom ulju, ali bogata je i antioksidansima. Primjerice, pe??eni kikiriki se po koli??ini antioksidansa mo??e usporediti s kupinama i jagodama, a znatno je bogata antioksidantima od jabuka, mrkve ili cikle.\n"
                + "\n"
                + "Kikiriki je bogat polifenolima, primarno sastojkom imena p-kumarinska kiselina, a upravo pe??enje pove??ava udio ove kiseline u kikirikiju, pove??avaju??i njihov ukupni antioksidativni nivo za ??ak 22%. "
                + "Kikiriki i zdravlje srca\n"
                + "Kikiriki je bogat mononezasi??enim masnim kiselinama, vrstom masno??a koje pozitivno utje??u na zdravlje srca i kardiovaskularnog sustava. Smatra se da ova vrsta masno??a sni??ava rizik od razvoja bolesti srca za ??ak 21%. Osobe koje su jele kikiriki barem 4 puta tjedno imale su za 37% smanjen rizik od razvoja sr??anih bolesti od osoba koje nisu jele kikiriki.\n"
                + "\n"
                + "Osim zbog sadr??aja zdravih masti, kikiriki je preporu??ljiv u prehrani zbog svojeg visokog udjela vitamina E, niacina i folata, ali i proteina i mangana.\n"
                + "\n"
                + "Dodatno, kikiriki je bogat i resveratrolom, antioksidansom koji nalazimo u crvenom gro????u i vinu, a koji je zaslu??an za tzv. francuski paradoks: ??injenicu da ljudi u Francuskoj imaju prehranu koja je bogata mastima, ali imaju sni??en rizik od razvoja kardiovaskularnih bolesti, od naroda koji imaju manje masno??a u prehrani.\n"
                + "\n"
                + "Kikiriki i dijabetes tipa 2\n"
                + "Studija objavljena 2002. godine u The Journal of the American Medical Association potvrdila je da prehrana bogata kikirikijem i maslacem od kikirikija sni??ava rizik od razvoja dijabetesa tipa 2.\n"
                + "\n"
                + "Naime, upravo polinezasi??ene i mononezasi??ene masne kiseline koje nalazimo u kikirikiju pozitivno utje??u na homeostazu glukoze i inzulina. Studije potvr??uju da vi??i unos ovih vrsta masnih kiselina pobolj??ava osjetljivost na inzulin. Osim toga, vlakna i magnezij koje nalazimo u kikirikiju smanjuju potrebu za inzulinom i otpornost na njega te su povezane tako??er sa smanjenjem opasnosti od dijabetesa tipa 2.\n"
                + "\n"
                + "Studija objavljena 2009. godine u The Journal of Nutrition potvrdila je da prehrana s visokim udjelom kikirikija sni??ava rizik od razvoja kardiovaskularnih bolesti, a posebno sni??ava ovaj rizik kod osoba koje boluju od dijabetesa tipa 2.Kikiriki i zdravlje srca\n"
                + "Kikiriki je bogat mononezasi??enim masnim kiselinama, vrstom masno??a koje pozitivno utje??u na zdravlje srca i kardiovaskularnog sustava. Smatra se da ova vrsta masno??a sni??ava rizik od razvoja bolesti srca za ??ak 21%. Osobe koje su jele kikiriki barem 4 puta tjedno imale su za 37% smanjen rizik od razvoja sr??anih bolesti od osoba koje nisu jele kikiriki.\n"
                + "\n"
                + "Osim zbog sadr??aja zdravih masti, kikiriki je preporu??ljiv u prehrani zbog svojeg visokog udjela vitamina E, niacina i folata, ali i proteina i mangana.\n"
                + "\n"
                + "Dodatno, kikiriki je bogat i resveratrolom, antioksidansom koji nalazimo u crvenom gro????u i vinu, a koji je zaslu??an za tzv. francuski paradoks: ??injenicu da ljudi u Francuskoj imaju prehranu koja je bogata mastima, ali imaju sni??en rizik od razvoja kardiovaskularnih bolesti, od naroda koji imaju manje masno??a u prehrani.\n"
                + "\n"
                + "Kikiriki i dijabetes tipa 2\n"
                + "Studija objavljena 2002. godine u The Journal of the American Medical Association potvrdila je da prehrana bogata kikirikijem i maslacem od kikirikija sni??ava rizik od razvoja dijabetesa tipa 2.\n"
                + "\n"
                + "Naime, upravo polinezasi??ene i mononezasi??ene masne kiseline koje nalazimo u kikirikiju pozitivno utje??u na homeostazu glukoze i inzulina. Studije potvr??uju da vi??i unos ovih vrsta masnih kiselina pobolj??ava osjetljivost na inzulin. Osim toga, vlakna i magnezij koje nalazimo u kikirikiju smanjuju potrebu za inzulinom i otpornost na njega te su povezane tako??er sa smanjenjem opasnosti od dijabetesa tipa 2.\n"
                + "\n"
                + "Studija objavljena 2009. godine u The Journal of Nutrition potvrdila je da prehrana s visokim udjelom kikirikija sni??ava rizik od razvoja kardiovaskularnih bolesti, a posebno sni??ava ovaj rizik kod osoba koje boluju od dijabetesa tipa 2."
                + "Kikiriki i karcinomi\n"
                + "Nutrijenti koje nalazimo u kikirikiju, uklju??uju??i folnu kiselinu, fitosterole, fitinsku kiselinu i resveratrol, imaju utjecaj na smanjenje rizika od razvoja nekih vrsta karcinoma.\n"
                + "\n"
                + "Primjerice, ??aka kikirikija dvaput na dan povezana je s 58%-tnim smanjenjem rizika od razvoja karcinoma crijeva kod ??ena i 27%-tnim smanjenjem rizika od ove vrste karcinoma kod mu??karaca.\n"
                + "\n"
                + "Kikiriki i vi??ak kilograma\n"
                + "Iako se radi o kalorijski visokovrijednoj namirnici studije potvr??uju da osobe koje u prehrani imaju kikiriki rje??e imaju problema s vi??kom kilograma od osoba koje nemaju u prehrani ovu namirnicu.\n"
                + "\n"
                + "Naime, upravo zbog sadr??aja masti i kalorijske vrijednosti, kikiriki du??e vremena daje osje??aj sitosti pa s njihovim unosom ne dolazi da zna??ajnog pove??anja energije.");

        s.save(blog2);

        //Dodavanje vi??e aktivnosti u bazu
        List<Aktivnost> aktivnosti;

        Faker faker = new Faker();

        //Program preba??en sa rubya pa ne po??tuje OOP principe
        // Aktivnost aktivnost;
        //for (int i = 0; i < 20; i++) {
        //   aktivnost = new Aktivnost();
        //   int suma = +i;
        //   int z = 0;
        //   aktivnost.setImeAktivnosti(faker.name().firstName());
        //  aktivnost.setPotroseneKalorijePoSatu(suma);
        //   aktivnost.setVrijemeTrajanjaUMinutama(60);
        //  s.save(aktivnost);
        // }
        Aktivnost aktivnost;
        aktivnost = new Aktivnost();

        Aktivnost trcanje = new Aktivnost();
        trcanje.setImeAktivnosti("Trcanje");
        trcanje.setPotroseneKalorijePoSatu(600);
        s.save(trcanje);

        Aktivnost nogomet = new Aktivnost();
        nogomet.setImeAktivnosti("Nogomet");
        nogomet.setPotroseneKalorijePoSatu(500);
        s.save(nogomet);

        Aktivnost skijanje = new Aktivnost();
        skijanje.setImeAktivnosti("Skijanje");
        skijanje.setPotroseneKalorijePoSatu(350);
        s.save(skijanje);

        Aktivnost bicikliranje = new Aktivnost();
        bicikliranje.setImeAktivnosti("Bicikliranje");
        bicikliranje.setPotroseneKalorijePoSatu(300);
        s.save(bicikliranje);

        Aktivnost rukomet = new Aktivnost();
        rukomet.setImeAktivnosti("Rukomet");
        rukomet.setPotroseneKalorijePoSatu(450);
        s.save(rukomet);

//        List<DnevnikAktivnosti> dani = new ArrayList<>();
//        dani.add();
//        DnevnikAktivnosti dan;
        //Upucavanje datuma u listu
//        
//        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
//        List<Date> datum = new ArrayList<>();
//        datum.add(new Date());
//
//        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
//
//        Date startDate = null;
//
//        try {
//            startDate = formatter.parse("9.12.2021.");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        Date endDate = null;
//        try {
//            endDate = formatter.parse("15.12.2021.");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        Calendar start = Calendar.getInstance();
//        start.setTime(startDate);
//
//        Calendar end = Calendar.getInstance();
//        end.setTime(endDate);
//
//        for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
//            datum.add(date);
//            
//            dan = new DnevnikAktivnosti();
//            dan.setDatum(datum);
//            dani.add(dan);
//            s.save(dan);
//
//            System.out.println(formatter.format(date));
//        }
//
//        System.out.println(datum);
//        DnevnikAktivnosti datumAktivnosti = new DnevnikAktivnosti();
//        Date datumAkt = new Date();
//        datumAkt.setTime(10);
//        System.out.println(datumAkt); //Thu Jan 01 01:00:00 CET 1970
//
//        DnevnikAktivnosti datumNeki = new DnevnikAktivnosti();
//        SimpleDateFormat df = new SimpleDateFormat("dd. MM. yyyy.");
//        System.out.println(df.format(datumNeki));
//        
//        DnevnikAktivnosti treciPokusaj = new DnevnikAktivnosti();
//       // treciPokusaj.setDatum(10. 10. 2010.);
//        
//        
//        
//        
//        
////        Calendar gc = GregorianCalendar.getInstance();
////        gc.set(Calendar.YEAR, 2020);
////        gc.set(Calendar.MONTH, 9);
////        gc.set(Calendar.DAY_OF_MONTH, 15);
////        datumNeki = gc.getTime();
//
//        datumNeki.setDatum(datumAkt);
//        s.save(datumAkt);
//
////        DnevnikAktivnosti datum = new DnevnikAktivnosti();
////        SimpleDateFormat df = new SimpleDateFormat(Aplikacija.FORMAT_DATUMA);
////        Date pokusajDatuma = new Date();
////        df.format(pokusajDatuma);
////        
////        
////        
////        datum.setDatum(pokusajDatuma);
////        
////        
////        for (int i=0; i<20;i++){
////            
////            
////        }
////        for (int i = 0; i < 20; i++) {
////            
////            datum.setDatum(datum);
////            int suma = +i;
//        }
        s.getTransaction().commit();

    }
}
