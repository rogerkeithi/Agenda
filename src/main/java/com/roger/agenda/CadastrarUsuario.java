package com.roger.agenda;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastrarUsuario {
    private static ArrayList<Pessoa> pessoa;
    private static ArrayList<Usuario> login;
    private static ArrayList<Pessoa> pessoa_contato;
    private static String ID_USUARIO_FK;
    private static String ID_PESSOA_FK;
    private static String ID_PESSOA_FK_CONTATO;

    public void setPessoa(ArrayList<Pessoa> newPessoa){
        this.pessoa = newPessoa;
    }
    
    public void setUsuario(ArrayList<Usuario> newLogin){
        this.login = newLogin;
    }
    
    public void setPessoaContato(ArrayList<Pessoa> newPessoaContato){
        this.pessoa_contato = newPessoaContato;
    }
    
    public boolean CadastrarPessoa(){
        Connection con;

        String query = "INSERT INTO tb_pessoa VALUES (default,default,?,?,?,?,?,null,?)";
        PreparedStatement ps;

        java.sql.Date dataSql = new java.sql.Date(this.pessoa.get(0).getData_nasc().getTime());

         try {
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);
            ps.setString(1, this.pessoa.get(0).getNome());
            ps.setDate(2, dataSql);
            ps.setString(3, this.pessoa.get(0).getEmail());
            ps.setLong(4, this.pessoa.get(0).getTelefone1());
            ps.setLong(5, this.pessoa.get(0).getTelefone2());
            ps.setInt(6, Integer.parseInt(ID_USUARIO_FK));
            ps.execute();

            con.commit();
            ps.close();

            System.out.println("Cadastro feito com sucesso! Realize o login para continuar");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }

    public void CadastrarEndereco(){
        Connection con;

        String query = "INSERT INTO tb_endereco VALUES (default,?,?,null,null,null,?,?,?,?)";
        PreparedStatement ps;

         try {
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);
            ps.setString(1, this.pessoa_contato.get(0).getLogradouro());
            ps.setInt(2, this.pessoa_contato.get(0).getNumero());
            ps.setString(3, this.pessoa_contato.get(0).getCidade());
            ps.setString(4, this.pessoa_contato.get(0).getSigla_estado());
            ps.setString(5, this.pessoa_contato.get(0).getPais());
            ps.setInt(6, Integer.parseInt(ID_PESSOA_FK));
            ps.execute();

            con.commit();
            ps.close();

            JOptionPane.showMessageDialog(null, "Contato Adicionado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public boolean CadastrarUsuario(){
        Connection con;
    
        String query = "INSERT INTO tb_usuario VALUES (default,default,?,?)";
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
            
            System.out.println("Cadastro de login feito com sucesso!");
            return true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário existente");
            return false;
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
                ID_USUARIO_FK = rs.getString("ID_USUARIO");
            }
            System.out.println(ID_USUARIO_FK);
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void selectID_PESSOA(){
        Connection con;
        
        String query = "SELECT ID_PESSOA FROM tb_pessoa WHERE ID_USUARIO = ?";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);
            ps.setString(1, ID_USUARIO_FK);
            rs = ps.executeQuery();
            con.commit();

            while (rs.next()) {
                ID_PESSOA_FK = rs.getString("ID_PESSOA");
            }
            System.out.println(ID_PESSOA_FK);
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public void selectID_PESSOA_CONTATO(){
        Connection con;
        
        String query = "SELECT ID_PESSOA FROM tb_pessoa ORDER BY ID_PESSOA DESC LIMIT 1";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            con.commit();

            while (rs.next()) {
                ID_PESSOA_FK = rs.getString("ID_PESSOA");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public boolean CadastrarPessoaContato() throws IOException{
        Connection con;

        String query = "INSERT INTO tb_pessoa VALUES (default,default,?,?,?,?,?,?,null)";
        PreparedStatement ps;

        java.sql.Date dataSql = new java.sql.Date(this.pessoa_contato.get(0).getData_nasc().getTime());
        
        
        
         try {
            FuncoesUtils fu = new FuncoesUtils();
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);
            ps.setString(1, this.pessoa_contato.get(0).getNome());
            ps.setDate(2, dataSql);
            ps.setString(3, this.pessoa_contato.get(0).getEmail());
            ps.setLong(4, this.pessoa_contato.get(0).getTelefone1());
            ps.setLong(5, this.pessoa_contato.get(0).getTelefone2());
            ps.setBytes(6, getBytesFromFile(this.pessoa_contato.get(0).getFoto()));
            ps.execute();

            con.commit();
            ps.close();

            System.out.println("Contato adicionado com sucesso");
            selectID_PESSOA_CONTATO();
            CadastrarEndereco();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }
    
    public static byte[] getBytesFromFile(File file) throws IOException {
            InputStream is = new FileInputStream(file);
            long length = file.length();
    
            byte[] bytes = new byte[(int) length];
    
            int offset = 0;
            int numRead = 0;
            while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
                offset += numRead;
            }
    
            if (offset < bytes.length) {
                throw new IOException("Não foi possível ler o arquivo: " + file.getName());
            }
    
            is.close();
            return bytes;
    }
}
