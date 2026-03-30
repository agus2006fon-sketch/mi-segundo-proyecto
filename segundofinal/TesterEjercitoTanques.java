package segundofinal;

public class TesterEjercitoTanques {
    public static void main(String a[]){
        EjercitoTanques eTanques=new EjercitoTanques(3, 4);

        eTanques.establecer(0, 0, new Tanque(500, false));
        eTanques.establecer(0, 1, null);
        eTanques.establecer(0, 2, new Tanque(600, true));
        eTanques.establecer(0, 3, null);

        eTanques.establecer(1, 0, new Tanque(500, false));
        eTanques.establecer(1, 1, new TanqueEspecial(700, false, 200));
        eTanques.establecer(1, 2, new TanqueEspecial(850,true,200));
        eTanques.establecer(1, 3, new TanqueEspecial(850, true, 200));

        eTanques.establecer(2, 0, new Tanque(500, false));
        eTanques.establecer(2, 1, new TanqueEspecial(700, false, 200));
        eTanques.establecer(2, 2, null);
        eTanques.establecer(2, 3, new Tanque(500, false));

        System.out.println("verificacion del metodo tropasEquivalentes()");
        System.out.println("caso 1, si n=1, devuelve 2");
        System.out.println(eTanques.TropasEquivalentes(1));
        System.out.println("caso 2, si n=2, devuelve 1");
        System.out.println(eTanques.TropasEquivalentes(2));
        System.out.println("caso 3, si n=3, devuelve 0");
        System.out.println(eTanques.TropasEquivalentes(3));





    }
}
