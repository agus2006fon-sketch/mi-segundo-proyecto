package Genericidad.ejercicio7;

public class Criatura extends Elemento {
    //atributos de clase
    private static int maxEnergia=1000;
    //atributos de instancia
    protected String nombre;
    protected int energia;
    //constructor
    public Criatura(String nom){
        nombre=nom;
        energia=maxEnergia;
    }
    //comandos
    public void jugar(){
        if(energia>0){
            energia--;
        }
    }
    //consultas
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerEnergia(){
        return energia;
    }
    public boolean equals(Elemento c){
        boolean eq=false;
        if(this.getClass()==c.getClass()){
            Criatura cr=(Criatura)c;
            eq=this.nombre==cr.obtenerNombre() && this.energia==cr.obtenerEnergia();
        }
        return eq;
    }
    public boolean complemento(Elemento c){
        boolean es=false;
        if(this.getClass()==c.getClass()){
            Criatura a=(Criatura)c;
            es=energia+a.obtenerEnergia()>maxEnergia;
        }
        return es;
    }
}
