public class PolizaOrdenada {
    //atributos de instancia
    private Poliza [] polOrd;
    private int n;
    //constructor 
    public PolizaOrdenada(int max){
        polOrd=new Poliza [max];
        n=0;
    }
    //comandos
    public void insertar(Poliza pol){
        int pos=0; boolean encontre=false;
        for(int i=0;i<n && !encontre;i++){ 
            if(polOrd[pos].obtenerNroPoliza()>pol.obtenerNroPoliza()){
                encontre=true;
                pos=i;
            }
        }
        if(encontre){
            for(int j=n-1;j>=pos;j--){
                polOrd[j+1]=polOrd[j];
            }
            polOrd[pos]=pol;
            n++;
        }
    }
    public void actualizar(int d,int h,int p){
        for(int i=0;i<n;i++){
            if(polOrd[i].obtenerCostoPoliza()>d && polOrd[i].obtenerCostoPoliza()<h){
                polOrd[i].establecerPorcentaje(p);
            }
        }
    }
    public void copy(PolizaOrdenada p){
        if(cantElementos()==p.cantElementos()){
            for(int i=0;i<n;i++){
                polOrd[i]=p.obtenerPoliza(i);
            }
        }
    }
    //consultas
    public int cantPolizas(){
        return polOrd.length;
    }
    public int cantElementos(){
        return n;
    }
    public boolean estaLlena(){
        return cantElementos()==cantPolizas();
    }
    public boolean existePoliza(int nro){
        boolean e=false;
        for(int i=0;i<cantElementos() && !e;i++){
            if(polOrd[i].obtenerNroPoliza()==nro)
                e=true;
        }
        return e;
    }
    public boolean existePoliza(Poliza p){
        boolean e=false;
        for(int i=0;i<cantElementos() && !e;i++){
            if(polOrd[i].equals(p))
                e=true;
        }
        return e;
    }
    public Poliza obtenerPoliza(int pos){
        Poliza o=null;
        if(pos>=0 && pos<cantElementos()){
            o=polOrd[pos];
        }
        return o;
    }
    public PolizaOrdenada intercalada(PolizaOrdenada p){
        int i=0;
        int j=0;
        PolizaOrdenada nueva=new PolizaOrdenada(n+p.cantElementos());
        while(i<n && j<p.cantElementos()){
            if(polOrd[i].obtenerNroPoliza()>p.obtenerPoliza(j).obtenerNroPoliza()){
                nueva.polOrd[nueva.cantElementos()]=p.obtenerPoliza(j);
                nueva.n++;
                j++;
            }else{
                nueva.polOrd[nueva.cantElementos()]=polOrd[i];
                nueva.n++;
                i++;
            }
        }
        while(i<n){
            nueva.polOrd[nueva.cantElementos()]=polOrd[i];
            nueva.n++;
            i++;
        }
        while(j<p.cantElementos()){
            nueva.polOrd[nueva.cantElementos()]=p.obtenerPoliza(j);
            nueva.n++;
            j++;
        }
        return nueva;
    }
    public boolean equals(PolizaOrdenada p){
        boolean eq=true;
        if(cantElementos()==p.cantElementos()){
            for(int i=0;i<cantElementos() && eq;i++){
                eq=polOrd[i]==p.obtenerPoliza(i);
            }
        }else
            eq=false;
        return eq;
    }

}
