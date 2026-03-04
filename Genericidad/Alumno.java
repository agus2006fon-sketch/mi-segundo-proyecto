package Genericidad;

public class Alumno extends Elemento {
    //atributos de clase
    protected int nroIngreso;
    protected String nombre;
    protected float promedio;
    //constructor
    public Alumno(int I,String n,float p){
        nroIngreso=I;
        nombre=n;
        promedio=p;
    }
    //consultas
    public int obtenerNroIngreso(){
        return nroIngreso;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public float obtenerPromedio(){
        return promedio;
    }
    public boolean esEquivalente(Elemento e){
        //Requiere que e sea de clase Alumno.
        Alumno a=(Alumno)e;
        return nroIngreso == a.obtenerNroIngreso() && 
               nombre == a.obtenerNombre() && 
               promedio == a.obtenerPromedio();
    }
    public boolean esMayor(Elemento e){
        Alumno a=(Alumno)e;
        return nroIngreso>a.obtenerNroIngreso() && promedio>a.obtenerPromedio();
    }
}
