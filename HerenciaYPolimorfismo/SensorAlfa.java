package HerenciaYPolimorfismo;

public class SensorAlfa extends Sensor {
    //atributos de instancia
    protected float p3;
    protected float p4;
    //constructor
    public SensorAlfa(float pU,float pD,float pT,float pC){
        super(pD, pC);
        p3=pT;
        p4=pC;
    }
    //comandos
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
    public boolean equals(Sensor s){
        boolean eq=false;
        if(this.getClass()==s.getClass()){
            SensorAlfa sA=(SensorAlfa)s;
            eq=super.equals(s) && p3==sA.obtenerP3() && p4==sA.obtenerP4();
        }
        return eq;
    }
    public SensorAlfa clone(){
        SensorAlfa clon=new SensorAlfa(p3, p3, p4, p3);
        return clon;
    }
}
