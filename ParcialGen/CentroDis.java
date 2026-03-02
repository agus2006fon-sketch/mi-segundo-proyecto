package ParcialGen;

public class CentroDis {
    // atributos de instancia
    private Producto [][] g;
    //constructor
    public CentroDis(int cantZonas,int cantClientes){
        g=new Producto[cantZonas][cantClientes];
    }
    //comandos
    public boolean establecer(int z,int c,Producto p){
        boolean pudo=false;
        if(z>=0 && z<g.length && c>=0 && c<g[0].length){
            g[z][c]=p;
            pudo=true;
        }
        return pudo;
    }
    //consultas
    public Producto obtener(int z,int c){
        return g[z][c];
    }
    public ColProductos productosARepartir(int zona,int p){
        ColProductos col=new ColProductos(g[0].length);
        for(int c=0;c<g[0].length;c++){
            if(g[zona][c]!=null && g[zona][c].obtenerPrioridad()==p){
                col.agregarProducto(g[zona][c]);
            }
        }
        return col;
    }
    public boolean hayNZonasConAlMenosMClientes(int n,int m){
        boolean hay=false;
        if(n>=0 && n<=g.length && m>=0 && m<=g[0].length){
            int nZonas=0;
            int MClientes=0;
            for(int f=0;f<g.length && nZonas<=n;f++){
                MClientes=0;
                for(int c=0;c<g[0].length && MClientes<m;c++){
                    if(g[f][c]!=null){
                        MClientes++;
                    }
                }
                if(MClientes>=m){
                    nZonas++;
                }
            }
            if(nZonas==n){
                hay=true;
            }
        }
        return hay;
    }
}
