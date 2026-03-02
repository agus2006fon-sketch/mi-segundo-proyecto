public class Poligono {
    //atributos de instancia
    private Punto [] pol;
    private int n;
    //constructor
    public Poligono(int max){
        pol=new Punto[max];
        n=0;
    }
    //comandos
    public void insertar(Punto p){
        if(p!=null){ 
            pol[n]=p;
            n++;
        }
    }
    public void eliminar(Punto p){
        boolean encontre=false;
        for(int i=0;i<n && !encontre;i++)
            if(pol[i].equals(p)){
                pol[i]=pol[n-1];
                pol[n-1]=null;
                n--;
                encontre=true;
            }
    }
    //consultas
    public int cantPuntos(){
        return n;
    }
    public boolean estaLlena(){
        return n==pol.length;
    }
    public Punto obtenerPunto(int p){
        return pol[p];
    }
    public boolean existePunto(Punto p){
        boolean existe=false;
        for(int i=0;i<n;i++){
            if(pol[i]==p){
                existe=true;
            }
        }
        return existe;
    }
    public float perimetro(){
        return n/2;
    }
    public boolean equals(Poligono p){
        boolean eq=false;
        if(this.cantPuntos() == p.cantPuntos()){
            for(int i=0;i<cantPuntos();i++){
                eq=pol[i].obtenerX()==p.obtenerPunto(i).obtenerX() &&
                   pol[i].obtenerY()==p.obtenerPunto(i).obtenerY();
            }
        }
        return eq;
    }
}
