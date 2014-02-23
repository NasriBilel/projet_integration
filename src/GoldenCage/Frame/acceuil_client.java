/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Frame;

import javax.swing.JFrame;
/**
 *
 * @author FGH
 */
public class acceuil_client extends javax.swing.JFrame {

    
        
    
      
    
    /**
     * Creates new form fr_acceuil
     */
    public acceuil_client() {
        initComponents();
        
         build();//On initialise notre fenêtre
    }
    private void build(){
		setTitle("Ma première fenêtre"); //On donne un titre à l'application
		setSize(1000,650); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
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
        p_bouton = new javax.swing.JPanel();
        bt_acceuil = new javax.swing.JButton();
        bt_reclamation = new javax.swing.JButton();
        lb_nom_admin = new javax.swing.JLabel();
        lb_photo = new javax.swing.JLabel();
        bt_service = new javax.swing.JButton();
        bt_panier = new javax.swing.JButton();
        bt_compt = new javax.swing.JButton();
        p_liste = new javax.swing.JPanel();
        lb_photo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
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

        bt_reclamation.setText("reclamation");
        bt_reclamation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reclamationActionPerformed(evt);
            }
        });
        p_bouton.add(bt_reclamation);
        bt_reclamation.setBounds(10, 190, 140, 23);

        lb_nom_admin.setText("Administrateur");
        p_bouton.add(lb_nom_admin);
        lb_nom_admin.setBounds(70, 20, 100, 30);

        lb_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GoldenCage/images/Client-2-icon.png"))); // NOI18N
        lb_photo.setText("Foto");
        p_bouton.add(lb_photo);
        lb_photo.setBounds(10, 4, 50, 60);

        bt_service.setText("service");
        bt_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_serviceActionPerformed(evt);
            }
        });
        p_bouton.add(bt_service);
        bt_service.setBounds(10, 130, 140, 23);

        bt_panier.setText("Panier");
        p_bouton.add(bt_panier);
        bt_panier.setBounds(10, 160, 140, 23);

        bt_compt.setText("my compte");
        bt_compt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_comptActionPerformed(evt);
            }
        });
        p_bouton.add(bt_compt);
        bt_compt.setBounds(10, 100, 140, 23);

        p_liste.setBackground(new java.awt.Color(233, 213, 230));
        p_liste.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Wide Latin", 0, 12), new java.awt.Color(135, 8, 165))); // NOI18N
        p_liste.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p_liste.setLayout(null);

        lb_photo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new.png"))); // NOI18N
        p_liste.add(lb_photo2);
        lb_photo2.setBounds(280, 130, 350, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p_bouton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_liste, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_bouton, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addComponent(p_liste, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
      
    }//GEN-LAST:event_formWindowOpened

    private void bt_acceuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_acceuilActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bt_acceuilActionPerformed

    private void bt_reclamationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reclamationActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_bt_reclamationActionPerformed

    private void bt_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_serviceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_serviceActionPerformed

    private void bt_comptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_comptActionPerformed
      
    }//GEN-LAST:event_bt_comptActionPerformed

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
            java.util.logging.Logger.getLogger(acceuil_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acceuil_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acceuil_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acceuil_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new acceuil_client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane Alert_quit;
    private javax.swing.JButton bt_acceuil;
    private javax.swing.JButton bt_compt;
    private javax.swing.JButton bt_panier;
    private javax.swing.JButton bt_reclamation;
    private javax.swing.JButton bt_service;
    private javax.swing.JLabel lb_nom_admin;
    private javax.swing.JLabel lb_photo;
    private javax.swing.JLabel lb_photo2;
    private javax.swing.JPanel p_bouton;
    private javax.swing.JPanel p_liste;
    // End of variables declaration//GEN-END:variables
}