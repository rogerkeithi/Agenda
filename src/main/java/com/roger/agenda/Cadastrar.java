package com.roger.agenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cadastrar {
    private static ArrayList<Pessoa> pessoa;
    private static ArrayList<Login> login;
    private static String FKUsuario;

    public void setPessoa(ArrayList<Pessoa> newPessoa){
        this.pessoa = newPessoa;
    }
    
    public void setUsuario(ArrayList<Login> newLogin){
        this.login = newLogin;
    }
    
    public void CadastrarPessoa(){
        Connection con;
    
        String query = "INSERT INTO tb_pessoa VALUES (default,?,?,?,?,?,null,null)";
        PreparedStatement ps;
        
        java.sql.Date dataSql = new java.sql.Date(this.pessoa.get(0).getData_nasc().getTime());
        
         try {
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);
            ps.setString(1, this.pessoa.get(0).getNome());
            ps.setDate(2, dataSql);
            ps.setString(3, this.pessoa.get(0).getEmail());
            ps.setInt(4, this.pessoa.get(0).getTelefone1());
            ps.setInt(5, this.pessoa.get(0).getTelefone2());
            ps.execute();

            con.commit();
            ps.close();

            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso! Realize o login para continuar");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void CadastrarUsuario(){
        Connection con;
    
        String query = "INSERT INTO tb_usuario VALUES (default,?,?)";
        PreparedStatement ps;
        
        try {
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);
            ps.setString(1, this.login.get(0).getUsuario());
            ps.setString(2, this.login.get(0).getSenha());
            ps.execute();

            con.commit();
            ps.close();

            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso! Realize o login para continuar");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void selectID_USUARIO(){
        Connection con;
        
        String query = "SELECT ID_USUARIO FROM tb_usuario WHERE USUARIO = ?";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);
            ps.setString(1, this.login.get(0).getUsuario());
            rs = ps.executeQuery();
            con.commit();

            while (rs.next()) {
                FKUsuario = rs.getString("ID_USUARIO");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
