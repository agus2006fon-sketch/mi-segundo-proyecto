package HerenciaYPolimorfismo.Rubrica;

public class Rubrica {
    // atributos de instancia
    protected int legajo;
    protected int comunicacion;
    protected int autonomia;
    protected int responsabilidad;
    // constructor
    public Rubrica(int l,int c,int a,int r){
        legajo=l;
        comunicacion=c;
        responsabilidad=r;
        autonomia=a;
    }
    // comandos
    public void establecerComunicacion(int p){
        comunicacion=p;
    }
    public void establecerAutonomia(int p){
        autonomia=p;
    }
    public void establecerResponsabilidad(int p){
        responsabilidad=p;
    }
    // consultas
    public int obtenerLegajo(){
        return legajo;
    }
    public int obtenerComunicacion(){
        return comunicacion;
    }
    public int obtenerAutonomia(){
        return autonomia;
    }
    public int obtenerResponsabilidad(){
        return responsabilidad;
    }
    public String toString(){
        return ("legajo:"+legajo+" comunicacion:"+comunicacion+" responsabilidad:"+responsabilidad+" autonomia:"+autonomia);
    }
    public int total(){
        return legajo+comunicacion+responsabilidad+autonomia;
    }
    public float promedio(){
        return (legajo+comunicacion+responsabilidad+autonomia)/4;
    }
    public float productividad(){
        return (2*comunicacion)+(3*autonomia)+(5*responsabilidad);
    }
}
