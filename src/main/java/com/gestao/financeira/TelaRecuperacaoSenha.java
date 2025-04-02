/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestao.financeira;

import com.gestao.financeira.sessao.SessaoUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author luiza-maria-schwinn
 */
public class TelaRecuperacaoSenha extends javax.swing.JFrame {
    private String codigoGerado;
    
    /**
     * Creates new form TelaRecuperacaoSenha
     */
    public TelaRecuperacaoSenha() {
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

        labelTituloRecuperacao = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btnEnviarCodigo = new javax.swing.JButton();
        labelInformacao = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTituloRecuperacao.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        labelTituloRecuperacao.setForeground(new java.awt.Color(0, 0, 102));
        labelTituloRecuperacao.setText("RECUPERAÇÃO");

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        labelEmail.setText("Digite seu e-mail");

        btnEnviarCodigo.setBackground(new java.awt.Color(0, 102, 0));
        btnEnviarCodigo.setText("Enviar código de recuperação");
        btnEnviarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCodigoActionPerformed(evt);
            }
        });

        labelInformacao.setText("Se o e-mail estiver cadastrado, você receberá um código");

        labelCodigo.setText("Código");

        btnVoltar.setBackground(new java.awt.Color(102, 102, 102));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnVerificar.setBackground(new java.awt.Color(0, 102, 0));
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelEmail))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(labelTituloRecuperacao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEnviarCodigo)
                            .addComponent(labelInformacao)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerificar)
                                .addGap(33, 33, 33)
                                .addComponent(btnVoltar)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(labelTituloRecuperacao)
                        .addGap(18, 18, 18)
                        .addComponent(labelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnviarCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInformacao)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar)
                    .addComponent(btnVerificar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaEscolhaTipoGestao escolha = new TelaEscolhaTipoGestao(); 
        escolha.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_btnVoltarActionPerformed

    //aqui eu fiz simplesmente para mostrar no console o código e nao da forma mais complicada enviando realmente um email para a pessoa
    private void btnEnviarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCodigoActionPerformed
       String emailDigitado = tfEmail.getText().trim();

        if (emailDigitado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um e-mail.");
            return;
        }

        if (!verificarEmailNoBanco(emailDigitado)) {
            JOptionPane.showMessageDialog(this, "Nenhum cadastro encontrado com esse e-mail. Por favor, cadastre-se.");
            TelaCadastroUsuarioPessoal cadastro = new TelaCadastroUsuarioPessoal();
            cadastro.setVisible(true);
            this.dispose();
        } else {
            codigoGerado = gerarCodigoRecuperacao();
            System.out.println("Código de recuperação gerado: " + codigoGerado);
            JOptionPane.showMessageDialog(this, "Código de recuperação enviado, vísivel no console.");
        }
    }//GEN-LAST:event_btnEnviarCodigoActionPerformed

    private boolean verificarEmailNoBanco(String email) {
        try (Connection conn = ConfiguracaoBD.getConnection()) { 
            String sql = "SELECT COUNT(*) FROM usuarios WHERE email = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, email);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        return rs.getInt(1) > 0; 
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao acessar o banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Mostra detalhes do erro no console
        }
        return false; // Retorna false em caso de erro ou email não encontrado
    }
    
    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        String codigoDigitado = tfCodigo.getText().trim();

        if (codigoDigitado.equals(codigoGerado)) {
            JOptionPane.showMessageDialog(this, "Código correto! Acesso permitido.");

            try (Connection conn = ConfiguracaoBD.getConnection()) { 
                String sql = "SELECT id FROM usuarios WHERE email = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, tfEmail.getText().trim());
                    try (ResultSet rs = stmt.executeQuery()) {
                        if (rs.next()) {
                            int idUsuario = rs.getInt("id");
                            SessaoUsuario.setIdUsuario(idUsuario); 

                            TelaDashboardPessoa dashboard = new TelaDashboardPessoa();
                            dashboard.setVisible(true);
                            this.dispose(); 
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao acessar o banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Código incorreto! Tente novamente.");
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private String gerarCodigoRecuperacao() {
        int codigo = (int) (Math.random() * 9000) + 1000;  
        return String.valueOf(codigo);
    }
    
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
            java.util.logging.Logger.getLogger(TelaRecuperacaoSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRecuperacaoSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRecuperacaoSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRecuperacaoSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRecuperacaoSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarCodigo;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelInformacao;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelTituloRecuperacao;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables
}
