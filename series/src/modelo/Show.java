/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author hector
 */
public class Show implements Serializable{
    
    private String titulo,guionista,genero;
    private int temporadas, vistas;

    public Show(String titulo, String guionista, String genero, int temporadas, int vistas) {
        this.titulo = titulo;
        this.guionista = guionista;
        this.genero = genero;
        this.temporadas = temporadas;
        this.vistas = vistas;
    }

    public Show() {
        this.titulo = "";
        this.guionista ="";
        this.genero = "";
        this.temporadas = 0;
        this.vistas = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGuionista() {
        return guionista;
    }

    public void setGuionista(String guionista) {
        this.guionista = guionista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getVistas() {
        return vistas;
    }

    public void setVistas(int vistas) {
        this.vistas = vistas;
    }
    
    
    
}
