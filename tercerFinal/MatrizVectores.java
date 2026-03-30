package tercerFinal;

public class MatrizVectores extends MatrizGenerica {
    public MatrizVectores(int n,int m){
        super(n, m);
    }
    public boolean siempreCero(){
        boolean cumple=false;
        int cantF=0;
        for(int f=0;f<cantFilas() && cantF<1;f++){
            cumple=true;
            for(int c=0;c<cantCol() && cumple;c++){
                if(mat[f][c]!=null){
                    Vector v=(Vector)mat[f][c];
                    if(v.obtenerX()!=0 ||
                       v.obtenerY()!=0 ||
                       v.obtenerZ()!=0){
                        cumple=false;
                       }
                }
            }
            if(cumple){
                cantF++;
            }
        }
        return cantF>=1;
    }
    
}
