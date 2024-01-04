/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Entidad.Factura;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jandr
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
             
            Factura f = new Factura();
            ArrayList<Factura> listaFactura = new ArrayList<>();
            Path path = Paths.get("C:\\TextoPlano\\prueba3.txt");
            List<String> contentList = Files.readAllLines(path, StandardCharsets.UTF_8);
            System.out.println(contentList);
            listaFactura.add(f);
            
        }catch (IOException e){
            e.printStackTrace();
        } 
    }
    
}
