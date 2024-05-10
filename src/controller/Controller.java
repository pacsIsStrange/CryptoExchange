/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAO.Conexao;
import DAO.UsuarioDAO;
import java.awt.Color;
import model.Usuario;
import view.JanelaPrincipal;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import model.Bitcoin;
import model.Ethereum;
import model.Ripple;
import view.JanelaLogin;
import java.util.Random;
/**
 *
 * @author Pedro Alexandre
 */
public class Controller {
    private JanelaPrincipal janelaPrincipal;
    private JanelaLogin janelaLogin;
    private double ctBtc, ctEth, ctXrp, auxCtBtc, auxCtEth, auxCtXrp;
    private Random random;
    public DecimalFormat df = new DecimalFormat("#.##");
//    public Controller(JanelaPrincipal janelaPrincipal){
//        this.janelaPrincipal = janelaPrincipal;
//    }

    public double getCtBtc() {
        return ctBtc;
    }

    public void setCtBtc(double ctBtc) {
        this.ctBtc = ctBtc;
    }

    public double getCtEth() {
        return ctEth;
    }

    public void setCtEth(double ctEth) {
        this.ctEth = ctEth;
    }

    public double getCtXrp() {
        return ctXrp;
    }

    public void setCtXrp(double ctXrp) {
        this.ctXrp = ctXrp;
    }

    public double getAuxCtBtc() {
        return auxCtBtc;
    }

    public void setAuxCtBtc(double auxCtBtc) {
        this.auxCtBtc = auxCtBtc;
    }

    public double getAuxCtEth() {
        return auxCtEth;
    }

    public void setAuxCtEth(double auxCtEth) {
        this.auxCtEth = auxCtEth;
    }

    public double getAuxCtXrp() {
        return auxCtXrp;
    }

    public void setAuxCtXrp(double auxCtXrp) {
        this.auxCtXrp = auxCtXrp;
    }
    
    
    
    public Controller(JanelaLogin janelaLogin) {
        this.janelaLogin = janelaLogin;
        this.random = new Random();
        
        this.ctBtc = random.nextDouble(1.0, 150.0);
        this.ctEth = random.nextDouble(1.0, 150.0);
        this.ctXrp = random.nextDouble(1.0, 150.0);
    }
    
    public void loginUsuario(){
        Usuario usuario = new Usuario(janelaLogin.getTxtCpf().getText(), 
                                      janelaLogin.getTxtSenha().getText(), 
                                      null, null, null, null, 0);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultar(usuario);
            if (
                res.next()){JOptionPane.showMessageDialog(janelaLogin, "Login realizado com sucesso.");
                janelaLogin.setVisible(false);
                usuario.setNome(res.getString("nome"));
                usuario.setBtc(new Bitcoin()); usuario.setEth(new Ethereum());
                usuario.setXrp(new Ripple());
                usuario.getBtc().setQtd(res.getDouble("btc"));
                usuario.getEth().setQtd(res.getDouble("eth"));
                usuario.getXrp().setQtd(res.getDouble("xrp"));
                usuario.setReais(res.getDouble("reais"));
                System.out.println(usuario);
                this.janelaPrincipal = new JanelaPrincipal(this, usuario);
                janelaPrincipal.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(janelaLogin, "CPF e/ou senha inválidos.");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(janelaLogin, "Não foi possível estabelecer a conexão.");
        }
    }
    
    public void atualizaCt(Usuario usuario){
        this.auxCtBtc = random.nextDouble(0.8, 1.2);
        this.auxCtEth = random.nextDouble(0.8, 1.2);
        this.auxCtXrp = random.nextDouble(0.8, 1.2);
        this.ctBtc = this.ctBtc * auxCtBtc;
        this.ctEth = this.ctEth * auxCtEth;
        this.ctXrp = this.ctXrp * auxCtXrp;
        Double auxTotal = usuario.getBtc().getQtd() * ctBtc + 
                        usuario.getEth().getQtd() * ctEth +
                        usuario.getXrp().getQtd() * ctXrp;
        String btcFormatado = df.format(ctBtc);
        String ethFormatado = df.format(ctEth);
        String xrpFormatado = df.format(ctXrp);
        String totalFormatado = df.format(auxTotal);
        if (auxCtBtc >= 1){
            janelaPrincipal.getIndexBtc().setForeground(Color.green);} 
        else {
            janelaPrincipal.getIndexBtc().setForeground(Color.red);}
        if (auxCtEth>= 1){
            janelaPrincipal.getIndexEth().setForeground(Color.green);} 
        else {
            janelaPrincipal.getIndexEth().setForeground(Color.red);}
        if (auxCtXrp >= 1){
            janelaPrincipal.getIndexXrp().setForeground(Color.green);} 
        else {
            janelaPrincipal.getIndexXrp().setForeground(Color.red);}
            janelaPrincipal.getLabelValorBtc().setText("" + btcFormatado);
            janelaPrincipal.getLabelValorEth().setText("" + ethFormatado);
            janelaPrincipal.getLabelValorXrp().setText("" + xrpFormatado);
            janelaPrincipal.getLabelSaldoTotal2().setText("Saldo total: R$" + 
                                                                totalFormatado);
    }
    
    public void trocaMoedaTrade(int opcMoeda, Usuario usuario){
        if (opcMoeda == 0){
            Double qtdBtc = usuario.getBtc().getQtd();
            janelaPrincipal.getLabelSaldoEspecífico().setText("Saldo atual: " +
                               qtdBtc + " (R$" + df.format(qtdBtc * ctBtc)+")");
        }
        if (opcMoeda == 1){
            Double qtdEth = usuario.getEth().getQtd();
            janelaPrincipal.getLabelSaldoEspecífico().setText("Saldo atual: " +
                               qtdEth + " (R$" + df.format(qtdEth * ctEth)+")");
        }
        if (opcMoeda == 2){
            Double qtdXrp = usuario.getXrp().getQtd();
            janelaPrincipal.getLabelSaldoEspecífico().setText("Saldo atual: " +
                               qtdXrp + " (R$" + df.format(qtdXrp * ctXrp)+")");
        }
    }
    
}
