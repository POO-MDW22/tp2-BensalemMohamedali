public class responsable extends employee{
    float prime;
    public responsable(int id,String nom,String adrs,int nb_h,int prime){
        super(id,nom,adrs,nb_h);
        this.prime=prime;
        System.out.println(" les primes:"+this.prime);

    }
    public float getPrime(){
        return prime;}

    public void setPrime(float prime){
        this.prime= prime;}
    public String toString(){
        return super.toString()+"Responsable{"+"prime"+prime+"}";}
    public float calculerSalaire(){
        return nb_h>100? ((160*10)+nb_h-160*10*0.2f):(160*10);
    }
    }


