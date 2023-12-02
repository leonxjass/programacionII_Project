/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo865;

/**
 *
 * @author leonj
 * Ejemplo de sobrecarga de metodos, con el atributo precio
 * super(); llama al constructor de la clase papá
 * 
 */
public class articulo {
    private double precio;
    
    public articulo(){
        precio = 0;
    };
    
    void setPrecio(){
        this.precio = 3.50;
    }
    
    void setPrecio(double precio){
        this.precio = precio;
    }
    
    void setPrecio(double costo, double porcentajeDeGanancia){
        this.precio = costo * porcentajeDeGanancia;
    }

    public double getPrecio() {
        return precio;
    }
}
