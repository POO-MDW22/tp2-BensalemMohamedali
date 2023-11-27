import java.time.LocalDate;

public class assietteCarree extends assiette {
    private double cote;
    public assietteCarree( int an_fab,double cote){
        super(an_fab);
        this.cote=cote;
    }
    public double getcote(){
        return cote;
    }
    public double calculValeur() {

            return 5 * super.calculValeur();


    }
    public double calculSurface(){
        return cote*cote;
    }
}
