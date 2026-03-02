package HerenciaYPolimorfismo.ejercicio7;

public class Departamento extends Alojamiento {
    //atributos de instancia
    protected int ambientes;
    protected boolean balcon;
    //constructor
    public Departamento(int id,int p,int a,boolean b){
        super(id,p);
        if(a>0)
          ambientes=a;
        balcon=b;
    }
    //consultas
    public boolean tieneBalcon(){
        return balcon;
    }
    public float costoDiario(int p){
        float cd=ambientes*p;
        if (balcon) {
            cd+=150;
        }
        return cd;
    }
}
