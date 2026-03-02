package ej1TP3;

public class RefugioVip extends Refugio {
    // atributos de clase
    private static final int capacidadSillones=10;
    //atributos de instancia
    protected int sillones;
    //constructor
    public RefugioVip(int a,int b,int c,int s){
        super(a, b, c);
        sillones=s;
    }
    //comandos
    public boolean ocuparSillon(){
        boolean hay=false;
        if(sillones>0){
            sillones++;
            hay=true;
        }
        return hay;
    }
    public boolean desocuparSillon(){
        boolean hay=false;
        if(sillones==capacidadSillones){
            sillones--;
            hay=true;
        }
        return hay;
    }
    //consultas
    public int obtenerSillones(){
        return sillones;
    }
    public int disponibilidad(){
        return super.disponibilidad()+sillones;
    }
    public RefugioVip clone(){
        RefugioVip nuevo=new RefugioVip(alimentos, bebidas, camas, sillones);
        return nuevo;
    }
}
