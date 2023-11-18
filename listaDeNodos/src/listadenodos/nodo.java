/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadenodos;

/**
 *
 * @author tguca-L01
 */
public class nodo {
    int info;
    nodo anterior;
    nodo siguiente;
    
    //constructor por defecto
    public nodo(){
        int info=0;
        nodo anterior= null;
        nodo siguiente= null;
    }
    
    void conectar(nodo z){
        //conecta el nodo actual con el nodo z
        siguiente = z;
        //conecta el nodo actual con el nodo z
        z.anterior = this;
    }
}
