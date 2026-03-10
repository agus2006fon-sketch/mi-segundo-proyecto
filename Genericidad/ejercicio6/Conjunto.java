package Genericidad.ejercicio6;

public class Conjunto {
    //atributos de instancia
    protected Elemento [] ce;
    protected int cantElementos;
    //constructor
    public Conjunto(int max){
        if(max>0)
        ce=new Elemento[max];
    cantElementos=0;
    }
    //comandos
    public void insertar(Elemento e){
        if(cantElementos<ce.length && !pertenece(e)){
            ce[cantElementos]=e;
            cantElementos++;
        }
    }
    //consultas
    public Elemento obtener(int pos){
        Elemento ob=null;
        if(pos>=0 && pos<ce.length)
            ob=ce[pos];
        return ob;
    }
    public boolean pertenece(Elemento e){
        boolean p=false;
        for(int i=0;i<ce.length && !p;i++){
            if(ce[i]!=null && ce[i].esEquivalente(e))
                p=true;
        }
        return p;
    }
    public boolean vacio(){
        boolean es=true;
        for(int i=0;i<ce.length && es;i++){
            if(ce[i]!=null)
                es=false;
        }
        return es;
    }
    public boolean incluido(Conjunto c){
        boolean esta=true;
        for(int i=0;i<cantElementos && esta;i++){
            if(!c.pertenece(ce[i])){
                esta=false;
            }
        }        
        return esta;
    }
    public boolean esEquivalente(Conjunto c){
        return (this.cantElementos==c.cantElementos) && this.incluido(c);
    }
    public boolean disjunto(Conjunto c){
        boolean noHay=true;
        for(int i=0;i<cantElementos && noHay;i++){
            if(c.pertenece(ce[i])){
                noHay=false;
            }
        }
        return noHay;
    }
    public Conjunto union(Conjunto c){
        Conjunto nuevo=new Conjunto(cantElementos+c.cantElementos);
        for(int i=0;i<cantElementos;i++){
            nuevo.insertar(ce[i]);
        }
        for(int j=0;j<c.cantElementos;j++){
            nuevo.insertar(c.obtener(j));
        }
        return nuevo;
    }
    public Conjunto interseccion(Conjunto c){
        Conjunto nuevo=new Conjunto(cantElementos);
        for(int i=0;i<cantElementos;i++){
            if(c.pertenece(ce[i]))
                nuevo.insertar(ce[i]);
        }
        return nuevo;
    }
    public Conjunto diferencia(Conjunto c){
        Conjunto nuevo=new Conjunto(cantElementos+c.cantElementos);
        for(int i=0;i<cantElementos;i++){
            if(!c.pertenece(ce[i]))
                nuevo.insertar(ce[i]);
        }
        return nuevo;
    }
    public int cardinalidad(){
       return cantElementos;
    }
}
