package HerenciaYPolimorfismo;

public class PolizaFabrica extends Poliza {
    //atributos de instancia
    protected int cantOperarios;
    protected float valorEquipo;
    //constructor
    public PolizaFabrica(int np){
        super(np);
        cantOperarios=0;
        valorEquipo=0;
    }
    public PolizaFabrica(int np, float i,float r,int co,int ve){
        super(np, i, r);
        cantOperarios=co;
        valorEquipo=ve;
    }
    //comandos
    public void establecerCantOperarios(int n){
        cantOperarios=n;
    }
    public void establecerValorEquipo(int n){
        valorEquipo=n;
    }
    //consultas
    public int obtenerCantOperarios(){
        return cantOperarios;
    }
    public float obtenerValorEquipo(){
        return valorEquipo;
    }
    public float obtenerCostoPoliza(){
        return super.obtenerCostoPoliza()+(cantOperarios*500)+(valorEquipo*0.8f);
    }
}
