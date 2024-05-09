/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAO.Conexao;
import DAO.UsuarioDAO;
import model.Usuario;
import view.JanelaPrincipal;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.JanelaLogin;
/**
 *
 * @author Pedro Alexandre
 */
public class Controller {
    private JanelaPrincipal janelaPrincipal;
    private JanelaLogin janelaLogin;
    
    public Controller(JanelaPrincipal janelaPrincipal){
        this.janelaPrincipal = janelaPrincipal;
    }

    public Controller(JanelaLogin janelaLogin) {
        this.janelaLogin = janelaLogin;
    }
    
    public void loginUsuario(){
        Usuario usuario = new Usuario(janelaLogin.getTxtCpf().getText(), 
                                      janelaLogin.getTxtSenha().getText(), 
                                      null, null, null, null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultar(usuario);
            if (
                res.next()){JOptionPane.showMessageDialog(janelaLogin, "Login realizado com sucesso.");
                janelaLogin.setVisible(false);
                janelaPrincipal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(janelaLogin, "CPF e/ou senha inválidos.");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(janelaLogin, "Não foi possível estabelecer a conexão.");
        }
    }
    
}
