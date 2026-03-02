package color;
public class TesterColor {
    public static void main(String []a){
        Color c1=new Color(255,255,255);
        Color c2=new Color(0,0,0);
        Color c3=new Color(255,0,0);
        Color c4=new Color(234,54,12);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());

        if(c1.esGris())
            System.out.println("es gris");
        else
            System.out.println("no es gris");

        if(c2.esNegro())
            System.out.println("es negro");
        else
            System.out.println("no es negro");

        System.out.println(c4.complemento());
        System.out.println(c2=c1.clone());
        System.out.println(c1.equals(c2));
    }
}
