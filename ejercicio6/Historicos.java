public class Historicos {
    //atributos de instancia
    private Jugador [] jugadoresHistoricos;
    private int cant;
    //constructor
    public Historicos(int n){
        jugadoresHistoricos=new Jugador[n];
        cant=0;
    }
    //comandos
    public void establecerJugador(Jugador j){
        jugadoresHistoricos[cant]=j;
        cant++;
    }
    public void ordenar(){
        Jugador aux;
        for(int i=0;i<jugadoresHistoricos.length-1 ;i++){
            if(jugadoresHistoricos[i+1].obtenerNombre().compareTo(jugadoresHistoricos[i].toString())>0){
                aux=jugadoresHistoricos[i+1];
                jugadoresHistoricos[i+1]=jugadoresHistoricos[i];
                jugadoresHistoricos[i]=aux;
            }
        }
    }
    //consultas
    public boolean estaLlena(){
        return cant==jugadoresHistoricos.length;
    }
    public int cantPosiciones(){
       return jugadoresHistoricos.length;
    }
    public int cantJugadores(){
        return cant;
    }
    public Jugador obtenerJugador(int p){
        return jugadoresHistoricos[p];
    }
    public boolean mMayores(int g,int m){
        int cantJ=0; 
        for(int i=0;i<cantJugadores() && cantJ<m ;i++){
            if(jugadoresHistoricos[i].obtenerGolesConvertidos()>g){
                cantJ++;
            }
        }
        return cantJ==m;
    }
    public boolean alMenosMMayores(int g,int m){
        int cantJ=0;
        for(int i=0;i<cantJugadores() && cantJ<=m ;i++){
            if(jugadoresHistoricos[i].obtenerGolesConvertidos()>g){
                cantJ++;
            }
        }
        return cantJ>=m;
    }
    public Historicos goleadores(int g){
        int cantG=0;  Historicos nuevo=null;
        for(int i=0;i<cantJugadores();i++){
            if(jugadoresHistoricos[i].obtenerGolesConvertidos()>g){
                cantG++;
            }
        } 
        if(cantG>0){ 
            nuevo=new Historicos(cantG);
            for(int i=0;i<cantJugadores();i++){
                if(jugadoresHistoricos[i].obtenerGolesConvertidos()>g){
                   nuevo.establecerJugador(jugadoresHistoricos[i]);
                }
            }
        }
        return nuevo;
    }
}
