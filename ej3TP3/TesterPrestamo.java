package ej3TP3;
public class TesterPrestamo {
    public static void main (String args[]){
        //libros
        Libro libro1= new Libro("alicia en el pais de las maravillas", "eduardo enrique", "la primera", 'f');
        Libro libroReferencia= new Libro("maravilla","cortaz","bomba",'c');
        Libro copiaReferencia= new Libro("maravilla","cortaz","bomba",'c');
        //fecha de prestamo
        Fecha fp= new Fecha(12,8,2025);
        Fecha fp1= new Fecha(10,9,2019);
        Fecha fpCopia= new Fecha(10,9,2019);
        //fecha de devolucion
        Fecha fd= new Fecha(5,10,2025);
        //prestamos
        Prestamo p= new Prestamo(libro1,fp,fd,"nicolas");
        Prestamo p1= new Prestamo(libro1,fp,fd,"agustin");
        Prestamo p2= new Prestamo(libroReferencia,fp1,fd,"agustin");
        Prestamo p3= new Prestamo(copiaReferencia,fpCopia,fd,"agustin");
        //fecha de hoy
        Fecha hoy= new Fecha(6,10,2025); 
        //consultas
        
        System.out.println("libro de prestamo:"+p1.obtenerLibro());
        //consulta estaAtrasado
        System.out.println("la fecha de hoy esta atrasado con la devolucion?"+p.estaAtrasado(hoy));
        //consulta MasAntiguo
        System.out.println("el prestamo mas antiguo es:"+p.masAntiguo(p1).toString());
        //consulta equals
        System.out.println("p3 es igual a p2?"+p2.equals(p3));
        System.out.println("p3 es igual a p?"+p.equals(p3));
        //consulta toString
        System.out.println(p1.toString());

    }
}
