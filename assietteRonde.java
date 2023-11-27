import java.time.LocalDate;

public class assietteRonde extends assiette{
    private double rayon;
    public assietteRonde( int an_fab,double rayon){
        super(an_fab);
        this.rayon=rayon;
    }
    public double getrayon(){
        return rayon;
    }
    public double calculValeur() {
        int age = LocalDate.now().getYear()- getAn_fab();
        if (age <= 50) {
            return 0;
        }
        else{
            return age - 50;
        }

    }
    public double calculSurface(){
        return 3.14*rayon*rayon;
    }
}
