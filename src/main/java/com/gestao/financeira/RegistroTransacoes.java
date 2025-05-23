/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestao.financeira;

import com.gestao.financeira.TelaDashboardPessoa.Transacao;
import com.gestao.financeira.sessao.SessaoUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author luiza-maria-schwinn
 */
public class RegistroTransacoes extends javax.swing.JFrame {

    /**
     * Creates new form RegistrosTransacoes
     */
    public RegistroTransacoes() {
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
        labelTituloRegistro = new javax.swing.JLabel();
        labelSubtituloTransacoes = new javax.swing.JLabel();
        cbTipoEntradaSaida = new javax.swing.JComboBox<>();
        labelTipo = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        labelValor = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        labelData = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        tfCategoria = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnVoltarDashboard = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        labelTituloRegistro.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        labelTituloRegistro.setForeground(new java.awt.Color(0, 0, 102));
        labelTituloRegistro.setText("REGISTRO ");

        labelSubtituloTransacoes.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        labelSubtituloTransacoes.setForeground(new java.awt.Color(0, 0, 102));
        labelSubtituloTransacoes.setText("DE TRANSAÇÕES");

        cbTipoEntradaSaida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Saída" }));

        labelTipo.setText("Tipo");

        labelDescricao.setText("Descrição");

        labelValor.setText("Valor");

        labelData.setText("Data");

        labelCategoria.setText("Categoria");

        btnSalvar.setBackground(new java.awt.Color(0, 102, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnVoltarDashboard.setBackground(new java.awt.Color(102, 102, 102));
        btnVoltarDashboard.setText("Voltar ao Dashboard");
        btnVoltarDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarDashboardActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(102, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(labelTituloRegistro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(labelSubtituloTransacoes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipoEntradaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTipo)
                            .addComponent(labelDescricao))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCategoria))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancelar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btnVoltarDashboard))
                            .addComponent(labelValor)
                            .addComponent(labelData))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltarDashboard))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(labelTituloRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelSubtituloTransacoes)
                        .addGap(18, 18, 18)
                        .addComponent(labelTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoEntradaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDescricao)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarDashboardActionPerformed
        TelaDashboardPessoa dashboard = new TelaDashboardPessoa();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarDashboardActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        TelaDashboardPessoa dashboard = new TelaDashboardPessoa();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String tipo = cbTipoEntradaSaida.getSelectedItem().toString();
        String valor = tfValor.getText();
        String dataDigitada = tfData.getText();
        String categoria = tfCategoria.getText();
        String descricao = tfDescricao.getText().trim();

        int idUsuario = SessaoUsuario.getIdUsuario();

        if (tipo.isEmpty() || valor.isEmpty() || dataDigitada.isEmpty() || categoria.isEmpty() || descricao.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        double valorConvertido;
        try {
            valorConvertido = Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valor inválido.");
            return;
        }

        String dataFormatada;
        try {
            DateTimeFormatter entradaFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            DateTimeFormatter saidaFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate dataConvertida = LocalDate.parse(dataDigitada, entradaFormatter);
            dataFormatada = dataConvertida.format(saidaFormatter);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido! Use DD-MM-YYYY.");
            return;
        }

        Transacao novaTransacao = new Transacao(tipo, dataFormatada, valorConvertido, categoria, descricao, idUsuario);

        boolean sucesso = salvarTransacaoNoBanco(novaTransacao);

        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Transação salva com sucesso!");
            atualizarDashboardPessoa();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar transação.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private boolean salvarTransacaoNoBanco(Transacao transacao) {
        try (Connection conn = ConfiguracaoBD.getConnection()) { 
            int idUsuario = SessaoUsuario.getIdUsuario();

            String sql = "INSERT INTO transacoes (descricao, valor, categoria, id_usuario, tipo, data) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, transacao.getDescricao());
                stmt.setDouble(2, transacao.getValor());
                stmt.setString(3, transacao.getCategoria());
                stmt.setInt(4, idUsuario);
                stmt.setString(5, transacao.getTipo());

                java.sql.Date dataSQL = java.sql.Date.valueOf(transacao.getData());
                stmt.setDate(6, dataSQL);

                int rowsAffected = stmt.executeUpdate();
                return rowsAffected > 0; 
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false; 
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Formato de data inválido! Use AAAA-MM-DD.", "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false; 
        }
    }

    private void atualizarDashboardPessoa() {
        TelaDashboardPessoa dashboardPessoa = new TelaDashboardPessoa();
        dashboardPessoa.carregarTransacoesDoBanco();
        dashboardPessoa.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(RegistroTransacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroTransacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroTransacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroTransacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroTransacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltarDashboard;
    private javax.swing.JComboBox<String> cbTipoEntradaSaida;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelSubtituloTransacoes;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelTituloRegistro;
    private javax.swing.JLabel labelValor;
    private javax.swing.JTextField tfCategoria;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
