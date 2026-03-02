package HerenciaYPolimorfismo.Dispositivo;

public class Dispositivo {
    //atributos de clase
    protected static final float max=0.01f;
    //atributos de instancia
    protected float p1;
    protected float p2;
    //constructor
    public Dispositivo(float pU,float pD){
        p1=pU;
        p2=pD;
    }
    //comandos
    public void establecerP1(float p){
        p1=p;
    }
    public void establecerP2(float p){
        p2=p;
    }
    public void copy(Dispositivo d){
        p1=d.obtenerP1();
        p2=d.obtenerP2();
    }
    //consultas
    public float obtenerP1(){
        return p1;
    }
    public float obtenerP2(){
        return p2;
    }
    public boolean riesgo(){
        return p2>p1;
    }
    public boolean emergencia(){
        return p1<max;
    }
    public boolean equals(Dispositivo d){
      boolean ig; 
      ig = p1 == d.obtenerP1() && p2 == d.obtenerP2() ; 
      return ig; 
    }
    public Dispositivo clone(){
        Dispositivo clon=new Dispositivo(p1,p2);
        return clon;
    }
    
}
