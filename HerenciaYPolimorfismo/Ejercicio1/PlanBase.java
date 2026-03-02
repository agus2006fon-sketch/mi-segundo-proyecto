package HerenciaYPolimorfismo.Ejercicio1;
public class PlanBase {
    //atributos de instancia
    protected int usuarios;
    protected int base;
    //constructor
    public PlanBase(int u,int b){
        usuarios=u;
        base=b;
    }
    //consultas
    public int obtenerUsuarios(){
        return usuarios;
    }
    public int obtenerBase(){
        return base;
    }
    public int obtenerCostoPlan(){
        return (base*2)+usuarios*10;
    }
}
