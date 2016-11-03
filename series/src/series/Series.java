/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

import modelo.Acceso;
import modelo.ListShow;
import modelo.Show;

/**
 *
 * @author hector
 */
public class Series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Show sh=new Show("Breaking bad", "Vince Gilligan","Drama",5,5);
        ListShow ls=new ListShow();
        ls.setShow(sh);
        
        sh=new Show("Juego de Tronos","David Benioff","Drama",7,1);
        ls.setShow(sh);
        
        Acceso.guardarLS(ls);
        System.out.println("Guardado");
*/
        ListShow ls=Acceso.cargarLS();
        Show sh=ls.getSerie(0);
        
        System.out.println(sh.getTitulo());
        System.out.println(ls.getSerie(1).getTitulo());
    }
    
}
