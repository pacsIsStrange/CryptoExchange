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
        String sql = "select * from op where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cpfUsuario);
        System.out.println("statement = " + statement);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        System.out.println("reultado = " + resultado);
        return resultado;
    }
}