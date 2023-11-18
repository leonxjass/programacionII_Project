
package listadenodos;

public class ListaDeNodos {

    public static void main(String[] args) {
        
        //punteros a cada poscicion de los nodos 1(inicio), 2(final), 3(random)
        nodo p1,p2,p;
              
        nodo A1  = new nodo();
        nodo A2  = new nodo();
        nodo A3  = new nodo();
        nodo A4  = new nodo();
        nodo A5  = new nodo();
        nodo A6  = new nodo();
        nodo A7  = new nodo();
        nodo A8  = new nodo();
        nodo A9  = new nodo();
        nodo A10 = new nodo();
        
        p1 = A5;
        p= A5;
        p2=p1;
        
        A1.info=73;
        A2.info=96;
        A3.info=80;
        A4.info=52;
        A5.info=69;
        A6.info=87;
        A7.info=25;
        A8.info=35;
        A9.info=45;
        A10.info=47;
        
        //conectando nodos
        A5.conectar(A9);
        A9.conectar(A1);
        A1.conectar(A7);
        A7.conectar(A2);
        A2.conectar(A6);
        A8.conectar(A4);
        A4.conectar(A10);
        A10.conectar(A3);
        
        System.out.println(p1.info);
        System.out.println(p2.siguiente.info);
        System.out.println(A5.siguiente.siguiente.info);
        
        System.out.println("");
    }
    
}
