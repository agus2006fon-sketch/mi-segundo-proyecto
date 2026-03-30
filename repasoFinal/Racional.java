package repasoFinal;

public class Racional extends Elemento{
    //atributos de instancia
    protected int num;
    protected int den;
    //constructor
    public Racional(int n,int d){
        if(n>=0 && den>=0){
            num=n;
            den=d;
        }
    }
    //comandos
    public void establecerNum(int n){
        if(n>=0)
        num=n;
    }
    public void establecerDen(int d){
        if(d>=0)
            den=d;
    }
    //consultas
    public int obtenerNum(){
        return num;
    }
    public int obtenerDen(){
        return den;
    }
    public boolean esComplemento(Elemento e){
        boolean es=false;
        int numerador;
        int denominador;
        if(this.getClass()==e.getClass()){
            Racional r=(Racional)e;
            numerador=r.obtenerNum();
            denominador=r.obtenerDen();
            es=(numerador*num)==(denominador*den);
        }
        return es;
    }
    public boolean esNeutro(){
        boolean es=false;
        es=num==1 || den==1;
        return es;
    }
}
