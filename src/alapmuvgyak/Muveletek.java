package alapmuvgyak;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Muveletek extends javax.swing.JFrame {
    int osszeskerdesekSzama = 0;
    int osztaskerdesSzama = 0;
    int osztasprobakSzama = 0;
    int szorzaskerdesSzama = 0;
    int szorzasprobakSzama = 0;
    int osszprobalkozasokSzama = 0;
    
    public Muveletek() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlGyakorlas = new javax.swing.JPanel();
        lblFeladat = new javax.swing.JLabel();
        txtEredmeny = new javax.swing.JTextField();
        btnEllenorzes = new javax.swing.JButton();
        lblValasz = new javax.swing.JLabel();
        btnUj = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOsszKerdes = new javax.swing.JLabel();
        lbllblOsszProba = new javax.swing.JLabel();
        lblEredmeny = new javax.swing.JLabel();
        lblOsszeadKerdes = new javax.swing.JLabel();
        lblKivonasKerdes = new javax.swing.JLabel();
        lblOsztasKerdes = new javax.swing.JLabel();
        lblSzorzasKerdes = new javax.swing.JLabel();
        lblOsszeadProba = new javax.swing.JLabel();
        lblKivonasProba = new javax.swing.JLabel();
        lblOsztasProba = new javax.swing.JLabel();
        lblSzorzasProba = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFajl = new javax.swing.JMenu();
        mnuFajlMegnyit = new javax.swing.JMenuItem();
        mnuFajlMent = new javax.swing.JMenuItem();
        fajl_chb_mentesmaskent = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuFajlKilep = new javax.swing.JMenuItem();
        mnuMuvelet = new javax.swing.JMenu();
        muv_rbtn_osszeads = new javax.swing.JRadioButtonMenuItem();
        muv_rbtn_kivonas = new javax.swing.JRadioButtonMenuItem();
        muv_rbtn_osztas = new javax.swing.JRadioButtonMenuItem();
        muv_rbtn_szorzas = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alapműveletek gyakoroltatása");

        pnlGyakorlas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gyakorlás"));

        lblFeladat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtEredmeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEredmenyActionPerformed(evt);
            }
        });

        btnEllenorzes.setText("Ellenőrzés");
        btnEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEllenorzesActionPerformed(evt);
            }
        });

        lblValasz.setText("visszajelzés");

        javax.swing.GroupLayout pnlGyakorlasLayout = new javax.swing.GroupLayout(pnlGyakorlas);
        pnlGyakorlas.setLayout(pnlGyakorlasLayout);
        pnlGyakorlasLayout.setHorizontalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEllenorzes)
                .addContainerGap())
        );
        pnlGyakorlasLayout.setVerticalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFeladat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEllenorzes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnUj.setText("Új feladat");

        btnMegoldas.setText("Megoldás");
        btnMegoldas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegoldasActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        lblOsszKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszKerdes.setText("Össz kérdések száma: 1");

        lbllblOsszProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbllblOsszProba.setText("Össz Probálkozások száma: 1");

        lblEredmeny.setText("Eredmény: 0 %");

        lblOsszeadKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadKerdes.setText("Összeadás: 1");

        lblKivonasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasKerdes.setText("Kivonás: 0");

        lblOsztasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasKerdes.setText("Osztás: 0");

        lblSzorzasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasKerdes.setText("Szorzás: 0");

        lblOsszeadProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadProba.setText("Összeadás: 1");

        lblKivonasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasProba.setText("Kivonás: 0");

        lblOsztasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasProba.setText("Osztás: 0");

        lblSzorzasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasProba.setText("Szorzás: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEredmeny)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsszeadKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKivonasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszKerdes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKivonasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszeadProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbllblOsszProba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblKivonasKerdes, lblOsszeadKerdes, lblOsztasKerdes, lblSzorzasKerdes});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszKerdes)
                    .addComponent(lbllblOsszProba))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasKerdes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasProba)))
                .addGap(18, 18, 18)
                .addComponent(lblEredmeny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuFajl.setText("Fájl");

        mnuFajlMegnyit.setText("Megnyit...");
        mnuFajlMegnyit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMegnyitActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMegnyit);

        mnuFajlMent.setText("Ment");
        mnuFajlMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMent);

        fajl_chb_mentesmaskent.setText("Mentés másként...");
        fajl_chb_mentesmaskent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fajl_chb_mentesmaskentActionPerformed(evt);
            }
        });
        mnuFajl.add(fajl_chb_mentesmaskent);
        mnuFajl.add(jSeparator1);

        mnuFajlKilep.setText("Kilép");
        mnuFajl.add(mnuFajlKilep);

        jMenuBar1.add(mnuFajl);

        mnuMuvelet.setText("Műveletek");

        buttonGroup1.add(muv_rbtn_osszeads);
        muv_rbtn_osszeads.setText("Összeadás");
        mnuMuvelet.add(muv_rbtn_osszeads);

        buttonGroup1.add(muv_rbtn_kivonas);
        muv_rbtn_kivonas.setText("Kivonás");
        mnuMuvelet.add(muv_rbtn_kivonas);

        buttonGroup1.add(muv_rbtn_osztas);
        muv_rbtn_osztas.setText("Osztás");
        muv_rbtn_osztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muv_rbtn_osztasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(muv_rbtn_osztas);

        buttonGroup1.add(muv_rbtn_szorzas);
        muv_rbtn_szorzas.setText("Szorzás");
        muv_rbtn_szorzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muv_rbtn_szorzasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(muv_rbtn_szorzas);

        jMenuBar1.add(mnuMuvelet);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUj, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMegoldas, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegoldas))
                    .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEllenorzesActionPerformed
        osszprobalkozasokSzama++;
        lbllblOsszProba.setText("Össz próbálkozások száma: " + osszprobalkozasokSzama);
        
        if (muv_rbtn_osztas.isSelected()) {
            osztasprobakSzama++;
            lblOsztasProba.setText("Osztás: " + osztasprobakSzama);
        } else if(muv_rbtn_szorzas.isSelected()) {
            szorzasprobakSzama++;
            lblSzorzasProba.setText("Szorzás: " + szorzasprobakSzama);
        }
    }//GEN-LAST:event_btnEllenorzesActionPerformed

    private void btnMegoldasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegoldasActionPerformed
        //empty lines
    }//GEN-LAST:event_btnMegoldasActionPerformed

    private void mnuFajlMegnyitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMegnyitActionPerformed
        JFileChooser fcMegnyit = new JFileChooser(new File("."));
        fcMegnyit.setDialogTitle("Fájl megnyitása");
        fcMegnyit.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("PNG és GIF képek", "PNG", "GIF");
        fcMegnyit.addChoosableFileFilter(imgFilter);
        FileNameExtensionFilter textfilter = new FileNameExtensionFilter("csak szöveges dokumentum .txt", "TXT");
        fcMegnyit.addChoosableFileFilter(textfilter);
        
        
        int valasztottgomberteke = 0;
        if (valasztottgomberteke == JFileChooser.APPROVE_OPTION) {
            File f = fcMegnyit.getSelectedFile();
            String fn = f.getPath();
            lblEredmeny.setText("<html> Elérés: " + fn + "<br> Fájl neve: "+ f.getName() + "</html>");
            
            Path path = Paths.get(fn);
            try {
//                byte[] bajttomb = Files.readAllBytes(path);
                List<String> stringLista = Files.readAllLines(path);
                int i = 7;
                
                String sor = stringLista.get(1);
                String[] adatok = sor.split(":");
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        }
        
    }//GEN-LAST:event_mnuFajlMegnyitActionPerformed

    private void mnuFajlMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentActionPerformed
        JFileChooser fc = new JFileChooser();
        int gomb = fc.showSaveDialog(this);
        fc.setDialogTitle("Fájl mentése..");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setCurrentDirectory(new File("."));
        if ( gomb == JFileChooser.APPROVE_OPTION ) {
            File f = fc.getSelectedFile();
            if (f.isDirectory()) {
                lblValasz.setText("<html>Elérés" + f.getPath() + "<br>Könyvtár" + f.getName() + "</html>");
                try {
                    Files.write(Paths.get(f.getPath(), "stat.txt"),"Statisztika: ".getBytes());
                } catch (IOException ex) {
                    Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_mnuFajlMentActionPerformed

    private void fajl_chb_mentesmaskentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fajl_chb_mentesmaskentActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Mentés másként..");
        fc.setAcceptAllFileFilterUsed(false);
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG és GIF képek", "PNG", "GIF");
        fc.addChoosableFileFilter(filter);
        
        
        int gomb = fc.showSaveDialog(this);
        if (gomb == JFileChooser.APPROVE_OPTION ) {
            File f = fc.getSelectedFile();
            if (f.isDirectory()) {
                lblValasz.setText("<html>Elérés" + f.getPath() + "<br>Könyvtár" + f.getName() + "</html>");
                
                String[] kit = ((FileNameExtensionFilter)fc.getFileFilter()).getExtensions();
                String fn = f.getName() + kit[0];
                
                try {
                    Files.write(Paths.get(fn),"Statisztika: ".getBytes());
                } catch (IOException ex) {
                    Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_fajl_chb_mentesmaskentActionPerformed

    private void muv_rbtn_osztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muv_rbtn_osztasActionPerformed
//        int osztasMegoldas=random1/random2;
//        do {            
//            random2 = rnd.nextInt((99)+1);
//        } while (random2 == 0);
//        
//        String valasz = lblValasz.getText();
//        int szamValasz = Integer.parseInt(valasz);
//        
//        if (szamValasz==osztasMegoldas){
//            lblValasz.setText("Helyes megoldás!\n"+"Eddig helyesen megválaszolt kérdések száma: "+szamokmegoldasa);
//            szamokmegoldasa+=1;
//        }else {
//            lblValasz.setText("Helytelen válasz!\n"+"Eddig helyesen megválaszolt kérdések száma: "+szamokmegoldasa);
//            szamokmegoldasa-=1;
//            if (szamokmegoldasa==0){
//                szamokmegoldasa=0;
//            }
//        }
         int szam1, szam2;
         boolean jo;
         do {            
            szam1 = (int)(Math.random()*101);
            szam2 = (int)(Math.random()*99)+1;
            jo = szam2 != 0 && szam1 % szam2 == 0 && szam1 > szam2;
        } while (!jo);
         lblFeladat.setText(szam1 + "/" + szam2 + "=");
         
         osszeskerdesekSzama++;
         lblOsszKerdes.setText("Össz kérdések száma" + osszeskerdesekSzama);
         osszeskerdesekSzama++;
         lblOsztasKerdes.setText("Osztás: " + osztaskerdesSzama);
         
    }//GEN-LAST:event_muv_rbtn_osztasActionPerformed

    private void txtEredmenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEredmenyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEredmenyActionPerformed

    private void muv_rbtn_szorzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muv_rbtn_szorzasActionPerformed
        osszeskerdesekSzama++;
        lblOsszKerdes.setText("Össz kérdések száma: " + osszeskerdesekSzama);
        
        szorzaskerdesSzama++;
        lblOsztasKerdes.setText("Szorzás: " + szorzaskerdesSzama);
    }//GEN-LAST:event_muv_rbtn_szorzasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muveletek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBoxMenuItem fajl_chb_mentesmaskent;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblFeladat;
    private javax.swing.JLabel lblKivonasKerdes;
    private javax.swing.JLabel lblKivonasProba;
    private javax.swing.JLabel lblOsszKerdes;
    private javax.swing.JLabel lblOsszeadKerdes;
    private javax.swing.JLabel lblOsszeadProba;
    private javax.swing.JLabel lblOsztasKerdes;
    private javax.swing.JLabel lblOsztasProba;
    private javax.swing.JLabel lblSzorzasKerdes;
    private javax.swing.JLabel lblSzorzasProba;
    private javax.swing.JLabel lblValasz;
    private javax.swing.JLabel lbllblOsszProba;
    private javax.swing.JMenu mnuFajl;
    private javax.swing.JMenuItem mnuFajlKilep;
    private javax.swing.JMenuItem mnuFajlMegnyit;
    private javax.swing.JMenuItem mnuFajlMent;
    private javax.swing.JMenu mnuMuvelet;
    private javax.swing.JRadioButtonMenuItem muv_rbtn_kivonas;
    private javax.swing.JRadioButtonMenuItem muv_rbtn_osszeads;
    private javax.swing.JRadioButtonMenuItem muv_rbtn_osztas;
    private javax.swing.JRadioButtonMenuItem muv_rbtn_szorzas;
    private javax.swing.JPanel pnlGyakorlas;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables
    private String tartalomosszeallitas(){
        String statisztika = "Az alapműveletek gyakoroltatása statisztika: /n";
        
        JLabel[] lbltomb = new JLabel[]{lblOsszKerdes,lbllblOsszProba,lblOsszeadKerdes,lblOsszeadProba,lblKivonasKerdes,lblKivonasProba,lblOsztasKerdes,lblOsztasProba,lblSzorzasKerdes,lblSzorzasProba};
        
        final int KERDES_MAX_HOSSZ = lbltomb[0].getText().length();
        final int PROBA_MAX_HOSSZ = lbltomb[1].getText().length();
        
        for (int i = 0; i < lbltomb.length; i += 2) {
            
            JLabel lblkerdes = lbltomb[i];
            JLabel lblproba = lbltomb[i + 1];
            
            final int he = 3; //helyi érték 3 helyen
            String format = "%" + (KERDES_MAX_HOSSZ+he) + "s%" + (PROBA_MAX_HOSSZ+he) + "s/n";
            
            
            statisztika += String.format(format,lblkerdes.getText(),lblproba.getText());
        }
        //statisztika += lblOsszKerdes.getText() + "/n";
        //statisztika += lbllblOsszProba.getText() + "/n";
        
        return statisztika;
    }
}
