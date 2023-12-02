/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.archivosbinarios865;
import java.io.*;
/**
 *
 * @author leonj
 */



public class ArchivosBinarios {
   
    public static empleado[] e = new empleado[20];
    public static int NR=0;
    
    public static void inicializa(){
        for(int i=0; i<=19;i++){
            e[i] = new empleado();
        }
    }
    
    public static void Datos(){
        e[1].guardarRegistro("E01","Juan", 22, 12000.00);
        e[2].guardarRegistro("E02","Roberto", 32, 9000.00);
        e[3].guardarRegistro("E03","Lucía", 27, 14000.00);
        e[4].guardarRegistro("E04","Dania", 25, 11000.00);
        e[5].guardarRegistro("E05","Glenda", 23, 15000.00);
        NR=5;
    }
    
    public static void imprimeTabla(){
        
        System.out.println("Nombre Cod Edad  Sueldo");
        System.out.println("==================================");
        for(int k=1;k<=NR;k++)
            e[k].ImprimeRegistro();
        System.out.println("==================================");
    }
    
    public static void escritura(){
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try{
            fos = new FileOutputStream("C:/Users/leonj/Desktop/tienda/empleados.Dat"); //\Users\leonj\Desktop
            dos = new DataOutputStream(fos);
            
            for(int i=0; i<=NR; i++){
                dos.writeUTF(e[i].codigoEmpleado);
                dos.writeUTF(e[i].nombreEmpleado);
                dos.writeInt(e[i].edad);
                dos.writeDouble(e[i].sueldo);
            }
            fos.close();
        }catch(IOException e){
            System.out.println("Error de escritura");
        }
    }
    
    public static void lectura(){
        
        FileInputStream fis = null;
        DataInputStream dis = null; // <--Esta es la variable que lee
        int k=0;
        
        try{
            fis = new FileInputStream("C:/Users/leonj/Desktop/tienda/empleados.Dat"); //\Users\leonj\Desktop
            dis = new DataInputStream(fis);
            
            while(dis.available()>0){
                k+=1;
                e[k].codigoEmpleado = dis.readUTF();
                e[k].nombreEmpleado = dis.readUTF();
                e[k].edad = dis.readInt();
                e[k].sueldo = dis.readDouble();
            }
            dis.close();
            NR=k; // < = ImprimeTabla depende del valor de NR para imprimir los datos
            
        }catch(IOException e){
            System.out.println("Error de Lectura de Datos");
        }
    }
    
    
    public static void main(String[] args) {
        inicializa();
        //Datos();
        //escritura();
        lectura();
        imprimeTabla();
    }
}