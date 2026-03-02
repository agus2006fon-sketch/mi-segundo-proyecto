package sensores;

public class TableroSensores {
    //atributos de instancia
    private Sensor [][] grilla;
    //constructor
    public TableroSensores(int cantFil,int cantCol){
        grilla=new Sensor[cantFil][cantCol];
    }
    //comandos
    public void establecerSensor(int f,int c,Sensor s){
        grilla[f][c]=s;
    }
    public void intercambiar(int f1,int f2){
        Sensor guardarF1;
        for(int c=0;c<cantColumnas();c++){
            guardarF1=grilla[f1][c];
            grilla[f1][c]=grilla[f2][c];
            grilla[f2][c]=guardarF1;
        }
    }
    public void copy(TableroSensores t){
        if(t!=null && cantFilas()==t.cantFilas() && cantColumnas()==t.cantColumnas()){
            for(int f=0; f < cantFilas(); f++){
                for(int c=0;c < cantColumnas(); c++){
                    grilla[f][c] = t.obtenerSensor(f, c);
                }
            }
        }
    }
    //consultas
    public int cantFilas(){
        return grilla.length;
    }
    public int cantColumnas(){
        return grilla[0].length;
    }
    public Sensor obtenerSensor(int f,int c){
        return grilla[f][c];
    }
    public int cantidadFilasRiesgo(){
        int cantF=0;
        for(int f=0; f < cantFilas(); f++){
            cantF=0;
            for(int c=0; c < cantColumnas() && cantF == 0; c++){
                if(grilla[f][c].riesgo() == true){
                    cantF++;
                }
            }
        }
        return cantF;
    }
    public boolean todosEnEmergencia(){
        boolean estan=true;
        for(int f=0;f < cantFilas() && estan; f++){
            for(int c=0;c<cantColumnas() && estan; c++){
                if(grilla[f][c].emergencia() != true){
                    estan=false;
                }
            }
        }
        return estan;
    }
    public boolean hayNRiesgoCol(int c,int n){
        int cont=0;
        for(int f=0; f < cantFilas() && cont <= n ; f++){
            if(grilla[f][c].riesgo() == true){
                cont++;
            }
        }
        return cont>=n;
    }
    public boolean dosConsecutivosEmergencia(int f){
        boolean hay=false;
        for(int c=0; c < cantColumnas()-1; c++){
            if(grilla[f][c].emergencia() == true && 
               grilla[f][c+1].emergencia() == true){
                hay=true;
            }
        }
        return hay;
    }
    public int contarCoincidencias(TableroSensores gs){
        int cont=0;
        if(cantFilas()==gs.cantFilas() && cantColumnas()==gs.cantColumnas()){ 
            for(int f=0;f<cantFilas();f++){
                for(int c=0;c<cantColumnas();c++){
                    if(grilla[f][c].equals(gs.obtenerSensor(f, c))){
                        cont++;
                    }
                }
            }
        }
        return cont;
    }
    public boolean equals(TableroSensores t){
        boolean eq=false;
        if(cantFilas()==t.cantFilas() && cantColumnas()==t.cantColumnas()){
            for(int f=0;f<cantFilas();f++){
                for(int c=0;c<cantColumnas();c++){
                    eq=grilla[f][c].equals(t.obtenerSensor(f, c));
                }
            }
        }
        return eq;
    }
    public TableroSensores clone(){
        TableroSensores nuevo=new TableroSensores(this.cantFilas(),this.cantColumnas());

        for(int f=0;f<cantFilas();f++){
            for(int c=0;c<cantColumnas();c++){
                nuevo.establecerSensor(f, c, grilla[f][c]);
            }
        }
        return nuevo;
    }

}
