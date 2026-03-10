package Genericidad.ejercicio7;

public class Tribu extends Conjunto{
    //constructor
    public Tribu(int max){
        super(max);
    }
    //consultas
    public boolean hayTresDecrecientes(){
        int racha=1;
        int secDeTres=0;
        for(int i=0;i<cant-1;i++){
            Criatura actual=(Criatura)co[i];
            Criatura siguiente=(Criatura)co[i+1];
            if(actual.obtenerEnergia()>siguiente.obtenerEnergia()){
                racha++;
            }else{
                if(racha==3){
                    secDeTres++;
                }
            racha=1;
            }
        }
        if(racha==3){
            secDeTres++;
        }
        return secDeTres==1;
    }
}
