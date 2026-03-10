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

        B.insertar(new Punto(3, 0));
        B.insertar(new Punto(2, 4));
        B.insertar(new Punto(5, 4));
        B.insertar(new Punto(2, 2));
        B.insertar(new Punto(3, 6));

        System.out.println("A.esEquivalente(B) es verdadero sí y solo sí A.incluido(B) y B.incluido(A) son verdadero");
        System.out.println("A.incluido(B)=true , "+A.incluido(B));
        System.out.println("B.incluido(A)=true , "+B.incluido(A));
        System.out.println("A.esEquivalente(B)="+A.esEquivalente(B));

        System.out.println();

        System.out.println("A.esEquivalente(B) es verdadero sí y solo sí A.diferencia(B) y B.diferencia(A) son el conjunto vacío.");
        Conjunto AdifB=A.diferencia(B);
        Conjunto BdifA=B.diferencia(A);
        System.out.println("AdifB.vacio()=true, rta recibida="+AdifB.vacio());
        System.out.println("Bdif.vacio()=true, rta recibida="+BdifA.vacio());
        boolean ld=AdifB.vacio() && BdifA.vacio();
        System.out.println("A.esEquivalente(B)=true y A.diferencia(B) y B.diferencia(A) son el conjunto vacío, rta recibida="+(ld==A.esEquivalente(B)));

        System.out.println();

        System.out.println("A.disjunto(B) es verdadero sí y solo sí A.interseccion(B) es el conjunto vacío");
        boolean AintB=A.interseccion(B).vacio();
        System.out.println("A.interseccion(B)=false, rta recibida="+AintB);
        System.out.println("A.disjunto(B)=true y A.interseccion(B).vacio()=true, rta recibida="+(A.disjunto(B)==AintB));

        System.out.println();

        System.out.println("A.disjunto(B) es verdadero sí y solo sí la cardinalidad de A.union(B) es igual a la cardinalidad de A más la cardinalidad de B.");
        Conjunto AunionB=A.union(B);
        int card=AunionB.cardinalidad();
        int cardA=A.cardinalidad();
        int cardB=B.cardinalidad();
        System.out.println("A.disjunto(B)=false, rta recibida="+A.disjunto(B));
        System.out.println("A.union(B)="+AunionB);
        System.out.println("cardinalidad de A="+cardA + " cardinalidad de B="+cardB);
        System.out.println("cardinalidad de A.union(B)="+card);
        boolean ladoDerecho = (card == (cardA + cardB));
        System.out.println("se cumple?"+(A.disjunto(B) == ladoDerecho));

        System.out.println();

        System.out.println("A.union(B) es igual a la unión de A.diferencia(B), A.intersección(B) y B.diferencia(A)");
        Conjunto unionDif=A.diferencia(B).union(B.diferencia(A));
        Conjunto unionTot=unionDif.union(A.interseccion(B));
        System.out.println("A.union(B)==unionTotal (true), rta recibida="+(AunionB.esEquivalente(unionTot)));

        System.out.println();
        
        
    }
}
