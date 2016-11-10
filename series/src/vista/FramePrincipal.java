package vista;


import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hector
 */
public class FramePrincipal extends JFrame{

    public FramePrincipal() throws HeadlessException {
        setSize(500,300);
        this.setLocation(100, 100);
        setTitle("Mis series");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panelPrincipal=new JPanel();
        panelPrincipal.setLayout(new BorderLayout(10,10));
        add(panelPrincipal);
        
        PanelDatos pDatos=new PanelDatos();
        panelPrincipal.add(pDatos,BorderLayout.CENTER);
        
        PanelBotones pBotones=new PanelBotones(pDatos);
        panelPrincipal.add(pBotones,BorderLayout.NORTH);
        
        
        
        
    }
    
    
}
