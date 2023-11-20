public class employee {
        protected int id;
        protected String nom;
        protected String adrs;
        protected int nb_h;

        public employee(int id, String nom, String adrs, int nb_h){
            this.id=id;
            this.adrs=adrs;
            this.nb_h=nb_h;
            this.nom=nom;
        }
     void afficheE(){
            System.out.println(nom+""+id+""+adrs);     }

    }

