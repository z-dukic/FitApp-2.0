/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitapp.view;

/**
 *
 * @author PC
 */
public class ONama extends javax.swing.JFrame {

    /**
     * Creates new form ONama
     */
    public ONama() {
        initComponents();
        areaONama();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconGoreLijevo = new javax.swing.JLabel();
        lvlONamaONama = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaOnama = new javax.swing.JTextArea();
        lblAktivnost = new javax.swing.JLabel();
        lblIzvjestaj = new javax.swing.JLabel();
        lblDnevnik = new javax.swing.JLabel();
        lblONama = new javax.swing.JLabel();
        lblPostavke = new javax.swing.JLabel();
        lblIzbornikOdjaviSe = new javax.swing.JLabel();
        lblBlog1 = new javax.swing.JLabel();
        iconGoreLijevo1 = new javax.swing.JLabel();
        lblHrana = new javax.swing.JLabel();

        iconGoreLijevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FitAppIcon1.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lvlONamaONama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lvlONamaONama.setText("O nama:");

        areaOnama.setColumns(20);
        areaOnama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        areaOnama.setRows(5);
        areaOnama.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor \nincididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud \nexercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute \nirure dolor in reprehenderit in voluptate velit esse cillum dolore eu \nfugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, \nsunt in culpa qui officia deserunt mollit anim id est laborum.");
        jScrollPane1.setViewportView(areaOnama);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvlONamaONama, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(lblIzbornikOdjaviSe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lvlONamaONama, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        new PostavkeKorisnika().setVisible(true);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaOnama;
    private javax.swing.JLabel iconGoreLijevo;
    private javax.swing.JLabel iconGoreLijevo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAktivnost;
    private javax.swing.JLabel lblBlog1;
    private javax.swing.JLabel lblDnevnik;
    private javax.swing.JLabel lblHrana;
    private javax.swing.JLabel lblIzbornikOdjaviSe;
    private javax.swing.JLabel lblIzvjestaj;
    private javax.swing.JLabel lblONama;
    private javax.swing.JLabel lblPostavke;
    private javax.swing.JLabel lvlONamaONama;
    // End of variables declaration//GEN-END:variables

    private void areaONama() {
        areaOnama.setEditable(false);
    }
}
