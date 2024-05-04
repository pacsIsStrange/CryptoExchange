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
/**
 *
 * @author Pedro Alexandre
 */
public class Controller {
    private JanelaPrincipal view;
    
    public Controller(JanelaPrincipal view){
        this.view = view;
    }
    
    public void loginUsuario(){
        Usuario usuario = new Usuario(view.getTxtCpf().getText(), 
                                      view.getTxtSenha().getText(), 
                                      null, null, null, null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultar(usuario);
            if (
                res.next()){JOptionPane.showMessageDialog(view, "Login realizado com sucesso.");
                view.painelLogin.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(view, "CPF e/ou senha inválidos.");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Não foi possível estabelecer a conexão.");
        }
    }
}
