/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.gui;

import GoldenCage.Dao.ReclamationDAO;
import GoldenCage.entites.Reclamation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mounir
 */
public class Reclamation2 extends javax.swing.JFrame {

    /**
     * Creates new form Reclamation2
     */
    public Reclamation2() {
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

        Alert_quit = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        Repondrebt = new javax.swing.JButton();
        Supprimerbt = new javax.swing.JButton();
        p_bouton = new javax.swing.JPanel();
        bt_acceuil = new javax.swing.JButton();
        bt_compte_client = new javax.swing.JButton();
        bt_compte_prestataire = new javax.swing.JButton();
        bt_reclamation = new javax.swing.JButton();
        bt_statistique = new javax.swing.JButton();
        lb_nom_admin = new javax.swing.JLabel();
        lb_photo = new javax.swing.JLabel();
        bt_offre = new javax.swing.JButton();
        bt_comtpe_admin = new javax.swing.JButton();
        bt_quitter = new javax.swing.JButton();
        txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 213, 230));

        Repondrebt.setText("Repondre");
        Repondrebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepondrebtActionPerformed(evt);
            }
        });

        Supprimerbt.setText("Supprimer");
        Supprimerbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerbtActionPerformed(evt);
            }
        });

        p_bouton.setBackground(new java.awt.Color(233, 213, 230));
        p_bouton.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Wide Latin", 0, 12), new java.awt.Color(135, 8, 165))); // NOI18N
        p_bouton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p_bouton.setLayout(null);

        bt_acceuil.setText("Acceuil");
        bt_acceuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_acceuilActionPerformed(evt);
            }
        });
        p_bouton.add(bt_acceuil);
        bt_acceuil.setBounds(10, 70, 140, 23);

        bt_compte_client.setText("Compte client");
        bt_compte_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_compte_clientActionPerformed(evt);
            }
        });
        p_bouton.add(bt_compte_client);
        bt_compte_client.setBounds(10, 130, 140, 23);

        bt_compte_prestataire.setText("Compte Prestataire");
        p_bouton.add(bt_compte_prestataire);
        bt_compte_prestataire.setBounds(10, 160, 140, 23);

        bt_reclamation.setText("Les réclamation");
        bt_reclamation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reclamationActionPerformed(evt);
            }
        });
        p_bouton.add(bt_reclamation);
        bt_reclamation.setBounds(10, 220, 140, 23);

        bt_statistique.setText("Les statistiques");
        bt_statistique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_statistiqueActionPerformed(evt);
            }
        });
        p_bouton.add(bt_statistique);
        bt_statistique.setBounds(10, 250, 140, 23);

        lb_nom_admin.setText("Administrateur");
        p_bouton.add(lb_nom_admin);
        lb_nom_admin.setBounds(70, 20, 100, 30);

        lb_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GoldenCage/images/Client-2-icon.png"))); // NOI18N
        lb_photo.setText("Foto");
        p_bouton.add(lb_photo);
        lb_photo.setBounds(10, 4, 50, 60);

        bt_offre.setText("Les offres");
        p_bouton.add(bt_offre);
        bt_offre.setBounds(10, 190, 140, 23);

        bt_comtpe_admin.setText("Compte Admin");
        p_bouton.add(bt_comtpe_admin);
        bt_comtpe_admin.setBounds(10, 100, 140, 23);

        bt_quitter.setText("Quitter");
        bt_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quitterActionPerformed(evt);
            }
        });
        p_bouton.add(bt_quitter);
        bt_quitter.setBounds(10, 280, 140, 23);

        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_bouton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(Repondrebt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Supprimerbt)
                        .addGap(156, 156, 156))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Supprimerbt, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Repondrebt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_bouton, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_acceuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_acceuilActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bt_acceuilActionPerformed

    private void bt_compte_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_compte_clientActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bt_compte_clientActionPerformed

    private void bt_statistiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_statistiqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_statistiqueActionPerformed

    private void bt_quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quitterActionPerformed
        // TODO add your handling code here:
        int n = Alert_quit.showConfirmDialog(this,"Quitter l'application ?","Quitter",Alert_quit.YES_NO_OPTION);
        if (n == Alert_quit.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_bt_quitterActionPerformed
public void setReclamation(String s){
    txt.setText(s);
}
    private void SupprimerbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerbtActionPerformed
        // TODO add your handling code here:
       
        
        txt.setText("");
        
    }//GEN-LAST:event_SupprimerbtActionPerformed

    private void RepondrebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepondrebtActionPerformed
        // TODO add your handling code here:
        MailJframe mail = new MailJframe();
        mail.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RepondrebtActionPerformed

    private void bt_reclamationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reclamationActionPerformed
        // TODO add your handling code here:
        reclamation1 r1=new reclamation1();
        r1.setVisible(true);
    }//GEN-LAST:event_bt_reclamationActionPerformed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

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
            java.util.logging.Logger.getLogger(Reclamation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reclamation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reclamation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reclamation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reclamation2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane Alert_quit;
    private javax.swing.JButton Repondrebt;
    private javax.swing.JButton Supprimerbt;
    private javax.swing.JButton bt_acceuil;
    private javax.swing.JButton bt_compte_client;
    private javax.swing.JButton bt_compte_prestataire;
    private javax.swing.JButton bt_comtpe_admin;
    private javax.swing.JButton bt_offre;
    private javax.swing.JButton bt_quitter;
    private javax.swing.JButton bt_reclamation;
    private javax.swing.JButton bt_statistique;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_nom_admin;
    private javax.swing.JLabel lb_photo;
    private javax.swing.JPanel p_bouton;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}