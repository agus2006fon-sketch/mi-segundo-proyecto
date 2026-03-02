package HerenciaYPolimorfismo.ejercicio7;

abstract public class Alojamiento {
    //atributos de instancia
    protected int id;
    protected int personas;
    //constructor
    public Alojamiento(int id,int p){
        this.id=id;
        personas=p;
    }
    //consultas
    public int obtenerId(){
        return id;
    }
    public int obtenerPersonas(){
        return personas;
    }
    public String toString(){
        return ("id:"+id+" personas:"+personas);
    }
    abstract public float costoDiario(int p);
}
