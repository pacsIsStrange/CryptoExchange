/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAO.Conexao;
import DAO.ExtratoDAO;
import DAO.UsuarioDAO;
import java.awt.Color;
import static java.lang.Double.parseDouble;
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import model.Moeda;
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
        Usuario u = new Usuario(janelaLogin.getTxtCpf().getText(), 
                                      janelaLogin.getTxtSenha().getText(), 
                                      null, null, null, null, 0);
        Conexao conexao = new Conexao();
        if (u.getSenha().length() != 6 || !u.getSenha().matches("\\d{6}")) {
            JOptionPane.showMessageDialog(janelaLogin, 
                                       "A senha deve ter 6 dígitos numéricos.");
            return;
        }
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultar(u);
            if (
                res.next()){JOptionPane.showMessageDialog(janelaLogin, 
                                                "Login realizado com sucesso.");
                janelaLogin.setVisible(false);
                u.setNome(res.getString("nome"));
                u.setBtc(new Bitcoin()); u.setEth(new Ethereum());
                u.setXrp(new Ripple());
                u.getBtc().setQtd(res.getDouble("btc"));
                u.getEth().setQtd(res.getDouble("eth"));
                u.getXrp().setQtd(res.getDouble("xrp"));
                u.setReais(res.getDouble("reais"));
                System.out.println(u);
                this.janelaPrincipal = new JanelaPrincipal(this, u);
                janelaPrincipal.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(janelaLogin, 
                                                   "CPF e/ou senha inválidos.");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(janelaLogin, 
                                     "Não foi possível estabelecer a conexão.");
        }
    }
    
    public void atualizaCt(JanelaPrincipal j){
        Usuario usuario = j.getUsuario();
        this.auxCtBtc = random.nextDouble(0.8, 1.2);
        this.auxCtEth = random.nextDouble(0.8, 1.2);
        this.auxCtXrp = random.nextDouble(0.8, 1.2);
        this.ctBtc = this.ctBtc * auxCtBtc;
        this.ctEth = this.ctEth * auxCtEth;
        this.ctXrp = this.ctXrp * auxCtXrp;
        String btcFormatado = df.format(ctBtc);
        String ethFormatado = df.format(ctEth);
        String xrpFormatado = df.format(ctXrp);
        j.getLabelValorBtc().setText(btcFormatado);
        j.getLabelValorEth().setText(ethFormatado);
        j.getLabelValorXrp().setText(xrpFormatado);
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
        
        atualizaDisplayCarteira(j);
    }
    
    public void trocaMoedaTrade(JanelaPrincipal j){
        int opcMoeda = j.getOpcMoedaTroca().getSelectedIndex();
        Usuario usuario = j.getUsuario();
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
 
    public void preencherExtrato(JanelaPrincipal j){
        JTable tabela = j.getTabelaExtrato();
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ExtratoDAO dao = new ExtratoDAO(conn);
            ResultSet res = dao.consultar(j.getUsuario().getCpf());
            DefaultTableModel modelo = new DefaultTableModel();
                
            ResultSetMetaData metaData = res.getMetaData();
            int numColunas = metaData.getColumnCount();
            for (int i = 2; i <= numColunas; i++){
                modelo.addColumn(metaData.getColumnName(i));
            }

            while (res.next()){
                Object[] rowData = new Object[numColunas];
                for (int i = 2; i <= numColunas; i++){
                    rowData[i - 2] = res.getObject(i);
                }
                modelo.addRow(rowData);
            }
            
            tabela.setModel(modelo);
            
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            tabela.setDefaultRenderer(Object.class, centerRenderer);
            
        }catch(SQLException e){
            System.out.println("nao foi possivel obter o extrato");
        }
    }
      
    public void escreveExtrato(String sinal, String moeda, double valor, 
                        double valorTaxa ,Usuario usuario) throws SQLException{
        Conexao conexao = new Conexao();
        DecimalFormat f = new DecimalFormat("00"); // se minuto for 1 -> 01 ; 2 -> 02 ; 11 -> 11
        String sql = "INSERT INTO op (cpf, \"Data\", \"Hora\", \"+/-\", \"Valor (R$)\","
                   + " \"Moeda\", \"Cotação\", \"Taxa\", \"Saldo (R$)\", \"Saldo (BTC)\","
                   + " \"Saldo (ETH)\", \"Saldo (XRP)\") VALUES (?, ?, ?, ?, ?, ?,"
                   + " ?, ?, ?, ?, ?, ?)";
        double ct;
        ct = switch (moeda) {
            case "BTC" -> ctBtc;
            case "ETH" -> ctEth;
            case "XRP" -> ctXrp;
            default -> 0;
        };
        System.out.println("moeda = " + moeda + " ct = " + ct);
        
        
        Connection conn = conexao.getConnection();
//        System.out.println("iii");
        PreparedStatement statement = conn.prepareStatement(sql);
        
        LocalDateTime tempo = LocalDateTime.now();
//        System.out.println("hhh");
        
        int ano = tempo.getYear();
        int mes = tempo.getMonthValue();
        int dia = tempo.getDayOfMonth();
        int hora = tempo.getHour();
        int minuto = tempo.getMinute();
        
        String data = ("" + f.format(dia) + "-" + f.format(mes) + "-" + ano);
        String horario = ("" + f.format(hora) + ":" + f.format(minuto));
        
        statement.setString(1, usuario.getCpf()); statement.setString(2, data);
        statement.setString(3, horario); statement.setString(4, sinal);
        statement.setDouble(5, valor); statement.setString(6, moeda);
        statement.setDouble(7, ct); statement.setDouble(8, valorTaxa);
        statement.setDouble(9, usuario.getReais());
        statement.setDouble(10, usuario.getBtc().getQtd()); 
        statement.setDouble(11, usuario.getEth().getQtd());
        statement.setDouble(12, usuario.getXrp().getQtd()); 

        statement.execute();
    }
   
    public void depositar(JanelaPrincipal j){
        Usuario u = j.getUsuario();
        double valorDeposito = parseDouble(j.getTxtValorDepSac().getText());
        u.setReais(u.getReais() + valorDeposito);
        try {
            escreveExtrato("+", "R$", valorDeposito, 0, u);
        } catch (SQLException e){
            System.out.println("erro ao atualizar Extrato: " + e.getMessage());
        }
        
        try {atualizaUsuario(u);} catch (SQLException e){
            System.out.println("Erro ao atualizar usuário: " + e.getMessage());
        }

        atualizaDisplayCarteira(j);
    }
    
    public void sacar(JanelaPrincipal j){
        Usuario u = j.getUsuario();
        double valorSaque = parseDouble(j.getTxtValorDepSac().getText());
        if (valorSaque <= u.getReais()){
            try {
                u.setReais(u.getReais() - valorSaque);
                escreveExtrato("-", "R$", valorSaque, 0, u);
            } catch (SQLException e){
                System.out.println("erro ao atualizar extrato: " + e.getMessage());
            }

            try {atualizaUsuario(u);} catch (SQLException e){
                System.out.println("Erro ao atualizar usuário: " + e.getMessage());
            }

            atualizaDisplayCarteira(j);} 
        else{exibeSaldoInsuficiente(j);}
    }
    public void comprar(JanelaPrincipal j) {
        Usuario u = j.getUsuario();
        double valorCompra = parseDouble(j.getTxtValorTroca().getText());
        if (valorCompra <= u.getReais()){
            Moeda m = null;
            String moeda;
            double auxCt, auxQtd, taxa, valorAdd, 
                   valorTaxa, valorConvertido; 
            int opcMoeda = j.getOpcMoedaTroca().getSelectedIndex();
            switch (opcMoeda) {
                case 0 -> {
                    m = u.getBtc(); auxQtd = m.getQtd(); auxCt = ctBtc;
                    moeda = "BTC"; taxa = m.getTaxaCompra();
                }
                case 1 -> {
                    m = u.getEth(); auxQtd = m.getQtd(); auxCt = ctEth;
                    moeda = "ETH"; taxa = m.getTaxaCompra();
                }
                case 2 -> {
                    m = u.getXrp(); auxQtd = u.getXrp().getQtd(); auxCt = ctXrp;
                    moeda = "XRP"; taxa = m.getTaxaCompra();
                } default -> {auxCt = 1; taxa = 0; moeda = "";}
            }
            valorConvertido = valorCompra / auxCt; // valor da compra convertido para a moeda desejada
            valorTaxa = valorCompra * taxa; // valor de taxa que será deduzido da compra
            valorAdd = valorConvertido - valorTaxa; // valor que será adicionado ao saldo do usuário (da moeda desejada)
            m.setQtd(m.getQtd() + valorAdd); 
            u.setReais(u.getReais() - valorCompra);
            try {
                escreveExtrato("+", moeda, valorCompra, valorTaxa, u);
                escreveExtrato("-", "R$", valorCompra, 0, u);
                atualizaUsuario(u);
            } catch(SQLException e){
                System.out.println("Erro ao atualizar extrato: " + e.getMessage());
            }
            atualizaDisplayCarteira(j);
        } else {exibeSaldoInsuficiente(j);}
        
    }
    
    public void vender(JanelaPrincipal j){
        Usuario u = j.getUsuario();
        double valorVenda = parseDouble(j.getTxtValorTroca().getText());
        Moeda m = null;
        String moeda;
        double auxCt, auxQtd, taxa, valorAdd, valorTaxa, valorConvertido;
        int opcMoeda = j.getOpcMoedaTroca().getSelectedIndex();
        switch(opcMoeda){
            case 0 -> {
                m = u.getBtc(); auxQtd = m.getQtd(); auxCt = ctBtc; 
                    moeda = "BTC"; taxa = m.getTaxaVenda();
            } case 1 -> {
                m = u.getEth(); auxQtd = m.getQtd(); auxCt = ctEth; 
                    moeda = "ETH"; taxa = m.getTaxaVenda();
            } case 2 -> {
                m = u.getXrp(); auxQtd = m.getQtd(); auxCt = ctXrp; 
                    moeda = "XRP"; taxa = m.getTaxaVenda();
            } default -> {auxQtd = 0; auxCt = 1; taxa = 0; moeda = "";}
        }
        valorConvertido = valorVenda / auxCt;
        valorTaxa = valorVenda * taxa;
        valorAdd = valorVenda + valorTaxa;
        if (auxQtd * auxCt >= valorVenda + valorTaxa){
        m.setQtd(m.getQtd() - valorConvertido);
        u.setReais(u.getReais() + valorVenda - valorTaxa);
        try{
            escreveExtrato("+", "R$", valorVenda, valorTaxa, u);
            escreveExtrato("-", moeda, valorVenda, valorTaxa, u);
            atualizaUsuario(u);
        } catch(SQLException e){
            System.out.println("Erro ao atualizar extrato: " + e.getMessage());
        } atualizaDisplayCarteira(j);
        } else {exibeSaldoInsuficiente(j);}
    }
    
    public void atualizaUsuario(Usuario u) throws SQLException {
        Conexao conexao = new Conexao();
        String sql = "UPDATE usuario SET btc=?, eth=?, xrp=?, "
                                                    + "reais=? WHERE cpf=?";
        Connection conn = conexao.getConnection();
        PreparedStatement statement = conn.prepareStatement(sql);
        
        statement.setDouble(1, u.getBtc().getQtd());
        statement.setDouble(2, u.getEth().getQtd());
        statement.setDouble(3, u.getXrp().getQtd());
        statement.setDouble(4, u.getReais());
        statement.setString(5, u.getCpf());
        
        int numLinhas = statement.executeUpdate();
        System.out.println("numero de linhas atualizadas: " + numLinhas);
    }
    
    public void atualizaDisplayCarteira(JanelaPrincipal j){
        Usuario u = j.getUsuario();
        j.getLabelSaldoReais().setText("R$: " + u.getReais());
        j.getLabelSaldoBtc().setText("BTC: " + u.getBtc().getQtd());
        j.getLabelSaldoEth().setText("ETH: " + u.getEth().getQtd());
        j.getLabelSaldoXrp().setText("XRP: " + u.getXrp().getQtd());
        Double auxTotal = u.getReais() + 
                          u.getBtc().getQtd() * ctBtc + 
                          u.getEth().getQtd() * ctEth +
                          u.getXrp().getQtd() * ctXrp;
        String totalFormatado = df.format(auxTotal);
        janelaPrincipal.getLabelSaldoTotal2().setText("Saldo total: R$" + 
                                                                totalFormatado);
    }
    
    public void exibeSaldoInsuficiente(JanelaPrincipal j){
        JOptionPane.showMessageDialog(j, "Saldo insuficiente.");
    }
    
    public boolean pedeSenha(JanelaPrincipal j){
        Usuario u = j.getUsuario();
        String senha = JOptionPane.showInputDialog(j, "Digite sua senha:", 
                                                    JOptionPane.PLAIN_MESSAGE);
        if (senha.equals(u.getSenha())){return true;} else {
            JOptionPane.showMessageDialog(j, "Senha incorreta.");
            return false;
        }
    }
}
