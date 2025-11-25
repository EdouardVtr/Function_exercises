import java.util.Scanner;

public class Main {

    public static double moyenne(double a, double b) {
        double moyenne = (a + b) / 2;
        return moyenne;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez votre premier nombre : ");
        double a = scan.nextInt();

        System.out.print("Entrez votre deuxième nombre : ");
        double b = scan.nextInt();

        System.out.println("La moyenne de ces deux nombre est : " + moyenne(a, b));
    }
}
