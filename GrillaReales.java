public class GrillaReales {
    //atributos de intancia
    private float [][] grilla;
    //constructor
    public GrillaReales(int f,int c){
        grilla=new float[f][c];
    }
    //comandos
    public void establecerReal(int f,int c,float r){
        grilla[f][c]=r;
    }
    public void reemplazar(float r1,float r2){
        for(int f=0;f<cantFilas();f++){
            for(int c=0;c<cantColumnas();c++){
                if(grilla[f][c]==r1){
                    grilla[f][c]=r2;
                }
            }
        }
    }
    public void reemplazar(float r1,float r2,int f){
        for(int c=0;c<cantColumnas();c++){
            if(grilla[f][c]==r1)
            grilla[f][c]=r2;
        }
    }
    public boolean intercambiarFilas(int f1,int f2){
        boolean sePudo=false;
        if(f1>=0 && f1<cantFilas() && f2>=0 && f2<cantFilas()){
            for(int c=0;c<cantColumnas();c++){
                float guardarF1=grilla[f1][c];
                grilla[f1][c]=grilla[f2][c];
                grilla[f2][c]=guardarF1;
            }
            sePudo=true;
        }
        return sePudo;
    }
    //consultas
    public float obtenerReal(int f,int c){
        return grilla[f][c];
    }
    public int cantFilas(){
        return grilla.length;
    }
    public int cantColumnas(){
        return grilla[0].length;
    }
    public float total(){
        float suma=0;
        for(int f=0;f<cantFilas();f++){
            for(int c=0;c<cantColumnas();c++){
                suma=suma+grilla[f][c];
            }
        }
        return suma;
    }
    public float totalColumna(int c){
        float suma=0;
        for(int f=0;f<cantColumnas();f++){
            suma=suma+grilla[f][c];
        }
        return suma;
    }
    public boolean estaNum(float r){
        boolean esta=false;
        for(int f=0;f<cantFilas() && !esta;f++){
            for(int c=0;c<cantColumnas() && !esta;c++){
                if(grilla[f][c]==r){
                    esta=true;
                }
            }
        }
        return esta;
    }
    public int cantidadMayores(float r){
        int cant=0;
        for(int f=0;f<cantFilas();f++){
            for(int c=0;c<cantColumnas();c++){
                if(grilla[f][c]>r){
                    cant++;
                }
            }
        }
        return cant;
    }
    public boolean esFilaCreciente(int f){
        boolean es=true;
        for(int c=0;c<cantColumnas()-1 && es;c++){
            if(grilla[f][c]>grilla[f][c+1]){
                es=false;
            }
        }
        return es;
    }
    public boolean hayNMayoresConsecutivos(int n,float r){
        boolean hay=false;  int cant;
        for(int f=0;f<cantFilas() && !hay ;f++){
            cant=0;
            for(int c=0;c<cantColumnas()-1;c++){
                if(grilla[f][c] > r && grilla[f][c+1] > r){
                    cant++;
                }
            }
            if(cant==n){
                hay=true;
            }
        }
        return hay;
    }
    public boolean esTranspuesta(GrillaReales g){
        boolean es=true;
        if(g.cantColumnas() != this.cantColumnas() || g.cantFilas() != this.cantFilas()){
            es=false;
        }
            for(int f=0;f<cantFilas() && es;f++){
                for(int c=0;c<cantColumnas() && es;c++){
                    if(grilla[f][c]!=g.obtenerReal(c, f)){
                        es=false;
                    }
                }
            }
        return es;
    }
    public GrillaReales transpuesta(){
        GrillaReales t=new GrillaReales(cantColumnas(),cantFilas());
        for(int f=0;f<cantFilas();f++){
            for(int c=0;c<cantColumnas();c++){
                t.establecerReal(c, f, grilla[f][c]);
            }
        }
        return t;
    }
}
