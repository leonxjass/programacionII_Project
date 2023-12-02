/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.archivosbinarios865;

/**
 *
 * @author leonj
 */
public class empleado {
    String nombreEmpleado;
    String codigoEmpleado;
    int edad;
    double sueldo;
    
    public empleado(){
        nombreEmpleado = "empleado";
        codigoEmpleado = "null";
        edad = 0;
        sueldo = 0;
    }
    
    void guardarRegistro(String nombre, String codigo, int edad, double sueldo){
        this.nombreEmpleado = nombre;
        this.codigoEmpleado = codigo;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    
    public void ImprimeRegistro(){
        String f1,f2,f3,f4,f;
        f1="%-5s";  f2="%-15s"; f3="%-5d"; f4="%-7.2f";
        f = f1 + f2 + f3 + f4 + "\n";
        System.out.format(f,codigoEmpleado,nombreEmpleado,edad,sueldo);
    }
    
}
