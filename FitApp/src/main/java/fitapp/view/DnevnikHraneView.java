/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import fitapp.controller.DnevnikHraneController;
import fitapp.controller.HranaController;
import fitapp.controller.IzracunMakroHraneController;
import fitapp.model.DnevnikHrane;
import fitapp.model.Hrana;
import fitapp.model.IzracunMakroHrane;
import fitapp.util.Aplikacija;
import fitapp.util.ControllerException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
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
import javax.swing.JFileChooser;
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
        //#1
        DefaultListModel<DnevnikHrane> m = new DefaultListModel<>();
        dnevnikHranaController.read().forEach(g -> {
            m.addElement(g);
        });
        lstEntiteti.setModel(m);

    }

    private void ucitaj2() {
        //#1
        DefaultListModel<Hrana> m = new DefaultListModel<>();

        hranaController.read().forEach(s -> {
            m.addElement(s);
        });

        lstDnevnikBaze.setModel(m);

    }

    private void pocistiPodatke() {
        //#9
        dpDatum.setDateToToday();
        lstDnevnikHrane.setModel(new DefaultListModel<IzracunMakroHrane>());

    }

    private void postavke() {
        //#10
        setTitle(Aplikacija.NASLOV_APP + " Dnevnik hrane");

        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd.MM.yyyy");

        dpDatum.setSettings(dps);

        lstDnevnikHrane.setModel(new DefaultListModel<IzracunMakroHrane>());

        ImageIcon icon = new ImageIcon("C:\\Users\\PC\\Desktop\\FitApp-2.0\\FitApp\\src\\main\\resources\\FitAppLogo.png");
        this.setIconImage(icon.getImage());

    }

    public void postaviVrijednostiUEntitet() {
        //#15
        var e = dnevnikHranaController.getEntitet();

        if (dpDatum.getDate() != null) {
            e.setDatum(Date.from(
                    dpDatum.getDate().atStartOfDay()
                            .atZone(ZoneId.systemDefault()).toInstant())
            );
        }
        
        izbrisiMakro();
        DefaultListModel<IzracunMakroHrane> m = (DefaultListModel<IzracunMakroHrane>) lstDnevnikHrane.getModel();
        List<IzracunMakroHrane> lista = new ArrayList<>();
        for (int i = 0; i < m.getSize(); i++) {
            lista.add(m.get(i));
        }
        e.setIzracunMakroHrane(lista);
    }

    public void izbrisiMakro() {
        //#16
        for (IzracunMakroHrane c : izracunMakroHraneController.svi()) {
            if (c.getDnevnikHrane().getDatum() == dnevnikHranaController.getEntitet().getDatum()) {
                izracunMakroHraneController.setEntitet(c);
                try {
                    izracunMakroHraneController.delete();
                } catch (ControllerException ex) {
                    JOptionPane.showMessageDialog(null, ex.getPoruka());
                }
            }
        }
    }

    public void datum() {
        //17
        Date datum = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String datumIzbornik = sdf.format(datum);
        txtDatum.setText(datumIzbornik);

    }

    private void vrijeme() {
        //18
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
        //#19
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
        dpDatum = new com.github.lgooddatepicker.components.DatePicker();
        btnDodajDatum = new javax.swing.JButton();
        btnPromjeniDatum = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstDnevnikHrane = new javax.swing.JList<>();
        txtKolicinaHraneDnevnik = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstDnevnikBaze = new javax.swing.JList<>();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        btnDodajMakroHranu = new javax.swing.JButton();
        btnObrisiMakrohranu = new javax.swing.JButton();
        btnSPremiKalorije = new javax.swing.JButton();
        lblUkupnaKoličina = new javax.swing.JLabel();
        btnObrisiDatum = new javax.swing.JButton();
        lblUkupnoKalorija = new javax.swing.JLabel();
        lblUkupnoProteina = new javax.swing.JLabel();
        lblUkupnoUgljikohidrata = new javax.swing.JLabel();
        lblUkupnoMasti = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnExportJSON = new javax.swing.JButton();

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

        btnDodajDatum.setText("Dodaj");
        btnDodajDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajDatumActionPerformed(evt);
            }
        });

        btnPromjeniDatum.setText("Promjeni");
        btnPromjeniDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniDatumActionPerformed(evt);
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

        lstDnevnikBaze.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDnevnikBazeValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(lstDnevnikBaze);

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        btnDodajMakroHranu.setText("Dodaj");
        btnDodajMakroHranu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajMakroHranuActionPerformed(evt);
            }
        });

        btnObrisiMakrohranu.setText("Obriši");
        btnObrisiMakrohranu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiMakrohranuActionPerformed(evt);
            }
        });

        btnSPremiKalorije.setBackground(new java.awt.Color(242, 242, 242));
        btnSPremiKalorije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSPremiKalorijeActionPerformed(evt);
            }
        });

        lblUkupnaKoličina.setText("Ukupno grama: 0");

        btnObrisiDatum.setBackground(new java.awt.Color(242, 242, 242));
        btnObrisiDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiDatumActionPerformed(evt);
            }
        });

        lblUkupnoKalorija.setText("Ukupno kalorija: 0");

        lblUkupnoProteina.setText("Ukupno proteina: 0");

        lblUkupnoUgljikohidrata.setText("Ukupno ugljikohidrata: 0");

        lblUkupnoMasti.setText("Ukupno masti: 0");

        jLabel1.setText("Uk. grama:");

        jLabel2.setText("Uk. Kcal:");

        jLabel4.setText("Uk. Proteina:");

        jLabel5.setText("Uk. UH:");

        jLabel6.setText("Uk. Masti:");

        btnExportJSON.setText("To JSON");
        btnExportJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportJSONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVrijeme, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnObrisiDatum)
                            .addComponent(btnSPremiKalorije)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnExportJSON, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel17)
                                                        .addComponent(dpDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(btnDodajDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(btnPromjeniDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblUkupnaKoličina, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblUkupnoKalorija, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblUkupnoProteina, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblUkupnoUgljikohidrata, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblUkupnoMasti, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel16)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnDodajMakroHranu)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnObrisiMakrohranu))
                                                .addComponent(txtKolicinaHraneDnevnik, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap(30, Short.MAX_VALUE))
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
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExportJSON)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtVrijeme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSPremiKalorije)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnObrisiDatum))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dpDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnDodajDatum)
                                            .addComponent(btnPromjeniDatum)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUkupnaKoličina)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUkupnoKalorija)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUkupnoProteina)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnDodajMakroHranu)
                                            .addComponent(btnObrisiMakrohranu)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(txtKolicinaHraneDnevnik, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUkupnoUgljikohidrata)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUkupnoMasti)
                            .addComponent(jLabel6))
                        .addContainerGap(146, Short.MAX_VALUE))))
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

    private void btnDodajDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajDatumActionPerformed
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
    }//GEN-LAST:event_btnDodajDatumActionPerformed

    private void btnPromjeniDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniDatumActionPerformed
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
    }//GEN-LAST:event_btnPromjeniDatumActionPerformed


    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        //#2
        if (evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue() == null) {
            return;
        }

        dnevnikHranaController.setEntitet(lstEntiteti.getSelectedValue());
        var e = dnevnikHranaController.getEntitet();

        if (e.getDatum() != null) {
            dpDatum.setDate(e.getDatum().toInstant().atZone(ZoneId.systemDefault()).
                    toLocalDate());
        } else {
            dpDatum.setDate(null);
        }

        DefaultListModel<IzracunMakroHrane> m = new DefaultListModel<>();

        Collections.sort(e.getIzracunMakroHrane(), new Comparator<IzracunMakroHrane>() {
            @Override
            public int compare(IzracunMakroHrane o1, IzracunMakroHrane o2) {
                return o1.getHranaMakro().getImeHrane().compareTo(o2.getHranaMakro().getImeHrane());
            }

        });

        e.getIzracunMakroHrane().forEach(p -> {
            m.addElement(p);
        });
        lstDnevnikHrane.setModel(m);

        updateZbroja();
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void updateZbroja() {
        //#20
        DefaultListModel<IzracunMakroHrane> m = (DefaultListModel<IzracunMakroHrane>) lstDnevnikHrane.getModel();
        int ukupnoKolicina = 0;
        int ukupnoKcal = 0;
        int ukupnoProteina = 0;
        int ukupnoUgljikohidrata = 0;
        int ukupnoMasti = 0;

        for (int i = 0; i < m.getSize(); i++) {
            ukupnoKolicina += m.get(i).getKolicina();
            ukupnoKcal += m.get(i).getKalorije();
            ukupnoProteina += m.get(i).getProteini();
            ukupnoUgljikohidrata += m.get(i).getUgljikohidrati();
            ukupnoMasti += m.get(i).getMasti();
        }
        lblUkupnaKoličina.setText(String.valueOf(ukupnoKolicina));
        lblUkupnoKalorija.setText(String.valueOf(ukupnoKcal));
        lblUkupnoProteina.setText(String.valueOf(ukupnoProteina));
        lblUkupnoUgljikohidrata.setText(String.valueOf(ukupnoUgljikohidrata));
        lblUkupnoMasti.setText(String.valueOf(ukupnoMasti));

    }

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        //#8
        DefaultListModel<Hrana> m = new DefaultListModel<>();
        hranaController.read(txtUvjet.getText()).forEach(p -> {
            m.addElement(p);
        });
        lstDnevnikBaze.setModel(m);
    }//GEN-LAST:event_btnTraziActionPerformed

    private void btnDodajMakroHranuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajMakroHranuActionPerformed
        
        //#7
        DefaultListModel<IzracunMakroHrane> m = (DefaultListModel<IzracunMakroHrane>) lstDnevnikHrane.getModel();

        for (Hrana p : lstDnevnikBaze.getSelectedValuesList()) {
            IzracunMakroHrane c = new IzracunMakroHrane();
            c.setHranaMakro(p);
            c.setDnevnikHrane(dnevnikHranaController.getEntitet());
            if (txtKolicinaHraneDnevnik.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(getRootPane(), "Količina ne može biti nula");
                return;
            }
                if (Integer.valueOf(txtKolicinaHraneDnevnik.getText()) < 0) {
                JOptionPane.showMessageDialog(getRootPane(), "Količina ne može biti nula");
                return;
            }
            
            //ovo pokazuje tostring
            c.setKolicina(Integer.parseInt(txtKolicinaHraneDnevnik.getText()));
            c.setKalorije((Integer.parseInt(txtKolicinaHraneDnevnik.getText())/100)*p.getKalorije()); 
            c.setMasti((Integer.parseInt(txtKolicinaHraneDnevnik.getText())/100)*p.getMasti());
            c.setUgljikohidrati((Integer.parseInt(txtKolicinaHraneDnevnik.getText())/100)*p.getUgljikohidrati());
            c.setProteini((Integer.parseInt(txtKolicinaHraneDnevnik.getText())/100)*p.getProteini());
            m.addElement(c);

        }
        lstDnevnikHrane.repaint();
        updateZbroja();

    }//GEN-LAST:event_btnDodajMakroHranuActionPerformed

    private void btnObrisiMakrohranuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiMakrohranuActionPerformed

        //#6
        List<IzracunMakroHrane> lista = lstDnevnikHrane.getSelectedValuesList();

        for (IzracunMakroHrane a : lista) {
            obrisiHranuIzGrupe(a);

        }
        lstDnevnikHrane.repaint();
        updateZbroja();
    }//GEN-LAST:event_btnObrisiMakrohranuActionPerformed

    private void btnSPremiKalorijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSPremiKalorijeActionPerformed
        //#12
        IzracunMakroHrane c = lstDnevnikHrane.getSelectedValue();

        if (c == null) {
            return;
        }

        c.setKolicina(Integer.parseInt(txtKolicinaHraneDnevnik.getText()));
        c.setKalorije(Integer.parseInt(txtKolicinaHraneDnevnik.getText()));
        c.setMasti(Integer.parseInt(txtKolicinaHraneDnevnik.getText()));
        c.setUgljikohidrati(Integer.parseInt(txtKolicinaHraneDnevnik.getText()));
        c.setProteini(Integer.parseInt(txtKolicinaHraneDnevnik.getText()) * hranaController.getEntitet().getProteini());
        izracunMakroHraneController.setEntitet(c);
        try {
            izracunMakroHraneController.update();
        } catch (ControllerException e) {
            JOptionPane.showMessageDialog(rootPane, e.getPoruka());
        }

        updateZbroja();
    }//GEN-LAST:event_btnSPremiKalorijeActionPerformed

    private void lstDnevnikHraneValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDnevnikHraneValueChanged
        //#14
        if (evt.getValueIsAdjusting()) {
            return;
        }

        IzracunMakroHrane c = lstDnevnikHrane.getSelectedValue();

        if (c == null) {
            return;
        }

        txtKolicinaHraneDnevnik.setText(String.valueOf(c.getKolicina()));
        
        
        
        
        
        //Ovdje doradit value change
//        c.setKalorije(Integer.parseInt(txtKolicinaHraneDnevnik.getText()) / 100 * hranaController.getEntitet().getKalorije());
//        c.setMasti(Integer.parseInt(txtKolicinaHraneDnevnik.getText()) / 100 * hranaController.getEntitet().getMasti());
//        c.setUgljikohidrati(Integer.parseInt(txtKolicinaHraneDnevnik.getText()) / 100 * hranaController.getEntitet().getUgljikohidrati());
//        c.setProteini(Integer.parseInt(txtKolicinaHraneDnevnik.getText()) / 100 * hranaController.getEntitet().getProteini());


    }//GEN-LAST:event_lstDnevnikHraneValueChanged

    private void lstDnevnikBazeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDnevnikBazeValueChanged

    }//GEN-LAST:event_lstDnevnikBazeValueChanged

    private void btnObrisiDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiDatumActionPerformed
        //#5
        if (dnevnikHranaController.getEntitet() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite grupu");
            return;
        }
        boolean brisanje = true;
        if (lstDnevnikHrane.getModel().getSize() > 0) {
            if (JOptionPane.showConfirmDialog(getParent(), "Grupa ima polaznike. Sigurno sve obrisati",
                    "Brisanje grupe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                dnevnikHranaController.getEntitet().setIzracunMakroHrane(new ArrayList<IzracunMakroHrane>());
            } else {
                brisanje = false;
            }
        }
        if (brisanje) {
            try {
                dnevnikHranaController.delete();
                ucitaj();
                pocistiPodatke();
            } catch (ControllerException ex) {
                JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
            }
        }


    }//GEN-LAST:event_btnObrisiDatumActionPerformed

    private void btnExportJSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportJSONActionPerformed
         ExclusionStrategy strategija = new ExclusionStrategy(){
            @Override
            public boolean shouldSkipField(FieldAttributes fa) {
               
                if(fa.getDeclaringClass()==DnevnikHrane.class && fa.getName().equals("dnevnikHrane")){ //Smjer -> Grupa
                    return true;
                }
                 if(fa.getDeclaringClass()==IzracunMakroHrane.class && fa.getName().equals("dnevnikHrane")){ //clan -> grupa izracun ->dnevnik
                    return true;
                }
                
                return false;
            }

            @Override
            public boolean shouldSkipClass(Class<?> type) {
                return false;
            }
            
        };
        
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .setExclusionStrategies(strategija)
                .setDateFormat("EEE, dd MMM yyyy HH:mm:ss Z")
                .create();
        
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
        jfc.setSelectedFile(new File(System.getProperty("user.home") + File.separator + "podaci.json"));
        if(jfc.showSaveDialog(this)==JFileChooser.APPROVE_OPTION){
            try {
                BufferedWriter writer = new BufferedWriter(
                new FileWriter(jfc.getSelectedFile(),StandardCharsets.UTF_8)
                );
                writer.write(gson.toJson(dnevnikHranaController.read()));
                writer.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnExportJSONActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajDatum;
    private javax.swing.JButton btnDodajMakroHranu;
    private javax.swing.JButton btnExportJSON;
    private javax.swing.JButton btnObrisiDatum;
    private javax.swing.JButton btnObrisiMakrohranu;
    private javax.swing.JButton btnPromjeniDatum;
    private javax.swing.JButton btnSPremiKalorije;
    private javax.swing.JButton btnTrazi;
    private com.github.lgooddatepicker.components.DatePicker dpDatum;
    private javax.swing.JLabel iconGoreLijevo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JLabel lblUkupnaKoličina;
    private javax.swing.JLabel lblUkupnoKalorija;
    private javax.swing.JLabel lblUkupnoMasti;
    private javax.swing.JLabel lblUkupnoProteina;
    private javax.swing.JLabel lblUkupnoUgljikohidrata;
    private javax.swing.JList<Hrana> lstDnevnikBaze;
    private javax.swing.JList<IzracunMakroHrane> lstDnevnikHrane;
    private javax.swing.JList<DnevnikHrane> lstEntiteti;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtKolicinaHraneDnevnik;
    private javax.swing.JTextField txtUvjet;
    private javax.swing.JTextField txtVrijeme;
    // End of variables declaration//GEN-END:variables
}
