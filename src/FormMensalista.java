
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alunos
 */
public class FormMensalista extends javax.swing.JFrame {
    Mensalista mens = new Mensalista();

    public FormMensalista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textnome = new javax.swing.JTextField();
        textreg = new javax.swing.JTextField();
        textSalbruto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textdesc = new javax.swing.JTextField();
        butCadastrar = new javax.swing.JButton();
        butExibir = new javax.swing.JButton();
        butCalcularsal = new javax.swing.JButton();
        textsalario = new javax.swing.JTextField();
        butvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mensalista");

        jLabel2.setText("Nome");

        jLabel3.setText("Registro");

        jLabel4.setText("Salario Bruto");

        textnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnomeActionPerformed(evt);
            }
        });

        jLabel5.setText("Desconto");

        butCadastrar.setText("Cadastrar");
        butCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCadastrarActionPerformed(evt);
            }
        });

        butExibir.setText("Exibir");
        butExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExibirActionPerformed(evt);
            }
        });

        butCalcularsal.setText("Calcular Salario");
        butCalcularsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCalcularsalActionPerformed(evt);
            }
        });

        butvoltar.setText("Voltar");
        butvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butvoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addGap(29, 29, 29)
                            .addComponent(textnome, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(textreg))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(29, 29, 29)
                                    .addComponent(textdesc))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textSalbruto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butCalcularsal)
                                .addGap(18, 18, 18)
                                .addComponent(textsalario))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butCadastrar)
                                .addGap(62, 62, 62)
                                .addComponent(butExibir)))
                        .addGap(47, 47, 47)
                        .addComponent(butvoltar)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textSalbruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butCadastrar)
                    .addComponent(butExibir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butCalcularsal)
                            .addComponent(textsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(butvoltar)
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCadastrarActionPerformed
      mens.nome=this.textnome.getText();
      mens.reg=Integer.parseInt(this.textreg.getText());
      mens.salbruto=Double.parseDouble(this.textSalbruto.getText());
      mens.desconto=Double.parseDouble(this.textdesc.getText());
      JOptionPane.showMessageDialog(null,"Dados cadastrado com sucesso");
      this.textnome.setText("");
      this.textreg.setText("");
      this.textSalbruto.setText("");
      this.textdesc.setText("");
    }//GEN-LAST:event_butCadastrarActionPerformed

    private void butExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExibirActionPerformed
      this.textnome.setText(""+mens.nome);
      this.textreg.setText(""+mens.reg);
      this.textSalbruto.setText(""+mens.salbruto);
      this.textdesc.setText(""+mens.desconto);
    }//GEN-LAST:event_butExibirActionPerformed

    private void butCalcularsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCalcularsalActionPerformed
      this.textsalario.setText(""+mens.Calcsal());
    }//GEN-LAST:event_butCalcularsalActionPerformed

    private void butvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butvoltarActionPerformed
new FormEmpresa().setVisible(true);
dispose();
    }//GEN-LAST:event_butvoltarActionPerformed

    private void textnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnomeActionPerformed

    /**
     * @param args the command line arguments
     */
     static {
        
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCadastrar;
    private javax.swing.JButton butCalcularsal;
    private javax.swing.JButton butExibir;
    private javax.swing.JButton butvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textSalbruto;
    private javax.swing.JTextField textdesc;
    private javax.swing.JTextField textnome;
    private javax.swing.JTextField textreg;
    private javax.swing.JTextField textsalario;
    // End of variables declaration//GEN-END:variables
}
