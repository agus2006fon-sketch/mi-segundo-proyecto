package repasoFinal;

public class TesterMatrizRacional {
    public static void main(String a[]){
        MatrizRacional mr=new MatrizRacional(3, 4);
        mr.establecer(0, 0, new Racional(3, 3));
        mr.establecer(0, 1, new Racional(1, 1));
        mr.establecer(0, 2, new Racional(2, 4));
        mr.establecer(0, 3, null);
        
        mr.establecer(1, 0, new Racional(3, 3));
        mr.establecer(1, 1, new Racional(2, 2));
        mr.establecer(1, 2, new Racional(6, 6));
        mr.establecer(1, 3, new Racional(5, 3));

        mr.establecer(2, 0, new Racional(3, 3));
        mr.establecer(2, 1, new Racional(5, 5));
        mr.establecer(2, 2, new Racional(2, 4));
        mr.establecer(2, 3, null);
        
       System.out.println("servicio columnasConUnos()");
       System.out.println("caso 1:n=3, cumple solo 2");
       System.out.println(mr.columnasConUnos(3));
       System.out.println("caso 2:n=2, cumplen  2");
       System.out.println(mr.columnasConUnos(2));
       System.out.println("caso 3:n=4, hay 0");
       System.out.println(mr.columnasConUnos(4));

       for(int i=0;i<mr.cantFilas();i++){
        for(int j=0;j<mr.cantCol();j++){
            if(mr.obtener(i, j)!=null){
                Racional r=(Racional)mr.obtener(i, j);
                System.out.print(r.obtenerNum()+"/"+r.obtenerDen()+" ");
            }else
                System.out.print(" n ");
        }
                System.out.println("   ");
       }
    }
}
