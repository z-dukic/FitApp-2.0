/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.view;

import fitapp.controller.KorisnikController;
import fitapp.model.Korisnik;
import fitapp.util.Aplikacija;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
public class GlavniIzbornik extends javax.swing.JFrame {

    /**
     * Creates new form GlavniIzbornik
     */
    public GlavniIzbornik() {
        initComponents();
        postavke();
        datum();
        vrijeme();

    }

    private void postavke() {
        setTitle(Aplikacija.NASLOV_APP + " Glavni Izbornik");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDatum = new javax.swing.JTextField();
        txtVrijeme = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        linkDnevnik = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        linkBazaHrane = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        linkBazaAktivnosti = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        linkIzvještaj = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        linkBlog = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        linkONama = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        linkPostavke = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblAktivnost = new javax.swing.JLabel();
        lblIzvjestaj = new javax.swing.JLabel();
        lblDnevnik = new javax.swing.JLabel();
        lblONama = new javax.swing.JLabel();
        lblPostavke = new javax.swing.JLabel();
        lblIzbornikOdjaviSe = new javax.swing.JLabel();
        lblBlog1 = new javax.swing.JLabel();
        iconGoreLijevo1 = new javax.swing.JLabel();
        lblHrana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Izbornik:");

        linkDnevnik.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        linkDnevnik.setText("Dnevnik");
        linkDnevnik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkDnevnikMouseClicked(evt);
            }
        });
        linkDnevnik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                linkDnevnikKeyPressed(evt);
            }
        });

        jLabel3.setText("Unesite hranu i aktivnost u svoj dnevnik");

        linkBazaHrane.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        linkBazaHrane.setText("Baza hrane");
        linkBazaHrane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkBazaHraneMouseClicked(evt);
            }
        });

        jLabel5.setText("Dodajte svoju hranu u bazu");

        linkBazaAktivnosti.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        linkBazaAktivnosti.setText("Baza Aktivnosti");
        linkBazaAktivnosti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkBazaAktivnostiMouseClicked(evt);
            }
        });

        jLabel7.setText("Dodajte svoju aktivnost u bazu");

        linkIzvještaj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        linkIzvještaj.setText("Izvještaj");
        linkIzvještaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkIzvještajMouseClicked(evt);
            }
        });

        jLabel9.setText("Pogledajte svoje izvještaje iz prošlih dana");

        linkBlog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        linkBlog.setText("Blog");
        linkBlog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkBlogMouseClicked(evt);
            }
        });

        jLabel11.setText("Saznajte novosti iz svijeta fitnessa");

        linkONama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        linkONama.setText("O nama");
        linkONama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkONamaMouseClicked(evt);
            }
        });

        jLabel13.setText("Saznajte više o aplikaciji");

        linkPostavke.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        linkPostavke.setText("Postavke");
        linkPostavke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkPostavkeMouseClicked(evt);
            }
        });

        jLabel15.setText("Postavke aplikacije");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/benchpressgif.gif"))); // NOI18N

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
        lblDnevnik.setText("Baza");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVrijeme, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(linkIzvještaj, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(linkBlog, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(linkONama, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(linkPostavke, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addComponent(linkDnevnik, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(linkBazaHrane, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(linkBazaAktivnosti, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(lblONama, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPostavke, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIzbornikOdjaviSe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
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
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(linkDnevnik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(linkBazaHrane)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(linkBazaAktivnosti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(linkIzvještaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(linkBlog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(linkONama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(linkPostavke)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVrijeme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatumActionPerformed

    private void txtVrijemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVrijemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVrijemeActionPerformed

    private void linkDnevnikKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linkDnevnikKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkDnevnikKeyPressed

    private void linkDnevnikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkDnevnikMouseClicked
        new DnevnikHraneView().setVisible(true);
        dispose();
    }//GEN-LAST:event_linkDnevnikMouseClicked

    private void linkBazaHraneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkBazaHraneMouseClicked
        new HranaBaza().setVisible(true);
        dispose();
    }//GEN-LAST:event_linkBazaHraneMouseClicked

    private void linkBazaAktivnostiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkBazaAktivnostiMouseClicked
        new AktivnostiBaza().setVisible(true);
        dispose();
    }//GEN-LAST:event_linkBazaAktivnostiMouseClicked

    private void linkIzvještajMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkIzvještajMouseClicked
        new IzvjestajView().setVisible(true);
        dispose();
    }//GEN-LAST:event_linkIzvještajMouseClicked

    private void linkBlogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkBlogMouseClicked
        new BlogView().setVisible(true);
        dispose();
    }//GEN-LAST:event_linkBlogMouseClicked

    private void linkONamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkONamaMouseClicked
        new ONama().setVisible(true);
        dispose();
    }//GEN-LAST:event_linkONamaMouseClicked

    private void linkPostavkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkPostavkeMouseClicked
        new OpcePostavke().setVisible(true);
        dispose();
    }//GEN-LAST:event_linkPostavkeMouseClicked

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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconGoreLijevo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAktivnost;
    private javax.swing.JLabel lblBlog1;
    private javax.swing.JLabel lblDnevnik;
    private javax.swing.JLabel lblHrana;
    private javax.swing.JLabel lblIzbornikOdjaviSe;
    private javax.swing.JLabel lblIzvjestaj;
    private javax.swing.JLabel lblONama;
    private javax.swing.JLabel lblPostavke;
    private javax.swing.JLabel linkBazaAktivnosti;
    private javax.swing.JLabel linkBazaHrane;
    private javax.swing.JLabel linkBlog;
    private javax.swing.JLabel linkDnevnik;
    private javax.swing.JLabel linkIzvještaj;
    private javax.swing.JLabel linkONama;
    private javax.swing.JLabel linkPostavke;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtVrijeme;
    // End of variables declaration//GEN-END:variables

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
}
