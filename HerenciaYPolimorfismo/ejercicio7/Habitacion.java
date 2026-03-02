package HerenciaYPolimorfismo.ejercicio7;

public class Habitacion extends Alojamiento {
    //atributos de instancia
    protected int camas;
    //constructor
    public Habitacion(int id,int p,int c){
        super(id,p);
        if(c>0)
        camas=c;
    }
    //consultas
    public int obtenerCamas(){
        return camas;
    }
    public float costoDiario(int p){
        return camas*(p/2);
    }
}
