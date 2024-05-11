/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author Pedro Alexandre
 */
public class ExtratoDAO {
    private Connection conn;
    
    public ExtratoDAO(Connection conn){
        this.conn = conn;
    }
    
    public ResultSet consultar(String cpfUsuario) throws SQLException {
        String sql = "select * from op where cpfUsuario = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cpfUsuario);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        // usuario.setCpf(sql);
        System.out.println("resultado = " + resultado);
        return resultado;
    }
}
