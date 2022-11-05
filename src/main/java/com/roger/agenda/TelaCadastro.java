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
        panelCadDados = new javax.swing.JPanel();
        btnProxCadDados = new javax.swing.JButton();
        btnAntCadDados = new javax.swing.JButton();
        panelCadEndereco = new javax.swing.JPanel();
        btnProxCadEndereco = new javax.swing.JButton();
        btnAntCadEndereco = new javax.swing.JButton();
        panelConfirmacao = new javax.swing.JPanel();
        btnConfirmacao = new javax.swing.JButton();
        btnAntConfirmacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        fieldSenhaConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldSenhaConfirmKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSenhaConfirm)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fieldSenhaConfirm)
                        .addComponent(fieldUsuario)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(labelSenha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(fieldSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(labelUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(labelSenhaConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldSenhaConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnProxCadLogin)
                .addGap(25, 25, 25))
        );

        tabbedPaneMenu.addTab("Passo 1", panelCadLogin);

        btnProxCadDados.setText("Próximo passo");
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

        javax.swing.GroupLayout panelCadDadosLayout = new javax.swing.GroupLayout(panelCadDados);
        panelCadDados.setLayout(panelCadDadosLayout);
        panelCadDadosLayout.setHorizontalGroup(
            panelCadDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadDadosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAntCadDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                .addComponent(btnProxCadDados)
                .addGap(25, 25, 25))
        );
        panelCadDadosLayout.setVerticalGroup(
            panelCadDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadDadosLayout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addGroup(panelCadDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProxCadDados)
                    .addComponent(btnAntCadDados))
                .addGap(25, 25, 25))
        );

        tabbedPaneMenu.addTab("Passo 2", panelCadDados);

        btnProxCadEndereco.setText("Próximo passo");
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

        javax.swing.GroupLayout panelCadEnderecoLayout = new javax.swing.GroupLayout(panelCadEndereco);
        panelCadEndereco.setLayout(panelCadEnderecoLayout);
        panelCadEnderecoLayout.setHorizontalGroup(
            panelCadEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadEnderecoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAntCadEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                .addComponent(btnProxCadEndereco)
                .addGap(25, 25, 25))
        );
        panelCadEnderecoLayout.setVerticalGroup(
            panelCadEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadEnderecoLayout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                .addComponent(btnConfirmacao)
                .addGap(25, 25, 25))
        );
        panelConfirmacaoLayout.setVerticalGroup(
            panelConfirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfirmacaoLayout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
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
        tabbedPaneMenu.setSelectedIndex(2);
    }//GEN-LAST:event_btnProxCadDadosActionPerformed

    private void btnProxCadEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProxCadEnderecoActionPerformed
        tabbedPaneMenu.setSelectedIndex(3);
    }//GEN-LAST:event_btnProxCadEnderecoActionPerformed

    private void btnConfirmacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmacaoActionPerformed

    private void btnAntCadDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntCadDadosActionPerformed
        tabbedPaneMenu.setSelectedIndex(0);
        loginCad.removeAll(loginCad);
    }//GEN-LAST:event_btnAntCadDadosActionPerformed

    private void btnAntCadEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntCadEnderecoActionPerformed
        tabbedPaneMenu.setSelectedIndex(1);
    }//GEN-LAST:event_btnAntCadEnderecoActionPerformed

    private void btnAntConfirmacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntConfirmacaoActionPerformed
        tabbedPaneMenu.setSelectedIndex(2);
    }//GEN-LAST:event_btnAntConfirmacaoActionPerformed

    private void fieldSenhaConfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldSenhaConfirmKeyReleased
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
            
            if(fieldUsuario.getText() != ""){
                
                if(senhahex.equals(senhahexConfirm)){
                    this.btnProxCadLogin.setEnabled(true);
                }else{
                    this.btnProxCadLogin.setEnabled(false);
                }
            }
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fieldSenhaConfirmKeyReleased

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAntCadDados;
    private javax.swing.JButton btnAntCadEndereco;
    private javax.swing.JButton btnAntConfirmacao;
    private javax.swing.JButton btnConfirmacao;
    private javax.swing.JButton btnProxCadDados;
    private javax.swing.JButton btnProxCadEndereco;
    private javax.swing.JButton btnProxCadLogin;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JPasswordField fieldSenhaConfirm;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSenhaConfirm;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelCadDados;
    private javax.swing.JPanel panelCadEndereco;
    private javax.swing.JPanel panelCadLogin;
    private javax.swing.JPanel panelConfirmacao;
    private javax.swing.JTabbedPane tabbedPaneMenu;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
