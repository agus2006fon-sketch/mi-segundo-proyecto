package sensores;

public class TesterFilaSensores {
    public static void main(String a[]){
        Sensor s1=new Sensor(4, 3);
        Sensor s2=new Sensor(3, 5);
        Sensor s3=new Sensor(6, 3);
        Sensor s4=new Sensor(9, 5);
        Sensor s5=new Sensor(1, 6);
        Sensor s6=new Sensor(3, 5);


        FilaSensores f1=new FilaSensores(5);
        f1.establecerSensor(1, s1);
        f1.establecerSensor(2, s2);
        f1.establecerSensor(3, s3);
        f1.establecerSensor(4, s4);
        f1.establecerSensor(5, s5);
        //f1.establecerSensor(6, s6);

        System.out.println("cantidad de sensores:"+f1.cantSensores());

          System.out.println("cantidad de filas:"+f1.cantFila());
        System.out.println("metodo cantidadRiesgo():");
        System.out.println(f1.cantidadRiesgo());

       System.out.println("sensores f1:");
        for(int i=1;i<=f1.cantFila();i++){
            System.out.println("sensor "+i+", p1:"+f1.obtenerSensor(i).obtenerP1()+" p2:"+f1.obtenerSensor(i).obtenerP2());
        }

        FilaSensores f2=new FilaSensores(5);
         for(int i=1;i<=f2.cantFila();i++){
            f2.establecerSensor(i, new Sensor(0,0));
        }
        f2.copy(f1);

        System.out.println("sensores f2:");
        for(int i=1;i<=f2.cantFila();i++){
            System.out.println("sensor "+i+", p1:"+f2.obtenerSensor(i).obtenerP1()+" p2:"+f2.obtenerSensor(i).obtenerP2()); 
        }

        System.out.println("posicion valida con 7=false: "+f1.posicionValida(7));
        System.out.println("posicion valida con 3=true: "+f1.posicionValida(3));

        System.out.println("hay N riesgo:N=2,true: "+f1.hayNRiesgo(2));
        System.out.println("hay N riesgo:N=3,false: "+f1.hayNRiesgo(3));

        System.out.println("dos consecutivos en riesgo:false: "+f1.dosConsecutivosEmergencia());
        f1.establecerSensor(4,new Sensor(0,2));
        f1.establecerSensor(3,new Sensor(0,2));
        System.out.println("sensores f1:");
        for(int i=1;i<=f1.cantFila();i++){
            System.out.println("sensor "+i+", p1:"+f1.obtenerSensor(i).obtenerP1()+" p2:"+f1.obtenerSensor(i).obtenerP2());
        }       
        System.out.println("dos consecutivos en riesgo:true: "+f1.dosConsecutivosEmergencia());

        System.out.println("equals,false: "+f1.equals(f2));


    }
}
