# FitApp-2.0
FitApp je desktop aplikacija napravljena pomoću Jave, Java.Swing, MariaDB(MySql), Maven i Hibernate.

Ovu aplikaciju sam izabrao zato što sam dugi niz godina bio u fitnessu te mi je ta tema bila poznata. Dosada sam koristio najviše MyFitnessPal tako da sam nju koristio kao inspiraciju za aplikaciju.

Aplikacija služi da možete voditi svoju prehranu i aktivnost kako bi dobili bolji uvid u ono što radite i kako bi mogli ostvariti svoje ciljeve. 

# EraDiagram:

![alt text](https://github.com/z-dukic/FitApp-2.0/blob/main/FitApp2.0%20era.png?raw=true)

# SplashScreen:
Splash screen je napravljen kako bi se aplikacija mogla pokrenuti bez da korisnik shvati da je potrebno vrijeme da se  aplikacija učita.
Splashscreen učitava bazu i nakon toga prebacuje na login ekran.

![alt text](https://github.com/z-dukic/FitApp-2.0/blob/main/FitAppLogo.png?raw=true)

# Login:
Login ima nekoliko mogućnosti. Prva mogućnost je da kliknete na button „Saznaj više o nama“ gdje će korisniku prikazati github sa source kodom na GitHub-u.
Nakon toga imamo u desnom kutu imamo prijavu gdje korisnik mora unijeti svoje podatke da pristupio svom računu.
Dole se nalazi skip button koji se ne nalazi u konačnoj verziji, ali trenutno služi developeru da prekoči proces logina kako bi lakše ušao u aplikaciju.

![alt text](https://github.com/z-dukic/FitApp-2.0/blob/main/Login.png?raw=true)

# Glavni izbornik:
Glavni izbornik nudi nekoliko mogućnosti. Prva (i glavna) mogućnost je „Hrana“ gdje korisnik može upisivati sve podatke vezane za svoju prehranu.
Drugi izbor je „Aktivnost“ gdje korisnik može upisivat sve podatke vezane za svoju aktivnost.
Treći izbor je „Baza“ gdje korisnik može pristupiti pristupiti bazi podataka kako bi dodao hranu ili aktivnost koje nema u bazi.
Četvrti izbor je izvještaj gdje korisnik može pogledati svoje prehrambene navike u prošlosti i usporediti ih.
Blog je peti izbor i sadrži korisne informacije o prehrambenim navikama kako bi korisnik bio što uspješniji u ostvarenju svojih ciljeva.
O nama je šesti izbor gdje korisnik može vidjeti više informacija o samoj aplikaciji te osobi koja ju je napravila.
Postavke aplikacije sadrži izbornik gdje korisnik može prilagoditi aplikaciju sebi.
Zadnji izbor je odjavi se gdje korisnik može izaći iz aplikacije kako bi samo on ima pristup.

![alt text](https://github.com/z-dukic/FitApp-2.0/blob/main/GlavniIzbornik.png?raw=true)

# Dnevnik hrane:
Dnevnik hrane je glavna funkcionalnost aplikacije. Korisnik unese hranu koju je pojeo te njenu količinu nakon čega aplikacija izračunava koliko je unio kalorija, proteina, ugljikohidrata i masti, a to možemo vidjeti u desnom uglu.
Aplikacija je raspoređena tako da ide s lijeva na desno. U desnom uglu se nalazi datum hrane.
Aplikacija radi na način da korisnik dođe na stranicu i doda datum za koji radi. Npr. 26.10.2021. kao što je na slici. Ako taj datum već postoji onda mora kliknuti promjeni.
Nakon toga (ako postoji) će se pokazati u srednjoj tablici sve što je korisnik dosada unio na taj datum. 
U desnom kutu se nalazi baza s hranom. U bazi se nalaze par najčešćih hrana koji smo dodali pomoću početnog inserta kako bi lakše koristili aplikaciju. Nakon što korisnik izabere koju je hranu konzumirao mora dodati i količinu. Nakon toga klikne na dodaj i ta količina hrane s pojavi na popisu. Nakon toga mora kliknuti dodaj datum ili promjeni datum ovisno dali datum postoji ili ne.

![alt text](https://github.com/z-dukic/FitApp-2.0/blob/main/GlavniIzbornik.png?raw=true)



