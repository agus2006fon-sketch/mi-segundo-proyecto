package segundofinal;


public class VectorGenerico {
    //atributos de instancia
    protected Elemento [] vec;
    //constructor
    public VectorGenerico(int m){
        vec=new Elemento[m];
    }
    //comandos
    public void establecer(int i,Elemento e){
        if(i>=0 && i<vec.length)
           vec[i]=e;
    }
    //consultas
    public Elemento obtener(int i){
        return vec[i];
    }
}
