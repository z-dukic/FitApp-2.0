/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.view;

import fitapp.controller.KorisnikController;
import fitapp.model.Korisnik;
import fitapp.util.Aplikacija;
import fitapp.util.EmailUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultListModel;

/**
 *
 * @author PC
 */
public class KontaktView extends javax.swing.JFrame {

    private KorisnikController controller;

    /**
     * Creates new form KontaktView
     */
    public KontaktView() {
        initComponents();
        controller = new KorisnikController();
        postavke();
        datum();
        vrijeme();
    }
    
    public void postaviVrijednostEntiteta() { //4
        var s = controller.getEntitet();

        
        
    }

    private void postavke() {
        setTitle(Aplikacija.NASLOV_APP + " O nama");
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIzbornikOdjaviSe = new javax.swing.JLabel();
        lblBlog1 = new javax.swing.JLabel();
        iconGoreLijevo1 = new javax.swing.JLabel();
        lblHrana = new javax.swing.JLabel();
        lblAktivnost = new javax.swing.JLabel();
        lblIzvjestaj = new javax.swing.JLabel();
        lblDnevnik = new javax.swing.JLabel();
        lblONama = new javax.swing.JLabel();
        lblPostavke = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEmailImePrezime = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEmailPoruka = new javax.swing.JTextArea();
        txtDatum = new javax.swing.JTextField();
        txtVrijeme = new javax.swing.JTextField();
        btnPosalji = new javax.swing.JButton();
        txtPoslano = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Kontaktirajte nas:");

        jLabel2.setText("Ime i prezime:");

        jLabel3.setText("Vaša poruka:");

        txtEmailPoruka.setColumns(20);
        txtEmailPoruka.setRows(5);
        jScrollPane1.setViewportView(txtEmailPoruka);

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

        btnPosalji.setText("Pošalji");
        btnPosalji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPosaljiMouseClicked(evt);
            }
        });

        txtPoslano.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(iconGoreLijevo1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(55, 55, 55)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailImePrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPosalji)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPoslano, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(202, 202, 202))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
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
                                .addComponent(lblIzbornikOdjaviSe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(108, 108, 108))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVrijeme, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailImePrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPosalji)
                    .addComponent(txtPoslano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVrijeme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatumActionPerformed

    private void txtVrijemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVrijemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVrijemeActionPerformed

    private void btnPosaljiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPosaljiMouseClicked
        EmailUtil send = new EmailUtil("perop8406@gmail.com", "Primjedba", "Ime pošiljatelja: " + txtEmailImePrezime.getText() + " Poruka pošiljatelja: " +  txtEmailPoruka.getText());
        txtPoslano.setText("Poslano.");
        
        
    }//GEN-LAST:event_btnPosaljiMouseClicked

    

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPosalji;
    private javax.swing.JLabel iconGoreLijevo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAktivnost;
    private javax.swing.JLabel lblBlog1;
    private javax.swing.JLabel lblDnevnik;
    private javax.swing.JLabel lblHrana;
    private javax.swing.JLabel lblIzbornikOdjaviSe;
    private javax.swing.JLabel lblIzvjestaj;
    private javax.swing.JLabel lblONama;
    private javax.swing.JLabel lblPostavke;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtEmailImePrezime;
    private javax.swing.JTextArea txtEmailPoruka;
    private javax.swing.JTextField txtPoslano;
    private javax.swing.JTextField txtVrijeme;
    // End of variables declaration//GEN-END:variables
}
