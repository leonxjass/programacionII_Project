/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication82;

/**
 *
 * @author tguca-L01
 */
public class tablaProductosGUI {
    
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
        p[6].guardaRegistro("P06", "PASTA(4OZ)", 2, 8.20, true);
        NR=5;
    }
    
    public static void calculos(){
        for(int m=0; m<=NR;m++)
            p[m].calcular();
    }
    
    public static void imprimeTabla(){
        System.out.println("CP"+"\t"+"PRODUCTO"+"\t"+"CANTIDAD"+"\t"+"PRECIO"+"\t"+"GRABABILIDAD"+"\t"+"Sub.T"+"\t"+"Impuesto"+ "   Total");
        System.out.println(line());
        for(int k=1; k<=NR;k++)
            p[k].imprimeRegistro();
        System.out.println(line());
    }
    
    public static String line(){
        String b = "===============================================================";
        return b;
    }

    public static void main(String[] args) {
        Inicializa();
        datos();
        calculos();
        imprimeTabla();
    }

}

