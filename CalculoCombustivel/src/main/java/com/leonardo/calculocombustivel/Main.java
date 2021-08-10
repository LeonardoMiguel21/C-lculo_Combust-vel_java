/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.calculocombustivel;

import com.leonardo.calculocombustivel.view.TelaCalculoCombustivel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author leoardo
 */
public class Main {
    
    
    public static void main(String[] args) throws UnsupportedLookAndFeelException{
     lookAndFeel();
     TelaCalculoCombustivel telaCalcCombustivel = new TelaCalculoCombustivel();
     telaCalcCombustivel.setVisible(true);
    }
    private static void lookAndFeel() throws UnsupportedLookAndFeelException{
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
         } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.ERROR_MESSAGE);

        }
   }
}
