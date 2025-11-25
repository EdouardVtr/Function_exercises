import java.util.Scanner;

public class Main {

    public static int mult(int a, int b) {

        int produit = 0;

        if (a < 0 && b < 0) {
            a = -a;
            b = -b;
            for (int i = 0; i < b; ++i) {
                produit += a;
            }
        }
        else if (a < 0 ^ b < 0) {
            if (a < 0) {
                a = -a;
            }
            else {
                b = -b;
            }
            for (int i = 0; i < b; ++i) {
                produit += a;
            }
            produit = -produit;
        }
        else if ((a > 0 && b > 0)) {
            for (int i = 0; i < b; ++i) {
                produit += a;
            }
        }
        return produit;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrer votre premier nombre : ");
        int a = scan.nextInt();
        System.out.print("Entrez votre deuxième nombre : ");
        int b = scan.nextInt();

        System.out.println("La multiplication de " + a + " * " + b + " est : " + mult(a, b));
    }
}
