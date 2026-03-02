package ParcialDos;

public class Jardin {
    //atributos de clase
    private static final int cantFilas=5;
    //atributos de clase
    private Personaje [][] g;
    //constructor
    public Jardin(int cantCols){
        g=new Personaje[cantFilas][cantCols];
    }
    //comandos
    public void establecerPersonaje(int f,int c,Personaje p){
       g[f][c] = p; 
    }
    //consultas
    public Personaje obtPersonaje(int f,int c){
        Personaje r = null;
        if(f >= 0 && f < g.length && c >= 0 && c < g[0].length){
            r = g[f][c];
        }
        return r;
    }
    public int primeraFilaConFuerzaF(int n,int f){
        int fila = -1; 
        int contN = 0;
        for(int fil=0;fil<g.length && fila==-1;fil++){
            contN = 0;
            for(int c = 0; c < g[0].length && contN < n ;c++){
                if(g[fil][c] != null && g[fil][c].obtenerFuerza() == f){
                    contN++;
                }
            }
            if(contN >= n){
                fila = fil;
            }
        }
        return fila;
    }
    public TablaPersonaje personasEquiv(Personaje p){
        TablaPersonaje equiv = new TablaPersonaje(g.length*g[0].length);
        if(p != null){
            for(int f = 0; f < g.length ;f++){
                for(int c = 0 ;c < g[0].length ;c++){
                    if(g[f][c] != null && g[f][c].equals(p))
                        equiv.agregarPersonaje(g[f][c]);
                }
            }
        }else
            equiv = null;
        return equiv;
    }
    public boolean hayFilasConVivosFuertes(int n,int f){
        boolean hay = false;  
        int contF = 0;  
        for(int fil = 0;fil < g.length && contF <= n ;fil++){
            hay = false;
            for(int c = 0; c < g[0].length && !hay ;c++){
                if(g[fil][c] != null && g[fil][c].obtenerSalud() > 0 && g[fil][c].obtenerFuerza() > f)
                    hay = true;
            }
            if(hay){
                contF++;
            }
        }
        return contF == n;
    }
}
