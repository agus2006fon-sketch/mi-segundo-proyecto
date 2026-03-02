public class Equipo {
    //atributos de instancia
    private String nombre;
    private Jugador capitan;
    private int pG;
    private int pE;
    private int pP;
    private int gAFavor;
    private int GContra;
    //constructor
    public Equipo (String nom,Jugador cap){
        nombre=nom;
        capitan=cap;
        pE=0;
        pG=0;
        pP=0;
        gAFavor=0;
        GContra=0;
    }
    //comandos
    public void incrementarPG(boolean jugoElCap){
        if(jugoElCap){
            capitan.aumentarUnPartido(1);;
        }
        pG++;
    }
    public void incrementarPE(boolean jugoElCap){
        if(jugoElCap){
            capitan.aumentarUnPartido(1);
        }
        pE++;
    }
    public void incrementarPP(boolean jugoElCap){
        if(jugoElCap){
            capitan.aumentarUnPartido(1);
        }
        pP++;
    }
    public void aumentarGFavor(int total, int delCap){
        if(delCap>0){
            capitan.aumentarGoles(delCap);
        }
        gAFavor=gAFavor+total;
    }
    public void aumentarGcontra(int total){
        GContra=GContra+total;
    }
    //consultas
    public String obtenerNombre(){
        return nombre;
    }
    public Jugador obtenerCapitan(){
        return capitan;
    }
    public int obtenerPG(){
        return pG;
    }
    public int obtenerPE(){
        return pE;
    }
    public int obtenerPP(){
        return pP;
    }
    public int obtenerGFavor(){
        return gAFavor;
    }
    public int obtenerGContra(){
        return GContra;
    }
    public int obtenerPartidos(){
        return pE+pG+pP;
    }
    public int obtenerPuntos(){
        int puntos=0;
        if(pG>0){
            puntos=pG*3;
        }else{
            if(pE>0){
                puntos=pE;
            }
        }
        return puntos;
    }
    public Equipo mejorPuntaje(Equipo e){
        if(e.obtenerPuntos()>this.obtenerPuntos()){
            return e;
        }else{
            if(e.obtenerPuntos()==this.obtenerPuntos() && e.obtenerGFavor()>this.obtenerGFavor()){
                return e;
            }else{
                if(e.obtenerGContra()<this.GContra){
                    return e;
                }
            }
        }
        return this;
    }
    public Jugador capitanConMasGoles(Equipo e){
        if(capitan.obtenerGolesConvertidos()>e.obtenerCapitan().obtenerGolesConvertidos()){
            return capitan;
        }else{ 
            return e.obtenerCapitan();
        }
    }
    public String toString(){
        return ("nombre:"+nombre+" capitan:"+capitan+" partidos ganados:"+pG+" partidos perdidos:"+pP+" partidos empatados:"+pE);
    }
    public boolean equals(Equipo e){
        boolean eq=false;
        if(e!=null){ 
          eq=nombre==e.obtenerNombre() && 
          capitan.equals(e.obtenerCapitan()) && 
          pG==e.obtenerPG() && 
          pE==e.obtenerPE() && 
          pP==e.obtenerPP();
        }
    return eq;
    }
}
