/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author telip
 */
public class BlockBusterBuscar extends javax.swing.JFrame {

    /**
     * Creates new form BlockBusterBuscar
     */
    public BlockBusterBuscar() {
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

        codigoFIELD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        gameBUTTON = new javax.swing.JButton();
        movieBUTTON = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        rentarBUTTON = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codigoFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoFIELDActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo:");

        gameBUTTON.setText("GAME");
        gameBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameBUTTONActionPerformed(evt);
            }
        });

        movieBUTTON.setText("MOVIE");
        movieBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieBUTTONActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo:");

        jButton1.setText("buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rentarBUTTON.setText("rentar");
        rentarBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentarBUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addComponent(codigoFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameBUTTON, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rentarBUTTON)
                            .addComponent(movieBUTTON))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gameBUTTON)
                    .addComponent(movieBUTTON)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(rentarBUTTON))
                .addGap(52, 52, 52))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoFIELDActionPerformed

    private void gameBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameBUTTONActionPerformed
        // funcion de setTipo aqui
        JOptionPane.showMessageDialog(null,"Eligio tipo GAME");
    }//GEN-LAST:event_gameBUTTONActionPerformed

    private void movieBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieBUTTONActionPerformed
        // funcion de setTipo aqui
        JOptionPane.showMessageDialog(null,"Eligio tipo MOVIE");
    }//GEN-LAST:event_movieBUTTONActionPerformed

    private void rentarBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentarBUTTONActionPerformed
        new BlockBusterRent().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rentarBUTTONActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*
        if(find){
        //funcion getInfo aqui
        }
        */
                 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BlockBusterBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlockBusterBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlockBusterBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlockBusterBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlockBusterBuscar().setVisible(true);
            }
        });
    }
    
    /*
    public boolean find(int code){
    int codeSEARCHING
    
    for(int i=0; i<ArrayList.size;i++){
    codeSEARCHING=ArrayList[i];
    if(codeSEARCHING==code)
    return true;
    return false;
    
    }
    
    
    
    
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoFIELD;
    private javax.swing.JButton gameBUTTON;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton movieBUTTON;
    private javax.swing.JButton rentarBUTTON;
    // End of variables declaration//GEN-END:variables
}
