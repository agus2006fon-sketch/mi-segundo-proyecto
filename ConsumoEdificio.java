public class ConsumoEdificio {
    //atributos de instancia
    private MedicioServicios [] consumoXPiso;
    //constructor
    public ConsumoEdificio(int pisos){
        consumoXPiso=new MedicioServicios[pisos];
    }
    //comandos
    public boolean registrarConsumo(MedicioServicios m,int p){
        boolean pudo=false;
        if(p>=0 && p<consumoXPiso.length){
            consumoXPiso[p]=m;
            pudo=true;
        }
        return pudo;
    }
    public boolean eliminarConsumo(int p){
        boolean pudo=false;
        if(p>=0 && p<consumoXPiso.length){
            consumoXPiso[p]=null;
            pudo=true;
        }
        return pudo;
    }
    public void eliminarCeros(){
        for(int i=0;i<consumoXPiso.length;i++){
            if(consumoXPiso[i]!=null)
            if(consumoXPiso[i].obtenerAgua()==0 && consumoXPiso[i].obtenerElectricidad()==0 || consumoXPiso[i].obtenerGas()==0){
                consumoXPiso[i]=null;
            }
        }
    }
    //consultas
    public int cantPosiciones(){
        return consumoXPiso.length;
    }
    public int cantRegistrosConsumo(){
        int cant=0;
        for(int i=0;i<cantPosiciones();i++){
            if(consumoXPiso[i] !=null)
                cant++;
        }
        return cant;
    }
    public MedicioServicios obtenerMedicioServicios(int p){
        return consumoXPiso[p];
    }
    public boolean hayMayorConsumo(int c){
        boolean hay=false;
        for(int i=0;i<cantPosiciones() && !hay;i++){
            if(consumoXPiso[i]!=null && consumoXPiso[i].costoServicio()>c){
                hay=true;
            }
        }
        return hay;
    }
    public int cuantasMayores(int c){
        int cant=0;
        for(int i=0;i<cantPosiciones();i++){
            if(consumoXPiso[i]!=null && consumoXPiso[i].costoServicio()>c){
                cant++;
            }
        }
        return cant;
    }
    public int primerPisoMayor(int c){
        int primer=-1;
        for(int i=0;i<cantPosiciones() && primer==-1 ;i++){
            if(consumoXPiso[i]!=null &&consumoXPiso[i].costoServicio()>c){
                primer=i;
            }
        }
        return primer;
    }
    public int ultimoPisoMayor(int c){
        int ultimo=-1;
        for(int i=0;i<cantPosiciones();i++){
            if(consumoXPiso[i]!=null && consumoXPiso[i].costoServicio()>c){
                ultimo=i;
            }
        }
        return ultimo;
    }
    public boolean nMayores(int c,int n){
        int cant=0;
        for(int i=0;i<cantPosiciones() && cant<=n;i++){
            if(consumoXPiso[i]!=null && consumoXPiso[i].costoServicio()>c){
                cant++;
            }
        }
        return cant>=n;
    }
    public boolean todosMayores(int c){
        boolean hay=true;
        for(int i=0;i<cantPosiciones() && hay;i++){
            if(consumoXPiso[i]!=null &&consumoXPiso[i].costoServicio()<c){
                hay=false;
            }
        }
        return hay;
    }
    public boolean todosMayores(MedicioServicios m){
        boolean son=false;
        for(int i=0;i<cantPosiciones() && !son;i++){
            if(consumoXPiso[i].obtenerAgua()>m.obtenerAgua() &&
               consumoXPiso[i].obtenerGas()>m.obtenerGas() &&
               consumoXPiso[i].obtenerElectricidad()>m.obtenerElectricidad()){
             son=true;
            }
        }
        return son;
    }
    
}
