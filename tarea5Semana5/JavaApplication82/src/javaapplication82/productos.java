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
public class productos {
    String  codProducto;
    String  nombreProducto;
    int     cantidad;
    double  precio;
    boolean grababilidad;
    boolean calcGrababilidad = false;
    double subTotal = 0.0;
    double impuesto = 0.0;
    double total =0;
    
    /*//Definimos un constructor, esto nos sirve para saber el valor
    default del objeto*/
    
    public productos(){
    String  codProducto ="CC";
    String  nombreProducto = "NULL";
    int     cantidad = 00;
    double  precio =0.0;
    boolean grababilidad = false;
    }
    
    void calcular(){
        subTotal = precio*cantidad;
        
        if(grababilidad){
        impuesto = subTotal*0.15;}
        else{impuesto = subTotal*0.15;}
        total = subTotal*impuesto;
    }
    
    void guardaRegistro(String cp, String np, int cn, double pr, boolean gb){
         codProducto =cp;
         nombreProducto = np;
         cantidad = cn;
         precio = pr;
         grababilidad = gb;
    }
    
    void imprimeRegistro(){
        String f1,f2,f3,f4,f5,f6,f7,f8,f;
        f1 = "%-9s";
        f2 = "%-18s";
        f3 = "%-14d";
        f4 = "%-10.2f";
        f5 = "%-10b";
        f6 = "%-10.2f";
        f7 = "%-11.2f";
        f8 = "%-10.2f";
        f = f1+f2+f3+f4+f5+f6+f7+f8+"\n";
        System.out.printf(f,codProducto,nombreProducto,cantidad
                ,precio,grababilidad,subTotal,impuesto,total);
    }
}

