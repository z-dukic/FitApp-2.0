/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.view;

import fitapp.controller.HranaController;
import fitapp.model.Hrana;
import fitapp.util.Aplikacija;
import fitapp.util.ControllerException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class HranaBaza extends javax.swing.JFrame implements Sucelje {

    private HranaController controller;

    public HranaBaza() { //1
        initComponents();
        controller = new HranaController();
        ucitajEntitet();
        postavke();
        datum();
        vrijeme();

    }
    
    public void datum() {
        Date datum = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String datumIzbornik = sdf.format(datum);
        txtDatum.setText(datumIzbornik);

    }

    private void vrijeme() {
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

    @Override
    public void postavke() {
        setTitle(Aplikacija.NASLOV_APP + " Baza hrane");
    }

    @Override
    public void ucitajEntitet() { //2

        DefaultListModel<Hrana> h = new DefaultListModel<>();

        controller.read(txtUvjet.getText()).forEach(s -> {
            h.addElement(s);
        });

        lstEntiteta.setModel(h);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteta = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btnDodajHranuBaza = new javax.swing.JButton();
        btnIzmjeniHranuBaza = new javax.swing.JButton();
        btnObrišiHranuBaza = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBazaImeHrane = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBazaKcalHrana = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBazaProteiniHrana = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBazaUgljikohidratiHrana = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBazaMastiHrana = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblAktivnost = new javax.swing.JLabel();
        lblIzvjestaj = new javax.swing.JLabel();
        lblDnevnik = new javax.swing.JLabel();
        lblONama = new javax.swing.JLabel();
        lblPostavke = new javax.swing.JLabel();
        lblIzbornikOdjaviSe = new javax.swing.JLabel();
        lblBlog1 = new javax.swing.JLabel();
        iconGoreLijevo1 = new javax.swing.JLabel();
        lblHrana = new javax.swing.JLabel();
        btnTrazi = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        txtVrijeme = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteta.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteta);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Dodavanje hrane u bazu:");

        btnDodajHranuBaza.setText("Dodaj");
        btnDodajHranuBaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajHranuBazaActionPerformed(evt);
            }
        });

        btnIzmjeniHranuBaza.setText("Izmjeni");
        btnIzmjeniHranuBaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmjeniHranuBazaActionPerformed(evt);
            }
        });

        btnObrišiHranuBaza.setText("Obriši");
        btnObrišiHranuBaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrišiHranuBazaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Ime hrane");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Kalorije");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Proteini");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Ugljikohidrati");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Masti");

        jLabel8.setText("grama");

        jLabel9.setText("grama");

        jLabel10.setText("grama");

        jLabel7.setText("kcal");

        lblAktivnost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAktivnost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAktivnost.setText("Aktivnost");
        lblAktivnost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAktivnostMouseClicked(evt);
            }
        });

        lblIzvjestaj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIzvjestaj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIzvjestaj.setText("Izvještaj");
        lblIzvjestaj.setToolTipText("");
        lblIzvjestaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIzvjestajMouseClicked(evt);
            }
        });

        lblDnevnik.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDnevnik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDnevnik.setText("Dnevnik");
        lblDnevnik.setToolTipText("");
        lblDnevnik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDnevnikMouseClicked(evt);
            }
        });

        lblONama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblONama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblONama.setText("O nama");
        lblONama.setToolTipText("");
        lblONama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblONamaMouseClicked(evt);
            }
        });

        lblPostavke.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPostavke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPostavke.setText("Postavke");
        lblPostavke.setToolTipText("");
        lblPostavke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPostavkeMouseClicked(evt);
            }
        });

        lblIzbornikOdjaviSe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIzbornikOdjaviSe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIzbornikOdjaviSe.setText("Odjavi se");
        lblIzbornikOdjaviSe.setToolTipText("");
        lblIzbornikOdjaviSe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIzbornikOdjaviSeMouseClicked(evt);
            }
        });

        lblBlog1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBlog1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBlog1.setText("Blog");
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

        lblHrana.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHrana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHrana.setText("Hrana");
        lblHrana.setToolTipText("");
        lblHrana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHranaMouseClicked(evt);
            }
        });

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        txtUvjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetActionPerformed(evt);
            }
        });

        txtDatum.setEditable(false);
        txtDatum.setBackground(new java.awt.Color(255, 255, 255));
        txtDatum.setText("Datum");
        txtDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatumActionPerformed(evt);
            }
        });

        txtVrijeme.setEditable(false);
        txtVrijeme.setBackground(new java.awt.Color(255, 255, 255));
        txtVrijeme.setText("Vrijeme");
        txtVrijeme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVrijemeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconGoreLijevo1)
                        .addGap(1, 1, 1)
                        .addComponent(lblDnevnik, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHrana, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAktivnost, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIzvjestaj, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBlog1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblONama, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPostavke, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIzbornikOdjaviSe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDodajHranuBaza)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnIzmjeniHranuBaza)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnObrišiHranuBaza))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtBazaMastiHrana, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtBazaUgljikohidratiHrana, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtBazaKcalHrana)
                                                    .addComponent(txtBazaProteiniHrana, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel9))
                                                .addComponent(jLabel10))
                                            .addComponent(jLabel7))
                                        .addGap(102, 102, 102))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(32, 32, 32)
                                        .addComponent(txtBazaImeHrane, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVrijeme, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblIzbornikOdjaviSe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPostavke, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAktivnost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconGoreLijevo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDnevnik, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHrana, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIzvjestaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBlog1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblONama, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTrazi)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUvjet)
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtBazaImeHrane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtBazaKcalHrana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtBazaProteiniHrana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtBazaUgljikohidratiHrana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtBazaMastiHrana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodajHranuBaza)
                            .addComponent(btnIzmjeniHranuBaza)
                            .addComponent(btnObrišiHranuBaza)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVrijeme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnDodajHranuBazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajHranuBazaActionPerformed
        //3
        controller.setEntitet(new Hrana());
        postaviVrijednostEntiteta();
        ucitajEntitet();

        try {
            controller.create();
            ucitajEntitet();
        } catch (ControllerException e) {
            JOptionPane.showMessageDialog(getParent(), e.getPoruka());
        }


    }//GEN-LAST:event_btnDodajHranuBazaActionPerformed

    private void btnIzmjeniHranuBazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmjeniHranuBazaActionPerformed
        //6
        postaviVrijednostEntiteta();
        try {
            controller.update();
            ucitajEntitet();
        } catch (ControllerException e) {
            JOptionPane.showMessageDialog(getParent(), e.getPoruka());
        }


    }//GEN-LAST:event_btnIzmjeniHranuBazaActionPerformed

    private void btnObrišiHranuBazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrišiHranuBazaActionPerformed
        //5
        try {
            controller.delete();
            ucitajEntitet();
        } catch (ControllerException e) {
            JOptionPane.showMessageDialog(getParent(), e.getPoruka());
        }
    }//GEN-LAST:event_btnObrišiHranuBazaActionPerformed

    private void lblAktivnostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAktivnostMouseClicked
        new AktivnostiBaza().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblAktivnostMouseClicked

    private void lblIzvjestajMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIzvjestajMouseClicked
        new IzvjestajView().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblIzvjestajMouseClicked

    private void lblDnevnikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDnevnikMouseClicked
        new DnevnikView().setVisible(true);
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
        new HranaBaza().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblHranaMouseClicked

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitajEntitet();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUvjetActionPerformed

    private void lstEntitetaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetaValueChanged
        if (evt.getValueIsAdjusting() || lstEntiteta.getSelectedValue() == null) {
            return;
        }
        controller.setEntitet(lstEntiteta.getSelectedValue());
        var s = controller.getEntitet();
        txtBazaImeHrane.setText(s.getImeHrane());
        txtBazaKcalHrana.setText(String.valueOf(s.getKalorije()));
        txtBazaProteiniHrana.setText(String.valueOf(s.getProteini()));
        txtBazaUgljikohidratiHrana.setText(String.valueOf(s.getUgljikohidrati()));
        txtBazaMastiHrana.setText(String.valueOf(s.getMasti()));
    }//GEN-LAST:event_lstEntitetaValueChanged

    private void txtDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatumActionPerformed

    private void txtVrijemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVrijemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVrijemeActionPerformed
    @Override
    public void postaviVrijednostEntiteta() { //4

        var h = controller.getEntitet();

        h.setImeHrane(txtBazaImeHrane.getText());
        try {
            h.setKalorije(Integer.parseInt(txtBazaKcalHrana.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(getParent(), "Broj kalorija mora biti cijeli broj");
            return;
        }

        try {
            h.setProteini(Integer.parseInt(txtBazaProteiniHrana.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(getParent(), "Broj proteina mora biti cijeli broj");
            return;
        }
        try {
            h.setUgljikohidrati(Integer.parseInt(txtBazaUgljikohidratiHrana.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(getParent(), "Broj ugljikohidrata mora biti cijeli broj");
            return;
        }

        try {
            h.setMasti(Integer.parseInt(txtBazaMastiHrana.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(getParent(), "Broj ugljikohidrata mora biti cijeli broj");
            return;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajHranuBaza;
    private javax.swing.JButton btnIzmjeniHranuBaza;
    private javax.swing.JButton btnObrišiHranuBaza;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JLabel iconGoreLijevo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAktivnost;
    private javax.swing.JLabel lblBlog1;
    private javax.swing.JLabel lblDnevnik;
    private javax.swing.JLabel lblHrana;
    private javax.swing.JLabel lblIzbornikOdjaviSe;
    private javax.swing.JLabel lblIzvjestaj;
    private javax.swing.JLabel lblONama;
    private javax.swing.JLabel lblPostavke;
    private javax.swing.JList<Hrana> lstEntiteta;
    private javax.swing.JTextField txtBazaImeHrane;
    private javax.swing.JTextField txtBazaKcalHrana;
    private javax.swing.JTextField txtBazaMastiHrana;
    private javax.swing.JTextField txtBazaProteiniHrana;
    private javax.swing.JTextField txtBazaUgljikohidratiHrana;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtUvjet;
    private javax.swing.JTextField txtVrijeme;
    // End of variables declaration//GEN-END:variables

}
