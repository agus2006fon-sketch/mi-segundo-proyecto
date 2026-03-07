package Genericidad.ejercicio1y4;

public class TesterNominaEmpleado {
    public static void main(String arg[]){
        NominaEmpleados ne=new NominaEmpleados(12);
        Elemento e1=new Empleado(32,"Fabian",8,1000);
        Elemento e2=new Tecnico(35,"julian",8,1500);
        Elemento e3=new Empleado(312,"lucas",8,1000);
        Elemento e4=new Tecnico(21,"fabri",8,1234);
        Elemento e5=new Empleado(64,"fer",8,1000);
        Elemento e6=new Tecnico(54,"marcelo",8,1500);
        Elemento e7=new Empleado(27,"migue",8,1000);
        Elemento e8=new Empleado(48,"pepe",8,1000);
        Elemento e9=new Tecnico(41,"luis",8,1463);
        Elemento e10=new Empleado(72,"nico",8,1000);
        Elemento e11=new Empleado(16,"lea",8,1000);

        ne.insertar(e1);
        ne.insertar(e2);
        ne.insertar(e3);
        ne.insertar(e4);
        ne.insertar(e5);
        ne.insertar(e5);
        ne.insertar(e6);
        ne.insertar(e7);
        ne.insertar(e8);
        ne.insertar(e9);
        ne.insertar(e10);
        ne.insertar(e11);

        System.out.print(ne.sumarSueldos());

    }
}
