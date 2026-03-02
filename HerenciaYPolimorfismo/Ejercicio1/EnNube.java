package HerenciaYPolimorfismo.Ejercicio1;
public class EnNube extends PlanBase{
    //atributos de instancia
    protected int espacio;
    //constructor
    public EnNube(int u,int b,int e){
        super(u, b);
        espacio=e;
    }
    //consultas
    public int obtenerEspacio(){
        return espacio;
    }
    public int costoPlan(int p){
        return (espacio*p)+super.base+super.usuarios;
    }
}
