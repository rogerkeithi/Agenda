package com.roger.agenda;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Agenda {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException e) {
           // handle exception
        }
        catch (ClassNotFoundException e) {
           // handle exception
        }
        catch (InstantiationException e) {
           // handle exception
        }
        catch (IllegalAccessException e) {
           // handle exception
        }
        
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        //Tela tela = new Tela();
        //tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //tela.setVisible(true);
    }
}
