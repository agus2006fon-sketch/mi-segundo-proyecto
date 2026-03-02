package ej1TP3;

public class Territorio {
    //atributos de instancia
    private Refugio [] [] tablero;
    //constructor
    public Territorio(int nf,int nc){
        tablero=new Refugio[nf][nc];
    }
    //comandos
    public boolean establecerRefugio(Refugio r,int f,int c){
        boolean pudo=false;
        if(f>=0 && f<cantFilas() && c>=0 && c<cantColumnas()){
            if(r!=null){
                tablero[f][c]=r;
                pudo=true;
            }
        }
        return pudo;
    }
    //consultas
    public int cantFilas(){
        return tablero.length;
    }
    public int cantColumnas(){
        return tablero[0].length;
    }
    public int cantRefugios(){
        int cant=0;
        for(int f=0;f<cantFilas();f++){
            for(int c=0;c<cantColumnas();c++){
                if(tablero[f][c]!=null)
                    cant++;
            }
        }
        return cant;
    }
    public int FilaMasPoblada(){
        int fila=-1;  int cant;
        for(int f=0;f<cantFilas();f++){
            cant=0;
            for(int c=0;c<cantColumnas();c++){
                if(tablero[f][c]!=null){ 
                    cant++;
                }
            }
            if(cant>cant){
                fila=f;
            }
        }
        return fila;
    }
    public boolean maximoNRefugiosHabitables(int f,int n){
        int cant=0;
        for(int c=0;c<cantColumnas() && cant<=n;c++){
            if(tablero[f][c]!=null){
                cant++;
            }
        }
        return cant>=n;
    }
    public int cantCondisponibilidadMayor(int m){
        int cant=0;   int cantCol=0;
        for(int c=0;c<cantColumnas();c++){
            cant=0;
            for(int f=0;f<cantFilas();f++){
                if(tablero[f][c]!=null && tablero[f][c].disponibilidad()>m){
                    cant++;
                }
            }
            if(cant>0){
                cantCol++;
            }
        }
        return cantCol;
    }
    public boolean territorioEspejo(){
        boolean centro=true;  int colCentral=cantColumnas()/2;
        if(cantColumnas()%2!=0)
            for(int f=0;f<cantFilas();f++){
               for(int c=0;c<colCentral;c++){
                Refugio izq=tablero[f][colCentral-1];
                Refugio der=tablero[f][colCentral+1];
               if(izq!=null && der!=null){
                    centro=izq.equals(der);
                    }
                }
               }
            return centro;
    }
    public ColeccionRefugio coleccionFila(){
        ColeccionRefugio nueva=new ColeccionRefugio(cantFilas());
        boolean hay=false;
        for(int f=0;f<cantFilas();f++){
            hay=false;
            for(int c=0;c<cantColumnas() && !hay;c++){
                if(tablero[f][c]!=null){
                    nueva.insertarRefugio(tablero[f][c]);
                    hay=true;
                }
            }
        }
        return nueva;
    }
    public Territorio clone(){
        Territorio clon=new Territorio(cantFilas(), cantColumnas());
        for(int f=0;f<cantFilas();f++){
            for(int c=0;c<cantColumnas();c++){
                clon.establecerRefugio(tablero[f][c].clone(), f, c);
            }
        }
        return clon;
    }
}
