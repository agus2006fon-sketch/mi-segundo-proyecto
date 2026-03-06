package Genericidad.ejercicio1y3;

public class Empleado extends Elemento {
    //atributos de instancia
    protected int legajo;
    protected String nombre;
    protected int cantHoras;
    protected float valorHora;
    //constructor
    public Empleado(int leg,String nombre,int canth,float valorh){
        legajo=leg;
        this.nombre=nombre;
        cantHoras=canth;
        valorHora=valorh;
    }
    //consultas
    public int obtenerLegajo(){
        return legajo;
    }
    public float obtenerSueldo(){
        return cantHoras*valorHora;
    }
    public int obtenerCantHoras(){
        return cantHoras;
    }
    public float obtenerValorHoras(){
        return valorHora;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public boolean esEquivalente(Elemento e){
        boolean eq=false;
        Empleado em=(Empleado)e;
        eq=em.obtenerCantHoras()==this.cantHoras &&
           em.obtenerLegajo()==this.legajo &&
           em.obtenerNombre()==this.nombre &&
           em.obtenerValorHoras()==this.valorHora;
        return eq;
    }
    public boolean esMayor(Elemento e){
        Empleado em=(Empleado)e;
        return em.obtenerLegajo()>legajo; 
    }

}
