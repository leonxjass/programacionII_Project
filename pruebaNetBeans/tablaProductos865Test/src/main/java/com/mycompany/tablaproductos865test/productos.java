/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tablaproductos865test;

/**
 *
 * @author leonj
 */
    public class productos {
    String  codPrd;
    String  producto;
    int     c;
    double  prec;
    boolean grab;
    boolean calcGrab = false;
    double subTotal = 0.0;
    double impuesto = 0.0;
    double total =0;
    
    public productos(){
    String  codProducto ="CC";
    String  nombreProducto = "NULL";
    int     cantidad = 00;
    double  precio =0.0;
    boolean grababilidad = false;
    }
    
    void calcular(){
        subTotal = prec*c;
        
        if(grab){
        impuesto = subTotal*0.15;}
        else{impuesto = subTotal*0.15;}
        total = subTotal*impuesto;
    }
    
    //metodo de escritura
    void guardaRegistro(String cp, String np, int cn, double pr, boolean gb){
         codPrd =cp;
         producto = np;
         c = cn;
         prec = pr;
         grab = gb;
    }
    
    //metodo de lectura
    void imprimeRegistro(){
        String f1,f2,f3,f4,f5,f6,f7,f8,f;
        f1 = "%-9s";
        f2 = "%-18s";
        f3 = "%-14d";
        f4 = "%-10.2f";
        f5 = "%-10b";
        f6 = "%-10.2f";
        f7 = "%-10.2f";
        f8 = "%-10.2f";
        f = f1+f2+f3+f4+f5+f6+f7+f8+"\n";
        System.out.printf(f,codPrd,producto,c
                ,prec,grab,subTotal,impuesto,total);
    }
}