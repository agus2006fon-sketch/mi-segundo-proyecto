package HerenciaYPolimorfismo.Rubrica;

public class Staff {
    //atributos de instancia
    private Rubrica [] s;
    private int cant;
    // constructor
    public Staff(int max){
        s=new Rubrica[max];
        cant=0;
    }
    //comandos
    public boolean agregarRubrica(Rubrica r){
        boolean pudo=false;
        if(r!=null && cant<s.length){ 
          s[cant]=r;
          cant++;
          pudo=true;
        }
        return pudo;
    }
    public void eliminar(int p){
        for(int i=0;i<cant;i++){
            if(s[i].productividad()<p){
                s[i]=s[cant-1];
                s[cant-1]=null;
                cant--;
            }
        }
    }
    //consultas
    public boolean estaLlena(){
        return cant==s.length;
    }
    public int cantPosiciones(){
        return s.length;
    }
    public int cantRubricas(){
        return cant;
    }
    public Rubrica obteneRubrica(int p){
        return s[p];
    }
    public int contarMayorP(int p){
        int cont=0;
        for(int i=0;i<cant;i++){
            if(s[i].productividad()>p)
                cont++;
        }
        return cont;
    }
    public Staff totalMayorT(int t){
        Staff nuevo=new Staff(s.length);
        for(int i=0;i<cant;i++){
            if(s[i].total()>t){
                nuevo.agregarRubrica(s[i]);
            }
        }
        return nuevo;
    }
}
