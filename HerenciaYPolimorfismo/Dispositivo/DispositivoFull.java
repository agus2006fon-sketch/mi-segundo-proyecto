package HerenciaYPolimorfismo.Dispositivo;

public class DispositivoFull extends Dispositivo {
    //atributos de instancia
    private float p3;
    private float p4;
    //constructor
    public DispositivoFull(float pU,float pD,float pT,float pC){
        super(pU, pD);
        p3=pT;
        p4=pC;
    }
    public void establecerP3(float p){
        p3=p;
    }
    public void establecerP4(float p){
        p4=p;
    }
    //consultas
    public float obtenerP3(){
        return p3;
    }
    public float obtenerP4(){
        return p4;
    }
    public boolean riesgo(){
        return p2>p1 || p4>p3;
    }
    public boolean emergencia(){
        return p4<max;
    }
    public boolean equals(Dispositivo d){
        boolean eq=false;
        if(this.getClass()==d.getClass()){
            DispositivoFull e=(DispositivoFull)d;
            eq=super.equals(d) && p3==e.obtenerP3() && p4==e.obtenerP4();
        }
        return eq;
    }
}
