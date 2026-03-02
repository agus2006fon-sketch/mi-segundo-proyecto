package ParcialGen;

abstract public class Producto {
    //atributos de instancia
    protected int id;
    protected float precio;
    protected int prioridad;
    //constructor
    public Producto(int i,int pri,float pre){
        id=i;
        precio=pre;
        if(pri>=1 && pri<=3){ 
          prioridad=pri;
        }else
            prioridad=3;

    }
    //consultas
    public int obtenerId(){
        return id;
    }
    public float obtenerPrecio(){
        return precio;
    }
    public int obtenerPrioridad(){
        return prioridad;
    }
    public boolean equals(Producto p){
        return id==p.obtenerId() && precio==p.obtenerPrecio() && prioridad==p.obtenerPrioridad();
    }
    abstract public float determinarCosto();
    public float determinarMargenGanancia(){
        return precio-this.determinarCosto();
    }
    // comandos
    public void establecerPrecio(float p){
        if(p>0){
            precio=p;
        }
    }
    public void establecerPrioridad(int p){
        if(p>=1 && p<=3){ 
          prioridad=p;
        }else
            prioridad=3;    
    }
}
