package ej8TP;

public class Vehiculo {
    //atributos de instancia
    private Hora ingreso;
    private Hora egreso;
    private int numero;
    private String patente;
    //constructor 
    public Vehiculo(Hora i,int n,String p){
        if(i != null){
            ingreso=i;
        }
        patente=p;
        numero=n;
        egreso=null;
    }
    //comandos
    public void esgresaVehiculo(Hora c){
        egreso=c;
    }
    public void copy(Vehiculo v){
        ingreso=v.obtenerIngreso();
        egreso=v.obtenerEgreso();
        numero=v.obtenerNumero();
        patente=v.obtenerPatente();
    }
    //consultas
    public Hora obtenerIngreso(){
        return ingreso;
    }
    public Hora obtenerEgreso(){
        return egreso;
    }
    public int obtenerNumero(){
        return numero;
    }
    public String obtenerPatente(){
        return patente;
    }
    public int obteneraCobrar(Tarifa t){
        if(egreso==null){
            return 0;
        }
        int minutos=this.egreso.diferenciaMinutos(this.ingreso);

        if(minutos<=15)
            return t.obtenerT15();
        else{
            if(minutos<=30){
                return t.obtenerT30();
            }else{
                if(minutos<=60){
                    return t.obtenerT60();
                }else{
                    return t.obtenerTfija();
                }
            }
        }
    }
    public boolean equals(Vehiculo c){
        return ingreso.equals(c.obtenerIngreso()) && egreso.equals(c.obtenerEgreso()) && numero==c.obtenerNumero() && patente==c.obtenerPatente();
    }
}
