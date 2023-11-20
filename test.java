import java.util.Scanner;
    public class test {
        public static void main(String[] args) {
            produit p1=new produit(1021,"Lait","Delice",800);
            produit p2=new produit(2510,"Yaourt","Vitalait",500);
            produit p3=new produit(3250,"Tomate","Sicam",1200);
            magasin MG1=new magasin(5000,"Bouzid",9);
            MG1.ajouter(p1);
            MG1.ajouter(p2);
            MG1.ajouter(p3);
            MG1.affmagasin();
            System.out.println("le nombre  du magasin est"+MG1.num);
            System.out.println(p1.comparer1(p2));
            System.out.println( p1.comparer2(p2,p3));
            magasin carrefour=new magasin(5001,"centre ville",20);
            magasin monoprix=new magasin(5100,"menzah 6",11);
            vendeur v1=new vendeur(6,"sabrine","sidibouzid",28);
            vendeur v2=new vendeur(6,"moujib","sidibouzid",28);
            vendeur v3=new vendeur(6,"dali","bizerte",28);
            responsable r1=new responsable(2,"islem","tunis",52,100);
            caissier c1=new caissier(5,"isra","tunis",4,23);
            caissier c2=new caissier(6,"jamila","bizerte",5,22);
           carrefour.ajouteremployee(v1);
           carrefour.ajouteremployee(r1);
           carrefour.ajouteremployee(c1);
           carrefour.ajouteremployee(c2);
           monoprix.ajouteremployee(c1);
           monoprix.ajouteremployee(v1);
           monoprix.ajouteremployee(v2);
           monoprix.ajouteremployee(v3);
           monoprix.ajouteremployee(r1);
           monoprix.affiche_employee();
           carrefour.affiche_employee();
            monoprix.ajouter(p1);
            carrefour.ajouter(p1);




        }
    }


