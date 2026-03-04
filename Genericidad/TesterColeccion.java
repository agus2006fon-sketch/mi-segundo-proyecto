package Genericidad;

public class TesterColeccion {
    public static void main(String[]a){
        Coleccion c=new Coleccion(6);
        Elemento a1=new Alumno(1,"tomas",6.7f);
        Elemento a2=new Alumno(2, "agustin", 6);
        Elemento a3=new Alumno(3, "julian", 8);
        Elemento a4=new Alumno(4, "matias", 5);
        Elemento a5=new Alumno(5, "nicolas", 7);
        Elemento a6=new Alumno(6, "fernando", 8);
        
        c.insertar(a6);
        c.insertar(a1);
        c.insertar(a5);
        c.insertar(a3);
        c.insertar(a2);
        c.insertar(a4);
        //metodo estaLlena
        System.out.println("respuesta esperada, true:"+c.estaLlena());
        c.eliminar(a1);
        System.out.println("respuesta esperada,false:"+c.estaLlena());

        //metodo recuperar
        System.out.println("rta esperada;null: "+c.recuperarElemento(6));
        System.out.println(c.recuperarElemento(4));
        //
        System.out.println("false:"+c.estaElemento(a1));
        System.out.println("true:"+c.estaElemento(a2));

    }
}
