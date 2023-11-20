import java.util.Scanner;
public class employe {
    protected String nom ;
    protected int id ;
    protected String adrs;
    protected int nb_h;
    public employe(){}
    public employe(int id ,String nom,String adrs,int nb_h){
        this.id=id;
        this.adrs=adrs;
        this.nb_h=nb_h;
        this.nom=nom;
    }
}
