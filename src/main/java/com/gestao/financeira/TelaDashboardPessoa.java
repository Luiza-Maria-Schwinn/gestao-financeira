/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestao.financeira;

import com.gestao.financeira.sessao.SessaoUsuario;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiza-maria-schwinn
 */
public class TelaDashboardPessoa extends javax.swing.JFrame {
    private final java.util.List<Transacao> transacoes = new ArrayList<>();
    private final java.util.List<String> listaMetas = new ArrayList<>();

    /**
     * Creates new form TelaDashboardPessoa
     */
    public TelaDashboardPessoa() {
        initComponents();

        setTitle("Tela de Dashboard");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        painelResumoFinanceiro.setVisible(true);
        painelDespesasPorCategoria.setVisible(false);
        painelMetas.setVisible(false);
        
        carregarTransacoesDoBanco(); 
        exibirTransacoesResumoFinanceiro();
        inicializarTabelaMetas();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        painelSuperior = new javax.swing.JPanel();
        labelSubtitleDashboard = new javax.swing.JLabel();
        btnResumoFinanceiro = new javax.swing.JButton();
        btnDespesasPorCategoria = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        btnMetas = new javax.swing.JButton();
        painelCentral = new javax.swing.JPanel();
        painelResumoFinanceiro = new javax.swing.JPanel();
        spResumoFinanceiro = new javax.swing.JScrollPane();
        tableResumoFinanceiro = new javax.swing.JTable();
        painelMetas = new javax.swing.JPanel();
        spTabelaMetas = new javax.swing.JScrollPane();
        tabelaMetas = new javax.swing.JTable();
        painelDespesasPorCategoria = new javax.swing.JPanel();
        spDespesasPorCategoria = new javax.swing.JScrollPane();
        tableDespesasPorCategoria = new javax.swing.JTable();
        painelInferior = new javax.swing.JPanel();
        btnAdicionarMeta = new javax.swing.JButton();
        btnAdicionarTransacao = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelSubtitleDashboard.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        labelSubtitleDashboard.setForeground(new java.awt.Color(0, 0, 102));
        labelSubtitleDashboard.setText("DASHBOARD");

        btnResumoFinanceiro.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        btnResumoFinanceiro.setText("Resumo Financeiro");
        btnResumoFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumoFinanceiroActionPerformed(evt);
            }
        });

        btnDespesasPorCategoria.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        btnDespesasPorCategoria.setText("Despesas por Categoria");
        btnDespesasPorCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespesasPorCategoriaActionPerformed(evt);
            }
        });

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        btnMetas.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        btnMetas.setText("Metas");
        btnMetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSuperiorLayout = new javax.swing.GroupLayout(painelSuperior);
        painelSuperior.setLayout(painelSuperiorLayout);
        painelSuperiorLayout.setHorizontalGroup(
            painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuperiorLayout.createSequentialGroup()
                .addGroup(painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelSuperiorLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(labelSubtitleDashboard)
                        .addGap(18, 18, 18)
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelSuperiorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResumoFinanceiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDespesasPorCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMetas)
                        .addGap(75, 75, 75)))
                .addGap(73, 73, 73))
        );
        painelSuperiorLayout.setVerticalGroup(
            painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuperiorLayout.createSequentialGroup()
                .addGroup(painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSuperiorLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(labelSubtitleDashboard))
                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDespesasPorCategoria)
                    .addComponent(btnResumoFinanceiro)
                    .addComponent(btnMetas))
                .addContainerGap())
        );

        painelCentral.setLayout(new java.awt.CardLayout());

        painelResumoFinanceiro.setLayout(new javax.swing.BoxLayout(painelResumoFinanceiro, javax.swing.BoxLayout.LINE_AXIS));

        tableResumoFinanceiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo", "Categoria", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spResumoFinanceiro.setViewportView(tableResumoFinanceiro);

        painelResumoFinanceiro.add(spResumoFinanceiro);

        painelCentral.add(painelResumoFinanceiro, "card2");

        painelMetas.setLayout(new javax.swing.BoxLayout(painelMetas, javax.swing.BoxLayout.LINE_AXIS));

        tabelaMetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Descrição", "Valor"
            }
        ));
        spTabelaMetas.setViewportView(tabelaMetas);

        painelMetas.add(spTabelaMetas);

        painelCentral.add(painelMetas, "card4");

        painelDespesasPorCategoria.setLayout(new javax.swing.BoxLayout(painelDespesasPorCategoria, javax.swing.BoxLayout.LINE_AXIS));

        tableDespesasPorCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Categoria", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spDespesasPorCategoria.setViewportView(tableDespesasPorCategoria);

        painelDespesasPorCategoria.add(spDespesasPorCategoria);

        painelCentral.add(painelDespesasPorCategoria, "card3");

        btnAdicionarMeta.setBackground(new java.awt.Color(0, 102, 0));
        btnAdicionarMeta.setText("Adicionar meta");
        btnAdicionarMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarMetaActionPerformed(evt);
            }
        });

        btnAdicionarTransacao.setBackground(new java.awt.Color(0, 102, 0));
        btnAdicionarTransacao.setText("Adicionar transação");
        btnAdicionarTransacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarTransacaoActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(102, 102, 102));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelInferiorLayout = new javax.swing.GroupLayout(painelInferior);
        painelInferior.setLayout(painelInferiorLayout);
        painelInferiorLayout.setHorizontalGroup(
            painelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInferiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionarTransacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionarMeta)
                .addGap(33, 33, 33))
        );
        painelInferiorLayout.setVerticalGroup(
            painelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInferiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarMeta)
                    .addComponent(btnAdicionarTransacao)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(painelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResumoFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumoFinanceiroActionPerformed
        painelResumoFinanceiro.setVisible(true);
        painelDespesasPorCategoria.setVisible(false);
        painelMetas.setVisible(false);

        carregarTransacoesDoBanco();
        exibirTransacoesResumoFinanceiro();

        painelResumoFinanceiro.revalidate();
        painelResumoFinanceiro.repaint();    
    }//GEN-LAST:event_btnResumoFinanceiroActionPerformed

    private void btnDespesasPorCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespesasPorCategoriaActionPerformed
        painelResumoFinanceiro.setVisible(false);
        painelDespesasPorCategoria.setVisible(true);
        painelMetas.setVisible(false);

        exibirDespesasPorCategoria();
    }//GEN-LAST:event_btnDespesasPorCategoriaActionPerformed

    private void btnMetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetasActionPerformed
        inicializarTabelaMetas();
        painelResumoFinanceiro.setVisible(false);
        painelDespesasPorCategoria.setVisible(false);
        painelMetas.setVisible(true);
        atualizarMetas();
    }//GEN-LAST:event_btnMetasActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        SessaoUsuario.limparSessao();
        
        TelaEscolhaTipoGestao escolha = new TelaEscolhaTipoGestao();
        escolha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAdicionarMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarMetaActionPerformed
        AdicaoMeta telaAdicaoMeta = new AdicaoMeta();
        telaAdicaoMeta.setVisible(true);
    }//GEN-LAST:event_btnAdicionarMetaActionPerformed

    private void btnAdicionarTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarTransacaoActionPerformed
        RegistroTransacoes telaTransacoes = new RegistroTransacoes();
        telaTransacoes.setVisible(true);
    }//GEN-LAST:event_btnAdicionarTransacaoActionPerformed

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
                return rowsAffected > 0; // 
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar transação: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Formato de data inválido! Use AAAA-MM-DD.", "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
    }
    
    public void inicializarDados() {
        carregarTransacoesDoBanco();
        exibirTransacoesResumoFinanceiro();
    }
    
    public void carregarTransacoesDoBanco() {
        transacoes.clear();

        try (Connection conn = ConfiguracaoBD.getConnection()) { 
            String sql = "SELECT tipo, data, valor, categoria, descricao FROM transacoes WHERE id_usuario = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, SessaoUsuario.getIdUsuario());

                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        Transacao transacao = new Transacao(
                            rs.getString("tipo"),
                            rs.getString("data"),
                            rs.getDouble("valor"),
                            rs.getString("categoria"),
                            rs.getString("descricao"),
                            SessaoUsuario.getIdUsuario()
                        );
                        transacoes.add(transacao);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar transações: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        exibirTransacoesResumoFinanceiro();
    }
    
    private void exibirTransacoesResumoFinanceiro() {
        DefaultTableModel modeloTabela = (DefaultTableModel) tableResumoFinanceiro.getModel();
        modeloTabela.setRowCount(0);

        if (transacoes.isEmpty()) {
            return;
        }

        for (Transacao transacao : transacoes) {
            modeloTabela.addRow(new Object[]{
                transacao.getTipo(),
                transacao.getCategoria(),
                String.format("R$ %.2f", transacao.getValor())
            });
        }

        tableResumoFinanceiro.revalidate();
        tableResumoFinanceiro.repaint();
    }
    
    public List<Object[]> carregarMetasDoBanco() {
        List<Object[]> metas = new ArrayList<>();

        try (Connection conn = ConfiguracaoBD.getConnection()) { 
            String query = "SELECT descricao, valor FROM metas WHERE id_usuario = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, SessaoUsuario.getIdUsuario());

                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        String descricao = rs.getString("descricao");
                        Double valor = rs.getDouble("valor");

                        metas.add(new Object[]{descricao, valor});
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar metas do banco: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        return metas;
    }

    public void atualizarMetas() {
        List<Object[]> metas = carregarMetasDoBanco();
        DefaultTableModel modeloTabela = (DefaultTableModel) tabelaMetas.getModel();
        modeloTabela.setRowCount(0);

        if (metas.isEmpty()) {
            modeloTabela.addRow(new Object[] {"Nenhuma meta encontrada", ""});
        } else {
            for (Object[] meta : metas) {
                modeloTabela.addRow(meta);
            }
        }

        painelMetas.revalidate();
        painelMetas.repaint();
    }
    
    public void adicionarMeta(String meta) {
        listaMetas.add(meta);
        atualizarMetas();
    }

    private void exibirResumoFinanceiro() {
        painelResumoFinanceiro.removeAll();
        double total = 0;
        for (Transacao transacao : transacoes) {
            if (transacao.getTipo().equalsIgnoreCase("Entrada")) {
                total += transacao.getValor();
            } else if (transacao.getTipo().equalsIgnoreCase("Despesa") || transacao.getTipo().equalsIgnoreCase("Saída")) {
                total -= transacao.getValor();
            }
        }

        JLabel resumoLabel = new JLabel("Total: R$ " + total);
        painelResumoFinanceiro.add(resumoLabel);

        painelResumoFinanceiro.revalidate();
        painelResumoFinanceiro.repaint();
    }
    
    private void exibirTransacoes() {
        painelResumoFinanceiro.removeAll();
        painelResumoFinanceiro.setLayout(new javax.swing.BoxLayout(painelResumoFinanceiro, javax.swing.BoxLayout.Y_AXIS)); 

        if (transacoes.isEmpty()) {
            JLabel labelVazio = new JLabel("Nenhuma transação encontrada.");
            painelResumoFinanceiro.add(labelVazio);
        } else {
            for (Transacao transacao : transacoes) {
                String valor = (transacao.getValor() == 0.0) ? "Valor inválido" : "R$ " + transacao.getValor();

                String transacaoTexto = "<html>" + transacao.getTipo() + " - " + transacao.getCategoria() + ": " + valor + "</html>";

                JLabel label = new JLabel(transacaoTexto);
                painelResumoFinanceiro.add(label);
            }
        }

        painelResumoFinanceiro.revalidate();
        painelResumoFinanceiro.repaint();
    }

    private void exibirDespesasPorCategoria() {
        DefaultTableModel model = (DefaultTableModel) tableDespesasPorCategoria.getModel();
        model.setRowCount(0); 

        Map<String, Double> despesasAgrupadas = agruparDespesasPorCategoria();
        for (Map.Entry<String, Double> entry : despesasAgrupadas.entrySet()) {
            model.addRow(new Object[]{entry.getKey(), entry.getValue()});
        }

        tableDespesasPorCategoria.revalidate();
        tableDespesasPorCategoria.repaint();
    }

    private Map<String, Double> agruparDespesasPorCategoria() {
        Map<String, Double> despesasAgrupadas = new HashMap<>();

        for (Transacao transacao : transacoes) {
            if (transacao.getTipo().equalsIgnoreCase("Despesa") || transacao.getTipo().equalsIgnoreCase("Saída")) {
                despesasAgrupadas.merge(transacao.getCategoria(), transacao.getValor(), Double::sum);
            }
        }
        return despesasAgrupadas;
    }
    
    private void inicializarTabelaMetas() {
        if (tabelaMetas == null) {
            DefaultTableModel modeloTabela = new DefaultTableModel();

            tabelaMetas = new JTable(modeloTabela);

            modeloTabela.addColumn("Descrição");
            modeloTabela.addColumn("Valor");

            spTabelaMetas.setViewportView(tabelaMetas);
        }
    }

    public void adicionarTransacao(String tipo, String valor, String data, String categoria, String descricao, int idUsuario) {
        try {
            double valorConvertido = Double.parseDouble(valor);
            Transacao novaTransacao = new Transacao(tipo, data, valorConvertido, categoria, descricao, idUsuario);
            transacoes.add(novaTransacao); 

            salvarTransacaoNoBanco(novaTransacao);

            carregarTransacoesDoBanco();

            exibirTransacoes(); 

            exibirResumoFinanceiro();

        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter o valor da transação: " + e.getMessage());
        }
    }

    public static class Transacao {
        private String tipo;
        private String data;
        private double valor;
        private String categoria;
        private String descricao;
        private int idUsuario;

        public Transacao(String tipo, String data, double valor, String categoria, String descricao, int idUsuario) {
            this.tipo = tipo;
            this.data = data;
            this.valor = valor;
            this.categoria = categoria;
            this.descricao = descricao;
            this.idUsuario = idUsuario;
        }

        public String getTipo() { return tipo; }
        public String getData() { return data; }
        public double getValor() { return valor; }
        public String getCategoria() { return categoria; }
        public String getDescricao() { return descricao; }
        public int getIdUsuario() { return idUsuario; }
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
            java.util.logging.Logger.getLogger(TelaDashboardEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDashboardEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDashboardEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDashboardEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDashboardPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarMeta;
    private javax.swing.JButton btnAdicionarTransacao;
    private javax.swing.JButton btnDespesasPorCategoria;
    private javax.swing.JButton btnMetas;
    private javax.swing.JButton btnResumoFinanceiro;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelSubtitleDashboard;
    private javax.swing.JPanel painelCentral;
    private javax.swing.JPanel painelDespesasPorCategoria;
    private javax.swing.JPanel painelInferior;
    private javax.swing.JPanel painelMetas;
    private javax.swing.JPanel painelResumoFinanceiro;
    private javax.swing.JPanel painelSuperior;
    private javax.swing.JScrollPane spDespesasPorCategoria;
    private javax.swing.JScrollPane spResumoFinanceiro;
    private javax.swing.JScrollPane spTabelaMetas;
    private javax.swing.JTable tabelaMetas;
    private javax.swing.JTable tableDespesasPorCategoria;
    private javax.swing.JTable tableResumoFinanceiro;
    // End of variables declaration//GEN-END:variables
}
