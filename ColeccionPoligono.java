public class ColeccionPoligono {
    //atributos de instancia
    private Poligono [] cp;
    private int n;
    //constructor
    public ColeccionPoligono(int max){
        cp=new Poligono[max];
        n=0;
    }
    //comandos
    public void insertar(Poligono p){
        if(p!=null){
            cp[n]=p;
            n++;
        }
    }
    public void eliminar(Poligono p){
        for(int i=0;i<n;i++){
            if(cp[i]==p){
                cp[i]=cp[n-1];
                cp[i-1]=null;
                n--;
            }
        }
    }
    public void eliminarPoligonosNLados(int n){
        
    }
}
