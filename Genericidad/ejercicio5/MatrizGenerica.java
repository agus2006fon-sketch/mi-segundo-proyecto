package Genericidad.ejercicio5;

public class MatrizGenerica {
    //atributos de instancia
    protected Elemento[][] m;
    //constructor
    public MatrizGenerica(int nf,int nc){
        if(nf>=0 && nf<m.length && nc>=0 && nc<m[0].length){
            m=new Elemento[nf][nc];
        }
    }
    //comandos
    public void establecer(int f,int c,Elemento e){
        if(f>=0 && f<m.length && c>=0 && c<m[0].length){
            m[f][c]=e;
        }
    }
    //consultas
    public Elemento obtener(int f,int c){
        Elemento e=null;
        if(f>=0 && f<m.length && c>=0 && c<m[0].length)
          e=m[f][c];
        return e;
    }
    public int cantFilas(){
        return m.length;
    }
    public int cantColumnas(){
        return m[0].length;
    }
    public boolean pertenece(Elemento e){
        boolean p=false;
        for(int f=0;f<cantFilas() && !p;f++){
            for(int c=0;c<cantColumnas() && !p;c++){
                if(m[f][c]==e)
                    p=true;
            }
        }
        return p;
    }
    public int contarElem(Elemento e){
        int cont=0;
        for(int f=0;f<cantFilas();f++){
            for(int c=0;c<cantColumnas();c++){
                if(m[f][c]==e)
                    cont++;
            }
        }
        return cont;
    }
    public boolean esEquivalente(MatrizGenerica c){
        boolean eq=false;
        if(getClass()==c.getClass()){
            eq=this.equals(c);
        }
        return eq;
    }
    public boolean esComplemento(MatrizGenerica c){
        boolean es=true;
        if(cantFilas()==c.cantFilas() && cantColumnas()==c.cantColumnas()){
            for(int fil=0;fil<cantFilas() && es;fil++){
                for(int col=0;col<cantColumnas() && es;col++){
                    if(m[fil][col]!=null && c.obtener(fil, col)!=null && 
                       m[fil][col].complemento() != c.obtener(fil, col).complemento()){
                        es=false;
                    }
                }
            }
        }else 
            if(cantFilas()!=c.cantFilas() && cantColumnas()!=c.cantColumnas())
              es=false;
        return es;
    }
    public MatrizGenerica clone(){
        MatrizGenerica c=new MatrizGenerica(cantFilas(),cantFilas());
        for(int fil=0;fil<cantFilas();fil++){
            for(int col=0;col<cantColumnas();col++){
                if(m[fil][col]!=null){
                    c.establecer(fil, col, m[fil][col]);
                }
            }
        }
        return c;
    }
}
