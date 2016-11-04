/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author hector
 */
public class PanelBotones extends JPanel{

    public PanelBotones() {
        super(new FlowLayout());
        JButton b1=new JButton("|<");
        JButton b2=new JButton("<");
        JButton b3=new JButton(">");
        JButton b4=new JButton(">|");
        JButton b5=new JButton("+");
        JButton b6=new JButton("-");
        JButton b7=new JButton("*");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
    }
    
}
