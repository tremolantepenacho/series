/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author hector
 */
public class ListShow implements Serializable{
    
    private ArrayList<Show> listaSeries;

    public ListShow() {
        listaSeries=new ArrayList<>();
    }

    public Show getSerie(int p) {
        return listaSeries.get(p);
    }

    public void setShow(Show serie) {
        listaSeries.add(serie);
    }    
    public int longitud(){
        return listaSeries.size();
    }
}
