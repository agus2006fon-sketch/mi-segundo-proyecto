package Genericidad.ejercicio6;

public class TesterConjunto {
    public static void main(String a[]){
        Conjunto A=new Conjunto(5);

        A.insertar(new Punto(3, 0));
        A.insertar(new Punto(2, 4));
        A.insertar(new Punto(5, 4));
        A.insertar(new Punto(2, 2));
        A.insertar(new Punto(3, 6));

        Conjunto B=new Conjunto(5);

        B.insertar(new Punto(5, 4));
        B.insertar(new Punto(2, 3));
        B.insertar(new Punto(6, 3));
        B.insertar(new Punto(3, 2));
        B.insertar(new Punto(4, 6));
    }
}
