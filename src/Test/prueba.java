/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Jandr
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
//            String ruta = "/ruta/filename.txt";
            String ruta = "C:\\TextoPlano\\prueba.txt";
            String contenido = "Contenido de ejemplo"+"dos";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Se creo el archivo con exito");
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
