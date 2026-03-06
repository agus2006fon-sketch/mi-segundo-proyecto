package Genericidad.ejercicio5;

public class Imagen extends MatrizGenerica {
    //constructor
    public Imagen(int n){
        super(n, n);
    }
    //consultas
    public boolean todosGrises(){
        boolean son=true;
        for(int fil=0;fil<cantFilas() && son;fil++){
            for(int col=0;col<cantColumnas() && son;col++){
                Color c=(Color)m[fil][col];
                if(c!=null && c.obtenerAzul()>=50 && c.obtenerAzul()<150 &&
                   c.obtenerRojo()>=50 && c.obtenerRojo()<150 && 
                   c.obtenerVerde()>=50 && c.obtenerVerde()<150){ 
                   son=true;
                   }else
                    son=false;
            }
        }
        return son;
    }

}
