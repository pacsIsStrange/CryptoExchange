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
    private String cpf, senha, btc, eth, xrp, nome;

    public Usuario() {
    }

    public Usuario(String cpf, String senha, String btc, String eth, String xrp, String nome) {
        this.cpf = cpf;
        this.senha = senha;
        this.btc = btc;
        this.eth = eth;
        this.xrp = xrp;
        this.nome = nome;
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

    public String getBtc() {
        return btc;
    }

    public void setBtc(String btc) {
        this.btc = btc;
    }

    public String getEth() {
        return eth;
    }

    public void setEth(String eth) {
        this.eth = eth;
    }

    public String getXrp() {
        return xrp;
    }

    public void setXrp(String xrp) {
        this.xrp = xrp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
