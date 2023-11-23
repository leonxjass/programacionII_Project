
package listadenodos;

public class ListaDeNodos {

    public static void main(String[] args) {
        
        int[] datos = {0,69,45,73,25,96,87,35,52,47,80};
        nodo p1,p2,p;
        p1=p2=p=null;
        nodo A = new nodo();
        
        //declarando el nodo
        for(int i=1;i<=10;i++){
        A = new nodo();
        A.info = datos[i];
        if(i==1){
            p1 = A; p=A; p2=A;
        }else{    
            p.conectar(A);
            p = p.siguiente;
            p2=A;}
        }
        
//        A = new nodo();
//        A.info = datos[3];
//        p.conectar(A);
//        p = p.siguiente;
//        p2=A;
        
        p=p1;
        //haciendo saltar al nodo
        while(p!=null){
        System.out.print(p.info+",  ");
        p=p.siguiente;
        }
        
        int NR = datos.length-1;
        
        System.out.println("\n==============================================");
        System.out.println("Numero de registros:>>" + NR);
        System.out.println("==============================================");
        
        p=p2;
        while(p!=null){
        System.out.print(p.info+",  ");
        p=p.anterior;
        }

//imprimiendo cada nodo manual        
//        System.out.println(p.siguiente.info);
//        System.out.println(p.siguiente.siguiente.info);
//        System.out.println(p.siguiente.siguiente.siguiente.info);
//        System.out.println(p.siguiente.siguiente.siguiente.siguiente.info);
//        System.out.println(p.siguiente.siguiente.siguiente.siguiente.siguiente.info);
//        System.out.println(p.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.info);
//        System.out.println(p.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.info);
//        System.out.println(p.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.info);
        
        System.out.println("");
    }
    
}
