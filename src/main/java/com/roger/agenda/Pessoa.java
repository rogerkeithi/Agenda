package com.roger.agenda;

import java.util.Date;
import javax.swing.ImageIcon;

public class Pessoa {
    public static int id_pessoa;
    public static String nome;
    public static Date data_nasc; 
    public static String email;
    public static int telefone1;
    public static int telefone2;
    public static ImageIcon foto;
    
    public static String logradouro; 
    public static int numero;
    public static String bairro;
    public static String complemento;
    public static int cep;
    public static String cidade;     
    public static String sigla_estado;
    public static String pais;
    /*
    public Pessoa(String nome, Date data_nasc, String email, int telefone1, int telefone2, ImageIcon foto,
                  String logradouro, int numero, String bairro, String complemento, int cep, String cidade, String sigla_estado, String pais
                 ){
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.email = email;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.foto = foto;
        
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.sigla_estado = sigla_estado;
        this.pais = pais;
    }
    */
    
    public int getId_pessoa(){
        return this.id_pessoa;
    }
    public void setId_pessoa(int id_pessoa){
        this.id_pessoa = id_pessoa;
    }
    
    //MÉTODOS GET DO OBJ. PESSOA
    public String getNome(){
        return this.nome;
    }
    public Date getData_nasc(){
        return this.data_nasc;
    }
    public String getEmail(){
        return this.email;
    }
    public int getTelefone1(){
        return this.telefone1;
    }
    public int getTelefone2(){
        return this.telefone2;
    }
    public ImageIcon getFoto(){
        return this.foto;
    }
    
    //MÉTODOS GET DO OBJ. ENDEREÇO
    public String getLogradouro(){
        return this.logradouro;
    }
    public int getNumero(){
        return this.numero;
    }
    public String getBairro(){
        return this.bairro;
    }
    public String getComplemento(){
        return this.complemento;
    }
    public int getCep(){
        return this.cep;
    }
    public String getCidade(){
        return this.cidade;
    }
    public String getSigla_estado(){
        return this.sigla_estado;
    }
    public String getPais(){
        return this.pais;
    }
    
    //MÉTODOS SET DO OBJ. PESSOA
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setData_nasc(Date data_nasc){
        this.data_nasc = data_nasc;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setTelefone1(int telefone1){
        this.telefone1 = telefone1;
    }
    public void setTelefone2(int telefone2){
        this.telefone2 = telefone2;
    }
    public void setFoto(ImageIcon foto){
        this.foto = foto;
    }
    
    //MÉTODOS SET DO OBJ. ENDEREÇO
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setSigla_estado(String sigla_estado){
        this.sigla_estado = sigla_estado;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
}
