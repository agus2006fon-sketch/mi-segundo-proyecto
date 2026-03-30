package tercerFinal;

public class TesterMatrizVectores {
    public static void main(String a[]){
        MatrizVectores mv=new MatrizVectores(4, 3);

        mv.establecerEnPos(0, 0, null);
        mv.establecerEnPos(0, 1, new Vector(3, 2, 5));
        mv.establecerEnPos(0, 2, new Vector(5, 4, 3));
        
        mv.establecerEnPos(1, 0, new Vector(0, 0, 0));
        mv.establecerEnPos(1, 1, new Vector(0, 0, 0));
        mv.establecerEnPos(1, 2, new Vector(0, 0, 0));

        mv.establecerEnPos(2, 0, new Vector(0, 0, 0));
        mv.establecerEnPos(2, 1, new Vector(1, 3, 3));
        mv.establecerEnPos(2, 2, new Vector(3, 0, 2));

        mv.establecerEnPos(3, 0, new Vector(2, 3, 0));
        mv.establecerEnPos(3, 1, null);
        mv.establecerEnPos(3, 2, new Vector(0, 0, 0));
        
        System.out.println("verificacion del metodo siempreCero()");
        System.out.println("caso 1: retorna true");
        System.out.println(mv.siempreCero());
        System.out.println("caso 2:anulamos un elemento en fila con la condicion; retorna true");
        mv.establecerEnPos(1, 0, null);
        System.out.println(mv.siempreCero());
        System.out.println("caso 3: retorna false, hago en la fila con la condicion un vector diferente");
        mv.establecerEnPos(1, 1, new Vector(1, 2, 3));
        System.out.println(mv.siempreCero());



    }
}
