package HerenciaYPolimorfismo.Ejercicio1;

public class PromocionPymes extends PlanBase{
    //atributos de instancia
    protected boolean activa;
    //constructor
    public PromocionPymes(int u,int b){
        super(u, b);
        activa=true;
    }
    //comandos
    public void cambiarActiva(){
        if (activa) {
         activa=false;   
        }else
            activa=true;
    }
    //consultas
    public boolean estaActiva(){
        return activa;
    }
    public int costoPlan(){
        int r;
        if(activa){
            r=base;
        }else{
            r=base+usuarios*5;
        }
        return r;
    }
}
