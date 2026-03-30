package tercerFinal;

public class MatrizGenerica {
    //atributos de instancia
    protected Elemento [][] mat;
    //constructor
    public MatrizGenerica(int n,int m){
        mat=new Elemento[n][m];
    }
    //comandos
    public void establecerEnPos(int fila,int col,Elemento e){
        if(fila>=0 && fila<cantFilas() && col>=0 && col<cantCol()){
            mat[fila][col]=e;
        }
    }
    public void desplazarDerecha(){
        Elemento eSig=null;
        for(int f=0;f<cantFilas();f++){
            for(int c=0;c<cantCol()-1;c++){
                eSig=mat[f][c+1];
                mat[f][c+1]=mat[f][c];
            }
            mat[f][0]=eSig;
        }
    }
    //consultas
    public Elemento obtenerElemento(int fila,int col){
        Elemento e=null;
        if(fila>=0 && fila<cantFilas() && col>=0 && col<cantCol()){
            e=mat[fila][col];
        }
        return e;
    }
    public int cantFilas(){
        return mat.length;
    }
    public int cantCol(){
        return mat[0].length;
    }
    public boolean NIgualesC(MatrizGenerica m,int c,int n){
        int cont=0;
        boolean hay=false;
        for(int f=0;f<cantFilas() && !hay;f++){
            if(mat[f][c]!=null && mat[f][c].inverso(m.obtenerElemento(f, c))){
                cont++;
            }else{
                cont=0;
            }
            if(cont>=n){
                hay=true;
            }
        }
        return hay;
    }

}
