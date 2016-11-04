/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author hector
 */
public class PanelDatos extends JPanel{

    public PanelDatos() {
        super();
        this.setLayout(new GridLayout(5,2,10,10));
        
        JLabel titulo=new JLabel("Título");
        JTextField fieldTitulo=new JTextField(50);
        this.add(titulo);
        this.add(fieldTitulo);
        
        JLabel guionista=new JLabel("Guionista");
        JTextField fieldGuionista=new JTextField(50);
        this.add(guionista);
        this.add(fieldGuionista);
        
        JLabel genero=new JLabel("Género");
        JTextField fieldGenero=new JTextField(50);
        this.add(genero);
        this.add(fieldGenero);
        
        JLabel temporadas=new JLabel("Temporadas");
        JTextField fieldTemporadas=new JTextField(5);
        this.add(temporadas);
        this.add(fieldTemporadas);
        
        JLabel vistas=new JLabel("Temporadas vistas");
        JTextField fieldVistas=new JTextField(5);
        this.add(vistas);
        this.add(fieldVistas);
        
    }
    
}
