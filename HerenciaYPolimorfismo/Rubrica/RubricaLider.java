package HerenciaYPolimorfismo.Rubrica;

public class RubricaLider extends Rubrica {
    //atributos de instancia
    protected int gestionConflictos;
    protected int gestionCambios;
    //constructor
    public RubricaLider(int l,int c,int a,int r,int go,int ga){
        super(l, c, ga, r);
        gestionCambios=ga;
        gestionConflictos=go;
    }
    //comandos
    public void establecerConflictos(int p){
        gestionConflictos=p;
    }
    public void establecerCambios(int p){
        gestionCambios=p;
    }
    //consultas
    public int obtenerConflictos(){
        return gestionConflictos;
    }
    public int obtenerCambios(){
        return gestionCambios;
    }
    public String toString(){
        return ("gestion conflictos:"+gestionConflictos+" gestion cambios:"+gestionCambios);
    }
    public int total(){
        return legajo+comunicacion+responsabilidad+autonomia+gestionCambios+gestionConflictos;
    }
    public float promedio(){
        return (legajo+comunicacion+responsabilidad+autonomia+gestionCambios+gestionConflictos)/5;
    }
    
}
