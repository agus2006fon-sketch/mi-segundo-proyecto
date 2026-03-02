public class TesterPoliza {
    public static void main(String a []){
        Poliza p1=new Poliza(1,25,2);
        p1.establecerPorcentaje(20);
        p1.desactivar();
        p1.establecerPorcentaje(10);
        p1.activar();
        System.out.println("numero de poliza:"+p1.obtenerNroPoliza()+" costo:"+p1.obtenerCostoPoliza()+" estado:"+p1.estaActiva());
    }
}
