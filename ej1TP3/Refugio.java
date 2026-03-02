package ej1TP3;
public class Refugio {
    //atributos de clase
    private static final int capacidadAlacena=20;
    private static final int cantidadCamas=10;
    //atributos de instancia
    protected int alimentos;
    protected int bebidas;
    protected int camas;
    //constructor
    public Refugio(int a,int b,int c){
        if(a+b>capacidadAlacena){
            alimentos=capacidadAlacena/2;
            bebidas=capacidadAlacena/2;
        }else{
            alimentos=a;
            bebidas=b;
        }if(c > cantidadCamas){
            camas=cantidadCamas;
        }else{
            camas=c;
        }
    }
    //comandos
    public void consumirAlimento(){
        alimentos--;
    }
    public void consumirBebida(){
        bebidas--;
    }
    public boolean ocuoparCama(){
        boolean ocupado=false;
        if(this.disponibilidad()>0){
            camas++;
            ocupado=true;
        }
        return ocupado;
    }
    public boolean desocuparCama(){
        boolean ocupado=false;
        if(camas>0){
            camas--;
            ocupado=true;
        }
        return ocupado;
    }
    public boolean reponerAlimentos(int n){
        boolean listo=false;
        if(n>0 && alimentos+bebidas+n<capacidadAlacena){
            alimentos=alimentos+n;
            listo=true;
        }else{
            if(n<0 || n+alimentos+bebidas+n>capacidadAlacena) 
                listo=false;
        }
        return listo;
    }
    public boolean reponerBebidas(int n){
        boolean listo=false;
        if(n>0 && bebidas+bebidas+n<capacidadAlacena){
            bebidas=bebidas+n;
            listo=true;
        }else{
            if(n<0 || n+alimentos+bebidas+n>capacidadAlacena)
                listo=false;
        }
        return listo;
    }
    //consultas
    public int obtenerAlimentos(){
        return alimentos;
    }
    public int obtenerBebidas(){
        return bebidas;
    }
    public int obtenerCamas(){
        return camas;
    }
    public int obtenerCapacidadAlacena(){
        return capacidadAlacena;
    }
    public boolean esHabitable(){
        boolean es=false;
        if(alimentos>0 || bebidas>0 || this.disponibilidad()>0){
            es=true;
        }
        return es;
    }
    public int disponibilidad(){
        return capacidadAlacena-camas;
    }
    public int diasSupervivencia(){
        int menor;
        if(alimentos<bebidas){
            menor=alimentos;
        }else{
            menor=bebidas;
        }
        return menor;
    }
    public boolean mayorAlimentos(Refugio r){
        return r!=null && r.obtenerAlimentos()<alimentos;
    }
    public boolean equals( Refugio r){
        return r!=null && r.obtenerAlimentos()==alimentos
                       && r.obtenerBebidas()==bebidas 
                       && r.obtenerCamas()==camas;
    }
    public Refugio clone(){
        Refugio nuevo=new Refugio(alimentos,bebidas,camas);
        return nuevo;
    }
    public String toString(){
        return ("alimentos:"+alimentos+" bebidas:"+bebidas+" camas:"+camas);
    }
}