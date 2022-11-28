package com.roger.agenda;

import javax.swing.ImageIcon;
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
        
        TelaLogin telalogin = new TelaLogin();
        telalogin.setLocationRelativeTo(null);
        telalogin.setVisible(true);
        
        ImageIcon image = new ImageIcon("./util/calendar.png");  
        
        telalogin.setIconImage(image.getImage());
    }
}
