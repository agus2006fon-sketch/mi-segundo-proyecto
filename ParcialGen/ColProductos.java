package ParcialGen;

public class ColProductos {
    //atributos de instancia
    private Producto [] col;
    private int cant;
    //constructor
    public ColProductos(int c){
        col=new Producto[c];
        cant=0;
    }
    //comandos
    public boolean agregarProducto(Producto p){
        boolean a=false;
        if(cant<col.length){
            col[cant]=p;
            cant++;
            a=true;
        }
        return a;
    }
    public void eliminarPrimeroMasRentableQueR(float r){
        boolean listo=false;
        for(int i=0;i<cant && !listo;i++){
            if(col[i].determinarMargenGanancia()>r){
                col[i]=col[cant-1];
                col[cant-1]=null;
                listo=true;
            }
        }
        cant--;
    }
    //consultas
    public Producto obteneProducto(int pos){
        Producto p=null;
        if(pos>=0 && pos<obtenerCant()){
            p=col[pos];
        }
        return p;
    }
    public int obtenerCant(){
        return cant;
    }
}
