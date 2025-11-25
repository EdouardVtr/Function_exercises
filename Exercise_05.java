import java.util.Scanner;

public class Main {

    public static boolean estPair(int a) {

        boolean pair;
        int verif = a % 2;

        if (verif == 0) {
            pair = true;
        }
        else {
            pair = false;
        }
        return pair;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez votre nombre : ");
        int a = scan.nextInt();

        if (estPair(a)) {
            System.out.println("Le nombre " + a + " est pair !");
        }
        else {
            System.out.println("Le nombre " + a + " n'est pas pair !");
        }
    }
}
