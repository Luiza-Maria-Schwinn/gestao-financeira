/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestao.financeira;

/**
 *
 * @author luiza-maria-schwinn
 */
public class TelaEscolhaTipoGestao extends javax.swing.JFrame {

    private static String tipoGestao;

    public static void setTipoGestao(String tipo) {
        tipoGestao = tipo;
    }

    public static String getTipoGestao() {
        return tipoGestao;
    }

    /**
     * Creates new form TelaEscolhaTipoGestao
     */
    public TelaEscolhaTipoGestao() {
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

        labelLogo = new javax.swing.JLabel();
        labelTituloEscolhaTipo1 = new javax.swing.JLabel();
        labelTituloEscolhaTipo2 = new javax.swing.JLabel();
        btnPessoal = new javax.swing.JButton();
        btnEmpresarial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        labelTituloEscolhaTipo1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        labelTituloEscolhaTipo1.setForeground(new java.awt.Color(0, 0, 102));
        labelTituloEscolhaTipo1.setText("ESCOLHA O TIPO");

        labelTituloEscolhaTipo2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        labelTituloEscolhaTipo2.setForeground(new java.awt.Color(0, 0, 102));
        labelTituloEscolhaTipo2.setText("DE GESTÃO");

        btnPessoal.setBackground(new java.awt.Color(0, 102, 0));
        btnPessoal.setText("Finanças Pessoais");
        btnPessoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoalActionPerformed(evt);
            }
        });

        btnEmpresarial.setBackground(new java.awt.Color(0, 102, 0));
        btnEmpresarial.setText("Finanças Empresariais");
        btnEmpresarial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresarialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTituloEscolhaTipo2)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTituloEscolhaTipo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnPessoal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnEmpresarial)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(labelTituloEscolhaTipo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTituloEscolhaTipo2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(btnPessoal)
                .addGap(18, 18, 18)
                .addComponent(btnEmpresarial)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPessoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoalActionPerformed
        setTipoGestao("Pessoal");
        TelaEscolhaLoginCadastro tela = new TelaEscolhaLoginCadastro();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPessoalActionPerformed

    private void btnEmpresarialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresarialActionPerformed
        setTipoGestao("Empresarial");
        TelaEscolhaLoginCadastro tela = new TelaEscolhaLoginCadastro();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEmpresarialActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEscolhaTipoGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhaTipoGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhaTipoGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhaTipoGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEscolhaTipoGestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpresarial;
    private javax.swing.JButton btnPessoal;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelTituloEscolhaTipo1;
    private javax.swing.JLabel labelTituloEscolhaTipo2;
    // End of variables declaration//GEN-END:variables
}
