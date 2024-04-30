/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alunos
 */
public class FormEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form FormEmpresa
     */
    public FormEmpresa() {
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

        jLabel1 = new javax.swing.JLabel();
        Butmensalista = new javax.swing.JButton();
        ButSair = new javax.swing.JButton();
        Buthorista = new javax.swing.JButton();
        butAutonomo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Controle de pagamentos dos funcionarios");

        Butmensalista.setText("Mensalista");
        Butmensalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButmensalistaActionPerformed(evt);
            }
        });

        ButSair.setText("Sair");
        ButSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSairActionPerformed(evt);
            }
        });

        Buthorista.setText("Horista");
        Buthorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButhoristaActionPerformed(evt);
            }
        });

        butAutonomo.setText("Autonomo");
        butAutonomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAutonomoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ButSair)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(Butmensalista)
                            .addGap(18, 18, 18)
                            .addComponent(Buthorista)
                            .addGap(18, 18, 18)
                            .addComponent(butAutonomo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Butmensalista)
                    .addComponent(Buthorista)
                    .addComponent(butAutonomo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(ButSair)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButmensalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButmensalistaActionPerformed
        new FormMensalista().setVisible(true);
        dispose();
    }//GEN-LAST:event_ButmensalistaActionPerformed

    private void ButSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSairActionPerformed
System.exit(0);
    }//GEN-LAST:event_ButSairActionPerformed

    private void ButhoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButhoristaActionPerformed
        new FormHorista() .setVisible(true);
        dispose();
    }//GEN-LAST:event_ButhoristaActionPerformed

    private void butAutonomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAutonomoActionPerformed
        new FormAutonomo() .setVisible(true);
        
    }//GEN-LAST:event_butAutonomoActionPerformed

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
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButSair;
    private javax.swing.JButton Buthorista;
    private javax.swing.JButton Butmensalista;
    private javax.swing.JButton butAutonomo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
