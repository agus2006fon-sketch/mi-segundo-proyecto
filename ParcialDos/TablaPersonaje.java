package ParcialDos;

public class TablaPersonaje {
    //atributos de instancia
    private Personaje [] t;
    //constructor
    public TablaPersonaje(int max){
        t=new Personaje[max];
    }
    //comandos
    public boolean agregarPersonaje(Personaje p){
        boolean listo=false;
        if(p!=null){
            for(int i=0;i<t.length && !listo;i++){
                if(t[i]==null)
                    t[i]=p;
                listo=true;
            }
        }
        return listo;
    }
    public void eliminarMasDebil(){
        int debil=0; int pos=0; boolean listo=false;
        for(int i=0;i<t.length && !listo;i++){
            if(t[i]!=null){
                debil=t[i].obtenerFuerza();
                listo=true;
                pos=i;
            }
        }
        int ind=0;
        for(int j=pos+1;j<t.length;j++){
            if(t[j]!=null && t[j].obtenerFuerza()<debil){
                debil=t[j].obtenerFuerza();
                ind=j;
            }
        }
        t[ind]=null;
    }
    //consultas
    public Personaje obtenerPersonaje(int pos){
        return t[pos];
    }
    
}
