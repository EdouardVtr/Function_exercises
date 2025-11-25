import java.util.Scanner;

public class Main {

    public static boolean negatif(int a) {

        boolean negatif;

        if (a < 0) {
            negatif = true;
        }
        else {
            negatif = false;
        }
        return negatif;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez votre nombre : ");
        int a = scan.nextInt();

        if (negatif(a)) {
            System.out.println("Le nombre " + a + " est négatif !");
        }
        else {
            System.out.println("Le nombre " + a + " n'est pas négatif !");
        }
    }
}
