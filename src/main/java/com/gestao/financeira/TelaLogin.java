/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.gestao.financeira;

import com.gestao.financeira.sessao.SessaoUsuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;


/**
 *
 * @author luiza-maria-schwinn
 */
public class TelaLogin extends javax.swing.JPanel {
    private final String tipoGestao;
    
    /**
     * Creates new form TelaLoginPessoal
     */
    public TelaLogin(String tipoGestao) {
        this.tipoGestao = tipoGestao;
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

        labelTituloLogin = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnEsqueciASenha = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();

        labelTituloLogin.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        labelTituloLogin.setForeground(new java.awt.Color(0, 0, 102));
        labelTituloLogin.setText("LOGIN");

        labelEmail.setText("E-mail");

        labelSenha.setText("Senha");

        btnEntrar.setBackground(new java.awt.Color(0, 102, 0));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnEsqueciASenha.setBackground(new java.awt.Color(102, 102, 102));
        btnEsqueciASenha.setFont(new java.awt.Font("Liberation Sans", 2, 15)); // NOI18N
        btnEsqueciASenha.setText("Esqueci a senha");
        btnEsqueciASenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueciASenhaActionPerformed(evt);
            }
        });

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEmail)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelTituloLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfSenha)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSenha)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnEsqueciASenha))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(labelTituloLogin)
                        .addGap(59, 59, 59)
                        .addComponent(labelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEsqueciASenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String emailDigitado = tfEmail.getText().trim();
        String senhaDigitada = new String(pfSenha.getPassword()).trim();

        if (emailDigitado.isEmpty() || senhaDigitada.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        if (!verificarEmailNoBanco(emailDigitado)) {
            JOptionPane.showMessageDialog(this, "Nenhum usuário cadastrado com esse e-mail. Você será redirecionado para a tela de cadastro.");

            if ("Pessoal".equalsIgnoreCase(tipoGestao)) {
                TelaCadastroUsuarioPessoal cadastroPessoal = new TelaCadastroUsuarioPessoal();
                cadastroPessoal.setVisible(true);
            } else if ("Empresarial".equalsIgnoreCase(tipoGestao)) {
                TelaCadastroUsuarioEmpresarial cadastroEmpresarial = new TelaCadastroUsuarioEmpresarial();
                cadastroEmpresarial.setVisible(true);
            }

            JFrame telaAtual = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (telaAtual != null) {
                telaAtual.dispose();
            }
            return;
        }

        if (verificarLogin(emailDigitado, senhaDigitada)) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");

            if ("Pessoal".equalsIgnoreCase(tipoGestao)) {
                TelaDashboardPessoa dashboardPessoa = new TelaDashboardPessoa();
                dashboardPessoa.setVisible(true);
            } else if ("Empresarial".equalsIgnoreCase(tipoGestao)) {
                TelaDashboardEmpresa dashboardEmpresa = new TelaDashboardEmpresa();
                dashboardEmpresa.setVisible(true);
            }

            JFrame telaAtual = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (telaAtual != null) {
                telaAtual.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Senha incorreta!");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEsqueciASenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueciASenhaActionPerformed
        TelaRecuperacaoSenha recuperacao = new TelaRecuperacaoSenha();
        recuperacao.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_btnEsqueciASenhaActionPerformed

    private boolean verificarEmailNoBanco(String email) {
        try (Connection conn = ConfiguracaoBD.getConnection()) { 
            String sql = "SELECT COUNT(*) FROM usuarios WHERE email = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, email);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return rs.getInt(1) > 0; 
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao acessar o banco de dados: " + e.getMessage());
            e.printStackTrace();
        }
        return false; 
    }

    public boolean verificarLogin(String email, String senha) {
        try (Connection conn = ConfiguracaoBD.getConnection()) {
            String sql = "SELECT id, cnpj FROM usuarios WHERE email = ? AND senha = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, email);
                stmt.setString(2, senha);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    int idUsuario = rs.getInt("id");
                    String cnpj = rs.getString("cnpj");

                    SessaoUsuario.setIdUsuario(idUsuario);

                    if (cnpj == null || cnpj.trim().isEmpty()) {
                        SessaoUsuario.setTipoGestao("Pessoal");
                    } else {
                        SessaoUsuario.setTipoGestao("Empresarial");
                    }

                    return true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao acessar o banco de dados: " + e.getMessage());
            e.printStackTrace();
        }
        return false; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEsqueciASenha;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTituloLogin;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables
}
