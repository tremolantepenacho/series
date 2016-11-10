/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.*;

/**
 *
 * @author hector
 */
public class Controlador {
    private int posicion;
    private ListShow ls;

    public Controlador() {
        posicion=0;
        ls=Acceso.cargarLS();
        }
    public Show primero(){
        posicion=0;
        return ls.getSerie(posicion);
    }
    public Show ultimo(){
        posicion=ls.longitud()-1;
        return ls.getSerie(posicion);
    }
    
    public Show anterior(){
        posicion--;
        return ls.getSerie(posicion);
    }
    
    public Show posterior(){
        posicion++;
        return ls.getSerie(posicion);
    }
    
    public void nuevo(Show s){
        ls.addShow(s);
    }
}
