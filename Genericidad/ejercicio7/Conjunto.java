package Genericidad.ejercicio7;

public class Conjunto {
    //atributos de instancia
    protected Elemento [] co;
    protected int cant;
    //constructor
    public Conjunto(int max){
        co=new Elemento[max];
        cant=0;
    }
    //comandos
    public void insertar(Elemento e){
        if(e!=null){ 
            co[cant]=e;
            cant++;
        }
    }
    //consultas
    public boolean pertenece(Elemento e){
        boolean tiene=false;
        for(int i=0;i<cant && !tiene;i++){
            if(co[i].equals(e))
                tiene=true;
        }
        return tiene;
    }
    public Conjunto interseccion(Conjunto c){
        Conjunto nuevo=new Conjunto(cant);
        for(int i=0;i<cant;i++){
            if(co[i].equals(c)){
                nuevo.insertar(co[i]);
            }
        }
        return nuevo;
    }
    public boolean aLoSumoNComplemento(int n,Elemento e){
        int cont=0;
        for(int i=0;i<cant && cont<=n;i++){
            if(co[i].complemento(e)){
                cont++;
            }
        }
        return cont>=n;
    }
    public int cantElementos(){
        return co.length;
    }
}
