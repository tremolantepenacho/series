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
import modelo.Show;

/**
 *
 * @author hector
 */
public class PanelDatos extends JPanel{

    private JTextField fieldTitulo,fieldGuionista,fieldGenero,fieldTemporadas,fieldVistas;
    
    public PanelDatos() {
        super();
        this.setLayout(new GridLayout(5,2,10,10));
        
        JLabel titulo=new JLabel("Título");
        fieldTitulo=new JTextField(50);
        this.add(titulo);
        this.add(fieldTitulo);
        
        JLabel guionista=new JLabel("Guionista");
        fieldGuionista=new JTextField(50);
        this.add(guionista);
        this.add(fieldGuionista);
        
        JLabel genero=new JLabel("Género");
        fieldGenero=new JTextField(50);
        this.add(genero);
        this.add(fieldGenero);
        
        JLabel temporadas=new JLabel("Temporadas");
        fieldTemporadas=new JTextField(5);
        this.add(temporadas);
        this.add(fieldTemporadas);
        
        JLabel vistas=new JLabel("Temporadas vistas");
        fieldVistas=new JTextField(5);
        this.add(vistas);
        this.add(fieldVistas);
        
    }
    
    public void actualiza(Show s){
        fieldTitulo.setText(s.getTitulo());
        fieldGuionista.setText(s.getGuionista());
        fieldTemporadas.setText(""+s.getTemporadas());
        fieldVistas.setText(""+s.getVistas());
        fieldGenero.setText(s.getGenero());
    }

    public String getTitulo() {
        return fieldTitulo.toString();
    }

    public String getGuionista() {
        return fieldGuionista.toString();
    }

    public String getGenero() {
        return fieldGenero.toString();
    }

    public int getTemporadas() {
        return Integer.parseInt(fieldTemporadas.toString());
    }

    public int getVistas() {
        return Integer.parseInt(fieldVistas.toString());
    }
    
    
    
}
