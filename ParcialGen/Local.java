package ParcialGen;

public class Local extends Producto {
    //atributos de instancia
    protected float costoProd;
    //constructor
    public Local(int i,int pri,float pre,float c){
        super(i, pri, pre);
        costoProd=c;
    }
    //consultas
    public float obtenerCostoProd(){
        return costoProd;
    }
    public boolean equals(Producto p){
        boolean eq=false;
        if(this.getClass()==p.getClass()){
            Local l=(Local)p;
            eq=this.equals(p) && costoProd==l.obtenerCostoProd();
        }
        return eq;
    }
    public float determinarCosto(){
        return costoProd+(70*precio)/100;
    }
    //comandos
    public void establecerCostoProd(float c){
        if(c>0)
        costoProd=c;
    }
}
