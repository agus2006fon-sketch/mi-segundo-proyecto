package ParcialDos;

public class Zombie extends Personaje {
    //atributos de instancia
    protected int velocidad;
    protected boolean casco;
    //constructor
    public Zombie(int s,int f,int vel,boolean c){
        super(s, f);
        velocidad=vel;
        casco=c;
    }
    //consultas
    public int obtenerVelocidad(){
        return velocidad;
    }
    public boolean tieneCasco(){
        return casco;
    }
    public boolean equals(Personaje p){
        boolean eq=false;
        if(this.getClass()==p.getClass()){
            Zombie z=(Zombie)p;
            eq=this.equals(p) && velocidad==z.obtenerVelocidad() && casco==z.tieneCasco();
        }
        return eq;
    }
    //comandos
    public void recibirAtaque(int d){
        if(!casco){
            super.recibirAtaque(d);
        }else{
            super.recibirAtaque(d/2);
        }
    }
}
