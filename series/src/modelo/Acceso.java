/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hector
 */
public class Acceso {
    private static File f=new File("series.dat");
    
    public static void guardarLS(ListShow ls){
        try {
            FileOutputStream fos=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ListShow cargarLS(){
        ListShow ls=new ListShow();
        ObjectInputStream ois=null;
        try {
            FileInputStream fis=new FileInputStream(f);
            ois=new ObjectInputStream(fis);
            ls=(ListShow) ois.readObject();
            ois.close();
        } catch (IOException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return ls;
        }
    }
}
