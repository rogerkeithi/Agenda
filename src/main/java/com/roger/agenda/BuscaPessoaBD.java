
package com.roger.agenda;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class BuscaPessoaBD {
    ArrayList<Pessoa> pessoaInfos = new ArrayList<Pessoa>(1);
    ArrayList<Pessoa> pessoaContato = new ArrayList<Pessoa>(1);
    
    public void setPessoa(int ID_USUARIO){
        Connection con;
        
        String query = "SELECT * FROM tb_pessoa WHERE ID_USUARIO = ?";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);
            ps.setInt(1, ID_USUARIO);
            rs = ps.executeQuery();
            
            con.commit();
            
            Pessoa pessoa = new Pessoa();
            pessoaInfos.add(pessoa);
            
            while (rs.next()) {
                pessoaInfos.get(0).setId_pessoa(rs.getInt("ID_PESSOA"));
                pessoaInfos.get(0).setNome(rs.getString("NOME"));
                pessoaInfos.get(0).setData_nasc(rs.getDate("DATA_NASC"));
                pessoaInfos.get(0).setTelefone1(rs.getLong("TELEFONE1"));
                pessoaInfos.get(0).setTelefone2(rs.getLong("TELEFONE2"));
                pessoaInfos.get(0).setEmail(rs.getString("EMAIL"));
            }
            ps.close();
            con.close();
            setEnderecoPessoa();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public ArrayList<Pessoa> buscaContato(int id_contato) throws IOException{
        Connection con;
        
        String query = "SELECT * FROM tb_pessoa WHERE ID_PESSOA = ?";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);
            ps.setInt(1, id_contato);
            rs = ps.executeQuery();
            
            con.commit();
            
            Pessoa pessoa = new Pessoa();
            pessoaContato.add(pessoa);
            
            while (rs.next()) {
                pessoaContato.get(0).setId_pessoa(rs.getInt("ID_PESSOA"));
                pessoaContato.get(0).setNome(rs.getString("NOME"));
                pessoaContato.get(0).setData_nasc(rs.getDate("DATA_NASC"));
                pessoaContato.get(0).setTelefone1(rs.getLong("TELEFONE1"));
                pessoaContato.get(0).setTelefone2(rs.getLong("TELEFONE2"));
                pessoaContato.get(0).setEmail(rs.getString("EMAIL"));
                
                pessoaContato.get(0).setFoto_banco(rs.getBytes("FOTO"));
            }
            ps.close();
            con.close();
            setEnderecoContato();
            return pessoaContato;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return pessoaContato;
        }
    }
    
    public void setEnderecoPessoa(){
        Connection con;
        
        String query = "SELECT * FROM tb_endereco WHERE ID_PESSOA = ?";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);
            ps.setInt(1, pessoaInfos.get(0).getId_pessoa());
            rs = ps.executeQuery();
            
            con.commit();
            
            while (rs.next()) {
                pessoaInfos.get(0).setLogradouro(rs.getString("LOGRADOURO"));
                pessoaInfos.get(0).setNumero(rs.getInt("NUMERO"));
                pessoaInfos.get(0).setCidade(rs.getString("CIDADE"));
                pessoaInfos.get(0).setSigla_estado(rs.getString("SIGLA_ESTADO"));       
                pessoaInfos.get(0).setPais(rs.getString("PAIS"));
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
        public void setEnderecoContato(){
        Connection con;
        
        String query = "SELECT * FROM tb_endereco WHERE ID_PESSOA = ?";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);
            ps.setInt(1, pessoaContato.get(0).getId_pessoa());
            rs = ps.executeQuery();
            
            con.commit();
            
            while (rs.next()) {
                pessoaContato.get(0).setLogradouro(rs.getString("LOGRADOURO"));
                pessoaContato.get(0).setNumero(rs.getInt("NUMERO"));
                pessoaContato.get(0).setCidade(rs.getString("CIDADE"));
                pessoaContato.get(0).setSigla_estado(rs.getString("SIGLA_ESTADO"));       
                pessoaContato.get(0).setPais(rs.getString("PAIS"));
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
    public ArrayList<Pessoa> getPessoa(){
        return this.pessoaInfos;
    } 
}
