package segundofinal;

public class EjercitoTanques extends MatrizGenerica {
    public EjercitoTanques(int n,int m){
        super(n, m);
    }
    public int TropasEquivalentes(int n){
        int cantC=0;
        int cont=0;
        for(int c=0;c<cantCol();c++){
            cont=0;
            for(int f=0;f<cantFilas()-1 && cont<n;f++){
                if(mat[f][c]!=null && mat[f+1][c]!=null &&
                    mat[f][c].equals(mat[f+1][c])){
                        cont++;
                    }else{
                        cont=0;
                    }
            }
            if(cont>=n){
                cantC++;
            }
        }
        return cantC;
    }
    public void atacarEquivalentes(Tanque e){
        for(int f=0;f<cantFilas();f++){
            for(int c=0;c<cantCol();c++){
                Tanque t=(Tanque)mat[f][c];
                if(t!=null && t.equals(e)){
                    t.recibirAtaque();
                }
            }
        }
    }
}
