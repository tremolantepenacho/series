/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

import controlador.Controlador;
import vista.FramePrincipal;
import modelo.Acceso;
import modelo.ListShow;
import modelo.Show;

/**
 *
 * @author hector
 */
public class Series {
    public static Controlador controlador;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        controlador=new Controlador();
        FramePrincipal fp=new FramePrincipal();
        fp.setVisible(true);
        
    }
    
}
