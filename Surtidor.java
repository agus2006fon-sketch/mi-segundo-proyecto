public class Surtidor {
    //atributos de clase
    private static final int maximaCarga=20000;
    //atributos de instancia
    private int cantGasoil;
    private int cantSuper;
    private int cantPremium;
    //constructor
    public Surtidor(){
        cantGasoil=maximaCarga;
        cantSuper=maximaCarga;
        cantPremium=maximaCarga;
    }
    //comandos
    public void llenarDepositoGasoil(){
        cantGasoil=maximaCarga;
    }
    public void llenarDepositoSuper(){
        cantSuper=maximaCarga;
    }
    public void llenarDepositoPreminum(){
        cantPremium=maximaCarga;
    }
    public void extraerGasoil(int litros){
        if(cantGasoil>litros){
            cantGasoil=cantGasoil-litros;
        }else{
            cantGasoil=0;
        }
    }
    public void extraerSuper(int litros){
        if(cantSuper>litros){
            cantSuper=cantSuper-litros;
        }else{
            cantSuper=0;
        }
    }
    public void extraerPremium(int litros){
        if(cantPremium>litros){
            cantPremium=cantPremium-litros;
        }else{
            cantPremium=0;
        }
    }
    //consultas
    public int obtenerMaximaCarga(){
        return maximaCarga;
    }
    public int obtenerLitrosGasoil(){
        return cantGasoil;
    }
    public int obtenerLitrosSuper(){
        return cantSuper;
    }
    public int obtenerLitrosPremium(){
        return cantPremium;
    }
    public boolean depositosLlenos(){
       return this.obtenerLitrosGasoil()==maximaCarga
              && this.obtenerLitrosPremium()==maximaCarga 
              && this.obtenerLitrosSuper()==maximaCarga;
    }
}
