/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GoldenCage.gui;

import GoldenCage.entites.Mail.*;
import java.net.URL;


/**
 *
 * @author MohamedAmine
 */
public class MailJframe extends javax.swing.JFrame {

    
    Mail mail = new Mail();
    
    
    /**
     * Creates new form MailJframe
     */
    public MailJframe() {
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
        jTextArearObject = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_mailadmin = new javax.swing.JTextField();
        txt_mailClient = new javax.swing.JTextField();
        txt_objet = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_sujet = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        annulerbt = new javax.swing.JButton();
        envoyerbt = new javax.swing.JButton();
        MDP = new javax.swing.JLabel();
        txt_mdp = new javax.swing.JTextField();
        p_bouton1 = new javax.swing.JPanel();
        bt_acceuil1 = new javax.swing.JButton();
        bt_compte_client = new javax.swing.JButton();
        bt_compte_prestataire = new javax.swing.JButton();
        bt_reclamation = new javax.swing.JButton();
        bt_statistique = new javax.swing.JButton();
        lb_nom_admin = new javax.swing.JLabel();
        lb_photo = new javax.swing.JLabel();
        bt_offre = new javax.swing.JButton();
        bt_comtpe_admin = new javax.swing.JButton();
        bt_quitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(233, 213, 230));

        jTextArearObject.setBackground(new java.awt.Color(233, 213, 230));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setText("Reclamation");

        txt_mailadmin.setText("goldencage.xcoders@outlook.com");

        txt_sujet.setColumns(20);
        txt_sujet.setRows(5);
        jScrollPane1.setViewportView(txt_sujet);

        jLabel2.setText("Admin");

        jLabel4.setText("Client");

        jLabel5.setText("Objet");

        jLabel6.setText("Sujet");

        annulerbt.setText("Annuler");
        annulerbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerbtActionPerformed(evt);
            }
        });

        envoyerbt.setText("Envoyer");
        envoyerbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoyerbtActionPerformed(evt);
            }
        });

        MDP.setText("MDP");

        txt_mdp.setText("x-Coders");

        javax.swing.GroupLayout jTextArearObjectLayout = new javax.swing.GroupLayout(jTextArearObject);
        jTextArearObject.setLayout(jTextArearObjectLayout);
        jTextArearObjectLayout.setHorizontalGroup(
            jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextArearObjectLayout.createSequentialGroup()
                .addGroup(jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTextArearObjectLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jTextArearObjectLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(envoyerbt)
                        .addGap(18, 18, 18)
                        .addComponent(annulerbt))
                    .addGroup(jTextArearObjectLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(MDP))
                        .addGap(18, 18, 18)
                        .addGroup(jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_mailadmin)
                            .addComponent(txt_mailClient)
                            .addComponent(txt_objet)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addComponent(txt_mdp))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jTextArearObjectLayout.setVerticalGroup(
            jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTextArearObjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_mailadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MDP)
                    .addComponent(txt_mdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_mailClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_objet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jTextArearObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annulerbt)
                    .addComponent(envoyerbt)))
        );

        p_bouton1.setBackground(new java.awt.Color(233, 213, 230));
        p_bouton1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Wide Latin", 0, 12), new java.awt.Color(135, 8, 165))); // NOI18N
        p_bouton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p_bouton1.setLayout(null);

        bt_acceuil1.setText("Acceuil");
        bt_acceuil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_acceuil1ActionPerformed(evt);
            }
        });
        p_bouton1.add(bt_acceuil1);
        bt_acceuil1.setBounds(10, 70, 140, 23);

        bt_compte_client.setText("Compte client");
        bt_compte_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_compte_clientActionPerformed(evt);
            }
        });
        p_bouton1.add(bt_compte_client);
        bt_compte_client.setBounds(10, 130, 140, 23);

        bt_compte_prestataire.setText("Compte Prestataire");
        p_bouton1.add(bt_compte_prestataire);
        bt_compte_prestataire.setBounds(10, 160, 140, 23);

        bt_reclamation.setText("Les réclamation");
        bt_reclamation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reclamationActionPerformed(evt);
            }
        });
        p_bouton1.add(bt_reclamation);
        bt_reclamation.setBounds(10, 220, 140, 23);

        bt_statistique.setText("Les statistiques");
        bt_statistique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_statistiqueActionPerformed(evt);
            }
        });
        p_bouton1.add(bt_statistique);
        bt_statistique.setBounds(10, 250, 140, 23);

        lb_nom_admin.setText("Administrateur");
        p_bouton1.add(lb_nom_admin);
        lb_nom_admin.setBounds(70, 20, 100, 30);

        lb_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GoldenCage/images/Client-2-icon.png"))); // NOI18N
        lb_photo.setText("Foto");
        p_bouton1.add(lb_photo);
        lb_photo.setBounds(10, 4, 50, 60);

        bt_offre.setText("Les offres");
        p_bouton1.add(bt_offre);
        bt_offre.setBounds(10, 190, 140, 23);

        bt_comtpe_admin.setText("Compte Admin");
        p_bouton1.add(bt_comtpe_admin);
        bt_comtpe_admin.setBounds(10, 100, 140, 23);

        bt_quitter.setText("Quitter");
        bt_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quitterActionPerformed(evt);
            }
        });
        p_bouton1.add(bt_quitter);
        bt_quitter.setBounds(10, 280, 140, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(p_bouton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArearObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p_bouton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextArearObject, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_acceuil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_acceuil1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bt_acceuil1ActionPerformed

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

    private void envoyerbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoyerbtActionPerformed
        // TODO add your handling code here:
        mail.setEmailRecepteur(txt_mailClient.getText());
        mail.setPwd(txt_mdp.getText());
        mail.setEmailEmetteur(txt_mailadmin.getText());
        mail.setEmailObjet(txt_objet.getText());
        
        mail.setEmailSujet(txt_sujet.getText());
        
        Mailconstruction mc = new Mailconstruction();
        mc.getMailProperties();

        mc.getMailMessage(mail);
        mc.SendMessage();
        
        
        
    }//GEN-LAST:event_envoyerbtActionPerformed

    private void annulerbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerbtActionPerformed
        // TODO add your handling code here:
        
        Reclamation2 rc2 = new Reclamation2();
        rc2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_annulerbtActionPerformed

    private void bt_reclamationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reclamationActionPerformed
        // TODO add your handling code here:
        reclamation1 rc1 = new reclamation1();
        rc1.setVisible(true);
        
    }//GEN-LAST:event_bt_reclamationActionPerformed


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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MailJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MailJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MailJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MailJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MailJframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane Alert_quit;
    private javax.swing.JLabel MDP;
    private javax.swing.JButton annulerbt;
    private javax.swing.JButton bt_acceuil1;
    private javax.swing.JButton bt_compte_client;
    private javax.swing.JButton bt_compte_prestataire;
    private javax.swing.JButton bt_comtpe_admin;
    private javax.swing.JButton bt_offre;
    private javax.swing.JButton bt_quitter;
    private javax.swing.JButton bt_reclamation;
    private javax.swing.JButton bt_statistique;
    private javax.swing.JButton envoyerbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jTextArearObject;
    private javax.swing.JLabel lb_nom_admin;
    private javax.swing.JLabel lb_photo;
    private javax.swing.JPanel p_bouton1;
    private javax.swing.JTextField txt_mailClient;
    private javax.swing.JTextField txt_mailadmin;
    private javax.swing.JTextField txt_mdp;
    private javax.swing.JTextField txt_objet;
    private javax.swing.JTextArea txt_sujet;
    // End of variables declaration//GEN-END:variables
}
