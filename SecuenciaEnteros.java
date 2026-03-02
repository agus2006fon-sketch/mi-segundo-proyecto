public class SecuenciaEnteros {
    //atributos de instancia
    private int [] sec;
    //constructor
    public SecuenciaEnteros(int cant){
        sec=new int[cant];
    }
    //comandos
    public void establecerEntero(int n,int p){
        sec[p]=n;
    }
    public void reemplazar(int n1,int n2){
        for(int i=0;i<cantElementos();i++){
            if(sec[i]==n1){
                sec[i]=n2;
            }
        }
    }
    public void reemplazar(int n){
        for(int i=0;i<sec.length;i++){
            if(sec[i]==n){
                sec[i]=0;
            }
        }
    }
    public boolean intercambiar(int p1,int p2){
        boolean pudo=false;
        if(p1 >= 0 && 0 <= p2 && p1 < cantElementos() && p2 < cantElementos()){
            int valor=sec[p1];
            sec[p1]=sec[p2];
            sec[p2]=valor;
            pudo=true;
        }
        return pudo;
    }
    public boolean copy(SecuenciaEnteros a){
        boolean pudo=false;
        if(a != null && a.cantElementos() == sec.length){
            for(int i=0;i<=a.cantElementos();i++){
                sec[i]=a.obtenerEntero(i);
            }
            pudo=true;
        }
        return pudo;
    }
    //consultas
    public int obtenerEntero(int p){
        return sec[p];
    }
    public int cantElementos(){
        return sec.length;
    }
    public int total(){
        int suma=0;
        for(int i=0;i<cantElementos();i++){
            suma=suma+sec[i];
        }
        return suma;
    }
    public boolean estaNum(int n){
        boolean esta=false;
        for(int i=0;i<cantElementos() && !esta;i++){
            if(sec[i]==n){
                esta=true;
            }
        }
        return esta;
    }
    public int cantidadMayores(int n){
        int cant=0;
        for(int i=0;i<cantElementos();i++){
            if(sec[i]>n){
                cant++;
            }
        }
        return cant;
    }
    public boolean mitadMayores(int n){
        int mitad=cantElementos()/2;
        boolean son=false;
        int cant=0;
        for(int i=0;i<cantElementos() && son;i++){
            if(sec[i]>n){
                cant++;
            }
            if(cant>mitad){
                son=true;
            }
        }
        return son;
    }
}
