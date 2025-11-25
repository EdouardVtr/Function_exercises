import java.util.Scanner;

public class Main {

    public static int max(int a, int b) {
        int max;
        if (a < b) {
            max = b;
        }
        else {
            max = a;
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez votre premier nombre : ");
        int a = scan.nextInt();

        System.out.print("Entrez votre deuxième nombre : ");
        int b = scan.nextInt();

        System.out.println("Le max est : " + max(a, b));
    }
}
