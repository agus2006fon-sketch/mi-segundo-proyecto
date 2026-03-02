package ej8TP;

public class Hora {
    //atributos de instancia
    private int hor;
    private int min;
    //constructor
    public Hora(int m,int h){
        hor=h;
        min=m;
    }
    //comandos
    public void establecerHora(int c){
        hor=c;
    }
    public void establecerMinutos(int c){
        min=c;
    }
    public void copy(Hora h){
        hor=h.obtenerHora();
        min=h.obtenerMinutos();
    }
    //consultas
    public int obtenerHora(){
        return hor;
    }
    public int obtenerMinutos(){
        return min;
    }
    public boolean equals(Hora c){
        return hor==c.obtenerHora() && min==c.obtenerMinutos();
    }
    public int diferenciaMinutos(Hora c){
        int minutos=(this.hor*60) + this.min;
        int minutosC=(c.obtenerHora()*60) + c.obtenerMinutos();
        return minutos-minutosC;
    }
    public boolean anterior(Hora c){
        boolean es=false;
        if(this.hor < c.obtenerHora()){
            es=true;
        }else{
            if(c.obtenerHora()==this.hor && this.min < c.obtenerMinutos()){
                es=true;
            }
        }
        return es;
    }
}
