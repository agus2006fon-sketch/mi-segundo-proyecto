public class TesterSecuenciaEnteros {
    public static void main(String []a){
        SecuenciaEnteros s1=new SecuenciaEnteros(12);
        
        s1.establecerEntero(1, 0);    // for(int i=0;i<s1.cantElementos();i++){
        s1.establecerEntero(2, 1);    //    s1.establecerEntero(2*i,i)
        s1.establecerEntero(3, 2);    //    }
        s1.establecerEntero(4, 3);
        s1.establecerEntero(5, 4);    //mostar por pantalla:
        s1.establecerEntero(6, 5);    // for(int i=0;i<s1.cantElementos();i++){ 
        s1.establecerEntero(7, 6);    //    System.out.print(print:impresion al lado)(s1.obtenerEntero(i));
        s1.establecerEntero(8, 7);    //    }
        s1.establecerEntero(9, 8);
        s1.establecerEntero(10, 9);
        s1.establecerEntero(11, 10);
        s1.establecerEntero(12, 11);


        System.out.println("la cantidad de elementos de s1 es:"+s1.cantElementos());

        for(int i=0;i<s1.cantElementos();i++){ 
            System.out.println("posicion: "+(i+1)+" contenido:"+s1.obtenerEntero(i));
        }
        System.out.println("comando reemplazar(n1,n2");
        s1.reemplazar(5, 1);
        System.out.println(s1.obtenerEntero(4));

        System.out.println("comando reemplazar(n");
        s1.reemplazar(11);
        System.out.println(s1.obtenerEntero(10));

        System.out.println("comando intercambiar");
        System.out.println(s1.intercambiar(4, 8));

        System.out.println("consulta estaNum;caso 1:5=true");
        System.out.println(s1.estaNum(3));
        System.out.println("consulta estaNum;caso 2:30=false");
        System.out.println(s1.estaNum(30));

        System.out.println("consulta cantidadMayores;caso 1:0=11");
        System.out.println(s1.cantidadMayores(0));
        System.out.println("consulta cantidadMayores;caso 2:6=5");
        System.out.println(s1.cantidadMayores(6));
        System.out.println("consulta cantidadMayores;caso 3:12=0");
        System.out.println(s1.cantidadMayores(12));
    }
}
