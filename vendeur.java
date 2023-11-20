public class vendeur extends employee{
    int tv;

    public vendeur(int id, String nom, String adrs, int nb_h) {
        super(id, nom, adrs, nb_h);
        this.tv=tv;
        System.out.println("les taux vendeuse:"+this.tv);}
        public void setTV(int tv){
            this.tv=tv;
        }
        public int calculerSalaire(){
            return tv*450;
        }

        }


