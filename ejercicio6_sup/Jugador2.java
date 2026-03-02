package ejercicio6_sup ;
public class Jugador2 {
    //atributos de instancia
    private String nombre;
    private int nroCamiseta;
    private int posicion;
    private int golesConvertidos;
    private int partidosJugados;
    //constructor
    public Jugador2(String nom){
        nombre=nom;
        nroCamiseta=0;
        posicion=0;
        golesConvertidos=0;
        partidosJugados=0;
    }
    //comandos
    public void establecerNroCamiseta(int n){
        nroCamiseta=n;
    }
    public void establecerPosicion(int n){
        posicion=n;
    }
    public void establecerGolesConvertidos(int n){
        golesConvertidos=n;
    }
    public void establecerPartidosJugados(int n){
        partidosJugados=n;
    }
    public void aumentarGoles(int n){
        golesConvertidos=golesConvertidos+n;
    }
    public void aumentarUnPartido(int n){
        partidosJugados=partidosJugados+n;
    }
    //consultas
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerNroCamiseta(){
        return nroCamiseta;
    }
    public int obtenerPosicion(){
        return posicion;
    }
    public int obtenerPartidosJugados(){
        return partidosJugados;
    }
    public int obtenerGolesConvertidos(){
        return golesConvertidos;
    }
    public int promedioGolesXPart(){
        return partidosJugados/golesConvertidos;
    }
    public boolean masGoles(Jugador2 j){
        return j.obtenerGolesConvertidos()<golesConvertidos;
    }
    public Jugador2 jugConMasGoles(Jugador2 j){
        if(this.masGoles(j)){
            return this;
        }else
            return j;
    }
    public String toString(){
        return ("nombre:"+nombre+" nro de camiseta:"+nroCamiseta+" posicion:"+posicion+" goles convertidos:"+golesConvertidos+" partidos jugados:"+partidosJugados);
    }
    public Jugador2 clone(){
        Jugador2 nuevo=new Jugador2(nombre);
        nuevo.establecerNroCamiseta(nroCamiseta);
        nuevo.establecerPosicion(posicion);
        nuevo.establecerGolesConvertidos(golesConvertidos);
        nuevo.establecerPartidosJugados(partidosJugados);
        return nuevo;
    }
    public boolean equals(Jugador2 j){
        return j.obtenerNombre()==nombre && 
        j.obtenerGolesConvertidos()==golesConvertidos && 
        j.obtenerNroCamiseta()==nroCamiseta && 
        j.obtenerPosicion()==posicion && 
        j.obtenerPartidosJugados()==partidosJugados;
    }

}
