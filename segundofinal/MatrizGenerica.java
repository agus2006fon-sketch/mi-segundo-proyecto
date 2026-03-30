package segundofinal;


public class MatrizGenerica {
    //atributos de instancia
    protected Elemento [][] mat;
    //constructor
    public MatrizGenerica(int n,int m){
        mat=new Elemento[n][m];
    }
    //comandos
    public void establecer(int fila,int col,Elemento e){
        if(fila>=0 && fila<mat.length && col>=0 && col<mat[0].length)
            mat[fila][col]=e;
    }
    //consultas
    public Elemento obtener(int fila,int col){
        return mat[fila][col];
    }
    public int cantFilas(){
        return mat.length;
    }
    public int cantCol(){
        return mat[0].length;
    }
    public boolean todasConNLigadas(int n){
        boolean hay=true;
        int cont=0;
        for(int f=0;f<cantFilas() && hay;f++){
            for(int c=0;c<cantCol() && cont<=n;c++){
                if(mat[f][c]!=null){
                    cont++;
                }
            }
            if(cont !=n)
                hay=false;
        }
        return hay;
    }
    public VectorGenerico recolectarPrimerEquivalente(Elemento e){
        VectorGenerico vg=new VectorGenerico(cantCol());
        boolean hay=false;
        for(int f=0;f<cantFilas();f++){
            for(int c=0;c<cantCol() && !hay;c++){
                if(mat[f][c].equals(e)){
                    vg.establecer(c,mat[f][c]);
                    hay=true;
                }
                if(hay==false){
                    vg.establecer(c, null);
                }
            }
        }
        return vg;
    }
}
