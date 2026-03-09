package Genericidad.ejercicio5;

public class TesterMatriz {
    public static void main(String a[]){
        Imagen im=new Imagen(4);
        //fila 0
        im.establecer(0, 0, new Color(50, 34, 43));
        im.establecer(0, 1, new Color(87, 23, 23));
        im.establecer(0, 2, new Color(100, 120, 23));
        im.establecer(0, 3, new Color(53, 21, 32));
        //fila 1
        im.establecer(1, 0, new Color(90, 80, 70));
        im.establecer(1, 1, new Color(50, 50, 50));
        im.establecer(1, 2, new Color(100, 100, 100));
        im.establecer(1, 3, new Color(150, 150, 150));
        //fila 2
        im.establecer(2, 0, new Color(0, 0, 0));       // Negro (cuenta como gris porque r=v=a)
        im.establecer(2, 1, new Color(255, 0, 0));     // Rojo puro
        im.establecer(2, 2, new Color(0, 0, 255));     // Azul puro
        im.establecer(2, 3, new Color(0, 255, 0));     // Verde puro
        //fila 3
        im.establecer(3, 0, new Color(255, 255, 0));   // Amarillo (Rojo + Verde)
        im.establecer(3, 1, new Color(0, 255, 255));   // Cian (Verde + Azul)
        im.establecer(3, 2, new Color(128, 128, 128)); // Gris medio
        im.establecer(3, 3, new Color(20, 20, 20));    // Gris muy oscuro
       

        System.out.println("metodo todosGrises:");
        System.out.println("respuesta esperada=false, respuesta recibida="+im.todosGrises());

        MatrizGenerica im2=im.clone();
        System.out.println("metodo esComplemento");
        System.out.println("respuesta esperada=true ;respuesta recibida="+im.esComplemento(im2));

        System.out.println("cambiamos un color para recibir un caso falso");
        im2.establecer(0, 0, new Color(23, 54, 60));
        System.out.println("respuesta esperada=false ;respuesta recibida="+im.esComplemento(im2));

        System.out.println("creamos una matriz con distintas longitudes para recibir un caso falso");
        MatrizGenerica im3=new Imagen(2);
        System.out.println("respuesta esperada=false ;respuesta recibida="+im.esComplemento(im3));


    }
}
