/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import fitapp.controller.AktivnostiController;
import fitapp.controller.DnevnikAktivnostiController;
import fitapp.controller.DnevnikHraneController;
import fitapp.controller.HranaController;
import fitapp.controller.IzracunMakroHraneController;
import fitapp.controller.KorisnikController;
import fitapp.model.Aktivnost;
import fitapp.model.DnevnikAktivnosti;
import fitapp.model.DnevnikHrane;
import fitapp.model.Hrana;
import fitapp.model.IzracunMakroHrane;
import fitapp.util.Aplikacija;
import fitapp.util.ControllerException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class DnevnikHraneView extends javax.swing.JFrame {

    private HranaController hranaController;
    private DnevnikHraneController dnevnikHranaController;
    private IzracunMakroHraneController izracunMakroHraneController;
    private Date trenutniDatum;
    private SimpleDateFormat df;
    private int odabraniIndex;

    /**
     * Creates new form DnevnikView
     */
    public DnevnikHraneView() {

        initComponents();
        dnevnikHranaController = new DnevnikHraneController();
        hranaController = new HranaController();
        izracunMakroHraneController = new IzracunMakroHraneController();
        df = new SimpleDateFormat(Aplikacija.FORMAT_DATUMA);
        postavke();
        vrijeme();
        ucitaj();
        ucitaj2();

    }

    private void ucitaj() {
        //Works #1
        DefaultListModel<DnevnikHrane> m = new DefaultListModel<>();
        dnevnikHranaController.read().forEach(g -> {
            m.addElement(g);
        });
        lstEntiteti.setModel(m);

    }

    private void ucitaj2() {
        //Works #1
        DefaultListModel<Hrana> m = new DefaultListModel<>();

        hranaController.read().forEach(s -> {
            m.addElement(s);
        });

        lstDnevnik1.setModel(m);

    }

    private void pocistiPodatke() {
        //works
        //#9
        dpDatumPocetka.setDateToToday();
        lstDnevnikHrane.setModel(new DefaultListModel<IzracunMakroHrane>());

    }

    private void postavke() {
        //#10
        //works
        setTitle(Aplikacija.NASLOV_APP + " Dnevnik hrane");

        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd.MM.yyyy");

        dpDatumPocetka.setSettings(dps);

        lstDnevnikHrane.setModel(new DefaultListModel<IzracunMakroHrane>());

        ImageIcon icon = new ImageIcon("C:\\Users\\PC\\Desktop\\FitApp-2.0\\FitApp\\src\\main\\resources\\FitAppLogo.png");
        this.setIconImage(icon.getImage());

    }

    public void postaviVrijednostiUEntitet() {
        //ne radi
        var e = dnevnikHranaController.getEntitet();

        if (dpDatumPocetka.getDate() != null) {
            e.setDatum(Date.from(
                    dpDatumPocetka.getDate().atStartOfDay()
                            .atZone(ZoneId.systemDefault()).toInstant())
            );
        }

        DefaultListModel<IzracunMakroHrane> m = (DefaultListModel<IzracunMakroHrane>) lstDnevnikHrane.getModel();
        List<IzracunMakroHrane> lista = new ArrayList<>();
        for (int i = 0; i < m.getSize(); i++) {
            lista.add(m.get(i));
        }
        //Provjeri dali radi
        e.setIzracunMakroHrane(lista);
    }

    public void datum() {
        //works
        Date datum = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String datumIzbornik = sdf.format(datum);
        txtDatum.setText(datumIzbornik);

    }

    private void vrijeme() {
        //works
        Thread t1;
        t1 = new Thread(() -> {
            while (true) {
                Date datum = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                txtVrijeme.setText(sdf.format(datum));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("Error with clock update");
                }
            }
        });
        t1.start();

    }

    private void obrisiHranuIzGrupe(IzracunMakroHrane a) {
        //works
        DefaultListModel<IzracunMakroHrane> m = (DefaultListModel<IzracunMakroHrane>) lstDnevnikHrane.getModel();
        for (int i = 0; i < m.getSize(); i++) {
            if (m.get(i).getSifra().equals(a.getSifra())) {
                m.removeElementAt(i);
                return;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtVrijeme = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        lblAktivnost = new javax.swing.JLabel();
        lblIzvjestaj = new javax.swing.JLabel();
        lblDnevnik = new javax.swing.JLabel();
        lblONama = new javax.swing.JLabel();
        lblPostavke = new javax.swing.JLabel();
        lblIzbornikOdjaviSe = new javax.swing.JLabel();
        lblBlog1 = new javax.swing.JLabel();
        iconGoreLijevo1 = new javax.swing.JLabel();
        lblHrana = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dpDatumPocetka = new com.github.lgooddatepicker.components.DatePicker();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstDnevnikHrane = new javax.swing.JList<>();
        txtKolicinaHraneDnevnik = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstDnevnik1 = new javax.swing.JList<>();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        btnDodaj1 = new javax.swing.JButton();
        btnObrisi1 = new javax.swing.JButton();
        btnSPremiKalorije = new javax.swing.JButton();
        lblUkupno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtVrijeme.setEditable(false);
        txtVrijeme.setText("Vrijeme");
        txtVrijeme.setBackground(new java.awt.Color(255, 255, 255));
        txtVrijeme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVrijemeActionPerformed(evt);
            }
        });

        txtDatum.setEditable(false);
        txtDatum.setText("Datum");
        txtDatum.setBackground(new java.awt.Color(255, 255, 255));
        txtDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatumActionPerformed(evt);
            }
        });

        lblAktivnost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAktivnost.setText("Aktivnost");
        lblAktivnost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAktivnost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAktivnostMouseClicked(evt);
            }
        });

        lblIzvjestaj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIzvjestaj.setText("Izvještaj");
        lblIzvjestaj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIzvjestaj.setToolTipText("");
        lblIzvjestaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIzvjestajMouseClicked(evt);
            }
        });

        lblDnevnik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDnevnik.setText("Baza");
        lblDnevnik.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDnevnik.setToolTipText("");
        lblDnevnik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDnevnikMouseClicked(evt);
            }
        });

        lblONama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblONama.setText("O nama");
        lblONama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblONama.setToolTipText("");
        lblONama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblONamaMouseClicked(evt);
            }
        });

        lblPostavke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPostavke.setText("Postavke");
        lblPostavke.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPostavke.setToolTipText("");
        lblPostavke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPostavkeMouseClicked(evt);
            }
        });

        lblIzbornikOdjaviSe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIzbornikOdjaviSe.setText("Odjavi se");
        lblIzbornikOdjaviSe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIzbornikOdjaviSe.setToolTipText("");
        lblIzbornikOdjaviSe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIzbornikOdjaviSeMouseClicked(evt);
            }
        });

        lblBlog1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBlog1.setText("Blog");
        lblBlog1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBlog1.setToolTipText("");
        lblBlog1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBlog1MouseClicked(evt);
            }
        });

        iconGoreLijevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FitAppIcon1.png"))); // NOI18N
        iconGoreLijevo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconGoreLijevo1MouseClicked(evt);
            }
        });

        lblHrana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHrana.setText("Hrana");
        lblHrana.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHrana.setToolTipText("");
        lblHrana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHranaMouseClicked(evt);
            }
        });

        jLabel16.setText("Hrana u danu:");

        jLabel17.setText("Datum");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        lstDnevnikHrane.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDnevnikHraneValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstDnevnikHrane);

        jLabel12.setText("Količina:");

        jLabel3.setText("Datum hrane:");

        lstEntiteti.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel11.setText("Baza hrane");

        jScrollPane6.setViewportView(lstDnevnik1);

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        btnDodaj1.setText("Dodaj");
        btnDodaj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodaj1ActionPerformed(evt);
            }
        });

        btnObrisi1.setText("Obriši");
        btnObrisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisi1ActionPerformed(evt);
            }
        });

        btnSPremiKalorije.setText("Spremi");
        btnSPremiKalorije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSPremiKalorijeActionPerformed(evt);
            }
        });

        lblUkupno.setText("Ukupno: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVrijeme, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconGoreLijevo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHrana, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAktivnost, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(lblDnevnik, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIzvjestaj, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBlog1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblONama, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnDodaj1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnObrisi1))
                                            .addComponent(jLabel16)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtKolicinaHraneDnevnik, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblUkupno, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPostavke, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIzbornikOdjaviSe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSPremiKalorije)
                .addGap(349, 349, 349))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblIzbornikOdjaviSe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPostavke, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconGoreLijevo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBlog1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblONama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHrana, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAktivnost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDnevnik, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIzvjestaj, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrazi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(197, 197, 197)
                                    .addComponent(lblUkupno)
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(59, 59, 59)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnDodaj1)
                                                .addComponent(btnObrisi1)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(txtKolicinaHraneDnevnik, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnDodaj)
                                        .addComponent(btnPromjeni))
                                    .addGap(218, 218, 218)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnSPremiKalorije)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVrijeme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtVrijemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVrijemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVrijemeActionPerformed

    private void txtDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatumActionPerformed


    private void lblAktivnostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAktivnostMouseClicked
        new DnevnikAktivnostiView().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblAktivnostMouseClicked

    private void lblIzvjestajMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIzvjestajMouseClicked
        new IzvjestajView().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblIzvjestajMouseClicked

    private void lblDnevnikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDnevnikMouseClicked
        new BazaIzbornik().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblDnevnikMouseClicked

    private void lblONamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblONamaMouseClicked
        new ONama().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblONamaMouseClicked

    private void lblPostavkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPostavkeMouseClicked
        new OpcePostavke().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblPostavkeMouseClicked

    private void lblIzbornikOdjaviSeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIzbornikOdjaviSeMouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblIzbornikOdjaviSeMouseClicked

    private void lblBlog1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBlog1MouseClicked
        new BlogView().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBlog1MouseClicked

    private void iconGoreLijevo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconGoreLijevo1MouseClicked
        new GlavniIzbornik().setVisible(true);
        dispose();
    }//GEN-LAST:event_iconGoreLijevo1MouseClicked

    private void lblHranaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHranaMouseClicked
        new DnevnikHraneView().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblHranaMouseClicked

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        //#3
        dnevnikHranaController.setEntitet(new DnevnikHrane());

        postaviVrijednostiUEntitet();
        try {
            dnevnikHranaController.create();
            ucitaj();
            pocistiPodatke();
        } catch (ControllerException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }

        updateZbroja();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
       //#4
        if (dnevnikHranaController.getEntitet() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite datum");
            return;
        }
        postaviVrijednostiUEntitet();
        try {
            dnevnikHranaController.update();
            odabraniIndex = lstEntiteti.getSelectedIndex();
            ucitaj();
            lstEntiteti.setSelectedIndex(odabraniIndex);

        } catch (ControllerException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
        updateZbroja();
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        //#2
        if (evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue() == null) {
            return;
        }

        dnevnikHranaController.setEntitet(lstEntiteti.getSelectedValue());
        var e = dnevnikHranaController.getEntitet();

        if (e.getDatum() != null) {
            dpDatumPocetka.setDate(e.getDatum().toInstant().atZone(ZoneId.systemDefault()).
                    toLocalDate());
        } else {
            dpDatumPocetka.setDate(null);
        }

        DefaultListModel<IzracunMakroHrane> m = new DefaultListModel<>();

//        Collections.sort(e.getHrana(), new Comparator<IzracunMakroHrane>() {
//            @Override
//            public int compare(IzracunMakroHrane o1, IzracunMakroHrane o2) {
//                return o1.getDnevnikHrane().getHrana().getImeHrane().compareTo(o2.getDnevnikHrane().getHrana().getImeHrane());
//            }
//        });
//
//        e.getHrana().getImeHrane().forEach(p -> {
//            m.addElement(p);
//        });
//        lstDnevnikHrane.setModel(m);
        updateZbroja();
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void updateZbroja() {
        DefaultListModel<IzracunMakroHrane> m = (DefaultListModel<IzracunMakroHrane>) lstDnevnikHrane.getModel();
        int ukupnoKcal = 0;

        for (int i = 0; i < m.getSize(); i++) {
            ukupnoKcal += m.get(i).getKalorije();
        }
        lblUkupno.setText(String.valueOf(ukupnoKcal));


    }

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        //#8
        DefaultListModel<Hrana> m = new DefaultListModel<>();
        hranaController.read(txtUvjet.getText()).forEach(p -> {
            m.addElement(p);
        });
        lstDnevnik1.setModel(m);
    }//GEN-LAST:event_btnTraziActionPerformed

    private void btnDodaj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodaj1ActionPerformed
        //Tu sam stao 
        //#7
        DefaultListModel<IzracunMakroHrane> m = (DefaultListModel<IzracunMakroHrane>) lstDnevnikHrane.getModel();
        for (Hrana p : lstDnevnik1.getSelectedValuesList()) {
            IzracunMakroHrane c = new IzracunMakroHrane();
            c.setHranaMakro(p);
            c.setDnevnikHrane(dnevnikHranaController.getEntitet());
            c.setKalorije(Integer.parseInt(txtKolicinaHraneDnevnik.getText()));
//            c.setMasti(Integer.parseInt(txtMasti.getText()));
//            c.setUgljikohidrati(Integer.parseInt(txtUH.getText()));
//            c.setProteini(Integer.parseInt(txtProtein.getText())); 
            m.addElement(c);

        }
        lstDnevnikHrane.repaint();
        updateZbroja();

    }//GEN-LAST:event_btnDodaj1ActionPerformed

    private void btnObrisi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisi1ActionPerformed
        //works
        //#6
        List<IzracunMakroHrane> lista = lstDnevnikHrane.getSelectedValuesList();

        for (IzracunMakroHrane a : lista) {
            obrisiHranuIzGrupe(a);

        }
        lstDnevnikHrane.repaint();
        updateZbroja();
    }//GEN-LAST:event_btnObrisi1ActionPerformed

    private void btnSPremiKalorijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSPremiKalorijeActionPerformed
        IzracunMakroHrane c = lstDnevnikHrane.getSelectedValue();

        if (c == null) {
            return;
        }

        c.setKalorije(Integer.parseInt(txtKolicinaHraneDnevnik.getText()));
//        c.setProteini(Integer.parseInt(txtProtein.getText()));
//        c.setUgljikohidrati(Integer.parseInt(txtUH.getText()));
//        c.setMasti(Integer.parseInt(txtMasti.getText()));

        c.setKalorije(Integer.parseInt(txtKolicinaHraneDnevnik.getText()));

        izracunMakroHraneController.setEntitet(c);
        try {
            izracunMakroHraneController.update();
        } catch (ControllerException e) {
            JOptionPane.showMessageDialog(rootPane, e.getPoruka());
        }

        updateZbroja();
    }//GEN-LAST:event_btnSPremiKalorijeActionPerformed

    private void lstDnevnikHraneValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDnevnikHraneValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        IzracunMakroHrane c = lstDnevnikHrane.getSelectedValue();

        if (c == null) {
            return;
        }

        txtKolicinaHraneDnevnik.setText(String.valueOf(c.getKalorije()));

        txtKolicinaHraneDnevnik.setText(String.valueOf(c.getKalorije()));

        txtKolicinaHraneDnevnik.setText(String.valueOf(c.getKalorije()));
//        txtProtein.setText(String.valueOf(c.getProteini()));
//        txtUH.setText(String.valueOf(c.getUgljikohidrati()));
//        txtMasti.setText(String.valueOf(c.getMasti()));


    }//GEN-LAST:event_lstDnevnikHraneValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodaj1;
    private javax.swing.JButton btnObrisi1;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnSPremiKalorije;
    private javax.swing.JButton btnTrazi;
    private com.github.lgooddatepicker.components.DatePicker dpDatumPocetka;
    private javax.swing.JLabel iconGoreLijevo1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblAktivnost;
    private javax.swing.JLabel lblBlog1;
    private javax.swing.JLabel lblDnevnik;
    private javax.swing.JLabel lblHrana;
    private javax.swing.JLabel lblIzbornikOdjaviSe;
    private javax.swing.JLabel lblIzvjestaj;
    private javax.swing.JLabel lblONama;
    private javax.swing.JLabel lblPostavke;
    private javax.swing.JLabel lblUkupno;
    private javax.swing.JList<Hrana> lstDnevnik1;
    private javax.swing.JList<IzracunMakroHrane> lstDnevnikHrane;
    private javax.swing.JList<DnevnikHrane> lstEntiteti;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtKolicinaHraneDnevnik;
    private javax.swing.JTextField txtUvjet;
    private javax.swing.JTextField txtVrijeme;
    // End of variables declaration//GEN-END:variables
}
