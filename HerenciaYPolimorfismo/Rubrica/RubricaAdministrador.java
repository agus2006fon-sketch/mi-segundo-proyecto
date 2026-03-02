package HerenciaYPolimorfismo.Rubrica;

public class RubricaAdministrador extends RubricaLider {
    //atributos de instancia
    protected int proyectos;
    //constructor
    public RubricaAdministrador(int l,int c,int a,int r,int go,int ga,int p){
        super(l, c, a, r, go, ga);
        proyectos=p;
    }
    //comandos
    public void aumentarProyectos(int p){
        proyectos=proyectos+p;
    }
    //consultas
    public int obtenerProyectos(){
        return proyectos;
    }
    public String toString(){
        return ("proyectos:"+proyectos);
    }
    public float productividad(){
        return 4*((legajo+comunicacion+responsabilidad+autonomia+gestionCambios+gestionConflictos+proyectos)/6)+proyectos*10;
    }
}
