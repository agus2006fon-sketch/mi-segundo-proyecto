package Genericidad.ejercicio5;
public class Color extends Elemento {
    //atributos de instancia
    private int rojo;
    private int verde;
    private int azul;
    //constructor
    public Color(){
        rojo=255;
        verde=255;
        azul=255;
    }
    public Color(int r,int v,int a){
        if(r<0 || r>255 && v<0 || v>255 && a<0 || v>255){
            rojo=255;
            verde=255;
            azul=255;
        }else{
            rojo=r;
            verde=v;
            azul=a;
        }
    }
    //comandos
    public void variar(int val){
        if(val+rojo>255){
            rojo=255;
        }else{
            if(rojo+val<0){
                rojo=0;
            }
        }
        if(val+verde>255){
            verde=255;
        }else{
            if(verde+val<0){
                verde=0;
            }
        }
        if(val+azul>2550){
            azul=255;
        }else{
            if(val+azul<0){
                azul=0;
            }
        }
    }
    public void variarRojo(int val){
        if(val+rojo>255){
            rojo=255;
        }else{
            if(val+rojo<0){
                rojo=0;
            }
        }
        rojo=rojo+val;
    }
    public void variarVerde(int val){
        if(val+verde>255){
            verde=255;
        }else{
            if(val+verde<0){
                verde=0;
            }
        }
        verde=verde+val;
    }
     public void variarAzul(int val){
        if(val+azul>255){
            azul=255;
        }else{
            if(val+azul<0){
                azul=0;
            }
        }
        azul=azul+val;
    }
    public void establecerRojo(int val){
        if(val>0 && val<255){
            rojo=val;
        }
    }
    public void establecerVerde(int val){
        if(val>0 && val<255){
            verde=val;
        }
    }
    public void establecerAzul(int val){
        if(val>0 && val<255){
            azul=val;
        }
    }
    public void copy(Color c){
        if(c !=null){
            rojo=c.obtenerRojo();
            verde=c.obtenerVerde();
            azul=c.obtenerAzul();
        }
    }
    //consultas
    public int obtenerRojo(){
        return rojo;
    }
    public int obtenerVerde(){
        return verde;
    }
    public int obtenerAzul(){
        return azul;
    }
    public boolean esRojo(){
        return rojo==255 && verde==0 && azul==0;
    }
    public boolean esGris(){
        return rojo==azul && azul==verde;
    }
    public boolean esNegro(){
        return rojo==0 && verde==0 && azul==0;
    }
    public Elemento complemento(){
        Color comp=new Color(255-rojo,255-verde,255-azul);
        return comp;
    }
    public Elemento clone(){
        Color clon=new Color(rojo,verde,azul);
        return clon;
    }
    public String toString(){
        return ("rojo:"+rojo+" verde:"+verde+" azul:"+azul);
    }
    public boolean equals(Elemento p){
        boolean eq=false;
        Color c=(Color)p;
        eq=rojo==c.obtenerRojo() && verde==c.obtenerVerde() && azul==c.obtenerAzul();
        return eq;
    }
}
