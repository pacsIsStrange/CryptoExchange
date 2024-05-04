/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pedro Alexandre
 */
public class Usuario {
    private String cpf, senha, nome;
    private Bitcoin btc;
    private Ethereum eth;
    private Ripple xrp;

    public Usuario() {
    }

    public Usuario(String cpf, String senha, String nome, Bitcoin btc, Ethereum eth, Ripple xrp) {
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.btc = btc;
        this.eth = eth;
        this.xrp = xrp;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bitcoin getBtc() {
        return btc;
    }

    public void setBtc(Bitcoin btc) {
        this.btc = btc;
    }

    public Ethereum getEth() {
        return eth;
    }

    public void setEth(Ethereum eth) {
        this.eth = eth;
    }

    public Ripple getXrp() {
        return xrp;
    }

    public void setXrp(Ripple xrp) {
        this.xrp = xrp;
    }

}
