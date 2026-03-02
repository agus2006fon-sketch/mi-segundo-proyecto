public class PlayaSurtidores {
    //atributos de instancia
    private Surtidor [] Tabla;
    //constructor
    public PlayaSurtidores(int n){
        Tabla=new Surtidor[n];
        for(int i=0;i<Tabla.length;i++){
            Tabla[i]=null;
        }
    }
    public PlayaSurtidores(){
        Tabla=new Surtidor[10];
        for(int i=0;i<10;i++){
            Tabla[i].llenarDepositoGasoil();
            Tabla[i].llenarDepositoPreminum();
            Tabla[i].llenarDepositoSuper();
        }
    }
    //comandos
    public void establecerSurtidor(Surtidor s,int p){
        Tabla[p]=s;
    }
    public void establecerSurtidor(Surtidor s){
        boolean corte=true;
        for(int i=0;i<Tabla.length && corte;i++)
            if(Tabla[i]==null){ 
                Tabla[i]=s;
                corte=false;
            }
    }
    public void llenaDepositos(){
        for(int i=0;i<Tabla.length;i++){
            if(Tabla[i]!=null){
            Tabla[i].llenarDepositoGasoil();
            Tabla[i].llenarDepositoPreminum();
            Tabla[i].llenarDepositoSuper();
            }
        }
    }
    public void agruparSurtidores(){
       int indiceValido = 0;
        for (int i = 0; i < Tabla.length; i++) {
            if (Tabla[i] != null) {
               Tabla[indiceValido] = Tabla[i];
               indiceValido++;
            }
        }
        for(int i=indiceValido;i<Tabla.length;i++){
            Tabla[i]=null;
        }
    }
    //consultas
    public int cantPosiciones(){
        return Tabla.length;
    }
    public int cantSurtidores(){
        int cant=0;
        for(int i=0;i<cantPosiciones();i++){
            if(Tabla[i]!=null){
                cant++;
            }
        }
        return cant;
    }
    public Surtidor obteneSurtidor(int p){
        return Tabla[p];
    }
    public int cantMaximaCarga(){
        int cant=0;
        for(int i=0;i<cantPosiciones();i++){
            if(Tabla[i]!=null && Tabla[i].obtenerMaximaCarga()==Tabla[i].obtenerLitrosGasoil() &&
              Tabla[i].obtenerMaximaCarga()==Tabla[i].obtenerLitrosPremium() && 
              Tabla[i].obtenerMaximaCarga()==Tabla[i].obtenerLitrosSuper()){
                cant++;
              }
        }
        return cant;
    }
    public boolean mismosNulos(PlayaSurtidores ps){
        boolean mismo=true;
        for(int i=0;i<cantPosiciones() && mismo;i++){
            if(Tabla[i]==null && ps.obteneSurtidor(i)!=null ||
               Tabla[i]!=null && ps.obteneSurtidor(i)==null)
                mismo=false;
        }
        return mismo;
    }
    public PlayaSurtidores clone(){
        PlayaSurtidores nuevo=new PlayaSurtidores(Tabla.length);
        for(int i=0;i<cantPosiciones();i++){
            nuevo.establecerSurtidor(Tabla[i], i);
        }
        return nuevo;
    }
    public PlayaSurtidores nLigados(int n){
        PlayaSurtidores ligados=null;   int cant=0;  int pos=0;
        for(int i=0;i<cantPosiciones() && cant<n;i++){
            if(Tabla[i]!=null){
                pos=i;
                cant++;
            }else
                cant=0;
        }
        if(cant==n){
            ligados=new PlayaSurtidores(n);
            for(int i=pos+1-n;i<=pos;i++)
                ligados.establecerSurtidor(Tabla[i]);
        }
        return ligados;
    }
}
