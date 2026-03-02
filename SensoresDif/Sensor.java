package SensoresDif;
public class Sensor {
    //atributos de clase
    private  static final double max=0.01;
    //atributos de instancia
    public double p1;
    public double p2;
    //constructor
    public Sensor(double p1,double p2){
        this.p1=p1;
        this.p2=p2;
    }
    //comandos
    public void establecerP1(double p){
        if(p >=0){
            p1=p;
        }
    }
    public void establecerP2(double p){
        if(p >=0){
            p2=p;
        }
    }
    public void copy(Sensor s){
        if(s != null){
            p1=s.obtenerP1();
            p2=s.obtenerP2();
        }
    }
    //consultas
    public double obtenerP1(){
        return p1;
    }
    public double obtenerP2(){
        return p2;
    }
    public boolean riesgo(){
        boolean es=false;
        if(p2>p1){
            es=true;
        }
        return es;
    }
    public boolean emergencia(){
        boolean menor=false;
        if(p1<max){
            menor=true;
        }
        return menor;
    }
    public boolean equals(Sensor s){
        boolean ligado=false;
        if(s != null && p1==s.obtenerP1() && p2==s.obtenerP2()){
            ligado=true;
        }
        return ligado;
    }
    public Sensor clone(){
        Sensor cloneSensor=new Sensor(p1,p2);
        return cloneSensor;
    }
}
