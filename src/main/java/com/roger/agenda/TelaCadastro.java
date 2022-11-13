/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.roger.agenda;

import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaCadastro extends javax.swing.JFrame {
    ArrayList<Login> loginCad = new ArrayList<Login>(1);
    ArrayList<Pessoa> pessoaCad = new ArrayList<Pessoa>(1);

    public TelaCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panelBackground = new javax.swing.JPanel();
        tabbedPaneMenu = new javax.swing.JTabbedPane();
        panelCadLogin = new javax.swing.JPanel();
        btnProxCadLogin = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelSenhaConfirm = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JTextField();
        fieldSenha = new javax.swing.JPasswordField();
        fieldSenhaConfirm = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelCadDados = new javax.swing.JPanel();
        btnProxCadDados = new javax.swing.JButton();
        btnAntCadDados = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        labelDataNasc = new javax.swing.JLabel();
        labelTelefone1 = new javax.swing.JLabel();
        fieldTelefone1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelTelefone2 = new javax.swing.JLabel();
        fieldTelefone2 = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        titulo2 = new javax.swing.JLabel();
        panelCadEndereco = new javax.swing.JPanel();
        btnProxCadEndereco = new javax.swing.JButton();
        btnAntCadEndereco = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelNumero = new javax.swing.JLabel();
        labelLogradouro = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        labelPais = new javax.swing.JLabel();
        fieldLogradouro = new javax.swing.JTextField();
        fieldNumero = new javax.swing.JTextField();
        fieldCidade = new javax.swing.JTextField();
        fieldEstado = new javax.swing.JTextField();
        fieldPais = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelConfirmacao = new javax.swing.JPanel();
        btnConfirmacao = new javax.swing.JButton();
        btnAntConfirmacao = new javax.swing.JButton();

        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("*");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel13.setText("Logradouro");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");

        tabbedPaneMenu.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbedPaneMenu.setEnabled(false);
        tabbedPaneMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        btnProxCadLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnProxCadLogin.setText("Próximo passo");
        btnProxCadLogin.setEnabled(false);
        btnProxCadLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProxCadLoginActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        titulo.setText("Informações de Login");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelUsuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelUsuario.setText("Usuário");

        labelSenha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelSenha.setText(" Senha");

        labelSenhaConfirm.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelSenhaConfirm.setText(" Confirme sua senha");

        fieldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldUsuarioKeyReleased(evt);
            }
        });

        fieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldSenhaKeyReleased(evt);
            }
        });

        fieldSenhaConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldSenhaConfirmKeyReleased(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("*");

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("*");

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelSenhaConfirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldSenhaConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addComponent(fieldUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenhaConfirm)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldSenhaConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCadLoginLayout = new javax.swing.GroupLayout(panelCadLogin);
        panelCadLogin.setLayout(panelCadLoginLayout);
        panelCadLoginLayout.setHorizontalGroup(
            panelCadLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProxCadLogin)
                .addGap(25, 25, 25))
            .addGroup(panelCadLoginLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(titulo)
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCadLoginLayout.setVerticalGroup(
            panelCadLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadLoginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnProxCadLogin)
                .addGap(25, 25, 25))
        );

        tabbedPaneMenu.addTab("Passo 1", panelCadLogin);

        btnProxCadDados.setText("Próximo passo");
        btnProxCadDados.setEnabled(false);
        btnProxCadDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProxCadDadosActionPerformed(evt);
            }
        });

        btnAntCadDados.setText("Voltar");
        btnAntCadDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntCadDadosActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(324, 288));

        labelNome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelNome.setText("Nome");

        fieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldNomeKeyReleased(evt);
            }
        });

        labelDataNasc.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelDataNasc.setText("Data de Nascimento");

        labelTelefone1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelTelefone1.setText("Telefone 1");

        fieldTelefone1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldTelefone1KeyReleased(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("*");

        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("*");

        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("*");

        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("*");

        labelTelefone2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelTelefone2.setText("Telefone 2");

        labelEmail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEmail.setText("Email");

        fieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldEmailKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fieldEmail)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(labelTelefone1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(fieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(labelTelefone2)
                                            .addGap(44, 44, 44))
                                        .addComponent(fieldTelefone2)))))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelDataNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataNasc)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelTelefone1)
                    .addComponent(labelTelefone2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        titulo2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        titulo2.setText("Informações Pessoais");

        javax.swing.GroupLayout panelCadDadosLayout = new javax.swing.GroupLayout(panelCadDados);
        panelCadDados.setLayout(panelCadDadosLayout);
        panelCadDadosLayout.setHorizontalGroup(
            panelCadDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadDadosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAntCadDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProxCadDados)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadDadosLayout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
            .addGroup(panelCadDadosLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(titulo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCadDadosLayout.setVerticalGroup(
            panelCadDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadDadosLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(titulo2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCadDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProxCadDados)
                    .addComponent(btnAntCadDados))
                .addGap(25, 25, 25))
        );

        tabbedPaneMenu.addTab("Passo 2", panelCadDados);

        btnProxCadEndereco.setText("Próximo passo");
        btnProxCadEndereco.setEnabled(false);
        btnProxCadEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProxCadEnderecoActionPerformed(evt);
            }
        });

        btnAntCadEndereco.setText("Voltar");
        btnAntCadEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntCadEnderecoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(324, 288));

        labelNumero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelNumero.setText("Número");

        labelLogradouro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelLogradouro.setText("Logradouro");

        labelEstado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEstado.setText("Estado");

        labelCidade.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelCidade.setText("Cidade");

        labelPais.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelPais.setText("País");

        fieldLogradouro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldLogradouroKeyReleased(evt);
            }
        });

        fieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldNumeroKeyReleased(evt);
            }
        });

        fieldCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldCidadeKeyReleased(evt);
            }
        });

        fieldEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldEstadoKeyReleased(evt);
            }
        });

        fieldPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldPaisKeyReleased(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("*");

        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("*");

        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("*");

        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setText("*");

        jLabel15.setForeground(new java.awt.Color(255, 102, 102));
        jLabel15.setText("*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(labelEstado)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(labelPais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(fieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(labelLogradouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(labelNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fieldCidade))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogradouro)
                    .addComponent(labelNumero)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidade)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelPais)
                        .addComponent(jLabel15))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelEstado)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("Informações de endereço");

        javax.swing.GroupLayout panelCadEnderecoLayout = new javax.swing.GroupLayout(panelCadEndereco);
        panelCadEndereco.setLayout(panelCadEnderecoLayout);
        panelCadEnderecoLayout.setHorizontalGroup(
            panelCadEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadEnderecoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAntCadEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 468, Short.MAX_VALUE)
                .addComponent(btnProxCadEndereco)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadEnderecoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCadEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadEnderecoLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(194, 194, 194))))
        );
        panelCadEnderecoLayout.setVerticalGroup(
            panelCadEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadEnderecoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panelCadEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProxCadEndereco)
                    .addComponent(btnAntCadEndereco))
                .addGap(25, 25, 25))
        );

        tabbedPaneMenu.addTab("Passo 3", panelCadEndereco);

        btnConfirmacao.setText("Confirmar meus dados");
        btnConfirmacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmacaoActionPerformed(evt);
            }
        });

        btnAntConfirmacao.setText("Voltar");
        btnAntConfirmacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntConfirmacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConfirmacaoLayout = new javax.swing.GroupLayout(panelConfirmacao);
        panelConfirmacao.setLayout(panelConfirmacaoLayout);
        panelConfirmacaoLayout.setHorizontalGroup(
            panelConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfirmacaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAntConfirmacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 430, Short.MAX_VALUE)
                .addComponent(btnConfirmacao)
                .addGap(25, 25, 25))
        );
        panelConfirmacaoLayout.setVerticalGroup(
            panelConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfirmacaoLayout.createSequentialGroup()
                .addContainerGap(385, Short.MAX_VALUE)
                .addGroup(panelConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmacao)
                    .addComponent(btnAntConfirmacao))
                .addGap(25, 25, 25))
        );

        tabbedPaneMenu.addTab("Confirmação", panelConfirmacao);

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneMenu)
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneMenu)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnProxCadLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProxCadLoginActionPerformed
        usuario = fieldUsuario.getText();
        
        Login login = new Login(this.usuario,this.senhahex);
        
        loginCad.add(login);
        
        tabbedPaneMenu.setSelectedIndex(1);
        
    }//GEN-LAST:event_btnProxCadLoginActionPerformed

    private void btnProxCadDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProxCadDadosActionPerformed
        nome = fieldNome.getText();
        data_nasc = jDateChooser1.getDate();
        telefone1 = Integer.parseInt(fieldTelefone1.getText());
        telefone2 = Integer.parseInt(fieldTelefone2.getText());
        email = fieldEmail.getText();
        
        Pessoa pessoa = new Pessoa();
        
        pessoaCad.add(pessoa);
        pessoaCad.get(0).setNome(nome);
        pessoaCad.get(0).setData_nasc(data_nasc);
        pessoaCad.get(0).setTelefone1(telefone1);
        pessoaCad.get(0).setTelefone2(telefone2);
        pessoaCad.get(0).setEmail(email);
        
        tabbedPaneMenu.setSelectedIndex(2);
    }//GEN-LAST:event_btnProxCadDadosActionPerformed

    private void btnProxCadEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProxCadEnderecoActionPerformed
        pessoaCad.get(0).setLogradouro(logradouro);
        pessoaCad.get(0).setNumero(numero);
        pessoaCad.get(0).setCidade(cidade);
        pessoaCad.get(0).setSigla_estado(sigla_estado);       
        pessoaCad.get(0).setPais(pais);
                
        tabbedPaneMenu.setSelectedIndex(3);
    }//GEN-LAST:event_btnProxCadEnderecoActionPerformed

    private void btnConfirmacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmacaoActionPerformed

    private void btnAntCadDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntCadDadosActionPerformed
        loginCad.removeAll(loginCad);
        tabbedPaneMenu.setSelectedIndex(0);
    }//GEN-LAST:event_btnAntCadDadosActionPerformed

    private void btnAntCadEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntCadEnderecoActionPerformed
        pessoaCad.removeAll(pessoaCad);
        tabbedPaneMenu.setSelectedIndex(1);
    }//GEN-LAST:event_btnAntCadEnderecoActionPerformed

    private void btnAntConfirmacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntConfirmacaoActionPerformed
        pessoaCad.get(0).setLogradouro(null);
        pessoaCad.get(0).setNumero(0);
        pessoaCad.get(0).setCidade(null);
        pessoaCad.get(0).setSigla_estado(null);       
        pessoaCad.get(0).setPais(null);
        
        tabbedPaneMenu.setSelectedIndex(2);
    }//GEN-LAST:event_btnAntConfirmacaoActionPerformed
    
    private void checkCamposEndereco(){
        if(!fieldLogradouro.getText().isEmpty()){
            if(!fieldNumero.getText().isEmpty()){
                if(!fieldCidade.getText().isEmpty()){
                    if(!fieldEstado.getText().isEmpty()){
                        if(!fieldPais.getText().isEmpty()){
                            this.btnProxCadEndereco.setEnabled(true);
                        }else{
                            this.btnProxCadEndereco.setEnabled(false);
                        } 
                    }else{
                        this.btnProxCadEndereco.setEnabled(false);
                    } 
                }else{
                    this.btnProxCadEndereco.setEnabled(false);
                }    
            }else{
                this.btnProxCadEndereco.setEnabled(false);
            }    
        }else{
            this.btnProxCadEndereco.setEnabled(false);
        }
    }
    
    private void checkCamposDados(){
        if(!fieldNome.getText().isEmpty()){
            if(jDateChooser1.getDate() != null){
                if(!fieldTelefone1.getText().isEmpty()){
                    if(!fieldEmail.getText().isEmpty()){
                        this.btnProxCadDados.setEnabled(true);
                    }else{
                        this.btnProxCadDados.setEnabled(false);
                    }
                }else{
                    this.btnProxCadDados.setEnabled(false);
                }
            }else{
                this.btnProxCadDados.setEnabled(false);
            }
        }else{
            this.btnProxCadDados.setEnabled(false);
        }
    }

    private void fieldSenhaConfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldSenhaConfirmKeyReleased
        if(fieldUsuario.getText().isEmpty() == false){
            checkSenha();
        }
    }//GEN-LAST:event_fieldSenhaConfirmKeyReleased

    private void fieldSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldSenhaKeyReleased
        if(fieldUsuario.getText().isEmpty() == false){
            checkSenha();
        }
    }//GEN-LAST:event_fieldSenhaKeyReleased
    
    private void checkSenha(){
         try {
                MessageDigest cryptSenha = MessageDigest.getInstance("SHA-256");
                byte messageDigestSenha[] = cryptSenha.digest(String.valueOf(fieldSenha.getPassword()).getBytes("UTF-8"));

                MessageDigest cryptSenhaConfirm = MessageDigest.getInstance("SHA-256");
                byte messageDigestSenhaConfirm[] = cryptSenhaConfirm.digest(String.valueOf(fieldSenhaConfirm.getPassword()).getBytes("UTF-8"));

                StringBuilder hexString = new StringBuilder();
                for (byte b : messageDigestSenha) {
                  hexString.append(String.format("%02X", 0xFF & b));
                }
                senhahex = hexString.toString();

                StringBuilder hexString2 = new StringBuilder();
                for (byte b : messageDigestSenhaConfirm) {
                  hexString2.append(String.format("%02X", 0xFF & b));
                }
                senhahexConfirm = hexString2.toString();

            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(senhahex.equals(senhahexConfirm)){
                this.btnProxCadLogin.setEnabled(true);
            }else{
                this.btnProxCadLogin.setEnabled(false);
            }
    }
    
    private void fieldUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldUsuarioKeyReleased
        if(fieldUsuario.getText().isEmpty() == false){
            if(!fieldSenhaConfirm.getPassword().toString().equals("") && fieldSenha.getPassword().toString().equals("")){
                checkSenha();
            }
        }else{
            this.btnProxCadLogin.setEnabled(false);
        }
    }//GEN-LAST:event_fieldUsuarioKeyReleased

    private void fieldNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNomeKeyReleased
        checkCamposDados();
    }//GEN-LAST:event_fieldNomeKeyReleased

    private void fieldTelefone1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTelefone1KeyReleased
        checkCamposDados();
    }//GEN-LAST:event_fieldTelefone1KeyReleased

    private void fieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldEmailKeyReleased
        checkCamposDados();
    }//GEN-LAST:event_fieldEmailKeyReleased

    private void fieldLogradouroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldLogradouroKeyReleased
        checkCamposEndereco();
    }//GEN-LAST:event_fieldLogradouroKeyReleased

    private void fieldNumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNumeroKeyReleased
        checkCamposEndereco();
    }//GEN-LAST:event_fieldNumeroKeyReleased

    private void fieldCidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCidadeKeyReleased
        checkCamposEndereco();
    }//GEN-LAST:event_fieldCidadeKeyReleased

    private void fieldEstadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldEstadoKeyReleased
        checkCamposEndereco();
    }//GEN-LAST:event_fieldEstadoKeyReleased

    private void fieldPaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPaisKeyReleased
       checkCamposEndereco();
    }//GEN-LAST:event_fieldPaisKeyReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }
    
    private String usuario;
    private String senhahex;
    private String senhahexConfirm;
    
    private String nome;
    private Date data_nasc;
    private int telefone1;
    private int telefone2;
    private String email;
    
    private String logradouro; 
    private int numero;
    private String bairro;
    private String complemento;
    private int cep;
    private String cidade;     
    private String sigla_estado;
    private String pais;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAntCadDados;
    private javax.swing.JButton btnAntCadEndereco;
    private javax.swing.JButton btnAntConfirmacao;
    private javax.swing.JButton btnConfirmacao;
    private javax.swing.JButton btnProxCadDados;
    private javax.swing.JButton btnProxCadEndereco;
    private javax.swing.JButton btnProxCadLogin;
    private javax.swing.JTextField fieldCidade;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldEstado;
    private javax.swing.JTextField fieldLogradouro;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JTextField fieldPais;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JPasswordField fieldSenhaConfirm;
    private javax.swing.JTextField fieldTelefone1;
    private javax.swing.JTextField fieldTelefone2;
    private javax.swing.JTextField fieldUsuario;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelDataNasc;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelLogradouro;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelPais;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSenhaConfirm;
    private javax.swing.JLabel labelTelefone1;
    private javax.swing.JLabel labelTelefone2;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelCadDados;
    private javax.swing.JPanel panelCadEndereco;
    private javax.swing.JPanel panelCadLogin;
    private javax.swing.JPanel panelConfirmacao;
    private javax.swing.JTabbedPane tabbedPaneMenu;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
