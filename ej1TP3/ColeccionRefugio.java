package ej1TP3;

public class ColeccionRefugio {
    //atributos de instancia
    private Refugio [] col;
    private int cant;
    //constructor
    public ColeccionRefugio(int n){
        col=new Refugio[n];
        cant=0;
    }
    //comandos
    public void insertarRefugio(Refugio r){
        if(r!=null && estaLlena()==false){
            col[cant]=r;
            cant++;
        }
    }
    public void eliminarEscasaSupervivencia(){
        boolean encontre=false;
        for(int i=0;i<cant && !encontre;i++){
            if(col[i].diasSupervivencia()>=1){
                col[i]=col[cant-1];
                col[cant-1]=null;
                cant--;
                encontre=true;
            }
        }
    }
    //consultas
    public int tamanoColeccion(){
        return col.length;
    }
    public int cantRefugios(){
        return cant;
    }
    public boolean estaLlena(){
        return col.length==cant;
    }
    public Refugio obtenRefugio(int pos){
        Refugio r=null;
        if(pos>=0 && pos<cant){
            r=col[pos];
        }
        return r;
    }
    public boolean hayNSeguidosHabitables(int n){
        boolean hay=false;   int cant=0;
        for(int i=0;i<cant-1 && !hay;i++){
            if(col[i].esHabitable() && col[i+1].esHabitable()){
                cant++;
            }else{
                cant=0;
            }
            if(cant>=n){
                hay=true;
            }
        }
        return hay;
    }
    public boolean equals(ColeccionRefugio c){
        boolean eq=false;
        if(this.tamanoColeccion()==c.tamanoColeccion() && this.getClass() == c.getClass()){
            for(int i=0;i<cant;i++){
                eq=col[i].equals(c.obtenRefugio(i));
            }
        }
        return eq;
    }
}
