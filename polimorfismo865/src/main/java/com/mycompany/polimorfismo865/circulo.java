/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo865;

/**
 *
 * @author leonj
 */
public class circulo extends figura {
    double radio;
    
    public circulo(){
        super();
    }
    
    public void calcularArea(){
        area = Math.PI*Math.pow(radio,2);
    }
    
    public void calcularPerimetro(){
        perimetro = 2*Math.PI*radio;
    }
}
