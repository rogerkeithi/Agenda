/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.roger.agenda;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.ImageFilter;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author roger
 */
public class Tela extends javax.swing.JFrame {
    private static int idUsuario;
    private static boolean logado;
    
    private static ArrayList<Usuario> usuario_infos;
    private static ArrayList<Pessoa> pessoa_infos;
    
    private static ArrayList<Pessoa> pessoa_contato_list = new ArrayList<Pessoa>();
    private static ArrayList<Pessoa> pessoa_contato_selecionada = new ArrayList<Pessoa>(0);
    
    private static Image fotoPerfilContatoToSave;
    private static File fileFoto;
    
    private String nome_contato;
    private Date data_nasc_contato;
    private long telefone1_contato;
    private long telefone2_contato;
    private String email_contato;
    
    private String logradouro_contato; 
    private int numero_contato;
    private String bairro_contato;
    private String complemento_contato;
    private int cep_contato;
    private String cidade_contato;     
    private String sigla_estado_contato;
    private String pais_contato;
    
    public Tela() {
        initComponents();
    }

    public void setLogin(int id_usuario, boolean logado_confirm){
        this.idUsuario = id_usuario;
        this.logado = logado_confirm;
        
        BuscaPessoaBD bpbd = new BuscaPessoaBD();
        
        bpbd.setPessoa(this.idUsuario);
        
        pessoa_infos = bpbd.getPessoa();
        
        this.jLabel3.setText("Olá, "+pessoa_infos.get(0).getNome()+", bem vindo de volta!");

        Connection con;
        
        String query = "SELECT * FROM tb_pessoa";
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
                String id_contato = rs.getString("ID_PESSOA");
                String nome_selected = rs.getString("NOME");
                String email_selected = rs.getString("EMAIL");
                String tel1_selected = rs.getString("TELEFONE1");
                String tel2_selected = rs.getString("TELEFONE2");
                
                if(rs.getString("ID_USUARIO") == null){
                    String[] objs = {id_contato,nome_selected,email_selected,tel1_selected,tel2_selected};
                
                    DefaultTableModel model = (DefaultTableModel) tabelContatos.getModel();

                    model.addRow(objs);
                }
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pperfil = new javax.swing.JTabbedPane();
        pinicio = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        pcompromissos = new javax.swing.JPanel();
        pcontatos = new javax.swing.JPanel();
        tabbedPaneContato = new javax.swing.JTabbedPane();
        paneListarContato = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelContatos = new javax.swing.JTable();
        panelAdicionarContato = new javax.swing.JPanel();
        tituloAdicionarContato = new javax.swing.JLabel();
        labelFoto = new javax.swing.JLabel();
        btnVoltarAdicionarContato = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fieldNomeContato = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fieldEmailContato = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldTelefone1Contato = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fieldTelefone2Contato = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        tabbedPaneContato2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        showFotoPerfilContato = new javax.swing.JLabel();
        showNomeContato = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        showLogradouroContato = new javax.swing.JLabel();
        showNumeroContato = new javax.swing.JLabel();
        showCidadeContato = new javax.swing.JLabel();
        showEstadoContato = new javax.swing.JLabel();
        showPaisContato = new javax.swing.JLabel();
        showIdadeContato = new javax.swing.JLabel();
        showEmailContato = new javax.swing.JLabel();
        showTelefone1Contato = new javax.swing.JLabel();
        showTelefone2Contato = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnSalvarAdicionarContato = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        fieldLogradouroContato = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        comboBoxSiglaEstado = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        fieldNumeroContato = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fieldCidadeContato = new javax.swing.JTextField();
        fieldPaisContato = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jenda");
        setBackground(new java.awt.Color(38, 34, 26));
        setMinimumSize(new java.awt.Dimension(640, 480));

        pperfil.setBackground(new java.awt.Color(51, 51, 51));
        pperfil.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, -3, -3, -3));
        pperfil.setToolTipText("");
        pperfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        pperfil.setMinimumSize(new java.awt.Dimension(100, 200));

        pinicio.setBackground(new java.awt.Color(51, 51, 51));
        pinicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jCalendar1.setBackground(new java.awt.Color(51, 51, 51));
        jCalendar1.setDecorationBackgroundColor(new java.awt.Color(51, 51, 51));
        jCalendar1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jCalendar1.setNullDateButtonText("");
        jCalendar1.setPreferredSize(new java.awt.Dimension(566, 169));
        jCalendar1.setSundayForeground(new java.awt.Color(255, 102, 102));
        jCalendar1.setTodayButtonText("");
        jCalendar1.setWeekOfYearVisible(false);
        jCalendar1.setWeekdayForeground(new java.awt.Color(255, 255, 255));
        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });

        jList1.setBackground(new java.awt.Color(51, 51, 51));
        jList1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jList1.setFixedCellHeight(100);
        jList1.setPreferredSize(new java.awt.Dimension(39, 2440));
        jScrollPane1.setViewportView(jList1);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Adicionar Compromisso");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(-1, -1, -1, -1));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane2.setBackground(new java.awt.Color(28, 28, 28));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, -3, -3, -3));
        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane2.setEnabled(false);

        jPanel3.setBackground(new java.awt.Color(28, 28, 28));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Meus Compromissos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Para o dia...");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Olá, jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(844, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", jPanel3);

        jPanel2.setBackground(new java.awt.Color(28, 28, 28));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Adicione um título ao seu compromisso");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setMargin(new java.awt.Insets(4, 10, 4, 6));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(912, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", jPanel2);

        javax.swing.GroupLayout pinicioLayout = new javax.swing.GroupLayout(pinicio);
        pinicio.setLayout(pinicioLayout);
        pinicioLayout.setHorizontalGroup(
            pinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinicioLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        pinicioLayout.setVerticalGroup(
            pinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinicioLayout.createSequentialGroup()
                .addGroup(pinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pperfil.addTab("  Inicio  ", pinicio);

        pcompromissos.setBackground(new java.awt.Color(51, 51, 51));
        pcompromissos.setToolTipText("");

        javax.swing.GroupLayout pcompromissosLayout = new javax.swing.GroupLayout(pcompromissos);
        pcompromissos.setLayout(pcompromissosLayout);
        pcompromissosLayout.setHorizontalGroup(
            pcompromissosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1369, Short.MAX_VALUE)
        );
        pcompromissosLayout.setVerticalGroup(
            pcompromissosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1017, Short.MAX_VALUE)
        );

        pperfil.addTab("Compromissos", pcompromissos);

        pcontatos.setBackground(new java.awt.Color(51, 51, 51));

        tabbedPaneContato.setBackground(new java.awt.Color(51, 51, 51));
        tabbedPaneContato.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, -3, -3, -3));
        tabbedPaneContato.setForeground(new java.awt.Color(0, 0, 0));
        tabbedPaneContato.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        paneListarContato.setBackground(new java.awt.Color(61, 61, 61));
        paneListarContato.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, -3, -3, -3));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Meus contatos");

        jButton2.setBackground(new java.awt.Color(0, 153, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Buscar");
        jButton2.setBorderPainted(false);

        jButton3.setBackground(new java.awt.Color(0, 153, 204));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Adicionar Contato");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tabelContatos.setAutoCreateRowSorter(true);
        tabelContatos.setBackground(new java.awt.Color(255, 255, 255));
        tabelContatos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tabelContatos.setForeground(new java.awt.Color(255, 255, 255));
        tabelContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Nome", "Telefone 1", "Telefone 2", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelContatos.setGridColor(new java.awt.Color(51, 51, 51));
        tabelContatos.setRowHeight(40);
        tabelContatos.setRowMargin(10);
        tabelContatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelContatosMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabelContatos);

        javax.swing.GroupLayout paneListarContatoLayout = new javax.swing.GroupLayout(paneListarContato);
        paneListarContato.setLayout(paneListarContatoLayout);
        paneListarContatoLayout.setHorizontalGroup(
            paneListarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneListarContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneListarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                    .addGroup(paneListarContatoLayout.createSequentialGroup()
                        .addComponent(jTextField2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(15, 15, 15))
        );
        paneListarContatoLayout.setVerticalGroup(
            paneListarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneListarContatoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(paneListarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        tabbedPaneContato.addTab("", paneListarContato);

        panelAdicionarContato.setBackground(new java.awt.Color(61, 61, 61));

        tituloAdicionarContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        tituloAdicionarContato.setForeground(new java.awt.Color(255, 255, 255));
        tituloAdicionarContato.setText("Adicionar Contato");

        labelFoto.setBackground(new java.awt.Color(0, 0, 0));
        labelFoto.setForeground(new java.awt.Color(255, 255, 255));
        labelFoto.setText("Selecionar foto...");
        labelFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labelFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelFotoMouseReleased(evt);
            }
        });

        btnVoltarAdicionarContato.setBackground(new java.awt.Color(0, 153, 204));
        btnVoltarAdicionarContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        btnVoltarAdicionarContato.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarAdicionarContato.setText("Voltar");
        btnVoltarAdicionarContato.setBorderPainted(false);
        btnVoltarAdicionarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarAdicionarContatoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome:");

        fieldNomeContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data de Nascimento");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail:");

        fieldEmailContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefone 1:");

        fieldTelefone1Contato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telefone 2:");

        fieldTelefone2Contato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        jDateChooser1.setBackground(new java.awt.Color(51, 51, 51));
        jDateChooser1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelAdicionarContatoLayout = new javax.swing.GroupLayout(panelAdicionarContato);
        panelAdicionarContato.setLayout(panelAdicionarContatoLayout);
        panelAdicionarContatoLayout.setHorizontalGroup(
            panelAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdicionarContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdicionarContatoLayout.createSequentialGroup()
                        .addComponent(tituloAdicionarContato)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdicionarContatoLayout.createSequentialGroup()
                        .addComponent(btnVoltarAdicionarContato)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdicionarContatoLayout.createSequentialGroup()
                        .addGroup(panelAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelAdicionarContatoLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldEmailContato))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAdicionarContatoLayout.createSequentialGroup()
                                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAdicionarContatoLayout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldNomeContato))
                                    .addGroup(panelAdicionarContatoLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAdicionarContatoLayout.createSequentialGroup()
                                .addGroup(panelAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldTelefone1Contato)
                                    .addComponent(fieldTelefone2Contato))))
                        .addGap(21, 21, 21))))
        );
        panelAdicionarContatoLayout.setVerticalGroup(
            panelAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdicionarContatoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloAdicionarContato)
                .addGap(41, 41, 41)
                .addGroup(panelAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAdicionarContatoLayout.createSequentialGroup()
                        .addGroup(panelAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fieldNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(122, 122, 122)
                .addGroup(panelAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldEmailContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(panelAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fieldTelefone1Contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124)
                .addGroup(panelAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fieldTelefone2Contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(btnVoltarAdicionarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        tabbedPaneContato.addTab("", panelAdicionarContato);

        tabbedPaneContato2.setBackground(new java.awt.Color(61, 61, 61));
        tabbedPaneContato2.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, -3, -3, -3));
        tabbedPaneContato2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel4.setBackground(new java.awt.Color(61, 61, 61));

        showFotoPerfilContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        showFotoPerfilContato.setForeground(new java.awt.Color(255, 255, 255));
        showFotoPerfilContato.setText("Sem Foto");
        showFotoPerfilContato.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        showNomeContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        showNomeContato.setForeground(new java.awt.Color(255, 255, 255));
        showNomeContato.setText("Selecione um contato");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Idade:");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("E-mail:");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telefone 1:");

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Telefone 2:");

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Logradouro:");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Endereço");

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Número:");

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cidade:");

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Estado:");

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("País:");

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));

        showLogradouroContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        showLogradouroContato.setForeground(new java.awt.Color(255, 255, 255));
        showLogradouroContato.setText("aguardando...");

        showNumeroContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        showNumeroContato.setForeground(new java.awt.Color(255, 255, 255));
        showNumeroContato.setText("aguardando...");

        showCidadeContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        showCidadeContato.setForeground(new java.awt.Color(255, 255, 255));
        showCidadeContato.setText("aguardando...");

        showEstadoContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        showEstadoContato.setForeground(new java.awt.Color(255, 255, 255));
        showEstadoContato.setText("aguardando...");

        showPaisContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        showPaisContato.setForeground(new java.awt.Color(255, 255, 255));
        showPaisContato.setText("aguardando...");

        showIdadeContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        showIdadeContato.setForeground(new java.awt.Color(255, 255, 255));
        showIdadeContato.setText("aguardando...");

        showEmailContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        showEmailContato.setForeground(new java.awt.Color(255, 255, 255));
        showEmailContato.setText("aguardando...");

        showTelefone1Contato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        showTelefone1Contato.setForeground(new java.awt.Color(255, 255, 255));
        showTelefone1Contato.setText("aguardando...");

        showTelefone2Contato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        showTelefone2Contato.setForeground(new java.awt.Color(255, 255, 255));
        showTelefone2Contato.setText("aguardando...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(showFotoPerfilContato, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showEmailContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showIdadeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showTelefone1Contato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showTelefone2Contato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showNumeroContato, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showCidadeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showEstadoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showPaisContato, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(showLogradouroContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showNomeContato)
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(showIdadeContato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(showEmailContato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(showTelefone1Contato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(showTelefone2Contato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(showFotoPerfilContato, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel20)
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(showLogradouroContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(showNumeroContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(showCidadeContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(showEstadoContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(showPaisContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        tabbedPaneContato2.addTab("", jPanel4);

        jPanel8.setBackground(new java.awt.Color(61, 61, 61));

        btnSalvarAdicionarContato.setBackground(new java.awt.Color(0, 153, 204));
        btnSalvarAdicionarContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        btnSalvarAdicionarContato.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarAdicionarContato.setText("Salvar");
        btnSalvarAdicionarContato.setBorderPainted(false);
        btnSalvarAdicionarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAdicionarContatoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Logradouro:");

        fieldLogradouroContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Estado:");

        comboBoxSiglaEstado.setBackground(new java.awt.Color(51, 51, 51));
        comboBoxSiglaEstado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        comboBoxSiglaEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboBoxSiglaEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Número:");

        fieldNumeroContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cidade:");

        fieldCidadeContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        fieldPaisContato.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("País:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarAdicionarContato))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxSiglaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldLogradouroContato, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNumeroContato, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldCidadeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldPaisContato, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fieldLogradouroContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(fieldNumeroContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(fieldCidadeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(comboBoxSiglaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(fieldPaisContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(btnSalvarAdicionarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        tabbedPaneContato2.addTab("", jPanel8);

        javax.swing.GroupLayout pcontatosLayout = new javax.swing.GroupLayout(pcontatos);
        pcontatos.setLayout(pcontatosLayout);
        pcontatosLayout.setHorizontalGroup(
            pcontatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcontatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPaneContato2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pcontatosLayout.setVerticalGroup(
            pcontatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcontatosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pcontatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tabbedPaneContato)
                    .addComponent(tabbedPaneContato2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pperfil.addTab("Contatos", pcontatos);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1369, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1017, Short.MAX_VALUE)
        );

        pperfil.addTab("Grupos", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1369, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1017, Short.MAX_VALUE)
        );

        pperfil.addTab("Perfil", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pperfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pperfil, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange
        jTabbedPane2.setSelectedIndex(0);
        java.sql.Date dataSql = new java.sql.Date(jCalendar1.getDate().getTime());

        jLabel2.setText(dataSql.toString());
    }//GEN-LAST:event_jCalendar1PropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tabbedPaneContato.setSelectedIndex(1);
        tabbedPaneContato2.setSelectedIndex(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void labelFotoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFotoMouseReleased
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);

        int option = fileChooser.showOpenDialog(this);

        ImageIcon fotoPerfilContato;

        if(option == JFileChooser.APPROVE_OPTION){
            String caminho = fileChooser.getSelectedFile().getPath();
            fileFoto = new File(caminho);
            fotoPerfilContato = new ImageIcon(caminho);
           
            Image image = fotoPerfilContato.getImage(); // transform it 
            
            Image newimg = image.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
            
            fotoPerfilContatoToSave = newimg;
            
            ImageIcon imageIcon = new ImageIcon(newimg);  // transform it back

            labelFoto.setIcon(imageIcon);

        }else{
           JOptionPane.showMessageDialog(null,"Não foi possível adicionar a imagem");
        }
    }//GEN-LAST:event_labelFotoMouseReleased

    private void btnSalvarAdicionarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAdicionarContatoActionPerformed
        nome_contato = fieldNomeContato.getText();
        data_nasc_contato = jDateChooser1.getDate();
        email_contato = fieldEmailContato.getText();
        telefone1_contato = Long.parseLong(fieldTelefone1Contato.getText());
        telefone2_contato = Long.parseLong(fieldTelefone2Contato.getText());
        
        logradouro_contato = fieldLogradouroContato.getText();
        numero_contato = Integer.parseInt(fieldNumeroContato.getText());
        cidade_contato = fieldCidadeContato.getText();        
        sigla_estado_contato = comboBoxSiglaEstado.getSelectedItem().toString();        
        pais_contato = fieldPaisContato.getText();        
        
        Pessoa pessoa_contato = new Pessoa();
        
        pessoa_contato.setNome(nome_contato);
        pessoa_contato.setData_nasc(data_nasc_contato);
        pessoa_contato.setEmail(email_contato);
        pessoa_contato.setTelefone1(telefone1_contato);
        pessoa_contato.setTelefone2(telefone2_contato);
        pessoa_contato.setFoto(fileFoto);
        
        pessoa_contato.setLogradouro(logradouro_contato);
        pessoa_contato.setNumero(numero_contato);
        pessoa_contato.setCidade(cidade_contato);
        pessoa_contato.setSigla_estado(sigla_estado_contato);
        pessoa_contato.setPais(pais_contato);
         
        pessoa_contato_list.add(pessoa_contato);
        
        CadastrarUsuario cdu = new CadastrarUsuario();
        
        cdu.setPessoaContato(pessoa_contato_list);
        
        try {
            cdu.CadastrarPessoaContato();
            
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
            
            tabbedPaneContato.setSelectedIndex(0);
            tabbedPaneContato2.setSelectedIndex(0);
        } catch (IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarAdicionarContatoActionPerformed

    private void btnVoltarAdicionarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarAdicionarContatoActionPerformed
        tabbedPaneContato.setSelectedIndex(0);
        tabbedPaneContato2.setSelectedIndex(0);
    }//GEN-LAST:event_btnVoltarAdicionarContatoActionPerformed

    private void tabelContatosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelContatosMouseReleased
        int id_contato_now = Integer.parseInt(tabelContatos.getValueAt(tabelContatos.getSelectedRow(), 0).toString());
        BuscaPessoaBD bp = new BuscaPessoaBD();
        
        try {
            pessoa_contato_selecionada = bp.buscaContato(id_contato_now);
            
            showNomeContato.setText(pessoa_contato_selecionada.get(0).getNome());
            byte[] byteArray=pessoa_contato_selecionada.get(0).getFoto_banco(); //need to initialize it
            ImageIcon imageIcon = new ImageIcon(byteArray);
            imageIcon.getImage();
            Image image = imageIcon.getImage(); // transform it 
            
            Image newimg = image.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
            
            imageIcon = new ImageIcon(newimg);
            
            showFotoPerfilContato.setIcon(imageIcon);

            showIdadeContato.setText(String.valueOf(getIdade(pessoa_contato_selecionada.get(0).getData_nasc())));
            
            showEmailContato.setText(pessoa_contato_selecionada.get(0).getEmail());
            
            showTelefone1Contato.setText(String.valueOf(pessoa_contato_selecionada.get(0).getTelefone1()));
                    
            showTelefone2Contato.setText(String.valueOf(pessoa_contato_selecionada.get(0).getTelefone2()));
            
            showLogradouroContato.setText(pessoa_contato_selecionada.get(0).getLogradouro());
            
            showNumeroContato.setText(String.valueOf(pessoa_contato_selecionada.get(0).getNumero()));
            
            showCidadeContato.setText(pessoa_contato_selecionada.get(0).getCidade());
            
            showEstadoContato.setText(pessoa_contato_selecionada.get(0).getSigla_estado());
            
            showPaisContato.setText(pessoa_contato_selecionada.get(0).getPais());
            
        } catch (IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelContatosMouseReleased
    
    public int getIdade(Date data_nasc){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        
        Date data_now = new Date(System.currentTimeMillis());
        
        int res = Integer.parseInt(formatter.format(data_now)) - Integer.parseInt(formatter.format(data_nasc));
        
        return res;
    }
    
    /**
     * @param args the command line arguments
     */
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
                java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Tela().setVisible(true);
                }
                
            });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarAdicionarContato;
    private javax.swing.JButton btnVoltarAdicionarContato;
    private javax.swing.JComboBox<String> comboBoxSiglaEstado;
    private javax.swing.JTextField fieldCidadeContato;
    private javax.swing.JTextField fieldEmailContato;
    private javax.swing.JTextField fieldLogradouroContato;
    private javax.swing.JTextField fieldNomeContato;
    private javax.swing.JTextField fieldNumeroContato;
    private javax.swing.JTextField fieldPaisContato;
    private javax.swing.JTextField fieldTelefone1Contato;
    private javax.swing.JTextField fieldTelefone2Contato;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JPanel paneListarContato;
    private javax.swing.JPanel panelAdicionarContato;
    private javax.swing.JPanel pcompromissos;
    private javax.swing.JPanel pcontatos;
    private javax.swing.JPanel pinicio;
    private javax.swing.JTabbedPane pperfil;
    private javax.swing.JLabel showCidadeContato;
    private javax.swing.JLabel showEmailContato;
    private javax.swing.JLabel showEstadoContato;
    private javax.swing.JLabel showFotoPerfilContato;
    private javax.swing.JLabel showIdadeContato;
    private javax.swing.JLabel showLogradouroContato;
    private javax.swing.JLabel showNomeContato;
    private javax.swing.JLabel showNumeroContato;
    private javax.swing.JLabel showPaisContato;
    private javax.swing.JLabel showTelefone1Contato;
    private javax.swing.JLabel showTelefone2Contato;
    private javax.swing.JTabbedPane tabbedPaneContato;
    private javax.swing.JTabbedPane tabbedPaneContato2;
    public javax.swing.JTable tabelContatos;
    private javax.swing.JLabel tituloAdicionarContato;
    // End of variables declaration//GEN-END:variables
}
