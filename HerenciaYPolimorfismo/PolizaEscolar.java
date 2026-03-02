package HerenciaYPolimorfismo;

public class PolizaEscolar extends Poliza{
    //atributos de instancia
    protected int cantAlumnos;
    protected int cantDocentes;
    //constructor
    public PolizaEscolar(int np){
        super(np);
        cantAlumnos=0;
        cantDocentes=0;
    }
    public PolizaEscolar(int np,float i,float r,int ca,int cd){
        super(np, i, r);
        cantAlumnos=ca;
        cantDocentes=cd;
    }
    //comandos
    public void establecerCantAlumnos(int n){
        cantAlumnos=n;
    }
    public void establecerCantDocentes(int n){
        cantDocentes=n;
    }
    // consultas
    public int obtenerCantAlumnos(){
        return cantAlumnos;
    }
    public int obtenerCantDocentes(){
        return cantDocentes;
    }
    public float obtenerCostoPoliza(int p){
        return obtenerCostoPoliza()+(cantAlumnos*p*1.5f)+(cantDocentes*p);
    }
}
