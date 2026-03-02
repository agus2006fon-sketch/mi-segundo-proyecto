public class MedicioServicios {
    //atributos de instancia
    private int gas;
    private int agua;
    private int electricidad;
    //constructor
    public MedicioServicios(int g,int a,int e){
        gas=g;
        agua=a;
        electricidad=e;
    }
    //comandos
    public void establecerGas(int g){
        gas=g;
    }
    public void establecerAgua(int a){
        agua=a;
    }
    public void establecerElectricidad(int e){
        electricidad=e;
    }
    //consultas
    public int obtenerAgua(){
        return agua;
    }
    public int obtenerGas(){
        return gas;
    }
    public int obtenerElectricidad(){
        return electricidad;
    }
    public float costoServicio(){
        return gas*1.5f + agua*0.5f + electricidad*2;
    }
}
