package HerenciaYPolimorfismo.ejercicio7;

public class Agencia {
    //atributos de instancia
    private Alojamiento [] alojamientos;
    //constructor
    public Agencia(int n){
        if(n>0)
        alojamientos=new Alojamiento[n];
    }
    //comandos
    public boolean insertarAlojamiento(Alojamiento aloj,int pos){
        boolean contiene=false;;
        for(int i=0;i<alojamientos.length && contiene;i++){
            if(alojamientos[i]!=null && alojamientos[i].obtenerId()==aloj.obtenerId())
                contiene=true;
            if(contiene==false){
                alojamientos[pos]=aloj;
            }
        }
        return contiene;
    }
    public void eliminarAlojamiento(int pos){
        alojamientos[pos]=null;
    }
    public void eliminarAlojamiento(Alojamiento aloj){
        boolean listo=false;
        for(int i=0;i<alojamientos.length && !listo;i++){
            if(alojamientos[i]!=null && alojamientos[i].obtenerId()==aloj.obtenerId()){
                alojamientos[i]=null;
                listo=true;
            }
        }
    }
    //consultas
    public int cantAlojamientos(){
        int cont=0;
        for(int i=0;i<alojamientos.length;i++){
            if(alojamientos[i]!=null){
                cont++;
            }
        }
        return cont;
    }
    public int tamanioTabla(){
        return alojamientos.length;
    }
    public Alojamiento recuperarAlojamiento(int pos){
        return alojamientos[pos];
    }
    public int recuperarPosicion(Alojamiento aloj){
        int pos=-1;
        for(int i=0;i<alojamientos.length && pos==-1;i++){
            if(alojamientos[i].obtenerId()==aloj.obtenerId())
                pos=i;
        }
        return pos;
    }
    public Alojamiento estaAlojamiento(int c){
        Alojamiento a=null; boolean esta=false;
        for(int i=0;i<alojamientos.length && !esta;i++){
            if(alojamientos[i].obtenerId()==c){
                a=alojamientos[i];
            }
        }
        return a;
    }
}
