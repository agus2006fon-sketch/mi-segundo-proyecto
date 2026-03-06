package Genericidad.ejercicio3;

public class ColeccionOrdenada {
    //atributos de instancia
    protected Elemento [] t;
    protected int cant;
    //constructor
    public ColeccionOrdenada(int max){
        t=new Elemento[max];
        cant=0;
    }
    //comandos
    public void insertar(Elemento e){
        boolean encontre=false;  int pos=0;
        if(!estaLlena() && e!=null){
            for(int i=0;i<cant && !encontre;i++){
                if(!t[i].esEquivalente(e)){
                    pos=i;
                    encontre=true;
                }
            }
            for(int j=cant-1;j>=pos;j--){
                t[j+1]=t[j];
            }
            t[pos]=e;
            cant++;
        }
    }
    public void eliminar(Elemento e){
        int pos=-1;
        for(int i=0;i<cant && pos==-1;i++){
            if(t[i].esEquivalente(e)){
                pos=i;
            }
        }
        if(pos>-1){
            for(int j=pos;j<cant-1;j++){
                t[j]=t[j+1];
            }
            t[cant-1]=null;
            cant--;
        }
    }
    //consultas
    public boolean estaLlena(){
        return cant==t.length;
    }
    public boolean hayElementos(){
        return cant>0;
    }
    public int cantElementos(){
        return cant;
    }
    public boolean existePosicion(int p){
        return p>=0 && p<cant;
    }
    public Elemento recuperarElemento(int p){
        Elemento r=null;
        if(this.existePosicion(p)){
            r=t[p];
        }
        return r;
    }
    public boolean estaElemento(Elemento e){
        int inicio = 0;
        int fin = cant-1;
        boolean encontro = false;
        while(inicio <= fin && !encontro){
            int medio = (inicio+fin)/2;
            if(t[medio].esEquivalente(e)){
                encontro = true;
            }else{
                if(t[medio].esMayor(e)){
                    fin = medio-1;
                }else{
                    inicio = medio+1;
                }
            }
        }
        return encontro;
    }
    public ColeccionOrdenada intercalar(ColeccionOrdenada c){
        int i=0;
        int j=0;
        ColeccionOrdenada nueva=new ColeccionOrdenada(this.cant+c.cant);
        while(i<this.cant && j<c.cant){
            if(this.t[i].esMayor(c.recuperarElemento(j))){
                nueva.t[nueva.cant]=c.recuperarElemento(j);
                nueva.cant++;
                j++;
            }else{
                nueva.t[nueva.cant]=this.t[i];
                nueva.cant++;
                i++;
            }
        }
        while(i<this.cant){
            nueva.t[nueva.cant]=this.t[i];
            nueva.cant++;
            i++;
        }
        while(j<c.cant){
            nueva.t[nueva.cant]=c.recuperarElemento(j);
            nueva.cant++;
            j++;
        }
        return nueva;
    }
}
