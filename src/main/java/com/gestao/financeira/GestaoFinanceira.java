/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestao.financeira;

import javax.swing.SwingUtilities;

/**
 *
 * @author luiza-maria-schwinn
 */
public class GestaoFinanceira {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaBoasVindas().setVisible(true);
        });
    }
}
