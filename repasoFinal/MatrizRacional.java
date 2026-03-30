package repasoFinal;

public class MatrizRacional extends MatrizGenerica {
    public MatrizRacional(int n,int m){
        super(n,m);
    }
    public int columnasConUnos(int n){
        int cant=0; int cantEle=0;
        for(int c=0;c<mat[0].length;c++){
            cantEle=0;
            for(int f=0;f<mat.length && cantEle<n;f++){
                Racional r=(Racional)mat[f][c];
                if(r!=null && (r.obtenerNum()/r.obtenerDen())==1)
                    cantEle++;
                else
                    cantEle=0;
            }
            if(cantEle>=n)
                cant++;
        }
        return cant;
    }
}
