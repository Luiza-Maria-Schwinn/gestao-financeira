/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestao.financeira.sessao;

/**
 *
 * @author luiza-maria-schwinn
 */
public class SessaoUsuario {

    private static int idUsuario;
    private static String tipoGestao = null;

    public static void setIdUsuario(int id) {
        idUsuario = id;
    }

    public static int getIdUsuario() {
        return idUsuario;
    }

    public static void setTipoGestao(String tipo) {
        tipoGestao = tipo;
    }

    public static String getTipoGestao() {
        return tipoGestao;
    }

    public static void limparSessao() {
        idUsuario = 0;
        tipoGestao = null;
        System.out.println("Sessão limpa.");
    }
}
