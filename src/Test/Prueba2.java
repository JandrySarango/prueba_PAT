/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jandr
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String nombre = "", apellido = "";
        archivo = new File("C:\\TextoPlano\\prueba2.txt");
        if (!archivo.exists()) {

            try {
                archivo.createNewFile();
                nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre:"
                        , "Solicitando Dato" , 3);
                apellido = JOptionPane.showInputDialog(null, "Ingresa el apellido:"
                        , "Solicitando Dato" , 3);
                escribir = new FileWriter(archivo, true);
//                linea = new PrintWriter(escribir);
//                linea.println(nombre);
//                linea.println(apellido);
                escribir.write(nombre);
                escribir.write(apellido);
                escribir.close();
                System.out.println("Se creo el archivo con exito");

            } catch (IOException ex) {
                Logger.getLogger(Prueba2.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {

                nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre:"
                        , "Solicitando Dato" , 3);
                apellido = JOptionPane.showInputDialog(null, "Ingresa el apellido:"
                        , "Solicitando Dato" , 3);
                escribir = new FileWriter(archivo, true);
//                linea = new PrintWriter(escribir);
                escribir.write(nombre);
                escribir.write(apellido);
                escribir.close();
                System.out.println("Se creo el archivo con exito");

            } catch (IOException ex) {
                Logger.getLogger(Prueba2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
