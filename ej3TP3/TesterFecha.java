package ej3TP3;
public class TesterFecha {
    public static void main(String []a){
        Fecha f1=new Fecha(10,4,2010);
        Fecha f2=new Fecha(3,13,2000);
        Fecha f3=new Fecha(13,5,2001);
        Fecha f4=new Fecha(10,4,2010);


        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());

        System.out.println("dia de f1:"+f1.obtenerDia());
        System.out.println("mes de f1:"+f1.obtenerMes());
        System.out.println("año de f1:"+f1.obtenerAnio());

        System.out.println("dia de f2:"+f2.obtenerDia());
        System.out.println("mes de f2:"+f2.obtenerMes());
        System.out.println("dia de f2:"+f2.obtenerAnio());
        
        System.out.println("dia de f3:"+f1.obtenerDia());
        System.out.println("dia de f3:"+f3.obtenerMes());
        System.out.println("dia de f3:"+f3.obtenerAnio());

        if(f1.esBisiesto()){
            System.out.println("el año "+f1.obtenerAnio()+" es bisiesto");
        }else{
            System.out.println("el año "+f1.obtenerAnio()+" es bisiesto");
        }

        if(f1.esAnterior(f3)){
            System.out.println(f1+" es anterior a "+f3);
        }else{
            System.out.println(f1+" no es anterior a "+f3);
        }

        if(f1.equals(f3)){
            System.out.println(f1+" es igual a "+f3);
        }else{
            System.out.println(f1+" no es igual a "+f3);
        }

         if(f1.equals(f4)){
            System.out.println(f1+" es igual a "+f4);
        }else{
            System.out.println(f1+" no es igual a "+f4);
        }


    }
}
