import java.time.LocalDate;

public abstract class ustensile {
  protected int an_fab;

    public ustensile(int an_fab) {
    }

    public void setAn_fab(int an_fab){
      this.an_fab=an_fab;
  }
  public int getAn_fab(){
      return an_fab;
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
