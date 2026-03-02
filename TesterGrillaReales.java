public class TesterGrillaReales {
    public static void main(String a[]){
        GrillaReales gr1=new GrillaReales(4, 4);

        gr1.establecerReal(0, 0, 5);
        gr1.establecerReal(0, 1, 32);
        gr1.establecerReal(0, 2, 8);
        gr1.establecerReal(0, 3, 44);
        gr1.establecerReal(1, 0, 23);
        gr1.establecerReal(1, 1, 3);
        gr1.establecerReal(1, 2, 72);
        gr1.establecerReal(1, 3, 4);
        gr1.establecerReal(2, 0, 21);
        gr1.establecerReal(2, 1, 7);
        gr1.establecerReal(2, 2, 6);
        gr1.establecerReal(2, 3, 13);
        gr1.establecerReal(3, 0, 34);
        gr1.establecerReal(3, 1, 61);
        gr1.establecerReal(3, 2, 8);
        gr1.establecerReal(3, 3, 21);

        //mostrar matriz
    for(int f=0;f<gr1.cantFilas();f++){ 
        for(int c=0;c<gr1.cantColumnas();c++){ 
         System.out.print(gr1.obtenerReal(f,c)+"\t"); 
        }
        System.out.println();
    }
    System.out.println("metodo reemplazar(r1,r2):21,27");
    gr1.reemplazar(21, 67);
    for(int f=0;f<gr1.cantFilas();f++){ 
        for(int c=0;c<gr1.cantColumnas();c++){ 
         System.out.print(gr1.obtenerReal(f,c)+"\t"); 
        }
        System.out.println();
    }
    System.out.println("metodo reemplazar(r2,r2,f):8,76,3");
    gr1.reemplazar(8, 76, 3);
    for(int f=0;f<gr1.cantFilas();f++){ 
        for(int c=0;c<gr1.cantColumnas();c++){ 
         System.out.print(gr1.obtenerReal(f,c)+"\t"); 
        }
        System.out.println();
    }
    System.out.println("metodo intercambiar fila:2,3");
    gr1.intercambiarFilas(2, 3);
    for(int f=0;f<gr1.cantFilas();f++){ 
        for(int c=0;c<gr1.cantColumnas();c++){ 
         System.out.print(gr1.obtenerReal(f,c)+"\t"); 
        }
        System.out.println();
    }

    System.out.println("cantidad mayores:72,0");
    gr1.cantidadMayores(72);
    System.out.println("cantidad mayores:13,8");
    gr1.cantidadMayores(13);
    System.out.println("cantidad mayores:3,1");
    gr1.cantidadMayores(3);

    System.out.println("esta num,1,false");
    System.out.println(gr1.estaNum(1));
    System.out.println("esta num,67,true");
    System.out.println(gr1.estaNum(67));

        System.out.println("hayNMayoresConsecutivos(n:entero,r:real): 1,20:true");
            System.out.println(gr1.hayNMayoresConsecutivos(3, 6));

        System.out.println("hayNMayoresConsecutivos(n:entero,r:real): 3,20:false");
                    System.out.println(gr1.hayNMayoresConsecutivos(3, 20));
   }
}
