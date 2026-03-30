package repasoFinal;

public class MatrizGenerica {
    //atributos de instancia
    protected Elemento [][] mat;
    //constructor
    public MatrizGenerica(int n,int m){
        mat=new Elemento[n][m];
    } 
    //comandos
    public void establecer(int f,int c,Elemento e){
        if(f>=0 && f<mat.length && c>=0 && c<mat[0].length){
            mat[f][c]=e;
        }
    }
    //consultas
    public Elemento obtener(int f,int c){
        Elemento e=null;
        if(f>=0 && f<mat.length && c>=0 && c<mat[0].length){
            e=mat[f][c];
        }
        return e;
    }
    public int cantFilas(){
        return mat.length;
    }
    public int cantCol(){
        return mat[0].length;
    }
    public boolean enTodasUnNeutro(){
        boolean es=true;
        int cant=0;
        for(int i=0;i<mat.length && es;i++){
            for(int j=0;j<mat[0].length && cant<=1;j++){
                if(mat[i][j]!=null && mat[i][j].esNeutro()){
                    cant++;
                }
            }
            if(cant!=1){
                es=false;
            }
        }
        return es;
    }
    public boolean filaComplemento(int f,MatrizGenerica m){
        boolean todos=true;
        for(int c=0;c<cantCol() && todos;c++){
            todos=(mat[f][c]==null && m.obtener(f, c)==null) ||
                  (mat[f][c]!=null && m.obtener(f, c)!=null &&
                   mat[f][c].esComplemento(m.obtener(f, c)));
        }
        return todos;
    }
}
