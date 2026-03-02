package color;
public class Borde {
    //atributos de instancia
    private int grosor;
    private Color color;
    //constructor
    public Borde(int g,Color c){
        grosor=g;
        color=c;
    }
    //comandos
    public void establecerGrosor(int g){
        grosor=g;
    }
    public void establecerColor(Color c){
        color=c;
    }
    public void copy(Borde b){
        grosor=b.obtenerGrosor();
        color=b.obtenerColor();
    }
    //consultas
    public int obtenerGrosor(){
        return grosor;
    }
    public Color obtenerColor(){
        return color;
    }
    public Borde clone(){
        Borde nuevo=new Borde(grosor,color);
        return nuevo;
    }
    public boolean equals(Borde b){
        return grosor==b.obtenerGrosor() && color==b.obtenerColor();
    }
    public String toString(){
        return ("grosor:"+grosor+" color:"+color);
    }
}
