class Atlantis{
    //atributos de clase
    private static int capacidad_de_tanque=50000;
    //atributos de instancia
    private int combustible;
    private boolean enOrbita;
    private Capsula cap;
    //constructor
    public Atlantis(Capsula cap){
        combustible=capacidad_de_tanque;
        enOrbita=false;
        this.cap=cap;
    }
    //comandos
    public void establecerCombustible(int comb){
        if(combustible>=0 && combustible<=capacidad_de_tanque){
            combustible=comb;
        }
    }
    public void colocarSacarDeOrbita(){
        if(enOrbita){
            enOrbita=false;
        }else
            enOrbita=true;
    }
    public void copy(Atlantis a){
        combustible=a.obtenerCombustible();
        enOrbita=a.obtenerEnOrbita();
        cap.copy(a.obtenerCapsula());
    }
    //consultas
    public int obtenerCombustible(){
        return combustible;
    }
    public boolean obtenerEnOrbita(){
        return enOrbita;
    }
    public Capsula obtenerCapsula(){
        return this.cap;
    }
    public boolean puedeDespegar(){
        return !enOrbita && cap.obtenerPurezaOxigeno()=='e';
    }
    public Atlantis clone(){
        Atlantis nuevo=new Atlantis(cap.clone());
        nuevo.establecerCombustible(combustible);
        if(enOrbita){
            nuevo.colocarSacarDeOrbita();
        }
        return nuevo;
    }
    public boolean equals(Atlantis a){
        return  combustible==a.obtenerCombustible() && 
                enOrbita==a.obtenerEnOrbita() && 
                cap==a.obtenerCapsula();
    }
    public Capsula coheteConMasTripulacion(Atlantis a){
        Capsula cohete=null;
        if(this.cap.obtenerTripulacion() > a.obtenerCapsula().obtenerTripulacion()){
            cohete= this.cap;
        }else         
            if(this.cap.obtenerTripulacion() < a.obtenerCapsula().obtenerTripulacion()){
            cohete= a.obtenerCapsula();
        }
        return cohete;
    }
}