/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Entidad.Factura;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Jandr
 */
public class Prueba3 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        ejemploEscribeFichTexto("C:\\TextoPlano\\prueba3.txt", "DISENOS Y MAS S.A. DISEMAS-03-12-2020 09-39-54", "001-901-000000001", 10.2, "Disemas");
        
        
    }
    
    static void ejemploEscribeFichTexto(String nomFich, String codigo,
        String i, double x, String razon) throws IOException {
        PrintWriter out = null;
        try {
        // Abre el fichero
        out = new PrintWriter(new FileWriter(nomFich));
        // escribe los datos en el fichero
        out.println("Codigo:" + codigo + " Nro:"+ i +" Total:" + x +" Razon:"+razon);
        } finally {
        if (out != null)
        out.close(); // Cierra el fichero
        }
      }
    
    public void leerTxt(){
        File archivo = new File("C:\\TextoPlano\\prueba2.txt");
        FileReader fr;
        BufferedReader bw;
        try {
            fr = new FileReader(archivo);
            bw = new BufferedReader(fr);
            Object[] linea = bw.lines().toArray();
            for (int i = 0; i < linea.length; i++) {
                String[] fila = linea [i].toString().split(" ");
                bw.close();
                fr.close();
            }
        } catch (Exception e) {
        }
    } 
    
//    public  void cargar_txt(){
//        File ruta = new File(ruta_txt);
//        try{
//            
//            FileReader fi = new FileReader(ruta);
//            BufferedReader bu = new BufferedReader(fi);
//            
//            
//            String linea = null;
//            while((linea = bu.readLine())!=null){
//                StringTokenizer st = new StringTokenizer(linea, ",");
//                f = new Factura();
//                f.setRUC_CI_PASAPORTE_S(st.nextToken());
//                f.setID_FACTURA(Integer.parseInt(st.nextToken()));
//                listaFactura.add(f);
//                System.out.println("Lista de factura: "+listaFactura);
//            }
//            bu.close();
//        }catch(Exception ex){
//            System.out.println("Error al cargar archivo: "+ex.getMessage());
//            System.out.println(ex.getMessage());
//        }
//    }
    
}
