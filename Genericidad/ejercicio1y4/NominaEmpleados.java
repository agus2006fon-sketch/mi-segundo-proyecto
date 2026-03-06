package Genericidad.ejercicio1y3;

public class NominaEmpleados extends Coleccion {
    //constructor
    public NominaEmpleados(int n){
        super(n);
    }
    //consultas
    public int contarSupHoras(int h){
        int cont=0;
        for(int i=0;i<cant;i++){
            Empleado e=(Empleado)col[i];
            if(e.obtenerCantHoras()>h){
                cont++;
            }
        }
        return cont;
    }
    public float sumarSueldos(){
        float suma=0;
        for(int i=0;i<cant;i++){
            Empleado e=(Empleado)col[i];
            suma+=e.obtenerSueldo();
        }
        return suma;
    }

}
