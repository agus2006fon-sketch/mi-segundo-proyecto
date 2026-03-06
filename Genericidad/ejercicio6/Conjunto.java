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
        if(ce[ce.length]==null){
            ce[ce.length]=e;
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
            if(ce[i]!=null && ce[i]==e)
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
        boolean esta=false;
        
    }
}
