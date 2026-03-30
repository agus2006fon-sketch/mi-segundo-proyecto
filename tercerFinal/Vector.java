package tercerFinal;

public class Vector extends Elemento {
    //atributos de instancia
    protected int x;
    protected int y;
    protected int z;
    //constructor
    public Vector(int px,int py,int pz){
        x=px;
        y=py;
        z=pz;
    }
    //consultas
    public int obtenerX(){
        return x;
    }
    public int obtenerY(){
        return y;
    }
    public int obtenerZ(){
        return z;
    }
    public boolean inverso(Elemento e){
        boolean es=false;
        if(this.getClass()==e.getClass()){
            Vector v=(Vector)e;
            es=this.x==v.obtenerZ() &&
               this.z==v.obtenerX(); 
        }
        return es;
    }
}
