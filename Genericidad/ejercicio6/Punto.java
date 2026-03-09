package Genericidad.ejercicio6;

public class Punto extends Elemento{ 
    //atributos de instancia
    protected float x;    
    protected float y;    

    public Punto(float x, float y){
        this.x=x;
        this.y=y;
    }
    //comandos
    public void establecerX(float x){
        this.x=x;
    }
    public void establecerY(float y){
        this.y=y;
    }
    public void copy(Punto p){
        this.x=p.obtenerX();
        this.y=p.obtenerY();
    }
    //consultas
    public float obtenerX(){
        return x; 
    }
    public float obtenerY(){ 
        return y; 
    }
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    public double distancia(Punto p) {
        float dx= x - p.obtenerX();
        float dy= y - p.obtenerY();
        return Math.sqrt(dx*dx+dy*dy);
    }
    public boolean equals(Punto p){
        return ((x==p.obtenerX())&&(y==p.obtenerY()));
    }
    public Punto clone(){
        Punto p=new Punto(this.x,this.y);
        return p;        
    }
    public boolean esInverso(Punto p){
      /*Requiere p ligado.*/
      return (x == p.obtenerY() && y == p.obtenerX());
    }
    public boolean esEquivalente(Elemento e) {
        boolean iguales = false;
        // 1. Verificamos que el elemento que nos pasan sea realmente un Punto
        if (e != null && this.getClass() == e.getClass()) {
            Punto otroPunto = (Punto) e;
            // 2. Comparamos las coordenadas
            if (this.x == otroPunto.x && this.y == otroPunto.y) {
                iguales = true;
            }
        }
        return iguales;
    }
}