package ej1TP3;
public class Criatura {
    //atributos de clase
    private static final int maxEnergia=1000;
    private static final int minEnergia=0;
    private static final int consumoEnergia=10;
    //atributos de instancia
    private int energia;
    private Refugio refugio;
    private boolean despierto;
    private  int caminatas;
    //constructor 
    public Criatura(Refugio r){
        refugio=r;
        energia=maxEnergia;
        caminatas=0;
        despierto=true;
    }
    //comandos
    public boolean comer(){
        boolean puede=false;
        if(despierto==true && refugio.obtenerAlimentos()>0){
            if(energia<maxEnergia){
                energia++;
            }
            refugio.consumirAlimento();
            puede=true;
        }
        return puede;
    }
    public boolean beber(){
        boolean puede=false;
        if(despierto==true && refugio.obtenerBebidas()>0){
            if(energia<maxEnergia){
                energia++;
            }
            refugio.consumirBebida();
            puede=true;
        }
        return puede;
    }
    public boolean dormir(){
        if(despierto && refugio.disponibilidad()>0){
            refugio.ocuoparCama();
            despierto=false;
        }
        return despierto;
    }
    public boolean despertar(){
        if(!despierto){
            despierto=true;
            refugio.desocuparCama();
            caminatas=0;
        }
        return despierto;
    }
    public boolean caminar(){
        boolean puede=false;
        if(despierto && energia>consumoEnergia){
            energia=energia-consumoEnergia;
            caminatas++;
            puede=true;
        }else{ 
            if(caminatas>3 && this.refugio.disponibilidad()>0){
                refugio.ocuoparCama();
                this.dormir();
                puede=true;
            }else{
                if(refugio.disponibilidad()<1) {
                    energia=minEnergia;
                    caminatas=3;
                    puede=true;
                }
            }
        }
        return puede;
    }
    //consultas
    public int obtenerEnergia(){
        return energia;
    }
    public int obtenerCaminatas(){
        return caminatas;
    }
    public int obtenerHumor(){
        int humor=1;
        if(refugio.esHabitable()==false){
            humor=1;
        }else{
            if(energia>=0 && energia<=40){
                humor=1;
            }else{
                if(energia>40 && energia<=70){
                    humor=2;
                }else{
                    if(energia>70){
                        humor=3;
                    }
                }
            }
        }
        return humor;
    }
    public Refugio obtenerRefugio(){
        return refugio;
    }
    public boolean estaDormido(){
        return despierto;
    }
    public boolean mayorEnergia(Criatura c){
        return c.obtenerEnergia()>energia;
    }
    public String toString(){
        return ("refugio:"+refugio+" energia:"+energia+" despierto:"+despierto+" caminatas:"+caminatas);
    }
}
