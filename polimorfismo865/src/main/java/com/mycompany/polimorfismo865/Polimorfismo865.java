/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo865;

/**
 *
 * @author leonj
 */
public class Polimorfismo865 {

    public static void main(String[] args) {
        
//        articulo lapiz = new articulo();
//        
//        lapiz.setPrecio(20);
//        System.out.println(lapiz.getPrecio());
//        lapiz.setPrecio(10, 2);
//        System.out.println(lapiz.getPrecio());
//        lapiz.setPrecio();
//        System.out.println(lapiz.getPrecio());
        
        polimorfismoSobreEscritura();
    }
    
    public static void polimorfismoSobreEscritura(){
        circulo plato = new circulo();
        plato.radio = 15.00;
        plato.calcularArea();
        plato.calcularPerimetro();
        System.out.println("Area = " + plato.area);
        System.out.println("Perimetro = " + plato.perimetro);
    }
}
