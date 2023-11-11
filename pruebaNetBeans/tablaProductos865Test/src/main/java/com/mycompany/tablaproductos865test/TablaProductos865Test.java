/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tablaproductos865test;
import java.io.*;
/**
 *
 * @author leonj
 */
public class TablaProductos865Test {
    
    //Variables globales
    public static productos p[] = new productos[20];
    public static int NR = 0;
    
    public static void Inicializa(){
        for(int m=0; m<=19;m++)
            p[m] = new productos();
    }
    
    public static void datos(){
        p[1].guardaRegistro("P01", "QUESO", 3, 47.50, false);
        p[2].guardaRegistro("P02", "PAPAS", 2, 8.45, false);
        p[3].guardaRegistro("P03", "MARGARINA", 1, 9.30, true);
        p[4].guardaRegistro("P04", "HUEVOS", 2, 45.00, false);
        p[5].guardaRegistro("P05", "CHILE(4OZ)", 3, 7.20, true);
        NR=5;
    }
    
    public static void calculos(){
        for(int m=0; m<=NR;m++)
            p[m].calcular();
    }
    
    public static void imprimeTabla(){
        System.out.println("CP"+"\t"+"PRODUCTO"+"\t"+"CANTIDAD"+"\t"+"PRECIO"+"\t"+"GRABABILIDAD"+"\t"+"Sub.T"+"\t"+"Impuesto"+"\t"+"Total");
        System.out.println(line());
        for(int k=1; k<=NR;k++)
            p[k].imprimeRegistro();
        System.out.println(line());
    }
    
    public static void Escritura(){
        File  a = new File("tienda/productos.txt");
        try{
            //condorito abre el archivo
            FileWriter fw = new FileWriter(a);
            
            //esta variable escribe en el archivo
            PrintWriter pw = new PrintWriter(fw);
            for(int k=0; k<NR; k++){
                pw.println(p[k].codPrd);
                pw.println(p[k].producto);
                pw.println(p[k].c);
                pw.println(p[k].prec);
                pw.println(p[k].grab);
            }
            
            fw.close();
            
        }catch(IOException e){
            System.out.println("Error de Escritura");
        }
        
        a.getAbsolutePath();
        a.exists();
    }
    
    public static void Lectura(){
        
        try{
            File a = new File("tienda/productos.txt");
            FileReader fr = new FileReader(a);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int c = 0;
            line = br.readLine();
            while(line != null){
                c ++;
                p[c].codPrd = line;
                line = br.readLine();
                p[c].producto = line;
                line = br.readLine();
                p[c].c = Integer.valueOf(line);
                line = br.readLine();
                p[c].prec = Double.valueOf(line);
                line = br.readLine();
                p[c].grab = Boolean.valueOf(line);
                line = br.readLine();
            }
            
            fr.close();
            NR = c;
        }
        
        catch(IOException e){
            
        }
    }
    
    public static String line(){
        String b = "===============================================================";
        return b;
    }

    public static void main(String[] args) {
        Inicializa();
        datos();
        Lectura();
        calculos();
        imprimeTabla();
        Escritura();
    }
}