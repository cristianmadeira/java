/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.utils;

import javax.swing.JOptionPane;

/**
 *
 * @author cristian
 */
public class Utils {
    public static String input(String msg){
        return JOptionPane.showInputDialog(null, msg);
    }
    public static String input(String msg, String title){
        return JOptionPane.showInputDialog(null,msg,title);
    }
    public static void print(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    public static void print(String msg, String title){
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }
    public static void print(String msg, String title, boolean error){
        JOptionPane.showMessageDialog(null, msg,title,(error?JOptionPane.ERROR_MESSAGE:JOptionPane.INFORMATION_MESSAGE));
    }
    public static int confirm(String msg, String title){
        return JOptionPane.showConfirmDialog(null, msg, title,JOptionPane.YES_NO_OPTION);
    }
}
