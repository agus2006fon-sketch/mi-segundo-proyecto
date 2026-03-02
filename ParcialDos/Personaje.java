package ParcialDos;

abstract public class Personaje {
    //atrbitups de instancia
    protected int salud;
    protected int fuerza;
    //constructor
    public Personaje(int s,int f){
        salud=s;
        fuerza=f;
    }
    //consultas
    public int obtenerSalud(){
        return salud;
    }
    public int obtenerFuerza(){
        return fuerza;
    }
    public boolean equals(Personaje p){
        boolean eq=false;
        if(this.getClass()==p.getClass()){
            eq=salud==p.obtenerSalud() && fuerza==p.obtenerFuerza();
        }
        return eq;
    }
    //comandos
    public void recibirAtaque(int d){
        salud=salud-d;
        if(salud<0){
            salud=0;
        }
    }
    public void atacar(Personaje p){
        if(p.obtenerFuerza()<fuerza){
            p.recibirAtaque(fuerza);
        }
    }
}
