package HerenciaYPolimorfismo.Rubrica;

public class RubricaProgrmador extends Rubrica {
    //atributos de instancia
    protected int lineasCodigo;
    //constructor
    public RubricaProgrmador(int l,int c,int a,int r,int lc){
        super(l,c,a,r);
        lineasCodigo=lc;
    }
    //comandos
    public void aumentarLineasCodigo(int p){
        lineasCodigo=lineasCodigo+p;
    }
    //consultas
    public int obtenerLineasCodigo(){
        return lineasCodigo;
    }
    public String toString(){
        return ("lineas de codigo:"+lineasCodigo);
    }
    public float productividad(){
        return (1.5f*comunicacion)+(3*autonomia)+(5*responsabilidad)+(lineasCodigo/10000);
    }
}
