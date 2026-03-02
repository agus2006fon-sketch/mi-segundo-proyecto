package ej3TP3;
public class Fecha {
    //atributos de instancia
    private int dia;
    private int mes;
    private int anio;
    //constructor
    public Fecha(int d,int m,int a){
        if(d>0){
        dia=d;
        }
        if(m>0 && m<13){
        mes=m;
        }
        if(a>0)
        anio=a;
    }
    //comando
    public void establecerDia(int d){
        dia=d;
    }
    public void establecerMes(int m){
        mes=m;
    }
    public void establecerAnio(int a){
        anio=a;
    }
    //consultas
    public int obtenerDia(){
        return dia;
    }
    public int obtenerMes(){
        return mes;
    }
    public int obtenerAnio(){
        return anio;
    }
    public boolean esBisiesto(){
        boolean es=false;
        if(this.obtenerAnio()%4 ==0){
            es=true;
        }
        return es;
    }
    public boolean esAnterior(Fecha f){
        boolean anterior=false;
        if(f.obtenerAnio()>anio){
            anterior=true; 
            if(anio==f.obtenerAnio() && f.obtenerMes()>this.obtenerMes()){
                anterior=true; 
                if(anio==f.obtenerAnio() && f.obtenerMes()==mes && f.obtenerDia()>dia){
                  anterior=true;
                } 
            }
        }
        return anterior;
    }
    public boolean mismoAnio(Fecha f){
        boolean mismo=false;
        if(anio==f.obtenerAnio()){
            mismo=true;
        }
        return mismo;
    }
    public boolean equals(Fecha f){
        boolean igual=false;
        if(f !=null && anio==f.obtenerAnio() && mes==f.obtenerMes() && dia==obtenerDia()){ 
            igual=true;
        }
        return igual;
    }
    public String toString(){
        return ("dia:"+dia+" mes:"+mes+" año:"+anio);
    }
}
