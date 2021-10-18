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
        banana.setKalorije(20);
        banana.setProteini(20);
        banana.setUgljikohidrati(20);
        banana.setMasti(20);
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
        cips.setImeHrane("Čips");
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
        bolognese.setImeHrane("Špagete Bolognese");
        bolognese.setKalorije(113);
        bolognese.setProteini(7);
        bolognese.setUgljikohidrati(9);
        bolognese.setMasti(7);
        s.save(bolognese);

        Hrana sir = new Hrana();
        sir.setImeHrane("Sir gauda");
        sir.setKalorije(356);
        sir.setProteini(25);
        sir.setUgljikohidrati(2);
        sir.setMasti(27);
        s.save(sir);

        Blog blog1 = new Blog();
        blog1.setNazivClanka("Vodič kroz zdravi doručak: Što jesti, a što izbjegavati?");
        blog1.setClanak("I vrapci na granama znaju: doručak je najvažniji obrok u danu! Koliko kvalitetno započnete dan doručkom, toliko će vam ostatak dana biti kvalitetan: nutrijenti koje unesete tim obrokom će vas voditi kroz dan i određivati vam razinu energije, raspoloženja i snage u aktivnostima koje budete radili.\n"
                + "\n"
                + "Istovremeno, preskakanje doručka koje mnogi naprave u pretjeranoj ljubavi prema dužem spavanju i ležanju, garantira kasnije napade gladi – a znamo da to najčešće završi s nekim obrokom koji vam nijedan nutricionist ne bi odobrio. Dakle, lako je zaključiti da je iznimno bitno da doručak bude sačinjen od kvalitetnih nutrijenata."
                + ""
                + "1. Zobene pahuljice\n"
                + "Najveća vrijednost zobenih pahuljica nalazi se u beta glukanu, vrsti vlakna koje potvrđeno smanjuje razinu kolesterola, ako se redovito konzumira. Osim toga, zobene pahuljice su bogate omega-3 masnim kiselinama, folatima i kalijem. S vremenskog i financijskog aspekta, zobene pahuljice su iznimno brz i jeftin način da pripremite kvalitetan doručak.\n"
                + "\n"
                + "Usput, i najmanje suđa uprljate. Dakle, zobene stavite u posudicu, prelijte tekućinom (vodom, malomasnim mlijekom, jogurtom, cijeđenom narančom…). Možete dodati orašaste plodove, sušeno voće, proteine u prahu, cimet, svježe voće, med… i uživajte u zdravom doručku.\n"
                + "\n"
                + "2. Jaje\n"
                + "„Svako jutro jedno jaje, organizmu snagu daje…“. Zaista je tako: jaje je izvrstan izvor proteina i vitamina D. Masnoće koje su nekad zamjerali jajetu (žumanjku), dokazano je, ne utječu značajno na razinu kolesterola u krvi. Stoga, jaje na oko, jaje na slatko, kajganu, kuhano, poširano, kako god vam drago… Odaberite jaje za doručak i dan će započeti snažno i nutritivno bogato."
                + "3. Grčki jogurt\n"
                + "Odnedavno je u našim supermarketima moguće kupiti tzv. grčki jogurt. Ovaj jogurt je bogat proteinima, kremast i ukusan i izvrstan je odabir za proteinski početak dana. Ovaj obrok možete pojesti i po putu, ako ste zaista ustali u posljednji trenutak.\n"
                + "\n"
                + "4. Maslac od kikirikija ili badema\n"
                + "Ako ne jedete jaja ili mliječne proizvode, dan možete početi i alternativnim izvorima proteina: maslacem od kikirikija ili badema. Ovaj ukusni maslac je bogat mononezasićenim masnim kiselinama i odličan je izvor energije. Maslac namažite na jabuku ili zdrave, integralne krekere. Kod kupovine maslaca, čitajte deklaracije i izbjegavajte one obogaćene biljnim uljima i šećerom.\n"
                + "\n"
                + "5. Pšenične posije\n"
                + "Još jedna namirnica koja ima opravdano mjesto na meniju za doručak, a tek se rijetkima ondje i nađe jesu pšenične posije. Pšenične posije su bogate celulozom, vlaknima, mineralima i vitaminima. Istovremeno, prirodno sadrže malo kolesterola i natrija.\n"
                + "\n"
                + "Dobar su izvor bjelančevina i željeza, magnezija, fosfora i selena, kao i tiamina (vitamina B1). U 100 g pšeničnih posija nalazi se 16 grama proteina i 17,7 grama ugljikohidrata, ali i čak 45 g vlakana! Pšenične posije možete pripremiti na jednak način kako obično pripremate zobene pahuljice.");

        s.save(blog1);

        Blog blog2 = new Blog();
        blog2.setNazivClanka("Zašto je dobro svakodnevno pojesti šaku kikirikija?");
        blog2.setClanak("Kikiriki je povrće koje se ubraja u porodicu mahunarki, iako ga mnogi smatraju orašastim plodom. Potječe iz južne i srednje Amerike, a u Europu je stigao u 15. stoljeću. Čovjek za svoju prehranu koristi sjeme kikirikija koje je bogato proteinima, vlaknima, željezom, cinkom i vitaminima E i K. Kikiriki se jede samostalno ili se od njega proizvode maslac, ulje, brašno i dr.\n"
                + "\n"
                + "Nutritivno, kikiriki je izrazito kalorijski vrijedna namirnica (567kcal u 100g), pa njenu konzumaciju treba ograničiti i prilagoditi vlastitim dnevnim kalorijskim potrebama.\n"
                + "\n"
                + "Najčešće je dnevno preporučena mjera kikirikija – šaka, a ako se govori o maslacu od kikirikija – 1 žlica. No, količine svakako treba prilagoditi individualnim potrebama, ovisno o ciljevima te vrsti i stupnju tjelesne aktivnosti."
                + ""
                + "Ova mahunarka je bogata oleinskom kiselinom, zdravom masti koju nalazimo i u maslinovom ulju, ali bogata je i antioksidansima. Primjerice, pečeni kikiriki se po količini antioksidansa može usporediti s kupinama i jagodama, a znatno je bogata antioksidantima od jabuka, mrkve ili cikle.\n"
                + "\n"
                + "Kikiriki je bogat polifenolima, primarno sastojkom imena p-kumarinska kiselina, a upravo pečenje povećava udio ove kiseline u kikirikiju, povećavajući njihov ukupni antioksidativni nivo za čak 22%. "
                + "Kikiriki i zdravlje srca\n"
                + "Kikiriki je bogat mononezasićenim masnim kiselinama, vrstom masnoća koje pozitivno utječu na zdravlje srca i kardiovaskularnog sustava. Smatra se da ova vrsta masnoća snižava rizik od razvoja bolesti srca za čak 21%. Osobe koje su jele kikiriki barem 4 puta tjedno imale su za 37% smanjen rizik od razvoja srčanih bolesti od osoba koje nisu jele kikiriki.\n"
                + "\n"
                + "Osim zbog sadržaja zdravih masti, kikiriki je preporučljiv u prehrani zbog svojeg visokog udjela vitamina E, niacina i folata, ali i proteina i mangana.\n"
                + "\n"
                + "Dodatno, kikiriki je bogat i resveratrolom, antioksidansom koji nalazimo u crvenom grožđu i vinu, a koji je zaslužan za tzv. francuski paradoks: činjenicu da ljudi u Francuskoj imaju prehranu koja je bogata mastima, ali imaju snižen rizik od razvoja kardiovaskularnih bolesti, od naroda koji imaju manje masnoća u prehrani.\n"
                + "\n"
                + "Kikiriki i dijabetes tipa 2\n"
                + "Studija objavljena 2002. godine u The Journal of the American Medical Association potvrdila je da prehrana bogata kikirikijem i maslacem od kikirikija snižava rizik od razvoja dijabetesa tipa 2.\n"
                + "\n"
                + "Naime, upravo polinezasićene i mononezasićene masne kiseline koje nalazimo u kikirikiju pozitivno utječu na homeostazu glukoze i inzulina. Studije potvrđuju da viši unos ovih vrsta masnih kiselina poboljšava osjetljivost na inzulin. Osim toga, vlakna i magnezij koje nalazimo u kikirikiju smanjuju potrebu za inzulinom i otpornost na njega te su povezane također sa smanjenjem opasnosti od dijabetesa tipa 2.\n"
                + "\n"
                + "Studija objavljena 2009. godine u The Journal of Nutrition potvrdila je da prehrana s visokim udjelom kikirikija snižava rizik od razvoja kardiovaskularnih bolesti, a posebno snižava ovaj rizik kod osoba koje boluju od dijabetesa tipa 2.Kikiriki i zdravlje srca\n"
                + "Kikiriki je bogat mononezasićenim masnim kiselinama, vrstom masnoća koje pozitivno utječu na zdravlje srca i kardiovaskularnog sustava. Smatra se da ova vrsta masnoća snižava rizik od razvoja bolesti srca za čak 21%. Osobe koje su jele kikiriki barem 4 puta tjedno imale su za 37% smanjen rizik od razvoja srčanih bolesti od osoba koje nisu jele kikiriki.\n"
                + "\n"
                + "Osim zbog sadržaja zdravih masti, kikiriki je preporučljiv u prehrani zbog svojeg visokog udjela vitamina E, niacina i folata, ali i proteina i mangana.\n"
                + "\n"
                + "Dodatno, kikiriki je bogat i resveratrolom, antioksidansom koji nalazimo u crvenom grožđu i vinu, a koji je zaslužan za tzv. francuski paradoks: činjenicu da ljudi u Francuskoj imaju prehranu koja je bogata mastima, ali imaju snižen rizik od razvoja kardiovaskularnih bolesti, od naroda koji imaju manje masnoća u prehrani.\n"
                + "\n"
                + "Kikiriki i dijabetes tipa 2\n"
                + "Studija objavljena 2002. godine u The Journal of the American Medical Association potvrdila je da prehrana bogata kikirikijem i maslacem od kikirikija snižava rizik od razvoja dijabetesa tipa 2.\n"
                + "\n"
                + "Naime, upravo polinezasićene i mononezasićene masne kiseline koje nalazimo u kikirikiju pozitivno utječu na homeostazu glukoze i inzulina. Studije potvrđuju da viši unos ovih vrsta masnih kiselina poboljšava osjetljivost na inzulin. Osim toga, vlakna i magnezij koje nalazimo u kikirikiju smanjuju potrebu za inzulinom i otpornost na njega te su povezane također sa smanjenjem opasnosti od dijabetesa tipa 2.\n"
                + "\n"
                + "Studija objavljena 2009. godine u The Journal of Nutrition potvrdila je da prehrana s visokim udjelom kikirikija snižava rizik od razvoja kardiovaskularnih bolesti, a posebno snižava ovaj rizik kod osoba koje boluju od dijabetesa tipa 2."
                + "Kikiriki i karcinomi\n"
                + "Nutrijenti koje nalazimo u kikirikiju, uključujući folnu kiselinu, fitosterole, fitinsku kiselinu i resveratrol, imaju utjecaj na smanjenje rizika od razvoja nekih vrsta karcinoma.\n"
                + "\n"
                + "Primjerice, šaka kikirikija dvaput na dan povezana je s 58%-tnim smanjenjem rizika od razvoja karcinoma crijeva kod žena i 27%-tnim smanjenjem rizika od ove vrste karcinoma kod muškaraca.\n"
                + "\n"
                + "Kikiriki i višak kilograma\n"
                + "Iako se radi o kalorijski visokovrijednoj namirnici studije potvrđuju da osobe koje u prehrani imaju kikiriki rjeđe imaju problema s viškom kilograma od osoba koje nemaju u prehrani ovu namirnicu.\n"
                + "\n"
                + "Naime, upravo zbog sadržaja masti i kalorijske vrijednosti, kikiriki duže vremena daje osjećaj sitosti pa s njihovim unosom ne dolazi da značajnog povećanja energije.");

        s.save(blog2);

        //Dodavanje više aktivnosti u bazu
        List<Aktivnost> aktivnosti;

        Faker faker = new Faker();

        //Program prebačen sa rubya pa ne poštuje OOP principe
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
