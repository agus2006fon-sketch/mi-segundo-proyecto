package Genericidad.ejercicio7;

public class Tribu extends Conjunto{
    //constructor
    public Tribu(int max){
        super(max);
    }
    //consultas
    public boolean hayTresDecrecientes(){
        int racha=1;
        for(int i=0;i<cant-1 && racha<=3;i++){
            Criatura actual=(Criatura)co[i];
            Criatura siguiente=(Criatura)co[i+1];
            if(actual.obtenerEnergia()>siguiente.obtenerEnergia()){
                racha++;
            }else{
                racha=0;
            }
        }
        return cant>=3;
    }
}
