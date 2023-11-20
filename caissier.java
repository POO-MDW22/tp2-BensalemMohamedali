public class caissier extends employee{
    int numero;
    public caissier(int id,String nom,String adrs,int nb_h,int numero){
        super(id,nom,adrs,nb_h);
        this.numero=numero;
        System.out.println("les numero:"+this.numero);}
        public float calculerSalaire(){
            return nb_h>180? (nb_h*5+(nb_h-180)*5.75f):(nb_h*5);
        }

    }

