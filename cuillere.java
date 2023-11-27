import java.time.LocalDate;

public class cuillere extends ustensile {
    private double longueur;

    public cuillere(int an_fab, double longueur) {
        super(an_fab);
        this.longueur = longueur;
    }

    public double getLongueur() {
        return longueur;
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
}
