/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.roger.agenda;

import java.awt.Color;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class TelaCadastro extends javax.swing.JFrame {
    ArrayList<Usuario> usuarioCad = new ArrayList<Usuario>(1);
    ArrayList<Pessoa> pessoaCad = new ArrayList<Pessoa>(1);
    ImageIcon image = new ImageIcon("./util/calendar.png");  

    public TelaCadastro() {
        initComponents();
        this.setIconImage(image.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelBackground = new javax.swing.JPanel();
        tabbedPaneMenu = new javax.swing.JTabbedPane();
        panelCadLogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelSenhaConfirm = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JTextField();
        fieldSenha = new javax.swing.JPasswordField();
        fieldSenhaConfirm = new javax.swing.JPasswordField();
        titulo = new javax.swing.JLabel();
        btnProxCadLogin = new javax.swing.JButton();
        voltarLogin = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        panelCadDados = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        labelDataNasc = new javax.swing.JLabel();
        labelTelefone1 = new javax.swing.JLabel();
        fieldTelefone1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        labelTelefone2 = new javax.swing.JLabel();
        fieldTelefone2 = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        btnProxCadDados = new javax.swing.JButton();
        titulo2 = new javax.swing.JLabel();
        btnAntCadDados = new javax.swing.JButton();
        panelCadEndereco = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelNumero = new javax.swing.JLabel();
        labelLogradouro = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        labelPais = new javax.swing.JLabel();
        fieldLogradouro = new javax.swing.JTextField();
        fieldNumero = new javax.swing.JTextField();
        fieldCidade = new javax.swing.JTextField();
        fieldPais = new javax.swing.JTextField();
        comboBoxEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnProxCadEndereco = new javax.swing.JButton();
        btnAntCadEndereco = new javax.swing.JButton();
        panelConfirmacao = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labelNomeCompletoConfirma = new javax.swing.JLabel();
        labelLogradouroConfirma = new javax.swing.JLabel();
        labelDataNascConfirma = new javax.swing.JLabel();
        labelNumeroConfirma = new javax.swing.JLabel();
        labelTelefone1Confirma = new javax.swing.JLabel();
        labelCidadeConfirma = new javax.swing.JLabel();
        labelTelefone2Confirma = new javax.swing.JLabel();
        labelEstadoConfirma = new javax.swing.JLabel();
        labelEmailConfirma = new javax.swing.JLabel();
        labelPaisConfirma = new javax.swing.JLabel();
        labelNomeConfirma = new javax.swing.JLabel();
        btnConfirmacao = new javax.swing.JButton();
        btnAntConfirmacao = new javax.swing.JButton();

        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("*");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel13.setText("Logradouro");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        tabbedPaneMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, -3, -3, -3));
        tabbedPaneMenu.setForeground(new java.awt.Color(255, 255, 255));
        tabbedPaneMenu.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbedPaneMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabbedPaneMenu.setEnabled(false);
        tabbedPaneMenu.setForeground(new java.awt.Color(0, 0, 0));
        tabbedPaneMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        panelCadLogin.setBackground(new java.awt.Color(51, 51, 51));
        panelCadLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, -3, -3, -3));
        panelCadLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelUsuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Usuário:");
        labelUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelSenha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha.setText("Senha:");
        labelSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelSenhaConfirm.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelSenhaConfirm.setForeground(new java.awt.Color(255, 255, 255));
        labelSenhaConfirm.setText("Confirme sua senha:");
        labelSenhaConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fieldUsuario.setBackground(new java.awt.Color(51, 51, 51));
        fieldUsuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        fieldUsuario.setForeground(new java.awt.Color(255, 255, 255));
        fieldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsuarioActionPerformed(evt);
            }
        });
        fieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldUsuarioKeyReleased(evt);
            }
        });

        fieldSenha.setBackground(new java.awt.Color(51, 51, 51));
        fieldSenha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        fieldSenha.setForeground(new java.awt.Color(255, 255, 255));
        fieldSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSenhaActionPerformed(evt);
            }
        });
        fieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldSenhaKeyReleased(evt);
            }
        });

        fieldSenhaConfirm.setBackground(new java.awt.Color(51, 51, 51));
        fieldSenhaConfirm.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        fieldSenhaConfirm.setForeground(new java.awt.Color(255, 255, 255));
        fieldSenhaConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldSenhaConfirmKeyReleased(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Cadastro de Login");

        btnProxCadLogin.setBackground(new java.awt.Color(102, 102, 102));
        btnProxCadLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnProxCadLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnProxCadLogin.setText("Próximo passo");
        btnProxCadLogin.setBorderPainted(false);
        btnProxCadLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProxCadLogin.setEnabled(false);
        btnProxCadLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProxCadLoginActionPerformed(evt);
            }
        });

        voltarLogin.setBackground(new java.awt.Color(102, 102, 102));
        voltarLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        voltarLogin.setForeground(new java.awt.Color(255, 255, 255));
        voltarLogin.setText("Voltar");
        voltarLogin.setBorderPainted(false);
        voltarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addComponent(labelSenhaConfirm)
                    .addComponent(labelSenha)
                    .addComponent(labelUsuario)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(voltarLogin)
                            .addGap(27, 27, 27)
                            .addComponent(btnProxCadLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addComponent(fieldSenhaConfirm, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fieldSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fieldUsuario, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(labelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(labelSenhaConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldSenhaConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarLogin)
                    .addComponent(btnProxCadLogin))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        ImageIcon ico = new ImageIcon("background1.png");

        jLabel16.setIcon(ico);
        jLabel16.setBorder(javax.swing.BorderFactory.createEmptyBorder(-2, -2, -2, -2));
        jLabel16.setMaximumSize(new java.awt.Dimension(422, 241));

        javax.swing.GroupLayout panelCadLoginLayout = new javax.swing.GroupLayout(panelCadLogin);
        panelCadLogin.setLayout(panelCadLoginLayout);
        panelCadLoginLayout.setHorizontalGroup(
            panelCadLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadLoginLayout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        panelCadLoginLayout.setVerticalGroup(
            panelCadLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadLoginLayout.createSequentialGroup()
                .addGroup(panelCadLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCadLoginLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        tabbedPaneMenu.addTab("Passo 1", panelCadLogin);

        panelCadDados.setBackground(new java.awt.Color(51, 51, 51));
        panelCadDados.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, -3, -3, -3));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(324, 288));

        labelNome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setText("Nome:");

        fieldNome.setBackground(new java.awt.Color(51, 51, 51));
        fieldNome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        fieldNome.setForeground(new java.awt.Color(255, 255, 255));
        fieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldNomeKeyReleased(evt);
            }
        });

        jDateChooser1.setBackground(new java.awt.Color(51, 51, 51));
        jDateChooser1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N

        labelDataNasc.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelDataNasc.setForeground(new java.awt.Color(255, 255, 255));
        labelDataNasc.setText("Data de Nascimento:");

        labelTelefone1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelTelefone1.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefone1.setText("Telefone 1: ");

        fieldTelefone1.setBackground(new java.awt.Color(51, 51, 51));
        fieldTelefone1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        fieldTelefone1.setForeground(new java.awt.Color(255, 255, 255));
        fieldTelefone1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldTelefone1KeyReleased(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("*");

        labelTelefone2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelTelefone2.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefone2.setText("Telefone: 2");

        fieldTelefone2.setBackground(new java.awt.Color(51, 51, 51));
        fieldTelefone2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        fieldTelefone2.setForeground(new java.awt.Color(255, 255, 255));

        labelEmail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setText("E-mail:");

        fieldEmail.setBackground(new java.awt.Color(51, 51, 51));
        fieldEmail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        fieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        fieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldEmailKeyReleased(evt);
            }
        });

        btnProxCadDados.setBackground(new java.awt.Color(102, 102, 102));
        btnProxCadDados.setForeground(new java.awt.Color(255, 255, 255));
        btnProxCadDados.setText("Próximo passo");
        btnProxCadDados.setBorderPainted(false);
        btnProxCadDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProxCadDados.setEnabled(false);
        btnProxCadDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProxCadDadosActionPerformed(evt);
            }
        });

        titulo2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 23)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("Informações Pessoais");

        btnAntCadDados.setBackground(new java.awt.Color(102, 102, 102));
        btnAntCadDados.setForeground(new java.awt.Color(255, 255, 255));
        btnAntCadDados.setText("Voltar");
        btnAntCadDados.setBorderPainted(false);
        btnAntCadDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAntCadDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntCadDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo2)
                    .addComponent(labelNome)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnAntCadDados)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProxCadDados))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(fieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelTelefone2)
                                .addComponent(fieldTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTelefone1)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDataNasc)
                            .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(labelDataNasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelTelefone1)
                    .addComponent(labelTelefone2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAntCadDados)
                    .addComponent(btnProxCadDados))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCadDadosLayout = new javax.swing.GroupLayout(panelCadDados);
        panelCadDados.setLayout(panelCadDadosLayout);
        panelCadDadosLayout.setHorizontalGroup(
            panelCadDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadDadosLayout.createSequentialGroup()
                .addContainerGap(382, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        panelCadDadosLayout.setVerticalGroup(
            panelCadDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadDadosLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        tabbedPaneMenu.addTab("Passo 2", panelCadDados);

        panelCadEndereco.setBackground(new java.awt.Color(51, 51, 51));
        panelCadEndereco.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, -3, -3, -3));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(324, 288));

        labelNumero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelNumero.setForeground(new java.awt.Color(255, 255, 255));
        labelNumero.setText("Número");

        labelLogradouro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelLogradouro.setForeground(new java.awt.Color(255, 255, 255));
        labelLogradouro.setText("Logradouro:");

        labelEstado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEstado.setForeground(new java.awt.Color(255, 255, 255));
        labelEstado.setText("Estado:");

        labelCidade.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelCidade.setForeground(new java.awt.Color(255, 255, 255));
        labelCidade.setText("Cidade");

        labelPais.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelPais.setForeground(new java.awt.Color(255, 255, 255));
        labelPais.setText("País:");

        fieldLogradouro.setBackground(new java.awt.Color(51, 51, 51));
        fieldLogradouro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        fieldLogradouro.setForeground(new java.awt.Color(255, 255, 255));
        fieldLogradouro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldLogradouroKeyReleased(evt);
            }
        });

        fieldNumero.setBackground(new java.awt.Color(51, 51, 51));
        fieldNumero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        fieldNumero.setForeground(new java.awt.Color(255, 255, 255));
        fieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldNumeroKeyReleased(evt);
            }
        });

        fieldCidade.setBackground(new java.awt.Color(51, 51, 51));
        fieldCidade.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        fieldCidade.setForeground(new java.awt.Color(255, 255, 255));
        fieldCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldCidadeKeyReleased(evt);
            }
        });

        fieldPais.setBackground(new java.awt.Color(51, 51, 51));
        fieldPais.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        fieldPais.setForeground(new java.awt.Color(255, 255, 255));
        fieldPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldPaisKeyReleased(evt);
            }
        });

        comboBoxEstado.setBackground(new java.awt.Color(51, 51, 51));
        comboBoxEstado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        comboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboBoxEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 23)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Informações de endereço");

        btnProxCadEndereco.setBackground(new java.awt.Color(102, 102, 102));
        btnProxCadEndereco.setForeground(new java.awt.Color(255, 255, 255));
        btnProxCadEndereco.setText("Próximo passo");
        btnProxCadEndereco.setBorderPainted(false);
        btnProxCadEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProxCadEndereco.setEnabled(false);
        btnProxCadEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProxCadEnderecoActionPerformed(evt);
            }
        });

        btnAntCadEndereco.setBackground(new java.awt.Color(102, 102, 102));
        btnAntCadEndereco.setForeground(new java.awt.Color(255, 255, 255));
        btnAntCadEndereco.setText("Voltar");
        btnAntCadEndereco.setBorderPainted(false);
        btnAntCadEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAntCadEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntCadEnderecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(41, 41, 41))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAntCadEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(labelEstado)
                                    .addGap(40, 40, 40)))
                            .addComponent(labelPais)
                            .addGap(110, 110, 110)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fieldCidade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelLogradouro)
                                    .addComponent(fieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNumero))))
                        .addComponent(btnProxCadEndereco)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogradouro)
                    .addComponent(labelNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(labelCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstado)
                    .addComponent(labelPais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProxCadEndereco)
                    .addComponent(btnAntCadEndereco))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCadEnderecoLayout = new javax.swing.GroupLayout(panelCadEndereco);
        panelCadEndereco.setLayout(panelCadEnderecoLayout);
        panelCadEnderecoLayout.setHorizontalGroup(
            panelCadEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadEnderecoLayout.createSequentialGroup()
                .addContainerGap(407, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        panelCadEnderecoLayout.setVerticalGroup(
            panelCadEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadEnderecoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        tabbedPaneMenu.addTab("Passo 3", panelCadEndereco);

        panelConfirmacao.setBackground(new java.awt.Color(51, 51, 51));
        panelConfirmacao.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, -3, -3, -3));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelNomeCompletoConfirma.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelNomeCompletoConfirma.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeCompletoConfirma.setText("Nome:                           ...................................................................................");

        labelLogradouroConfirma.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelLogradouroConfirma.setForeground(new java.awt.Color(255, 255, 255));
        labelLogradouroConfirma.setText("Endereço:                       ..................................................");

        labelDataNascConfirma.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelDataNascConfirma.setForeground(new java.awt.Color(255, 255, 255));
        labelDataNascConfirma.setText("Data de nascimento:      .........................");

        labelNumeroConfirma.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelNumeroConfirma.setForeground(new java.awt.Color(255, 255, 255));
        labelNumeroConfirma.setText("Número:                        .........................................................");

        labelTelefone1Confirma.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelTelefone1Confirma.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefone1Confirma.setText("Telefone principal:        .............................................................................");

        labelCidadeConfirma.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelCidadeConfirma.setForeground(new java.awt.Color(255, 255, 255));
        labelCidadeConfirma.setText("Cidade:                          .................................................................................");

        labelTelefone2Confirma.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelTelefone2Confirma.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefone2Confirma.setText("Telefone secundário:     .............................");

        labelEstadoConfirma.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEstadoConfirma.setForeground(new java.awt.Color(255, 255, 255));
        labelEstadoConfirma.setText("Estado:                          ..............");

        labelEmailConfirma.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEmailConfirma.setForeground(new java.awt.Color(255, 255, 255));
        labelEmailConfirma.setText("E-mail:                           .............................................................................");

        labelPaisConfirma.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelPaisConfirma.setForeground(new java.awt.Color(255, 255, 255));
        labelPaisConfirma.setText("País:                              ..................");

        labelNomeConfirma.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        labelNomeConfirma.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeConfirma.setText("NOME, confirme seus dados");

        btnConfirmacao.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirmacao.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmacao.setText("Confirmar meus dados");
        btnConfirmacao.setBorderPainted(false);
        btnConfirmacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmacaoActionPerformed(evt);
            }
        });

        btnAntConfirmacao.setBackground(new java.awt.Color(102, 102, 102));
        btnAntConfirmacao.setForeground(new java.awt.Color(255, 255, 255));
        btnAntConfirmacao.setText("Voltar");
        btnAntConfirmacao.setBorderPainted(false);
        btnAntConfirmacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAntConfirmacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntConfirmacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelCidadeConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelNomeCompletoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelEmailConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTelefone1Confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelTelefone2Confirma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelLogradouroConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNumeroConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelDataNascConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelEstadoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(labelNomeConfirma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(257, 257, 257))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelPaisConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAntConfirmacao)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmacao)
                        .addGap(59, 59, 59))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(labelNomeConfirma)
                .addGap(18, 18, 18)
                .addComponent(labelNomeCompletoConfirma)
                .addGap(4, 4, 4)
                .addComponent(labelDataNascConfirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTelefone1Confirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTelefone2Confirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmailConfirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLogradouroConfirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNumeroConfirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCidadeConfirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEstadoConfirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPaisConfirma)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConfirmacao)
                        .addComponent(btnAntConfirmacao)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelConfirmacaoLayout = new javax.swing.GroupLayout(panelConfirmacao);
        panelConfirmacao.setLayout(panelConfirmacaoLayout);
        panelConfirmacaoLayout.setHorizontalGroup(
            panelConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfirmacaoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        panelConfirmacaoLayout.setVerticalGroup(
            panelConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfirmacaoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        tabbedPaneMenu.addTab("Confirmação", panelConfirmacao);

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        Usuario login = new Usuario(this.usuario,this.senhahex);
        
        usuarioCad.add(login);
        
        tabbedPaneMenu.setSelectedIndex(1);
        
    }//GEN-LAST:event_btnProxCadLoginActionPerformed

    private void btnProxCadDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProxCadDadosActionPerformed
        nome = fieldNome.getText();
        data_nasc = jDateChooser1.getDate();
        telefone1 = Long.parseLong(fieldTelefone1.getText());
        
        if(fieldTelefone2.getText().isEmpty()){
            telefone2 = 0;
        }else{       
            telefone2 = Long.parseLong(fieldTelefone2.getText()); 
        }
        email = fieldEmail.getText();
        
        Pessoa pessoa = new Pessoa();
        
        pessoaCad.add(pessoa);
        pessoaCad.get(0).setNome(nome);
        pessoaCad.get(0).setData_nasc(data_nasc);
        pessoaCad.get(0).setTelefone1(telefone1);
        pessoaCad.get(0).setTelefone2(telefone2);
        pessoaCad.get(0).setEmail(email);
                
        //String[] tratNome = pessoaCad.get(0).getNome().split(" ");
        this.labelNomeConfirma.setText(usuarioCad.get(0).getUsuario() + ", confirme seus dados");
        
        tabbedPaneMenu.setSelectedIndex(2);
    }//GEN-LAST:event_btnProxCadDadosActionPerformed

    private void btnProxCadEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProxCadEnderecoActionPerformed
        logradouro = fieldLogradouro.getText();
        numero = Integer.parseInt(fieldNumero.getText());
        cidade = fieldCidade.getText();
        sigla_estado = comboBoxEstado.getSelectedItem().toString();
        pais = fieldPais.getText();        
                
        pessoaCad.get(0).setLogradouro(logradouro);
        pessoaCad.get(0).setNumero(numero);
        pessoaCad.get(0).setCidade(cidade);
        pessoaCad.get(0).setSigla_estado(sigla_estado);       
        pessoaCad.get(0).setPais(pais);
        System.out.println(pessoaCad.get(0).getLogradouro());
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        String nomeToString = pessoaCad.get(0).getNome();
        String dataNascToString =  df.format(pessoaCad.get(0).getData_nasc());
        String telefone1ToString = Long.toString(pessoaCad.get(0).getTelefone1());
        String telefone2ToString = Long.toString(pessoaCad.get(0).getTelefone2());
        String emailToString = pessoaCad.get(0).getEmail();
        String logradouroToString = pessoaCad.get(0).getLogradouro();
        String numeroToString = Integer.toString(pessoaCad.get(0).getNumero());
        String cidadeToString = pessoaCad.get(0).getCidade();
        String estadoToString = pessoaCad.get(0).getSigla_estado();
        String paisToString = pessoaCad.get(0).getPais();
        
        this.labelNomeCompletoConfirma.setText("Nome: "+nomeToString);
        this.labelDataNascConfirma.setText("Data de Nascimento: "+dataNascToString);
        this.labelTelefone1Confirma.setText("Telefone 1: "+telefone1ToString);
        if(!telefone2ToString.equals("0")){   
            this.labelTelefone2Confirma.setText("Telefone 2: "+telefone2ToString);
        }else{
            this.labelTelefone2Confirma.setText("Telefone 2: Não informado");
        }
        this.labelEmailConfirma.setText("Email: "+emailToString);
        
        this.labelLogradouroConfirma.setText("Logradouro: "+logradouroToString);
        this.labelNumeroConfirma.setText("Número: "+numeroToString);
        this.labelCidadeConfirma.setText("Cidade: "+cidadeToString);
        this.labelEstadoConfirma.setText("Estado: "+estadoToString);
        this.labelPaisConfirma.setText("País: "+paisToString);
                
        tabbedPaneMenu.setSelectedIndex(3);
    }//GEN-LAST:event_btnProxCadEnderecoActionPerformed

    private void btnConfirmacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmacaoActionPerformed
        CadastrarUsuario cad = new CadastrarUsuario();
        
        cad.setUsuario(usuarioCad);
        
        boolean checkUsuario = cad.CadastrarUsuario();
        
        if(checkUsuario == true){
            cad.selectID_USUARIO();

            cad.setPessoa(pessoaCad);

            boolean checkPessoa = cad.CadastrarPessoa();

            if(checkPessoa == true){
                cad.selectID_PESSOA();
                
                cad.CadastrarEndereco();
                
                this.setVisible(false);

                TelaLogin telalogin = new TelaLogin();
                telalogin.setLocationRelativeTo(null);
                
                ImageIcon image = new ImageIcon("./util/calendar.png"); 
                
                telalogin.setIconImage(image.getImage());
                
                telalogin.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnConfirmacaoActionPerformed

    private void btnAntCadDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntCadDadosActionPerformed
        usuarioCad.removeAll(usuarioCad);
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
    
    private void fieldLogradouroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldLogradouroKeyReleased
        checkCamposEndereco();
    }//GEN-LAST:event_fieldLogradouroKeyReleased

    private void fieldNumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNumeroKeyReleased
        checkCamposEndereco();
    }//GEN-LAST:event_fieldNumeroKeyReleased

    private void fieldCidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCidadeKeyReleased
        checkCamposEndereco();
    }//GEN-LAST:event_fieldCidadeKeyReleased

    private void fieldPaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPaisKeyReleased
       checkCamposEndereco();
    }//GEN-LAST:event_fieldPaisKeyReleased

    private void voltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarLoginActionPerformed
       this.setVisible(false);
       TelaLogin telalogin= new TelaLogin();
       telalogin.setLocationRelativeTo(null);
       
       ImageIcon image = new ImageIcon("./util/calendar.png"); 
                
       telalogin.setIconImage(image.getImage());
                
       telalogin.setVisible(true);
    }//GEN-LAST:event_voltarLoginActionPerformed

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

    private void fieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSenhaActionPerformed

    private void fieldUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldUsuarioKeyReleased
        if(fieldUsuario.getText().isEmpty() == false){
            if(!fieldSenhaConfirm.getPassword().toString().equals("") && fieldSenha.getPassword().toString().equals("")){
                checkSenha();
            }
        }else{
            this.btnProxCadLogin.setEnabled(false);
        }
    }//GEN-LAST:event_fieldUsuarioKeyReleased

    private void fieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsuarioActionPerformed

    private void fieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldEmailKeyReleased
        checkCamposDados();
    }//GEN-LAST:event_fieldEmailKeyReleased

    private void fieldTelefone1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTelefone1KeyReleased
        checkCamposDados();
    }//GEN-LAST:event_fieldTelefone1KeyReleased

    private void fieldNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNomeKeyReleased
        checkCamposDados();
    }//GEN-LAST:event_fieldNomeKeyReleased

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
    private long telefone1;
    private long telefone2;
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
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JTextField fieldCidade;
    private javax.swing.JTextField fieldEmail;
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCidadeConfirma;
    private javax.swing.JLabel labelDataNasc;
    private javax.swing.JLabel labelDataNascConfirma;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmailConfirma;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelEstadoConfirma;
    private javax.swing.JLabel labelLogradouro;
    private javax.swing.JLabel labelLogradouroConfirma;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomeCompletoConfirma;
    private javax.swing.JLabel labelNomeConfirma;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelNumeroConfirma;
    private javax.swing.JLabel labelPais;
    private javax.swing.JLabel labelPaisConfirma;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSenhaConfirm;
    private javax.swing.JLabel labelTelefone1;
    private javax.swing.JLabel labelTelefone1Confirma;
    private javax.swing.JLabel labelTelefone2;
    private javax.swing.JLabel labelTelefone2Confirma;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelCadDados;
    private javax.swing.JPanel panelCadEndereco;
    private javax.swing.JPanel panelCadLogin;
    private javax.swing.JPanel panelConfirmacao;
    private javax.swing.JTabbedPane tabbedPaneMenu;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    private javax.swing.JButton voltarLogin;
    // End of variables declaration//GEN-END:variables
}
