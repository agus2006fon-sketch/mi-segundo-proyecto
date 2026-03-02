package SensoresDif;
public class FilaSensores {
    //atributos de instancia
    private Sensor [] fs;
    //constructor
    public FilaSensores(int cant){
        fs=new Sensor[cant];
    }
    //comandos
    public void establecerSensor(int p, Sensor s){
        if(p >=0 && p<fs.length && s !=null){
            fs[p-1]=s;
        }
    }
    public void intercambiar(int p1,int p2){
        if(p1 >= 0 && p1 < fs.length && p2 >= 0 && p2 < fs.length){
            Sensor copia=fs[p1-1];
            fs[p1-1]=fs[p2-1];
            fs[p2-1]=copia;
        }
    }
    public void copy(FilaSensores a){
        for(int i=0;i<fs.length;i++)
        fs[i].copy(a.obtenerSensor(i));
    }
    //consultas
    public Sensor obtenerSensor(int p){
        Sensor s=null;
        if(p>=0 && p<fs.length){
            s=fs[p-1];
        }
        return s;
    }
    public boolean posicionValida(int p){
        return p>=0 && p<fs.length;
    }
    public int cantFila(){
        return fs.length;
    }
    public int cantSensores(){
        int cant=0;
        for(int i=0;i<=cantFila();i++){
            if(fs[i] != null){
                cant++;
            }
        }
        return cant;
    }
    public int cantidadRiesgo(){
        int cant=0;
        for(int i=0;i<cantFila();i++){
            if(fs[i]!=null){ 
                if(fs[i].riesgo()==true){
                    cant++;
                }
            }
        }
        return cant;
    }
    public boolean hayNRiesgo(int n){
        boolean hay=false;
        int cant=0;
        for(int i=0;i<cantFila() && hay;i++ ){
            if(fs[i]!=null){ 
               if(fs[i].riesgo()==true){
                    cant++;
                }
            }
            if(cant==n){
                hay=true;
            }
        }
        return hay;
    }
    public boolean dosConsecutivosEmergencia(){
        boolean hay=false;
        for(int i=0;i<cantFila()-1 && hay;i++){
            if(fs[i] != null && fs[i+1] != null){ 
                if(fs[i].emergencia()==true && fs[i+1].emergencia()==true ){
                    hay=true;
                }
            }
        }
        return hay;
    }
    public boolean equals(FilaSensores a){
        boolean e=true;
        for(int i=0;i<cantFila() && e;i++){
            if(a != null){ 
                if(fs[i]!=a.obtenerSensor(i) && 
                    fs[i].obtenerP1()!=a.obtenerSensor(i).obtenerP1() && 
                    fs[i].obtenerP2()!=a.obtenerSensor(i).obtenerP2() &&
                    fs[i].riesgo()!=a.obtenerSensor(i).riesgo() &&
                    fs[i].emergencia()!=a.obtenerSensor(i).emergencia()){
                        e=false;
                }
            }
        }
        return e;
    }
    public FilaSensores clone(){
        FilaSensores nuevo=new FilaSensores(cantFila());

        for(int i=0;i<cantFila();i++){
            if(fs[i]!=null){ 
                nuevo.establecerSensor(i,fs[i].clone());
            }
        }
        return nuevo;
    }
    public FilaSensores FilaCompleta(){
        FilaSensores FComp=new FilaSensores(cantFila());

        for(int i=0;i<cantFila();i++){
            if(fs[i]!=null){
                FComp.establecerSensor(i,fs[i]);
            }
        }
        return FComp;
    }
}
