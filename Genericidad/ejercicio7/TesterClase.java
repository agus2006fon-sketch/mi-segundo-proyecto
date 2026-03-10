package Genericidad.ejercicio7;

public class TesterClase {
    public static void main(String a[]){
        Tribu t1=new Tribu(6);

        Criatura c1=new Criatura("coco");
        Criatura c2=new Criatura("momo");
        Criatura c3=new Criatura("coco");
        Criatura c4=new Criatura("lolo");
        Criatura c5=new Criatura("pepe");

        t1.insertar(c1);
        t1.insertar(c2);
        t1.insertar(c3);
        t1.insertar(c4);
        t1.insertar(c5);

        System.out.println("metodo cantElementos y cant:");
        System.out.println("cantElementos=6, rta recibida="+t1.cantElementos());
        System.out.println("cant=4, rta recibida="+t1.cant);

        System.out.println();

        System.out.println("metodo hayTresDecreciente:");
        System.out.println("caso 1:true");

       for(int i=0;i<5;i++){
         c4.jugar();
        }
        for(int i=0;i<4;i++){
            c3.jugar();
        }
        for(int i=0;i<3;i++){
            c2.jugar();
        }
        System.out.println("t1.hayTresDecreciente()="+t1.hayTresDecrecientes());

        Tribu t2=new Tribu(8);
        Criatura c6=new Criatura("titi");
        t2.insertar(c1);
        t2.insertar(c5);
        t2.insertar(c6);

        c5.jugar();

        System.out.println("caso 2:false(no llega a tres)");
        System.out.println("t2.hayTresDecreciente="+t2.hayTresDecrecientes());
        System.out.println("caso 2:false(se pasa de tres)");
        Criatura c7=new Criatura("tete");
        t2.insertar(c7);
        t2.insertar(c2);
        t2.insertar(c3);
        c7.jugar();
        System.out.println("t2.hayTresDecreciente="+t2.hayTresDecrecientes());

        System.out.println("caso 2:false(se pasa de 1 secuencia)");
        Tribu t3=new Tribu(9);
        t3.insertar(c1);
        t3.insertar(c5);
        t3.insertar(c2);
        t3.insertar(new Criatura("lala"));
        t3.insertar(new Criatura("tata"));
        t3.insertar(c7);
        t3.insertar(c4);
        System.out.println("t3.hayTresDecreciente="+t3.hayTresDecrecientes());





       



    }
}
