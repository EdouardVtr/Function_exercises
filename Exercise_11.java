import java.util.Scanner;

public class Main {

    public static boolean estPremier(int a ) {

        boolean premier = true;

        for (int i = 2; i < a && premier; ++i) { // Le && premier permet d'arrêter la boucle quand on a trouvé un diviseur.
            if (a % i == 0) {
             premier = false;
            }
        }
        return premier;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez un entier (plus grand que 1) : ");
        int a = scan.nextInt();

        if (estPremier(a)) {
            System.out.println("Ce nombre est premier !");
        } else {
            System.out.println("Ce nombre n'est pas premier !");
        }
    }
}
