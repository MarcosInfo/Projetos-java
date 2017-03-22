/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.Pergunta;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author marca
 */
public class jfInfo extends javax.swing.JFrame {

    /**
     * Creates new form jfInfo
     */
    int xLV=0, msgSaida;     
    Pergunta pergunta = new Pergunta();
    public jfInfo() {        
        initComponents();  
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlbLevels = new javax.swing.JLabel();
        jlbImage = new javax.swing.JLabel();
        jbtSairL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtOK.setText("Iniciar");
        jbtOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtOKActionPerformed(evt);
            }
        });
        jPanel1.add(jbtOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 90, 30));

        jLabel1.setText("Inormações do Nível:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jlbLevels.setText("jLabel2");
        jPanel1.add(jlbLevels, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jlbImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jlbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 170, 140));

        jbtSairL.setText("Sair");
        jbtSairL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSairLActionPerformed(evt);
            }
        });
        jPanel1.add(jbtSairL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOKActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtOKActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try{
       xLV++;
       
       switch(xLV){
        case 1:
        ImageIcon icone1 = new ImageIcon(jfInfo.class.getResource("/images/Inicial.png"));
        Image imagem1 = icone1.getImage().getScaledInstance(jlbImage.getWidth(), jlbImage.getHeight(), Image.SCALE_DEFAULT);
        jlbImage.setIcon(new ImageIcon(imagem1));
        break;
        case 2:
        ImageIcon icone2 = new ImageIcon(jfInfo.class.getResource("/images/Computador-02.png"));
        Image imagem2 = icone2.getImage().getScaledInstance(jlbImage.getWidth(), jlbImage.getHeight(), Image.SCALE_DEFAULT);
        jlbImage.setIcon(new ImageIcon(imagem2));
        break;
        case 3:
        ImageIcon icone3 = new ImageIcon(jfInfo.class.getResource("/images/escola-00.png"));
        Image imagem3 = icone3.getImage().getScaledInstance(jlbImage.getWidth(), jlbImage.getHeight(), Image.SCALE_DEFAULT);
        jlbImage.setIcon(new ImageIcon(imagem3));
        break;
        case 4:
        ImageIcon icone4 = new ImageIcon(jfInfo.class.getResource("/images/livros-00.png"));
        Image imagem4 = icone4.getImage().getScaledInstance(jlbImage.getWidth(), jlbImage.getHeight(), Image.SCALE_DEFAULT);
        jlbImage.setIcon(new ImageIcon(imagem4));
        break;
        case 5:
        ImageIcon icone5 = new ImageIcon(jfInfo.class.getResource("/images/programador.png"));
        Image imagem5 = icone5.getImage().getScaledInstance(jlbImage.getWidth(), jlbImage.getHeight(), Image.SCALE_DEFAULT);
        jlbImage.setIcon(new ImageIcon(imagem5));
        break;
       }
       
       pergunta.setLevels(xLV);      
       jlbLevels.setText(Integer.toString(pergunta.getLevels()));
       }catch(Exception erro){
           JOptionPane.showMessageDialog(null, "Algo deu errado");
       }
        
    }//GEN-LAST:event_formComponentShown

    private void jbtSairLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSairLActionPerformed
       msgSaida = JOptionPane.showConfirmDialog(null,"Deseja mesmo sair?");
       switch (msgSaida){
           case 0:
               System.exit(0);
               break;
           case 1:
              JOptionPane.showMessageDialog(null, "Cancelado");
              break;
       }
    }//GEN-LAST:event_jbtSairLActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    msgSaida = JOptionPane.showConfirmDialog(null,"Deseja mesmo sair?");
    switch (msgSaida){
           case 0:
               System.exit(0);
                break;
           case 1:
              JOptionPane.showMessageDialog(null, "Cancelado");
              break;
       }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(jfInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtOK;
    private javax.swing.JButton jbtSairL;
    private javax.swing.JLabel jlbImage;
    private javax.swing.JLabel jlbLevels;
    // End of variables declaration//GEN-END:variables
}
