package segundofinal;

public class TanqueEspecial extends Tanque {
    private int poderBlindaje;
    //constructor
    public TanqueEspecial(float p,boolean b,int pb){
        super(pb, b);
        poderBlindaje=pb;
    }
    //consultas
    public int obtenerPoderBlindaje(){
        return poderBlindaje;
    }
    public boolean equals(Elemento e){
        boolean eq=false;
        if(this.getClass()==e.getClass()){
            TanqueEspecial te=(TanqueEspecial)e;
            eq=super.equals(te) &&
               this.poderBlindaje==te.obtenerPoderBlindaje();
        }
        return eq;
    }
    //comando
    public void recibirAtaque(){
        if(poderBlindaje!=peso){
            this.recibirAtaque();
        }
    }
}
