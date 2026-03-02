package ej3TP3;
public class Prestamo {
    //atributos de instancia
    private Libro libro;
    private String socio;
    private Fecha fechaPrestamo;
    private Fecha fechaDevolucion;
    private boolean devuelto;
    //constructor
    public Prestamo(Libro l,Fecha fp,Fecha fd,String s){
        libro=l;
        fechaPrestamo=fp;
        fechaDevolucion=fd;
        socio=s;
        devuelto=false;
    }
    //consultas
    public Libro obtenerLibro(){
        return libro;
    }
    public Fecha obtenerFechaPrestamo(){
        return fechaPrestamo;
    }
    public Fecha obtenerFechaDevolucion(){
        return fechaDevolucion;
    }
    public boolean estaDevuelto(){
        return devuelto;
    }
    public String obtenerSocio(){
        return socio;
    }
    public boolean estaAtrasado(Fecha hoy){
        boolean esta=false;
        if( this.fechaDevolucion.esAnterior(hoy)){
            esta=true;
        }
        return esta;
    }
    public Prestamo masAntiguo(Prestamo p){
        Prestamo antiguo=p;
        if(p!=null && this.fechaPrestamo.esAnterior(p.obtenerFechaDevolucion())){
            antiguo=this;
        }
        return antiguo;
    }
    public boolean equals(Prestamo p){
        if(p==null)
            return false;
        return this.libro.equals(p.obtenerLibro()) && 
        this.socio==p.obtenerSocio() && 
        this.fechaDevolucion.equals(p.obtenerFechaDevolucion()) && 
        this.fechaPrestamo.equals(p.obtenerFechaPrestamo());
    }
    public String toString(){
        return ("libro:"+libro+" socio:"+socio+" fecha de prestamo:"+fechaPrestamo+" fecha de devolucion:"+fechaDevolucion+" devuelto?:"+devuelto);
    }
}
