/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.Show;
import series.Series;

/**
 *
 * @author hector
 */
public class PanelBotones extends JPanel{
    PanelDatos pd;
    public PanelBotones(PanelDatos pd) {
        super(new FlowLayout());
        this.pd=pd;
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
        
        ButtonListener bl=new ButtonListener();
        b1.addActionListener(bl);
        b2.addActionListener(bl);
        b3.addActionListener(bl);
        b4.addActionListener(bl);
        b5.addActionListener(bl);
        b6.addActionListener(bl);
        b7.addActionListener(bl);
    }
    


class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Show s=new Show();
        if (e.getActionCommand().equals("|<")) {
            s=Series.controlador.primero();
        }
        pd.actualiza(s);
       
    }
    

}
}
