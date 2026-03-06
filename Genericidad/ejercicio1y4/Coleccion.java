package Genericidad.ejercicio1y3;

public class Coleccion {
    //atributos de instancia
    protected Elemento [] col;
    protected int cant;
    //constructor
    public Coleccion(int max){
        col=new Elemento[max];
        cant=0;
    }
    //comandos
    public void insertar(Elemento e){
        col[cant]=e;
        cant++;
    }
    public void eliminar(Elemento e){
        boolean encontro=false; 
        int pos=0;
        for(int i=0;i<cant && !encontro;i++){
            if(col[i].esEquivalente(e)){
                pos=i;
                encontro=true;  
            }
        }
        if(encontro){ 
            for(int i=pos+1;i<cant;i++){
                col[i-1]=col[i];
            }
         col[cant-1]=null;
         cant--;
        }
    }
    public void ordenar(){
        Elemento aux=null;
        boolean cambio=true;
        for(int k=0;k<cant/2 && cambio;k++){
            cambio=false;
            for(int i=k;i<cant-1-k;i++){
                if(col[i].esMayor(col[i+1])){
                    aux=col[i+1];
                    col[i+1]=col[i];
                    col[i]=aux;
                    cambio=true;
                }
            }
            for(int j=cant-2-k;j>k;j++){
                if(col[j-1].esMayor(col[j])){
                    aux=col[j];
                    col[j]=col[j-1];
                    col[j-1]=aux;
                    cambio=true;
                }
            }
        }
    }
    //consultas
    public boolean estaLlena(){
        return cant==col.length;
    }
    public boolean hayElementos(){
        return cant>0;
    }
    public int cantElementos(){
        return cant;
    }
    public boolean existePosicion(int p){
        return p>=0 && p<cant;
    }
    public Elemento recuperarElemento(int p){
        Elemento e=null;
        if(p>=0 && p<cant){
            e=col[p];
        }
        return e;
    }
    public boolean estaElemento(Elemento e){
        boolean encontre=false;
        for(int i=0;i<cant && !encontre;i++){
            if(col[i].esEquivalente(e)){
                encontre=true;
            }
        }
        return encontre;
    }
}
