package segundofinal;

public class Tanque extends Elemento {
    //atributos de instancia
    protected float peso;
    protected boolean blindado;
    protected int energia;
    //constructor
    public Tanque(float p,boolean b){
        if(p>=0)
            peso=p;
        blindado=b;
        energia=1000;
    }
    //consultas
    public int obtenerEnergia(){
        return energia;
    }
    public boolean estaBlindado(){
        return blindado;
    }
    public float obtenerPeso(){
        return peso;
    }
    //comandos
    public void recibirAtaque(){
        if(blindado){
            energia=energia-50;
        }else{
            if(peso>energia){
                energia=energia-100;
            }else{
                energia=energia-200;
            }
        }
        if(energia<0)
            energia=0;
    }
    public boolean equals(Elemento e){
        boolean eq=false;
        if(this.getClass()==e.getClass()){
            Tanque t=(Tanque)e;
            eq=this.energia==t.obtenerEnergia() &&
               this.peso==t.obtenerPeso() &&
               this.blindado==t.estaBlindado();
        }
        return eq;
    }
}
