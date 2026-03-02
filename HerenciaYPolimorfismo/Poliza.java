package HerenciaYPolimorfismo;
public class Poliza {
    //atributos de instancia
    private int nroPoliza;
    private float incendio;
    private float robo;
    private boolean activa;
    //constructor
    public Poliza(int np){
        nroPoliza=np;
        incendio=0;
        robo=0;
        activa=true;
    }
    public Poliza(int np,float i,float r){
        nroPoliza=np;
        incendio=i;
        robo=r;
        activa=true;
    }
    //comandos
    public void establecerIncendio(float m){
        incendio=m;
    }
    public void establecerRobo(float m){
        robo=m;
    }
    public void establecerPorcentaje(int p){
        if(activa==true){
            this.incendio=incendio+(1*p)/100;
            this.robo=robo+(1*p)/100;
        }       
    }
    public void activar(){
        activa=true;
    }
    public void desactivar(){
        activa=false;
    }
    //consultas
    public int obtenerNroPoliza(){
        return nroPoliza;
    }
    public float obtenerIncendio(){
        return incendio;
    }
    public float obtenerRobo(){
        return robo;
    }
    public float obtenerCostoPoliza(){
        return incendio+robo;
    }
    public boolean estaActiva(){
        return activa;
    }
}
