public class testHeritage {
    public static void main(String[] args){
        assietteRonde AR=new assietteRonde(2001,5);
        assietteCarree AC=new assietteCarree(1997,7);
        cuillere C1=new cuillere(2002,12);
        ustensile[] us=new ustensile[6];
        us[1]=new assietteRonde(1999,20);
        us[2]=new assietteCarree(1990,40);
        us[3]=new cuillere(2011,54);
        us[4]=new cuillere(2009,17);
        us[5]=new assietteCarree(2014,30);

        System.out.println(AR.getrayon());
        System.out.println(AC.getcote());
        System.out.println(C1.getLongueur());
        System.out.println( AR.calculValeur());
        System.out.println(AC.calculValeur());
        System.out.println(C1.calculValeur());
    }
    public static void afficherCui(ustensile[]usentieles){
        int nombreCui=0;
        for(usentiele:usentieles){
    }
}
